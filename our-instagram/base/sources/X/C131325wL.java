package X;

import java.lang.ref.WeakReference;

/* renamed from: X.5wL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131325wL implements InterfaceC55932he {
    public WeakReference A00;
    public WeakReference A01;
    public final C55982hj A02;
    public final C55982hj A03;
    public static final C55942hf A05 = C55942hf.A04(60.0d, 5.0d);
    public static final C55942hf A06 = C55942hf.A04(40.0d, 1.0d);
    public static final C55942hf A04 = C55942hf.A04(1.0d, 4.0d);

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        WeakReference weakReference;
        InterfaceC74253Vg interfaceC74253Vg;
        C14360o3.A0B(c55982hj, 0);
        C55982hj c55982hj2 = this.A02;
        if (c55982hj == c55982hj2 && c55982hj2.A05 == A05 && c55982hj2.A0E(1.0d)) {
            c55982hj2.A09(A06);
            c55982hj2.A06 = true;
            c55982hj2.A05(1.0d);
            c55982hj2.A06(0.0d);
        }
        if (c55982hj == this.A03 && (weakReference = this.A01) != null && (interfaceC74253Vg = (InterfaceC74253Vg) weakReference.get()) != null) {
            interfaceC74253Vg.CwW();
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        WeakReference weakReference;
        InterfaceC74253Vg interfaceC74253Vg;
        WeakReference weakReference2;
        InterfaceC74253Vg interfaceC74253Vg2;
        C14360o3.A0B(c55982hj, 0);
        C55942hf c55942hf = c55982hj.A05;
        float f = (float) c55982hj.A09.A00;
        boolean z = true;
        if (c55982hj == this.A02 && (weakReference2 = this.A00) != null && (interfaceC74253Vg2 = (InterfaceC74253Vg) weakReference2.get()) != null) {
            boolean z2 = false;
            if (c55942hf == A05) {
                z2 = true;
            }
            interfaceC74253Vg2.Cwl(z2, f);
        }
        if (c55982hj == this.A03 && (weakReference = this.A01) != null && (interfaceC74253Vg = (InterfaceC74253Vg) weakReference.get()) != null) {
            if (c55942hf == A04) {
                f = (Math.abs(f) * (-2.25f)) + 1.2f;
            }
            if (c55942hf != A05) {
                z = false;
            }
            interfaceC74253Vg.Cwl(z, f);
        }
    }

    public final void A00(WeakReference weakReference) {
        this.A00 = weakReference;
        C55982hj c55982hj = this.A02;
        if (!c55982hj.A0C()) {
            Dnm(c55982hj);
        }
    }

    public final void A01(WeakReference weakReference) {
        this.A01 = weakReference;
        C55982hj c55982hj = this.A03;
        if (!c55982hj.A0C()) {
            Dnm(c55982hj);
        }
    }

    public final void A02(boolean z, boolean z2, boolean z3) {
        if (z3 && (z2 || !z)) {
            C55982hj c55982hj = this.A02;
            c55982hj.A09(A05);
            c55982hj.A06 = false;
            c55982hj.A05(0.0d);
            c55982hj.A06(1.0d);
        } else {
            this.A02.A05(0.0d);
        }
        if (z && z2) {
            C55982hj c55982hj2 = this.A03;
            c55982hj2.A09(A04);
            c55982hj2.A05(-0.1d);
            c55982hj2.A06(0.1d);
            return;
        }
        C55982hj c55982hj3 = this.A03;
        c55982hj3.A09(A05);
        c55982hj3.A05(0.0d);
        c55982hj3.A06(1.0d);
    }

    public C131325wL() {
        C55952hg A00 = AbstractC13560mi.A00();
        C55982hj A02 = A00.A02();
        A02.A0A(this);
        this.A02 = A02;
        C55982hj A022 = A00.A02();
        A022.A0A(this);
        this.A03 = A022;
    }
}
