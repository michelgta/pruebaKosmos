package mx.com.movieschallenge.data.remote

import com.example.android.roomwordssample.data.model.Users
import retrofit2.http.GET
import retrofit2.http.Query

interface WordsEndpoints {
    @GET("api/users")
    suspend fun getListUsers(
        @Query("page") page: Int
    ): Users
}