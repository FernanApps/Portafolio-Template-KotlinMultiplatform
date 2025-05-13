package pe.fernan.apps.template.domain.usecase

import pe.fernan.apps.template.domain.model.GeminiTextResult
import pe.fernan.apps.template.domain.repository.GeminiRepository

class ProcessImageUseCase(private val repository: GeminiRepository) {
    suspend operator fun invoke(imageBase64: String): GeminiTextResult {
        return repository.processImage(imageBase64)
    }
}
