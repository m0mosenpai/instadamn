package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6YX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YX extends AbstractC60592pi implements InterfaceC147086jk {
    public final UserSession A00;
    public final C101934i8 A01;
    public final C42999Izp A02;
    public final C32S A03;
    public final C1PY A04;
    public final InterfaceC671531g A05;
    public final List A06;

    public C6YX(UserSession userSession, C101934i8 c101934i8, C32S c32s, C26281Pj c26281Pj, C31E c31e, C1PY c1py, InterfaceC671531g interfaceC671531g, List list) {
        C14360o3.A0B(c1py, 4);
        C14360o3.A0B(c26281Pj, 7);
        this.A00 = userSession;
        this.A03 = c32s;
        this.A05 = interfaceC671531g;
        this.A04 = c1py;
        this.A01 = c101934i8;
        this.A06 = list;
        List list2 = c1py.A00;
        if (!list2.contains(c101934i8)) {
            list2.add(0, c101934i8);
        }
        interfaceC671531g.A7z(c101934i8);
        if (C18U.A06(C06090Tz.A06, userSession, 36321619299477129L)) {
            C42999Izp c42999Izp = new C42999Izp(userSession, c101934i8, c32s, c26281Pj, c31e);
            this.A02 = c42999Izp;
            C3HY.A00(userSession).A00(c42999Izp);
        }
    }

    @Override // X.C42I
    public final void Cta(InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, int i4) {
        boolean z = false;
        if (i < i4) {
            z = true;
        }
        boolean z2 = i3 > i4;
        if (z || z2) {
            C32S c32s = this.A03;
            if (!z2) {
                i3 = i2 - 1;
            }
            c32s.A0C(i3);
        }
    }

    @Override // X.InterfaceC147026je
    public final void DNf(C41181vS c41181vS) {
    }

    @Override // X.InterfaceC147026je
    public final void DNx(C41181vS c41181vS, int i) {
        C14360o3.A0B(c41181vS, 0);
        if (!c41181vS.CdW() && !c41181vS.A1Q()) {
            this.A03.A02 = i;
        }
    }

    @Override // X.C42J
    public final void DXS(int i) {
    }

    @Override // X.InterfaceC62892tS
    public final void DXb(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diq(C3VZ c3vz, float f, float f2) {
    }

    @Override // X.InterfaceC62892tS
    public final void Diy(C3VZ c3vz, C3VZ c3vz2) {
    }

    @Override // X.InterfaceC62892tS
    public final void DrZ(int i, int i2) {
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ void DyE(int i, float f) {
    }

    @Override // X.InterfaceC62892tS
    public final void E0r(View view) {
    }

    @Override // X.InterfaceC147086jk
    public final void E3j(String str) {
        C14360o3.A0B(str, 0);
        C672131m c672131m = this.A03.A0a;
        if (c672131m.A00) {
            c672131m.A01.add(str);
        }
    }

    @Override // X.InterfaceC147086jk
    public final void EKn(String str) {
        C14360o3.A0B(str, 0);
        C672131m c672131m = this.A03.A0a;
        if (c672131m.A00) {
            c672131m.A01.remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36323715244305934L) == false) goto L6;
     */
    @Override // X.InterfaceC147086jk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer BHm() {
        /*
            r5 = this;
            X.32S r0 = r5.A03
            X.31d r4 = r0.A0U
            X.C14360o3.A07(r4)
            com.instagram.common.session.UserSession r3 = r5.A00
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            java.lang.Boolean r0 = X.C1P9.A00(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L25
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323715244305934(0x810c3a000f2e0e, double:3.0346020121358516E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L26
        L25:
            r0 = 0
        L26:
            r1 = 0
            if (r0 == 0) goto L36
            boolean r0 = r4 instanceof X.C140786Yg
            if (r0 == 0) goto L35
            X.6Yg r4 = (X.C140786Yg) r4
            int r0 = r4.A00
        L31:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L35:
            return r1
        L36:
            boolean r0 = r4 instanceof X.C140456Wz
            if (r0 == 0) goto L35
            X.6Wz r4 = (X.C140456Wz) r4
            int r0 = r4.A00
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6YX.BHm():java.lang.Integer");
    }

    @Override // X.InterfaceC147086jk
    public final InterfaceC101944i9 Blh() {
        return this.A01;
    }

    @Override // X.InterfaceC62892tS
    public final /* synthetic */ boolean CtU() {
        return false;
    }

    @Override // X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        this.A03.A0D(i, i2);
    }

    @Override // X.C42J
    public final void DXR(int i) {
        this.A03.A0C(i);
    }

    @Override // X.InterfaceC147086jk
    public final void DpL(C41551w4 c41551w4, String str) {
        C32S c32s = this.A03;
        if (c32s.A0U.F9C(c41551w4, str, null)) {
            c32s.A0W.AWR(EnumC72351Xbn.A04, new C1PZ(C05F.A00), c41551w4);
        }
    }

    @Override // X.InterfaceC147086jk
    public final void Dr9() {
        InterfaceC671531g interfaceC671531g = this.A05;
        C101934i8 c101934i8 = this.A01;
        interfaceC671531g.EF6(c101934i8);
        C1PY c1py = this.A04;
        c1py.A00.remove(c101934i8);
        List list = this.A06;
        for (Object obj : list) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.pool.SponsoredContentPool.PoolProximityListener<com.instagram.model.reels.ReelViewModel>");
            c1py.A04.remove(obj);
        }
        list.clear();
        C42999Izp c42999Izp = this.A02;
        if (c42999Izp != null) {
            C3HY.A00(this.A00).A01(c42999Izp);
        }
        this.A03.A0B();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A03.A0Z.DrD();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A03.A0Z.DrJ();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        Dr9();
    }
}
