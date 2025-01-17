package example

import example.entity.Showcases
import example.hook.useShowcases
import react.FC
import react.PropsWithChildren
import react.createContext

val ShowcasesContext = createContext<Showcases>()

val ShowcasesModule = FC<PropsWithChildren> { props ->
    val users = useShowcases()

    ShowcasesContext.Provider(users) {
        props.children()
    }
}
