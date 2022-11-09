package io.github.grishaninvyacheslav.cart.domain.use_cases.get_cart

import io.github.grishaninvyacheslav.cart.data.ICartRepository

class GetCartUseCaseImpl(
    private val cartRepository: ICartRepository
) : GetCartUseCase {
    override suspend fun invoke() = cartRepository.getCart()
}