package com.instagram.notifications.badging.ui.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$shouldShowBadge$2", f = "BaseBadgeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class BaseBadgeViewModel$shouldShowBadge$2 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ boolean A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBadgeViewModel$shouldShowBadge$2(InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(3, interfaceC23621Ds);
        this.A02 = z;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        BaseBadgeViewModel$shouldShowBadge$2 baseBadgeViewModel$shouldShowBadge$2 = new BaseBadgeViewModel$shouldShowBadge$2((InterfaceC23621Ds) obj3, this.A02);
        baseBadgeViewModel$shouldShowBadge$2.A00 = booleanValue;
        baseBadgeViewModel$shouldShowBadge$2.A01 = booleanValue2;
        return baseBadgeViewModel$shouldShowBadge$2.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AbstractC09560e7.A00(obj);
        boolean z2 = this.A00;
        boolean z3 = this.A01;
        if (z2 && (!z3 || this.A02)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
