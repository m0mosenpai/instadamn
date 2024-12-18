package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Aas, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23479Aas implements InterfaceC55932he {
    public int A00;
    public int A01;
    public C37905Gm2 A02;
    public WeakReference A03;
    public WeakReference A04;
    public float A05;
    public float A06;
    public final C55982hj A07;
    public final C55982hj A08;
    public final C55982hj A09;
    public final C55982hj A0A;
    public static final C55942hf A0D = C55942hf.A04(61.69d, 15.71d);
    public static final C55942hf A0E = C55942hf.A04(322.27d, 30.52d);
    public static final C55942hf A0C = C55942hf.A04(60.0d, 5.0d);
    public static final C55942hf A0B = C55942hf.A04(120.0d, 3.0d);

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        C55982hj c55982hj2 = this.A09;
        if (c55982hj == c55982hj2 && c55982hj2.A05 == A0D && c55982hj2.A0E(1.0d)) {
            c55982hj2.A09(A0E);
            c55982hj2.A06 = true;
            c55982hj2.A08(1.0d, true);
            c55982hj2.A04();
            this.A00 = C17s.A04(AbstractC50712Us.A00, new C17u(-10, 10));
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        InterfaceC74263Vh interfaceC74263Vh;
        float A02;
        InterfaceC74263Vh interfaceC74263Vh2;
        C14360o3.A0B(c55982hj, 0);
        C55982hj c55982hj2 = this.A09;
        if (c55982hj == c55982hj2) {
            float f = (float) c55982hj2.A09.A00;
            float f2 = (float) this.A08.A09.A00;
            float f3 = (float) this.A07.A09.A00;
            if (c55982hj2.A05 == A0D) {
                A02 = C17s.A02(f2, this.A05, 1.0f);
            } else {
                A02 = C17s.A02(f, 0.0f, this.A05);
            }
            this.A05 = A02;
            WeakReference weakReference = this.A03;
            if (weakReference != null && (interfaceC74263Vh2 = (InterfaceC74263Vh) weakReference.get()) != null) {
                interfaceC74263Vh2.Cwm(this.A02, f2, f, f3, A02);
            }
        }
        C55982hj c55982hj3 = this.A0A;
        if (c55982hj.equals(c55982hj3)) {
            float f4 = (float) c55982hj3.A09.A00;
            WeakReference weakReference2 = this.A04;
            if (weakReference2 != null && (interfaceC74263Vh = (InterfaceC74263Vh) weakReference2.get()) != null) {
                if (c55982hj3.A05 == A0C) {
                    this.A06 = C17s.A02(f4, this.A06, 1.0f);
                }
                if (c55982hj.A05 == C131325wL.A04) {
                    f4 = (Math.abs(f4) * (-2.25f)) + 1.2f;
                }
                interfaceC74263Vh.Cwm(null, f4, 0.0f, 0.0f, this.A06);
            }
        }
    }

    public C23479Aas() {
        C55952hg A00 = AbstractC13560mi.A00();
        C55982hj A02 = A00.A02();
        A02.A0A(this);
        this.A09 = A02;
        this.A08 = A00.A02();
        this.A07 = A00.A02();
        C55982hj A022 = A00.A02();
        A022.A0A(this);
        this.A0A = A022;
    }
}
