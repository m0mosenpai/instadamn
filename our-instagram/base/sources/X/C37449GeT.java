package X;

import java.util.List;

/* renamed from: X.GeT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37449GeT extends AbstractC140746Yc {
    public final int A00;
    public final InterfaceC671231d A01;
    public final C1PY A02;

    @Override // X.AbstractC672431p
    public final int A03(C40861ut c40861ut, int i, int i2, int i3) {
        C14360o3.A0B(c40861ut, 0);
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

    public /* synthetic */ C37449GeT(InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C1PY c1py, int i) {
        super(new AnonymousClass326(), new C671931k(interfaceC62242sP), true);
        this.A02 = c1py;
        this.A00 = i;
        this.A01 = interfaceC671231d;
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
        return this.A01.BUP(c75113Zb.getPosition());
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ C40861ut A09(Object obj) {
        return C37469Gen.A00(obj);
    }

    @Override // X.AbstractC672431p
    public final boolean A0H(InterfaceC57162jr interfaceC57162jr, C1PZ c1pz, C40861ut c40861ut, int i, int i2, int i3) {
        AbstractC37302Gc3.A1U(c40861ut, c1pz);
        if (this.A02.A02.isEmpty() || this.A0D.size() < c40861ut.A07()) {
            return false;
        }
        c1pz.A01("consumed_media_gap_did_meet");
        return true;
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ boolean A0I(InterfaceC57162jr interfaceC57162jr, C40861ut c40861ut, Object obj, int i, int i2, int i3, int i4, int i5) {
        return false;
    }
}
