package X;

import java.util.List;

/* renamed from: X.GsS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38283GsS extends AbstractC140746Yc {
    public final int A00;
    public final C38321qM A01;
    public final InterfaceC671231d A02;
    public final C1PY A03;

    @Override // X.AbstractC672431p
    public final int A03(C40861ut c40861ut, int i, int i2, int i3) {
        C14360o3.A0B(c40861ut, 0);
        if (i3 == this.A00 && this.A01.CdW()) {
            return i3;
        }
        return A02(i, i2, i3, A01(i3, c40861ut.A03()), c40861ut.A07(), c40861ut.A08());
    }

    @Override // X.AbstractC140746Yc, X.AbstractC672431p
    public final C1PZ A08(List list) {
        C14360o3.A0B(list, 0);
        C1PZ A08 = super.A08(list);
        int i = super.A00;
        int A05 = A05(list);
        if (A05 == -1) {
            A05 = this.A00;
        }
        A08.A09 = i - A05;
        return A08;
    }

    @Override // X.AbstractC140746Yc, X.AbstractC672431p
    public final void A0G(C1PZ c1pz, int i, int i2, int i3, int i4) {
        C14360o3.A0B(c1pz, 0);
        super.A0G(c1pz, i, i2, i3, i4);
        int i5 = -1;
        if (i != -1) {
            i5 = (i3 - i) - 1;
        }
        c1pz.A09 = i5;
    }

    @Override // X.AbstractC672431p
    public final boolean A0K(C40861ut c40861ut) {
        return false;
    }

    public /* synthetic */ C38283GsS(C38321qM c38321qM, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C1PY c1py, int i) {
        super(new AnonymousClass326(), new C671931k(interfaceC62242sP), true);
        this.A03 = c1py;
        this.A00 = i;
        this.A02 = interfaceC671231d;
        this.A01 = c38321qM;
    }

    @Override // X.AbstractC672431p
    public final int A01(int i, int i2) {
        return Math.max(this.A00 + i2, i + 1);
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        C75113Zb c75113Zb = (C75113Zb) obj;
        C14360o3.A0B(c75113Zb, 0);
        return c75113Zb.getPosition();
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        C75113Zb c75113Zb = (C75113Zb) obj;
        C14360o3.A0B(c75113Zb, 0);
        return this.A02.BUP(c75113Zb.getPosition());
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ C40861ut A09(Object obj) {
        return C37469Gen.A00(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r4.A01.CdW() == false) goto L8;
     */
    @Override // X.AbstractC672431p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0H(X.InterfaceC57162jr r5, X.C1PZ r6, X.C40861ut r7, int r8, int r9, int r10) {
        /*
            r4 = this;
            X.AbstractC37302Gc3.A1U(r7, r6)
            X.1PY r0 = r4.A03
            java.util.LinkedList r0 = r0.A02
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 != 0) goto L31
            int r0 = r4.A00
            if (r10 != r0) goto L1b
            X.1qM r0 = r4.A01
            boolean r1 = r0.CdW()
            r0 = 1
            if (r1 != 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            r2 = 1
            if (r0 != 0) goto L30
            java.util.Set r0 = r4.A0D
            int r1 = r0.size()
            int r0 = r7.A07()
            if (r1 < r0) goto L31
            java.lang.String r0 = "consumed_media_gap_did_meet"
            r6.A01(r0)
        L30:
            return r2
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38283GsS.A0H(X.2jr, X.1PZ, X.1ut, int, int, int):boolean");
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ boolean A0I(InterfaceC57162jr interfaceC57162jr, C40861ut c40861ut, Object obj, int i, int i2, int i3, int i4, int i5) {
        return false;
    }
}
