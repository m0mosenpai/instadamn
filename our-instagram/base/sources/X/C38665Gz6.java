package X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.Gz6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38665Gz6 extends C0T6 {
    public final C69749Vuj A00;
    public final C5QE A01;
    public final ImageInfo A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06 = true;

    public C38665Gz6(C69749Vuj c69749Vuj, C5QE c5qe, ImageInfo imageInfo, List list, boolean z, boolean z2) {
        this.A01 = c5qe;
        this.A00 = c69749Vuj;
        this.A02 = imageInfo;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38665Gz6) {
                C38665Gz6 c38665Gz6 = (C38665Gz6) obj;
                if (!C14360o3.A0K(this.A01, c38665Gz6.A01) || !C14360o3.A0K(this.A00, c38665Gz6.A00) || !C14360o3.A0K(this.A02, c38665Gz6.A02) || this.A05 != c38665Gz6.A05 || this.A04 != c38665Gz6.A04 || !C14360o3.A0K(this.A03, c38665Gz6.A03) || this.A06 != c38665Gz6.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, (AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0M(this.A02)) * 31))) * 31 * 31 * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Data(contentDescription=");
        A1C.append(this.A01);
        A1C.append(", imageContentDescription=");
        A1C.append(this.A00);
        A1C.append(", imageInfo=");
        A1C.append(this.A02);
        A1C.append(", isSaveButtonVisible=");
        A1C.append(this.A05);
        A1C.append(", isSaveButtonSelected=");
        A1C.append(this.A04);
        A1C.append(", labels=");
        A1C.append(this.A03);
        A1C.append(", labelsLineCount=");
        A1C.append((Object) null);
        A1C.append(", merchantTextSubtitle=");
        A1C.append((String) null);
        A1C.append(", roundedCornerRadius=");
        A1C.append((Object) null);
        A1C.append(", shouldHaveBorder=");
        return AbstractC25236BEt.A0a(A1C, this.A06);
    }
}
