job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/julioraulcarranzaruiz/dsljavamaven.git', 'master') { node ->
            node / gitConfigName('julioraulcarranzaruiz')
            node / gitConfigEmail('julioraulcarranzaruiz@gmail.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
    
}
