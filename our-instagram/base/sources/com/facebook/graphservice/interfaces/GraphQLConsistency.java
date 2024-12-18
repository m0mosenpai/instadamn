package com.facebook.graphservice.interfaces;

import X.AbstractC61279Rkp;
import X.InterfaceC65206Tfs;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes10.dex */
public interface GraphQLConsistency extends GraphQLBaseConsistency {
    ListenableFuture applyOptimistic(Tree tree, Tree tree2, AbstractC61279Rkp abstractC61279Rkp);

    ListenableFuture applyOptimisticBuilder(InterfaceC65206Tfs interfaceC65206Tfs, Tree tree, AbstractC61279Rkp abstractC61279Rkp);

    ListenableFuture publish(Tree tree);

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    ListenableFuture publishBuilder(InterfaceC65206Tfs interfaceC65206Tfs);

    @Override // com.facebook.graphservice.interfaces.GraphQLBaseConsistency
    ListenableFuture publishBuilderWithFullConsistency(InterfaceC65206Tfs interfaceC65206Tfs);

    ListenableFuture publishWithFullConsistency(Tree tree);
}
