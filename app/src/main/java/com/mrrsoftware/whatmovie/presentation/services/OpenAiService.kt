package com.mrrsoftware.whatmovie.presentation.services

import com.mrrsoftware.whatmovie.presentation.domain.ChatRequest
import com.mrrsoftware.whatmovie.presentation.domain.ChatResponse
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Welbert on 03/11/2023
 */
interface OpenAiService {
    @POST("v1/chat/completions")
    suspend fun getChatCompletion(@Body request: ChatRequest): ChatResponse
}