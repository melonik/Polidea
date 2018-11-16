package com.example.polidea.di

import com.example.polidea.domain.usecase.SearchUseCase
import com.example.polidea.view.main.search.presenter.SearchPresenter
import org.koin.dsl.module.module
import org.koin.experimental.builder.factory

object DomainModule {
	val module = module {

		factory<SearchUseCase>()

		factory<SearchPresenter>()
	}
}