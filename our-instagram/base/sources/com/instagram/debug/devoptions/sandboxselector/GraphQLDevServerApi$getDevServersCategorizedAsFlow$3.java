package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AnonymousClass436;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServersCategorizedAsFlow$3", f = "GraphQLDevServerApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class GraphQLDevServerApi$getDevServersCategorizedAsFlow$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object L$0;
    public int label;

    public GraphQLDevServerApi$getDevServersCategorizedAsFlow$3(InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        GraphQLDevServerApi$getDevServersCategorizedAsFlow$3 graphQLDevServerApi$getDevServersCategorizedAsFlow$3 = new GraphQLDevServerApi$getDevServersCategorizedAsFlow$3(interfaceC23621Ds);
        graphQLDevServerApi$getDevServersCategorizedAsFlow$3.L$0 = obj;
        return graphQLDevServerApi$getDevServersCategorizedAsFlow$3;
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(AnonymousClass436 anonymousClass436, InterfaceC23621Ds interfaceC23621Ds) {
        GraphQLDevServerApi$getDevServersCategorizedAsFlow$3 graphQLDevServerApi$getDevServersCategorizedAsFlow$3 = new GraphQLDevServerApi$getDevServersCategorizedAsFlow$3(interfaceC23621Ds);
        graphQLDevServerApi$getDevServersCategorizedAsFlow$3.L$0 = anonymousClass436;
        return graphQLDevServerApi$getDevServersCategorizedAsFlow$3.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            AbstractC09560e7.A00(obj);
            AnonymousClass436 anonymousClass436 = (AnonymousClass436) this.L$0;
            if (anonymousClass436 != null) {
                obj2 = anonymousClass436.Bos();
            } else {
                obj2 = null;
            }
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponseImpl");
            return obj2;
        }
        throw AbstractC166987dD.A13();
    }
}
