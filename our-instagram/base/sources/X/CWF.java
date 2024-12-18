package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class CWF {
    public final int A00;
    public final Drawable A01;
    public final CV6 A02;
    public final AbstractC27450C9s A03;
    public final AbstractC27451C9t A04;
    public final Integer A05;
    public final String A06;

    public CWF(Drawable drawable, CV6 cv6, AbstractC27450C9s abstractC27450C9s, AbstractC27451C9t abstractC27451C9t, Integer num, String str, int i) {
        C14360o3.A0B(str, 6);
        this.A04 = abstractC27451C9t;
        this.A03 = abstractC27450C9s;
        this.A00 = i;
        this.A05 = num;
        this.A01 = drawable;
        this.A06 = str;
        this.A02 = cv6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWF) {
                CWF cwf = (CWF) obj;
                if (!C14360o3.A0K(this.A04, cwf.A04) || !C14360o3.A0K(this.A03, cwf.A03) || this.A00 != cwf.A00 || !C14360o3.A0K(this.A05, cwf.A05) || !C14360o3.A0K(this.A01, cwf.A01) || !C14360o3.A0K(this.A06, cwf.A06) || !C14360o3.A0K(this.A02, cwf.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0J(this.A01, (((AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A04)) + this.A00) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC166997dE.A0I(this.A02);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProfilePhotoStyleValues(roundingOptions=");
        A1C.append(this.A04);
        A1C.append(", borderOptions=");
        A1C.append(this.A03);
        A1C.append(", imageSizeDp=");
        A1C.append(this.A00);
        A1C.append(", backgroundColor=");
        A1C.append(this.A05);
        A1C.append(", photoOverlay=");
        A1C.append(this.A01);
        A1C.append(", attributionLabel=");
        A1C.append(this.A06);
        A1C.append(", badgeAddOn=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
