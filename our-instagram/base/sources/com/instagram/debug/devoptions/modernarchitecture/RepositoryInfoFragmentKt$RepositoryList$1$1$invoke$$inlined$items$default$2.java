package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC166987dD;
import X.C0YY;
import X.InterfaceC16660sJ;
import java.util.List;

/* loaded from: classes4.dex */
public final class RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$2 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ List $items;
    public final /* synthetic */ InterfaceC16660sJ $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$2(InterfaceC16660sJ interfaceC16660sJ, List list) {
        super(1);
        this.$key = interfaceC16660sJ;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(AbstractC166987dD.A0H(obj));
    }
}
