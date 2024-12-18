package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.CnR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28795CnR implements InterfaceC74963Ym {
    public AbstractC118405Xc A00;
    public boolean A01;
    public boolean A02;
    public final C57F A03;
    public final C6LO A04;
    public final InterfaceC74953Yl A05;
    public final InterfaceC74953Yl A06;
    public final InterfaceC74953Yl A07;
    public final InterfaceC74953Yl A08;
    public final InterfaceC74953Yl A09;
    public final C5Y5 A0A;
    public final C5Y4 A0B;
    public final InterfaceC118485Xk A0C;
    public final /* synthetic */ BTO A0D;

    public C28795CnR(AbstractC118405Xc abstractC118405Xc, BTO bto, InterfaceC118485Xk interfaceC118485Xk, Object obj) {
        this.A0D = bto;
        this.A0C = interfaceC118485Xk;
        Object obj2 = null;
        this.A08 = AbstractC25230BEn.A0U(obj);
        C5Y4 A0I = AbstractC25225BEi.A0I(null, 1.0f, 1500.0f);
        this.A0B = A0I;
        ParcelableSnapshotMutableState A0R = AbstractC25229BEm.A0R(A0I);
        this.A06 = A0R;
        this.A05 = AbstractC25229BEm.A0R(new C62C((C5Y6) A0R.getValue(), abstractC118405Xc, interfaceC118485Xk, obj, this.A08.getValue()));
        this.A07 = AbstractC25229BEm.A0R(AbstractC166997dE.A0b());
        this.A03 = new ParcelableSnapshotMutableFloatState(-1.0f);
        this.A09 = AbstractC25229BEm.A0R(obj);
        this.A00 = abstractC118405Xc;
        this.A04 = new ParcelableSnapshotMutableLongState(((C62C) this.A05.getValue()).Azo());
        Number number = (Number) CNF.A01.get(interfaceC118485Xk);
        if (number != null) {
            float floatValue = number.floatValue();
            AbstractC118405Xc abstractC118405Xc2 = (AbstractC118405Xc) ((C118475Xj) interfaceC118485Xk).A01.invoke(obj);
            int A01 = abstractC118405Xc2.A01();
            for (int i = 0; i < A01; i++) {
                abstractC118405Xc2.A03(i, floatValue);
            }
            obj2 = ((C118475Xj) this.A0C).A00.invoke(abstractC118405Xc2);
        }
        this.A0A = AbstractC25225BEi.A0I(obj2, 1.0f, 1500.0f);
    }

    private final void A00(Object obj, boolean z) {
        C5Y6 c5y6;
        InterfaceC74953Yl interfaceC74953Yl = this.A08;
        if (interfaceC74953Yl.getValue() == null) {
            C62C c62c = new C62C(this.A0A, AbstractC137336Kc.A01(this.A00), this.A0C, obj, obj);
            InterfaceC74953Yl interfaceC74953Yl2 = this.A05;
            interfaceC74953Yl2.Egh(c62c);
            this.A02 = true;
            this.A04.EYa(((C62C) interfaceC74953Yl2.getValue()).Azo());
            return;
        }
        if (z && !this.A01 && !(this.A06.getValue() instanceof C5Y4)) {
            c5y6 = this.A0A;
        } else {
            c5y6 = (C5Y6) this.A06.getValue();
        }
        BTO bto = this.A0D;
        if (bto.A02() > 0) {
            c5y6 = new C28709Cm1(c5y6, bto.A02());
        }
        C62C c62c2 = new C62C(c5y6, this.A00, this.A0C, obj, interfaceC74953Yl.getValue());
        InterfaceC74953Yl interfaceC74953Yl3 = this.A05;
        interfaceC74953Yl3.Egh(c62c2);
        this.A04.EYa(((C62C) interfaceC74953Yl3.getValue()).Azo());
        this.A02 = false;
        InterfaceC74953Yl interfaceC74953Yl4 = bto.A08;
        AbstractC25227BEk.A1A(interfaceC74953Yl4, true);
        if (!AbstractC25230BEn.A1X(bto.A05)) {
            return;
        }
        C6MK c6mk = bto.A09;
        int size = c6mk.size();
        for (int i = 0; i < size; i++) {
            C28795CnR c28795CnR = (C28795CnR) c6mk.get(i);
            c28795CnR.A04.BPC();
            c28795CnR.A01(bto.A00);
        }
        AbstractC25227BEk.A1A(interfaceC74953Yl4, false);
    }

    public final void A01(long j) {
        if (this.A03.B72() == -1.0f) {
            this.A01 = true;
            InterfaceC74953Yl interfaceC74953Yl = this.A05;
            boolean A0K = C14360o3.A0K(((C62C) interfaceC74953Yl.getValue()).A05, ((C62C) interfaceC74953Yl.getValue()).A04);
            C62C c62c = (C62C) interfaceC74953Yl.getValue();
            if (A0K) {
                this.A09.Egh(c62c.A05);
            } else {
                this.A09.Egh(c62c.CEW(j));
                this.A00 = ((C62C) interfaceC74953Yl.getValue()).CEl(j);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r6.B72() == (-3.0f)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C5Y5 r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r8.A02
            if (r0 == 0) goto Lc
            r0 = 0
            boolean r0 = X.C14360o3.A0K(r10, r0)
            if (r0 == 0) goto Lc
            return
        Lc:
            X.3Yl r1 = r8.A08
            boolean r0 = X.AbstractC25229BEm.A1U(r1, r10)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            if (r0 == 0) goto L22
            X.57F r0 = r8.A03
            float r0 = r0.B72()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L22
            return
        L22:
            r1.Egh(r10)
            X.3Yl r0 = r8.A06
            r0.Egh(r9)
            X.57F r6 = r8.A03
            float r0 = r6.B72()
            r3 = -1069547520(0xffffffffc0400000, float:-3.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L89
            r0 = r10
        L37:
            X.3Yl r2 = r8.A07
            boolean r1 = X.AbstractC25230BEn.A1X(r2)
            r1 = r1 ^ 1
            r8.A00(r0, r1)
            float r0 = r6.B72()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            X.AbstractC25227BEk.A1A(r2, r0)
            float r1 = r6.B72()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L80
            X.3Yl r1 = r8.A05
            java.lang.Object r0 = r1.getValue()
            X.62C r0 = (X.C62C) r0
            long r2 = r0.Azo()
            java.lang.Object r7 = r1.getValue()
            X.62C r7 = (X.C62C) r7
            float r1 = (float) r2
            float r0 = r6.B72()
            float r1 = r1 * r0
            long r0 = (long) r1
            java.lang.Object r10 = r7.CEW(r0)
        L75:
            X.3Yl r0 = r8.A09
            r0.Egh(r10)
        L7a:
            r8.A02 = r4
            r6.EUc(r5)
            return
        L80:
            float r0 = r6.B72()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L7a
            goto L75
        L89:
            X.3Yl r0 = r8.A09
            java.lang.Object r0 = r0.getValue()
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28795CnR.A02(X.5Y5, java.lang.Object):void");
    }

    public final void A03(C5Y5 c5y5, Object obj, Object obj2) {
        this.A08.Egh(obj2);
        this.A06.Egh(c5y5);
        InterfaceC74953Yl interfaceC74953Yl = this.A05;
        if (C14360o3.A0K(((C62C) interfaceC74953Yl.getValue()).A04, obj) && C14360o3.A0K(((C62C) interfaceC74953Yl.getValue()).A05, obj2)) {
            return;
        }
        A00(obj, false);
    }

    @Override // X.InterfaceC74963Ym
    public final Object getValue() {
        return this.A09.getValue();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("current value: ");
        A1C.append(this.A09.getValue());
        A1C.append(", target: ");
        A1C.append(this.A08.getValue());
        A1C.append(", spec: ");
        return AbstractC166997dE.A0v(this.A06.getValue(), A1C);
    }
}
