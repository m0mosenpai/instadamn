package com.instagram.video.live.mvvm.viewmodel.cameraeffect;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC23611Dp;
import X.AbstractC53639Nnk;
import X.C05A;
import X.C0eB;
import X.C50957MfQ;
import X.EnumC1810181d;
import X.InterfaceC16570sA;
import X.InterfaceC23621Ds;
import X.MUG;
import X.N1P;
import com.instagram.camera.effect.models.CameraAREffect;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.cameraeffect.IgLiveFaceFilterViewModel$1", f = "IgLiveFaceFilterViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgLiveFaceFilterViewModel$1 extends AbstractC23611Dp implements InterfaceC16570sA {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public /* synthetic */ boolean A04;
    public final /* synthetic */ C50957MfQ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgLiveFaceFilterViewModel$1(C50957MfQ c50957MfQ, InterfaceC23621Ds interfaceC23621Ds) {
        super(6, interfaceC23621Ds);
        this.A05 = c50957MfQ;
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        boolean A1a3 = AbstractC166987dD.A1a(obj3);
        boolean A1a4 = AbstractC166987dD.A1a(obj4);
        IgLiveFaceFilterViewModel$1 igLiveFaceFilterViewModel$1 = new IgLiveFaceFilterViewModel$1(this.A05, (InterfaceC23621Ds) obj6);
        igLiveFaceFilterViewModel$1.A01 = A1a;
        igLiveFaceFilterViewModel$1.A02 = A1a2;
        igLiveFaceFilterViewModel$1.A03 = A1a3;
        igLiveFaceFilterViewModel$1.A04 = A1a4;
        igLiveFaceFilterViewModel$1.A00 = obj5;
        return igLiveFaceFilterViewModel$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        N1P n1p;
        C50957MfQ c50957MfQ;
        EnumC1810181d enumC1810181d;
        AbstractC09560e7.A00(obj);
        boolean z = this.A01;
        boolean z2 = this.A02;
        boolean z3 = this.A03;
        boolean z4 = this.A04;
        AbstractC53639Nnk abstractC53639Nnk = (AbstractC53639Nnk) this.A00;
        CameraAREffect cameraAREffect = null;
        if (abstractC53639Nnk instanceof N1P) {
            n1p = (N1P) abstractC53639Nnk;
        } else {
            n1p = null;
        }
        boolean z5 = true;
        if (n1p == null || !n1p.A01) {
            z5 = false;
            cameraAREffect = this.A05.A00;
        }
        if (z) {
            if (!z2 && !z3 && z4) {
                c50957MfQ = this.A05;
                enumC1810181d = EnumC1810181d.A11;
            } else {
                c50957MfQ = this.A05;
                enumC1810181d = EnumC1810181d.A08;
            }
        } else {
            c50957MfQ = this.A05;
            enumC1810181d = EnumC1810181d.A0V;
        }
        C05A c05a = c50957MfQ.A06;
        c05a.Egh(new MUG(cameraAREffect, enumC1810181d, ((MUG) c05a.getValue()).A01));
        if (z5) {
            AbstractC166997dE.A1Y(c50957MfQ.A07, false);
        }
        return C0eB.A00;
    }
}
