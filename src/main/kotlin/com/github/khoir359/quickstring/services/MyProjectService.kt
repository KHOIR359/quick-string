package com.github.khoir359.quickstring.services

import com.intellij.openapi.project.Project
import com.github.khoir359.quickstring.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
