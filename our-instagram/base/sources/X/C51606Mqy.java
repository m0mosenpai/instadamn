package X;

/* renamed from: X.Mqy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51606Mqy extends C0T6 {
    public final int A00;
    public final Integer A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51606Mqy) {
                C51606Mqy c51606Mqy = (C51606Mqy) obj;
                if (this.A03 != c51606Mqy.A03 || this.A02 != c51606Mqy.A02 || this.A00 != c51606Mqy.A00 || !C14360o3.A0K(this.A01, c51606Mqy.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A02, AbstractC25225BEi.A08(this.A03)) + this.A00) * 31) + AbstractC167017dG.A0M(this.A01);
    }

    public C51606Mqy(Integer num, int i, boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
        this.A00 = i;
        this.A01 = num;
    }
}
