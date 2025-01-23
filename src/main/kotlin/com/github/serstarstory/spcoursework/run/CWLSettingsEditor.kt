package com.github.serstarstory.spcoursework.run

import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.TextBrowseFolderListener
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.openapi.util.Comparing
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.util.ui.CheckBox
import com.intellij.util.ui.FormBuilder
import javax.swing.JComponent
import javax.swing.JPanel


class CWLSettingsEditor : SettingsEditor<CWLRunConfiguration>() {
    private val myPanel: JPanel
    private val filePathField = TextFieldWithBrowseButton()
    private val workingDirPathField = TextFieldWithBrowseButton()

    init {
        filePathField.addBrowseFolderListener("Select Input File", null, null,
            FileChooserDescriptorFactory.createSingleFileDescriptor("cwl"))
        workingDirPathField.addBrowseFolderListener("Select working directory", null, null,
            FileChooserDescriptorFactory.createSingleFolderDescriptor())
        myPanel = FormBuilder.createFormBuilder()
            .addLabeledComponent("Input file", filePathField)
            .addLabeledComponent("Working dir", workingDirPathField)
            .panel
    }

    override fun resetEditorFrom(rc: CWLRunConfiguration) {
        filePathField.text = rc.inputFile
        workingDirPathField.text = rc.workingDir
    }

    override fun applyEditorTo(rc: CWLRunConfiguration) {
        rc.inputFile = filePathField.text
        rc.workingDir = workingDirPathField.text
    }

    override fun createEditor(): JComponent {
        return myPanel
    }
}