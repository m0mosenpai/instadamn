package X;

/* renamed from: X.MxB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51928MxB extends C0T6 implements InterfaceC57867PlX {
    public final C51759Mti A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51928MxB) {
                C51928MxB c51928MxB = (C51928MxB) obj;
                if (!C14360o3.A0K(this.A01, c51928MxB.A01) || !C14360o3.A0K(this.A00, c51928MxB.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C51928MxB(C51759Mti c51759Mti, String str) {
        this.A01 = str;
        this.A00 = c51759Mti;
    }

    public static C51928MxB A00() {
        return new C51928MxB(new C51759Mti(new C51918Mx0(2131965661)), "settings_failed_to_load");
    }
}
