package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC166987dD;
import X.C0YY;
import X.InterfaceC16660sJ;
import java.util.List;

/* loaded from: classes5.dex */
public final class RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$3 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ InterfaceC16660sJ $contentType;
    public final /* synthetic */ List $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$RepositoryList$1$1$invoke$$inlined$items$default$3(InterfaceC16660sJ interfaceC16660sJ, List list) {
        super(1);
        this.$contentType = interfaceC16660sJ;
        this.$items = list;
    }

    public final Object invoke(int i) {
        return this.$contentType.invoke(this.$items.get(i));
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(AbstractC166987dD.A0H(obj));
    }
}
