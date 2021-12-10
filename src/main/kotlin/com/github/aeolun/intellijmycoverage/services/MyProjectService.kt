package com.github.aeolun.intellijmycoverage.services

import com.intellij.openapi.project.Project
import com.github.aeolun.intellijmycoverage.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
