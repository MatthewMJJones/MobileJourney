package za.ac.cput

sealed class Navigation(val route: String) {
    object Start : Navigation("start")
    object Journey : Navigation("journey")

}