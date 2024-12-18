package X;

import android.graphics.Bitmap;

/* renamed from: X.3Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73033Pe extends C0T6 {
    public final int A00;
    public final Bitmap A01;
    public final C206409Bx A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73033Pe) {
                C73033Pe c73033Pe = (C73033Pe) obj;
                if (!C14360o3.A0K(this.A01, c73033Pe.A01) || !C14360o3.A0K(this.A04, c73033Pe.A04) || this.A00 != c73033Pe.A00 || !C14360o3.A0K(this.A03, c73033Pe.A03) || !C14360o3.A0K(this.A02, c73033Pe.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Bitmap bitmap = this.A01;
        int hashCode = (((((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A00) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C206409Bx c206409Bx = this.A02;
        return hashCode2 + (c206409Bx != null ? c206409Bx.hashCode() : 0);
    }

    public C73033Pe(Bitmap bitmap, C206409Bx c206409Bx, String str, String str2, int i) {
        this.A01 = bitmap;
        this.A04 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A02 = c206409Bx;
    }
}
