package com.instagram.notifications.badging.ui.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.AbstractC58182la;
import X.C0eB;
import X.EnumC58122lU;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$displayStyle$3", f = "BaseBadgeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class BaseBadgeViewModel$displayStyle$3 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ AbstractC58182la A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBadgeViewModel$displayStyle$3(AbstractC58182la abstractC58182la, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A02 = abstractC58182la;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        BaseBadgeViewModel$displayStyle$3 baseBadgeViewModel$displayStyle$3 = new BaseBadgeViewModel$displayStyle$3(this.A02, (InterfaceC23621Ds) obj3);
        baseBadgeViewModel$displayStyle$3.A00 = obj;
        baseBadgeViewModel$displayStyle$3.A01 = booleanValue;
        return baseBadgeViewModel$displayStyle$3.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        Object obj2 = this.A00;
        boolean z = this.A01;
        EnumC58122lU enumC58122lU = this.A02.A0A;
        if (enumC58122lU != null && z) {
            return enumC58122lU;
        }
        return obj2;
    }
}
