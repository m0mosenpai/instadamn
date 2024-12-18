package com.instagram.direct.search.repository;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C33094Eiy;
import X.InterfaceC16590sC;
import X.InterfaceC23621Ds;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.search.repository.CombinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1", f = "CombinedProvidersSearchRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class CombinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1 extends AbstractC23611Dp implements InterfaceC16590sC {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C33094Eiy A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1(C33094Eiy c33094Eiy, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(5, interfaceC23621Ds);
        this.A04 = c33094Eiy;
        this.A05 = str;
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        CombinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1 combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1 = new CombinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1(this.A04, this.A05, (InterfaceC23621Ds) obj5);
        combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1.A00 = obj;
        combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1.A01 = obj2;
        combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1.A02 = obj3;
        combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1.A03 = obj4;
        return combinedProvidersSearchRepositoryImpl$combineSearchResults$1$4$combinedFlow$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        List list = (List) this.A00;
        List list2 = (List) this.A01;
        Map map = (Map) this.A02;
        return C33094Eiy.A00(this.A04, this.A05, list, list2, (List) this.A03, map);
    }
}
