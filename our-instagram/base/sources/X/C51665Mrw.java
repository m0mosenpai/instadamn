package X;

import com.instagram.model.reels.ReelType;

/* renamed from: X.Mrw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51665Mrw extends C0T6 {
    public String A04 = null;
    public long A01 = 0;
    public int A00 = 0;
    public C51752Mtb A02 = null;
    public ReelType A03 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51665Mrw) {
                C51665Mrw c51665Mrw = (C51665Mrw) obj;
                if (!C14360o3.A0K(this.A04, c51665Mrw.A04) || this.A01 != c51665Mrw.A01 || this.A00 != c51665Mrw.A00 || !C14360o3.A0K(this.A02, c51665Mrw.A02) || this.A03 != c51665Mrw.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC25236BEt.A01(this.A01, AbstractC167017dG.A0O(this.A04) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ArchiveShell(id=");
        A1C.append(this.A04);
        A1C.append(AbstractC43591JPw.A00(103));
        A1C.append(this.A01);
        A1C.append(", mediaCount=");
        A1C.append(this.A00);
        A1C.append(", coverImage=");
        A1C.append(this.A02);
        A1C.append(", reelType=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }
}
