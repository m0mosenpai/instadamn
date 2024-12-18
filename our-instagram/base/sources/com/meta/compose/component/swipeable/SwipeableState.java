package com.meta.compose.component.swipeable;

import X.AbstractC001800i;
import X.AbstractC06930Yk;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AnonymousClass627;
import X.BG5;
import X.C0eB;
import X.C14360o3;
import X.C16240rS;
import X.C1JX;
import X.C28727CmJ;
import X.C29892DGg;
import X.C30179DRk;
import X.C30455Db0;
import X.C50540MSt;
import X.C5Y6;
import X.D4s;
import X.EnumC27348C5d;
import X.InterfaceC16610sE;
import X.InterfaceC16660sJ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC30902DiF;
import X.InterfaceC74953Yl;
import java.util.Map;

/* loaded from: classes5.dex */
public final class SwipeableState {
    public float A00;
    public float A01;
    public final C5Y6 A02;
    public final InterfaceC30902DiF A03;
    public final InterfaceC74953Yl A04;
    public final InterfaceC74953Yl A05;
    public final InterfaceC74953Yl A06;
    public final InterfaceC74953Yl A07;
    public final InterfaceC74953Yl A08;
    public final InterfaceC74953Yl A09;
    public final InterfaceC74953Yl A0A;
    public final InterfaceC74953Yl A0B;
    public final InterfaceC74953Yl A0C;
    public final InterfaceC74953Yl A0D;
    public final InterfaceC16660sJ A0E;
    public final InterfaceC19390xP A0F;

    public static final Object A00(C5Y6 c5y6, SwipeableState swipeableState, InterfaceC23621Ds interfaceC23621Ds, float f) {
        Object AQL = swipeableState.A03.AQL(EnumC27348C5d.Default, interfaceC23621Ds, new D4s(c5y6, swipeableState, (InterfaceC23621Ds) null, f));
        if (AQL != C1JX.A02) {
            return C0eB.A00;
        }
        return AQL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0185 A[Catch: all -> 0x019b, TryCatch #3 {all -> 0x019b, blocks: (B:13:0x0034, B:22:0x0048, B:26:0x016d, B:28:0x0185), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.util.Map r12, java.util.Map r13, X.InterfaceC23621Ds r14) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.compose.component.swipeable.SwipeableState.A02(java.util.Map, java.util.Map, X.1Ds):java.lang.Object");
    }

    public SwipeableState(C5Y6 c5y6, Object obj, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1R(c5y6, interfaceC16660sJ);
        this.A02 = c5y6;
        this.A0E = interfaceC16660sJ;
        this.A07 = AbstractC25230BEn.A0U(obj);
        this.A08 = AbstractC25229BEm.A0R(AbstractC166997dE.A0a());
        Float A0l = AbstractC25227BEk.A0l();
        this.A09 = AbstractC25229BEm.A0R(A0l);
        this.A0A = AbstractC25229BEm.A0R(A0l);
        this.A04 = AbstractC25229BEm.A0R(A0l);
        this.A06 = AbstractC25229BEm.A0R(null);
        this.A05 = AbstractC25229BEm.A0R(AbstractC06930Yk.A0E());
        this.A0F = new C16240rS(new C50540MSt(AnonymousClass627.A02(C29892DGg.A00(this, 28)), 31));
        this.A01 = Float.NEGATIVE_INFINITY;
        this.A00 = Float.POSITIVE_INFINITY;
        this.A0C = AbstractC25229BEm.A0R(C30455Db0.A00);
        this.A0D = AbstractC25229BEm.A0R(A0l);
        this.A0B = AbstractC25229BEm.A0R(null);
        C30179DRk A01 = C30179DRk.A01(this, 35);
        InterfaceC16610sE interfaceC16610sE = BG5.A00;
        this.A03 = new C28727CmJ(A01);
    }

    public static void A01(SwipeableState swipeableState, Map map) {
        Float A08 = AbstractC001800i.A08(map.keySet());
        C14360o3.A0A(A08);
        swipeableState.A01 = A08.floatValue();
        Float A07 = AbstractC001800i.A07(map.keySet());
        C14360o3.A0A(A07);
        swipeableState.A00 = A07.floatValue();
    }
}
