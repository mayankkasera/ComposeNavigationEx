package com.example.myapplication.navigation

const val DETAIL_SCREEN_ARGS_ID = "id"
const val DETAIL_SCREEN_ARGS_QUERY = "query"

sealed class Screen(var route: String){
    object HomeScreen : Screen("home_screen")
    object DetailScreen : Screen("detail_screen/{$DETAIL_SCREEN_ARGS_ID}?query={$DETAIL_SCREEN_ARGS_QUERY}"){

        fun setArgs(id: Int, query: String=""): String {
            route = route.replace(oldValue = "{$DETAIL_SCREEN_ARGS_ID}", newValue = "$id")
            route = route.replace(oldValue = "{$DETAIL_SCREEN_ARGS_QUERY}", newValue = query)
            return route
        }

    }
}
