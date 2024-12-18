package androidx.compose.foundation.lazy.grid;

import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC25327BIw;
import X.AbstractC74903Yf;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C25679BWp;
import X.C28354CfE;
import X.C28751Cmj;
import X.C28752Cmk;
import X.C28754Cmm;
import X.C28836Co6;
import X.C57155PYz;
import X.C59A;
import X.C5C7;
import X.C5XN;
import X.C5XO;
import X.C6IO;
import X.C6M4;
import X.C6M5;
import X.C6M9;
import X.C6MA;
import X.C6MF;
import X.C6MH;
import X.C6MJ;
import X.CZP;
import X.DHO;
import X.DJE;
import X.DRS;
import X.DZO;
import X.EnumC27348C5d;
import X.InterfaceC09390do;
import X.InterfaceC118925a9;
import X.InterfaceC23621Ds;
import X.InterfaceC30767Dg4;
import X.InterfaceC30768Dg5;
import X.InterfaceC30769Dg6;
import X.InterfaceC74953Yl;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes5.dex */
public final class LazyGridState implements C6M4 {
    public static final C5C7 A0L = C6M5.A00(DJE.A00, DZO.A00);
    public float A00;
    public C59A A01;
    public boolean A02;
    public int A03;
    public final C6M4 A04;
    public final C5XO A05;
    public final C28754Cmm A06;
    public final InterfaceC30768Dg5 A07;
    public final InterfaceC30769Dg6 A08;
    public final C28354CfE A09;
    public final AwaitFirstLayoutModifier A0A;
    public final C6MF A0B;
    public final C6IO A0C;
    public final C6MJ A0D;
    public final C6MH A0E;
    public final InterfaceC74953Yl A0F;
    public final InterfaceC74953Yl A0G;
    public final InterfaceC74953Yl A0H;
    public final InterfaceC74953Yl A0I;
    public final InterfaceC74953Yl A0J;
    public final InterfaceC118925a9 A0K;

    public final Object A01(InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        Object EMA = EMA(EnumC27348C5d.Default, interfaceC23621Ds, new C57155PYz(this, null, i, i2, 0));
        if (EMA != C1JX.A02) {
            return C0eB.A00;
        }
        return EMA;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.C6M4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EMA(X.EnumC27348C5d r7, X.InterfaceC23621Ds r8, X.InterfaceC16620sF r9) {
        /*
            r6 = this;
            r3 = 0
            boolean r0 = X.MAL.A01(r8, r3)
            if (r0 == 0) goto L5a
            r5 = r8
            X.MAL r5 = (X.MAL) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r4 = r5.A04
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L29
            if (r0 != r2) goto L60
            X.AbstractC09560e7.A00(r4)
        L26:
            X.0eB r3 = X.C0eB.A00
        L28:
            return r3
        L29:
            java.lang.Object r9 = r5.A03
            X.0sF r9 = (X.InterfaceC16620sF) r9
            java.lang.Object r7 = r5.A02
            X.C5d r7 = (X.EnumC27348C5d) r7
            java.lang.Object r0 = r5.A01
            androidx.compose.foundation.lazy.grid.LazyGridState r0 = (androidx.compose.foundation.lazy.grid.LazyGridState) r0
            X.AbstractC09560e7.A00(r4)
            goto L48
        L39:
            X.AbstractC09560e7.A00(r4)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r6.A0A
            X.AbstractC25235BEs.A1J(r6, r7, r9, r5, r1)
            java.lang.Object r0 = r0.A00(r5)
            if (r0 == r3) goto L28
            r0 = r6
        L48:
            X.6M4 r1 = r0.A04
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A03 = r0
            r5.A00 = r2
            java.lang.Object r0 = r1.EMA(r7, r5, r9)
            if (r0 != r3) goto L26
            return r3
        L5a:
            X.MAL r5 = new X.MAL
            r5.<init>(r6, r8, r3)
            goto L15
        L60:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.EMA(X.C5d, X.1Ds, X.0sF):java.lang.Object");
    }

    public final InterfaceC30767Dg4 A00() {
        return (InterfaceC30767Dg4) this.A0H.getValue();
    }

    public final void A02(int i, int i2) {
        C28354CfE c28354CfE = this.A09;
        if (c28354CfE.A03.BIi() != i || c28354CfE.A04.BIi() != i2) {
            this.A0C.A06();
        }
        C28354CfE.A00(c28354CfE, i, i2);
        c28354CfE.A00 = null;
        C59A c59a = this.A01;
        if (c59a != null) {
            c59a.AWW();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C28836Co6 r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.A03(X.Co6, boolean):void");
    }

    @Override // X.C6M4
    public final float APr(float f) {
        return this.A04.APr(f);
    }

    @Override // X.C6M4
    public final boolean Akm() {
        return AbstractC25230BEn.A1X(this.A0F);
    }

    @Override // X.C6M4
    public final boolean Akn() {
        return AbstractC25230BEn.A1X(this.A0G);
    }

    @Override // X.C6M4
    public final boolean CcT() {
        return this.A04.CcT();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    public LazyGridState(InterfaceC30769Dg6 interfaceC30769Dg6, int i, int i2) {
        this.A08 = interfaceC30769Dg6;
        this.A09 = new C28354CfE(i, i2);
        C28836Co6 c28836Co6 = CZP.A00;
        C6M9 c6m9 = C6M9.A00;
        C14360o3.A0C(c6m9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A0H = new ParcelableSnapshotMutableState(c6m9, c28836Co6);
        this.A05 = new C5XN();
        this.A04 = new C6MA(DRS.A00(this, 39));
        this.A02 = true;
        this.A0K = new C25679BWp(this, 0);
        this.A0A = new Object();
        this.A0C = new C6IO();
        this.A0B = new C6MF();
        this.A0E = new C6MH(new DHO(i, 0, this));
        this.A07 = new C28751Cmj(this);
        this.A06 = new C28754Cmm(this);
        this.A0D = new C6MJ();
        this.A0J = AbstractC25327BIw.A00();
        this.A0I = AbstractC25327BIw.A00();
        this.A0G = AbstractC25229BEm.A0R(false);
        this.A0F = AbstractC25229BEm.A0R(false);
    }

    public LazyGridState() {
        this(new C28752Cmk(2), 0, 0);
    }
}
