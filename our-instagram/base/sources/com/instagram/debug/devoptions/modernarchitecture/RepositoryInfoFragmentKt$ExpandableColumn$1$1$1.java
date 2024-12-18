package com.instagram.debug.devoptions.modernarchitecture;

import X.AbstractC25227BEk;
import X.AbstractC25230BEn;
import X.C0YY;
import X.C0eB;
import X.InterfaceC16820sZ;
import X.InterfaceC74953Yl;

/* loaded from: classes5.dex */
public final class RepositoryInfoFragmentKt$ExpandableColumn$1$1$1 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InterfaceC74953Yl $isExpanded$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryInfoFragmentKt$ExpandableColumn$1$1$1(InterfaceC74953Yl interfaceC74953Yl) {
        super(0);
        this.$isExpanded$delegate = interfaceC74953Yl;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m78invoke() {
        AbstractC25227BEk.A1A(this.$isExpanded$delegate, !AbstractC25230BEn.A1X(r1));
    }

    @Override // X.InterfaceC16820sZ
    public /* bridge */ /* synthetic */ Object invoke() {
        m78invoke();
        return C0eB.A00;
    }
}
