package X;

/* renamed from: X.JxS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45098JxS extends C0T6 {
    public final KzF A00;
    public final C73 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45098JxS) {
                C45098JxS c45098JxS = (C45098JxS) obj;
                if (this.A01 != c45098JxS.A01 || this.A05 != c45098JxS.A05 || !C14360o3.A0K(this.A03, c45098JxS.A03) || !C14360o3.A0K(this.A02, c45098JxS.A02) || this.A06 != c45098JxS.A06 || !C14360o3.A0K(this.A00, c45098JxS.A00) || !C14360o3.A0K(this.A04, c45098JxS.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A06, (AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A05, AbstractC166987dD.A0G(this.A01))) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C45098JxS(KzF kzF, C73 c73, String str, String str2, String str3, boolean z, boolean z2) {
        this.A01 = c73;
        this.A05 = z;
        this.A03 = str;
        this.A02 = str2;
        this.A06 = z2;
        this.A00 = kzF;
        this.A04 = str3;
    }

    public C45098JxS() {
        this(null, C73.A04, "", null, null, false, true);
    }
}
