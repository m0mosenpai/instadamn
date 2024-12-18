package com.facebook.rp.platform.callutil;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25231BEo;
import X.AbstractC53430NkJ;
import X.AbstractC89993zf;
import X.C0eB;
import X.C14510oO;
import X.C15370ps;
import X.C16930sl;
import X.C1JX;
import X.C51981MyP;
import X.C51983MyR;
import X.C57782Pk9;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.ONE;
import X.OXh;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.callutil.WaitForCallConditionKt$waitForCallCondition$3", f = "WaitForCallCondition.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class WaitForCallConditionKt$waitForCallCondition$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C57782Pk9 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ C14510oO A06;
    public final /* synthetic */ C15370ps A07;
    public final /* synthetic */ C15370ps A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitForCallConditionKt$waitForCallCondition$3(C57782Pk9 c57782Pk9, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, C14510oO c14510oO, C15370ps c15370ps, C15370ps c15370ps2, long j) {
        super(2, interfaceC23621Ds);
        this.A01 = j;
        this.A04 = interfaceC16660sJ;
        this.A02 = c57782Pk9;
        this.A03 = str;
        this.A06 = c14510oO;
        this.A08 = c15370ps;
        this.A07 = c15370ps2;
        this.A05 = interfaceC16660sJ2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        long j = this.A01;
        InterfaceC16660sJ interfaceC16660sJ = this.A04;
        return new WaitForCallConditionKt$waitForCallCondition$3(this.A02, this.A03, interfaceC23621Ds, interfaceC16660sJ, this.A05, this.A06, this.A08, this.A07, j);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C14510oO c14510oO;
        C15370ps c15370ps;
        C15370ps c15370ps2;
        InterfaceC16660sJ interfaceC16660sJ;
        AbstractC53430NkJ abstractC53430NkJ;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            long j = this.A01;
            this.A00 = 1;
            if (AbstractC89993zf.A01(this, j) == c1jx) {
                return c1jx;
            }
        }
        InterfaceC16660sJ interfaceC16660sJ2 = this.A04;
        C57782Pk9 c57782Pk9 = this.A02;
        if (AbstractC25231BEo.A1a(c57782Pk9.B9j().invoke(), interfaceC16660sJ2)) {
            OXh.A02(null, "wait_for_call_condition_timeout_but_condition_passed", this.A03, null, C16930sl.A00, null, true);
            c14510oO = this.A06;
            c15370ps = this.A08;
            c15370ps2 = this.A07;
            interfaceC16660sJ = this.A05;
            abstractC53430NkJ = new C51981MyP(c57782Pk9);
        } else {
            c14510oO = this.A06;
            c15370ps = this.A08;
            c15370ps2 = this.A07;
            interfaceC16660sJ = this.A05;
            abstractC53430NkJ = C51983MyR.A00;
        }
        ONE.A01(abstractC53430NkJ, interfaceC16660sJ, c14510oO, c15370ps, c15370ps2);
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaitForCallConditionKt$waitForCallCondition$3) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
