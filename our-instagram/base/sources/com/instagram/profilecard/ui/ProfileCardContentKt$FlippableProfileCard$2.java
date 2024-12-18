package com.instagram.profilecard.ui;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.C0eB;
import X.C15080pO;
import X.InterfaceC16610sE;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC74953Yl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.profilecard.ui.ProfileCardContentKt$FlippableProfileCard$2", f = "ProfileCardContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class ProfileCardContentKt$FlippableProfileCard$2 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ float A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ InterfaceC16660sJ A02;
    public final /* synthetic */ C15080pO A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCardContentKt$FlippableProfileCard$2(InterfaceC74953Yl interfaceC74953Yl, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, C15080pO c15080pO) {
        super(3, interfaceC23621Ds);
        this.A02 = interfaceC16660sJ;
        this.A03 = c15080pO;
        this.A01 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        float A09 = AbstractC166987dD.A09(obj2);
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        C15080pO c15080pO = this.A03;
        ProfileCardContentKt$FlippableProfileCard$2 profileCardContentKt$FlippableProfileCard$2 = new ProfileCardContentKt$FlippableProfileCard$2(this.A01, (InterfaceC23621Ds) obj3, interfaceC16660sJ, c15080pO);
        profileCardContentKt$FlippableProfileCard$2.A00 = A09;
        return profileCardContentKt$FlippableProfileCard$2.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        float f;
        AbstractC09560e7.A00(obj);
        float f2 = this.A00;
        AbstractC25227BEk.A1A(this.A01, false);
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        float f3 = this.A03.A00;
        float f4 = 0.0f;
        if (Math.abs(f2) > 1000.0f) {
            f = Math.signum(f2) * 90.0f;
        } else {
            f = 0.0f;
        }
        float f5 = 360.0f;
        float f6 = (f3 % 360.0f) + f;
        float f7 = ((int) (f3 / 360.0f)) * 360.0f;
        if (-90.0f <= f6 && f6 <= 90.0f) {
            f4 = f7;
        } else {
            float abs = Math.abs(f6);
            if (abs < 270.0f) {
                if (abs >= 90.0f) {
                    f5 = 180.0f;
                }
            }
            f4 = f7 + (Math.signum(f3) * f5);
        }
        interfaceC16660sJ.invoke(AbstractC25225BEi.A10(f4));
        return C0eB.A00;
    }
}
