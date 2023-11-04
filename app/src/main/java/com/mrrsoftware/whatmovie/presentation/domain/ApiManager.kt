package com.mrrsoftware.whatmovie.presentation.domain

/**
 * Created by Welbert on 03/11/2023
 */

import com.mrrsoftware.whatmovie.presentation.services.OpenAiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ApiManager {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.openai.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val openAiService = retrofit.create(OpenAiService::class.java)

    suspend fun getChatCompletion(request: ChatRequest): ChatResponse? {
        return withContext(Dispatchers.IO) {
            try {
                openAiService.getChatCompletion(request)
            } catch (e: Exception) {
                null
            }
        }
    }
}
