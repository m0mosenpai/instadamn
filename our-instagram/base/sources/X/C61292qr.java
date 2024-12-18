package X;

import android.graphics.Bitmap;

/* renamed from: X.2qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61292qr extends C0T6 {
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final C206409Bx A03;
    public final String A04;

    public C61292qr(Bitmap bitmap, C206409Bx c206409Bx, String str, int i, int i2) {
        C14360o3.A0B(bitmap, 1);
        this.A02 = bitmap;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = str;
        this.A03 = c206409Bx;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61292qr) {
                C61292qr c61292qr = (C61292qr) obj;
                if (!C14360o3.A0K(this.A02, c61292qr.A02) || this.A01 != c61292qr.A01 || this.A00 != c61292qr.A00 || !C14360o3.A0K(this.A04, c61292qr.A04) || !C14360o3.A0K(this.A03, c61292qr.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A01) * 31) + this.A00) * 31;
        String str = this.A04;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C206409Bx c206409Bx = this.A03;
        return hashCode2 + (c206409Bx != null ? c206409Bx.hashCode() : 0);
    }
}
