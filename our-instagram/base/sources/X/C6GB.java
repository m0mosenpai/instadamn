package X;

/* renamed from: X.6GB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GB extends C0T6 implements C6GC {
    public final long A00;

    @Override // X.C6GC
    public final C6KV AEA() {
        return null;
    }

    @Override // X.C6GC
    public final C1333560c E3D(C6GD c6gd) {
        return new C1333560c(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6GB) {
                long j = this.A00;
                long j2 = ((C6GB) obj).A00;
                long j3 = C1132359l.A01;
                if (j == j2) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = C1132359l.A01;
        return (int) (j ^ (j >>> 32));
    }

    public C6GB(long j) {
        this.A00 = j;
    }

    @Override // X.C6GC
    public final C5AH ADD(C5Tl c5Tl, C6GD c6gd, int i) {
        c5Tl.Eno(-1906765004);
        if (C0fH.A02()) {
            C0fH.A01(-545503996, "com.instagram.compose.igds.components.button.LinkButtonStyle.backgroundShape (IgdsButton.kt:160)");
        }
        C5AH c5ah = C5AF.A00;
        if (C0fH.A02()) {
            C0fH.A00(771016107);
        }
        C117505Tk.A0L((C117505Tk) c5Tl, false);
        return c5ah;
    }

    @Override // X.C6GC
    public final float Ay1() {
        return 0.3f;
    }

    @Override // X.C6GC
    public final long ADC(boolean z) {
        return C1132359l.A07;
    }

    @Override // X.C6GC
    public final long AJo(boolean z) {
        return this.A00;
    }

    @Override // X.C6GC
    public final float Cpd(C6GD c6gd) {
        return Float.NaN;
    }
}
