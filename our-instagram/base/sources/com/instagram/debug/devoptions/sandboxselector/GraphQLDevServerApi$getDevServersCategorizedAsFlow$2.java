package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.debug.devoptions.sandboxselector.DevserverListError;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServersCategorizedAsFlow$2", f = "GraphQLDevServerApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class GraphQLDevServerApi$getDevServersCategorizedAsFlow$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object L$0;
    public int label;

    public GraphQLDevServerApi$getDevServersCategorizedAsFlow$2(InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        GraphQLDevServerApi$getDevServersCategorizedAsFlow$2 graphQLDevServerApi$getDevServersCategorizedAsFlow$2 = new GraphQLDevServerApi$getDevServersCategorizedAsFlow$2(interfaceC23621Ds);
        graphQLDevServerApi$getDevServersCategorizedAsFlow$2.L$0 = obj;
        return graphQLDevServerApi$getDevServersCategorizedAsFlow$2;
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(Throwable th, InterfaceC23621Ds interfaceC23621Ds) {
        GraphQLDevServerApi$getDevServersCategorizedAsFlow$2 graphQLDevServerApi$getDevServersCategorizedAsFlow$2 = new GraphQLDevServerApi$getDevServersCategorizedAsFlow$2(interfaceC23621Ds);
        graphQLDevServerApi$getDevServersCategorizedAsFlow$2.L$0 = th;
        return graphQLDevServerApi$getDevServersCategorizedAsFlow$2.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AbstractC09560e7.A00(obj);
            return new DevserverListError.HttpError(0, ((Throwable) this.L$0).getMessage());
        }
        throw AbstractC166987dD.A13();
    }
}
