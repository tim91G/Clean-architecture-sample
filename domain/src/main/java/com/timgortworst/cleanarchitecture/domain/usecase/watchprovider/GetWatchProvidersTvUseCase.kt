package com.timgortworst.cleanarchitecture.domain.usecase.watchprovider

import com.timgortworst.cleanarchitecture.domain.model.watchprovider.WatchProvider
import com.timgortworst.cleanarchitecture.domain.model.state.Resource
import com.timgortworst.cleanarchitecture.domain.usecase.SuspendUseCase

interface GetWatchProvidersTvUseCase :
    SuspendUseCase<GetWatchProvidersTvUseCaseImpl.Params, Resource<List<WatchProvider>>>