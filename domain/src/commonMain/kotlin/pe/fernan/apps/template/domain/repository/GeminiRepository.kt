package pe.fernan.apps.template.domain.repository

import pe.fernan.apps.template.domain.model.GeminiTextResult


interface GeminiRepository {
    suspend fun processImage(imageBase64: String): GeminiTextResult
}
