package com.github.muchenxmy.tuhumodulartemplate.services

import com.github.muchenxmy.tuhumodulartemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
