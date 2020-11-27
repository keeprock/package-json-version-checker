package com.github.xapai.packagejsonversionchecker.services

import com.intellij.openapi.project.Project
import com.github.xapai.packagejsonversionchecker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
