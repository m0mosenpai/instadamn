package com.instagram.debug.devoptions.sandboxselector;

import X.C1Dq;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi", f = "GraphQLDevServerApi.kt", i = {}, l = {26}, m = "getDevServers", n = {}, s = {})
/* loaded from: classes11.dex */
public final class GraphQLDevServerApi$getDevServers$1 extends C1Dq {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GraphQLDevServerApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLDevServerApi$getDevServers$1(GraphQLDevServerApi graphQLDevServerApi, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.this$0 = graphQLDevServerApi;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getDevServers(null, this);
    }
}
