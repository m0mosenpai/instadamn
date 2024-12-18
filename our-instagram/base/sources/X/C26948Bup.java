package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Bup, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26948Bup extends AbstractC166097bd {
    public final ImageUrl A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26948Bup) {
                C26948Bup c26948Bup = (C26948Bup) obj;
                if (!C14360o3.A0K(this.A02, c26948Bup.A02) || this.A01 != c26948Bup.A01 || !C14360o3.A0K(this.A00, c26948Bup.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C26948Bup(ImageUrl imageUrl, String str, int i) {
        super(AnonymousClass001.A0b("slide_thread_row_model", str, i));
        this.A02 = str;
        this.A01 = i;
        this.A00 = imageUrl;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (AbstractC166987dD.A0J(this.A02) + this.A01) * 31);
    }
}
