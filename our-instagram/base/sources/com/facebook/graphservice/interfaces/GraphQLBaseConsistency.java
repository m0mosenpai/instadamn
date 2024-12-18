package com.facebook.graphservice.interfaces;

import X.InterfaceC65206Tfs;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public interface GraphQLBaseConsistency {
    ListenableFuture lookup(Object obj);

    ListenableFuture publishBuilder(InterfaceC65206Tfs interfaceC65206Tfs);

    ListenableFuture publishBuilderWithFullConsistency(InterfaceC65206Tfs interfaceC65206Tfs);

    GraphQLService.Token subscribe(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor);

    GraphQLService.Token subscribeWithFullConsistency(Object obj, GraphQLService.DataCallbacks dataCallbacks, Executor executor);
}
