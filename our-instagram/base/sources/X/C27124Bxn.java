package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bxn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27124Bxn extends AbstractC27126Bxp {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27124Bxn) {
                C27124Bxn c27124Bxn = (C27124Bxn) obj;
                if (!C14360o3.A0K(this.A02, c27124Bxn.A02) || !C14360o3.A0K(this.A01, c27124Bxn.A01) || this.A03 != c27124Bxn.A03 || !C14360o3.A0K(this.A00, c27124Bxn.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A02))) + AbstractC167017dG.A0M(this.A00);
    }

    public C27124Bxn(ImageUrl imageUrl, String str, String str2, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = imageUrl;
    }
}
