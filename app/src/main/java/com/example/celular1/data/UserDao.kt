package com.example.celular1.data
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao
{
    @Insert
    suspend fun registerUser(user: User)

    @Query("SELECT * FROM users WHERE username = :username AND password = :password LIMIT 1")
    suspend fun login(username: String, password: String): User?

    @Query("SELECT * FROM users WHERE username = :username LIMIT 1")
    suspend fun getUserByUsername(username: String): User?
}