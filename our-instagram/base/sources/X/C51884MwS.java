package X;

/* renamed from: X.MwS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51884MwS extends C0T6 implements InterfaceC57855PlL {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51884MwS) {
                C51884MwS c51884MwS = (C51884MwS) obj;
                if (this.A03 != c51884MwS.A03 || this.A02 != c51884MwS.A02 || !C14360o3.A0K(this.A01, c51884MwS.A01) || !C14360o3.A0K(this.A00, c51884MwS.A00) || !C14360o3.A0K(this.A04, c51884MwS.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC25225BEi.A08(this.A03))) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C51884MwS(Integer num, String str, String str2, boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = str;
        this.A00 = num;
        this.A04 = str2;
    }

    public C51884MwS() {
        this(null, "", null, false, false);
    }
}
