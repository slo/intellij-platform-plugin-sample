package com.github.slo.intellijplatformpluginsample.services

import com.intellij.openapi.project.Project
import com.github.slo.intellijplatformpluginsample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
