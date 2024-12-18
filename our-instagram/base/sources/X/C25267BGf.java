package X;

/* renamed from: X.BGf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25267BGf extends C0T6 implements C6GC {
    public final float A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C6KV A04;

    @Override // X.C6GC
    public final C5AH ADD(C5Tl c5Tl, C6GD c6gd, int i) {
        C5AH c5ah;
        C14360o3.A0B(c6gd, 0);
        if (AbstractC25227BEk.A1U(c5Tl, -482811412)) {
            C0fH.A01(-1242197997, "com.instagram.compose.igds.components.button.LabelButtonStyle.backgroundShape (IgdsButton.kt:175)");
        }
        int ordinal = c6gd.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c5Tl.Eno(630317234);
                if (Float.compare(E3D(c6gd).A03, 0.0f) > 0) {
                    if (C1QI.A0E() == C1QL.A03) {
                        c5Tl.Eno(-2057871274);
                        C5XL.A02(c5Tl);
                        c5ah = C5WE.A01;
                    } else {
                        c5Tl.Eno(-2057869611);
                        C5XL.A02(c5Tl);
                        c5ah = C5WE.A00;
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                }
                c5ah = C5AF.A00;
            } else {
                throw AbstractC25233BEq.A0r(c5Tl, -2057883517);
            }
        } else {
            c5Tl.Eno(630152624);
            if (Float.compare(E3D(c6gd).A03, 0.0f) > 0) {
                C5XL.A02(c5Tl);
                c5ah = C5WE.A01;
            }
            c5ah = C5AF.A00;
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        if (AbstractC25227BEk.A1b(c117505Tk, false)) {
            C0fH.A00(-284460782);
        }
        C117505Tk.A0L(c117505Tk, false);
        return c5ah;
    }

    @Override // X.C6GC
    public final float Cpd(C6GD c6gd) {
        int A05 = AbstractC25227BEk.A05(c6gd, 0);
        if (A05 != 0) {
            if (A05 == 1) {
                return 44.0f;
            }
            throw B4Z.A00();
        }
        return 32.0f;
    }

    @Override // X.C6GC
    public final C1333560c E3D(C6GD c6gd) {
        float f;
        float f2;
        int A05 = AbstractC25227BEk.A05(c6gd, 0);
        if (A05 != 0) {
            if (A05 == 1) {
                f = 20.0f;
                f2 = 13.0f;
            } else {
                throw B4Z.A00();
            }
        } else {
            f = 16.0f;
            f2 = 5.0f;
        }
        return new C1333560c(f, f2, f, f2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25267BGf) {
                C25267BGf c25267BGf = (C25267BGf) obj;
                long j = this.A01;
                long j2 = c25267BGf.A01;
                long j3 = C1132359l.A01;
                if (j != j2 || this.A02 != c25267BGf.A02 || Float.compare(this.A00, c25267BGf.A00) != 0 || this.A03 != c25267BGf.A03 || !C14360o3.A0K(this.A04, c25267BGf.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C6GC
    public final long ADC(boolean z) {
        long A02;
        long j = this.A01;
        if (z) {
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), this.A00 * C1132359l.A00(j));
            return A02;
        }
        return j;
    }

    @Override // X.C6GC
    public final long AJo(boolean z) {
        if (z) {
            return this.A02;
        }
        return this.A03;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = C1132359l.A01;
        return AbstractC167007dF.A07(this.A03, AbstractC166997dE.A00(AbstractC167007dF.A07(this.A02, AbstractC25227BEk.A03(j)), this.A00)) + AbstractC167017dG.A0M(this.A04);
    }

    public C25267BGf(C6KV c6kv, float f, long j, long j2, long j3) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
        this.A03 = j3;
        this.A04 = c6kv;
    }

    @Override // X.C6GC
    public final C6KV AEA() {
        return this.A04;
    }

    @Override // X.C6GC
    public final float Ay1() {
        return this.A00;
    }
}
