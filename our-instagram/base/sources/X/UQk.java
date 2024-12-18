package X;

/* loaded from: classes11.dex */
public final class UQk extends C0T6 implements XF8 {
    public final C38582Gxl A00;
    public final UPA A01;
    public final boolean A02;
    public final Boolean A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQk) {
                UQk uQk = (UQk) obj;
                if (!C14360o3.A0K(this.A04, uQk.A04) || this.A02 != uQk.A02 || !C14360o3.A0K(this.A01, uQk.A01) || !C14360o3.A0K(this.A03, uQk.A03) || !C14360o3.A0K(this.A00, uQk.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = (((AbstractC167007dF.A0D(this.A02, AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        C38582Gxl c38582Gxl = this.A00;
        if (c38582Gxl != null) {
            i = c38582Gxl.hashCode();
        }
        return A0D + i;
    }

    public UQk(C38582Gxl c38582Gxl, UPA upa, Boolean bool, String str, boolean z) {
        this.A04 = str;
        this.A02 = z;
        this.A01 = upa;
        this.A03 = bool;
        this.A00 = c38582Gxl;
    }
}
