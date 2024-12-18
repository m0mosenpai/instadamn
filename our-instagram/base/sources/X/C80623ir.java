package X;

import android.graphics.Bitmap;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80623ir extends AbstractC80633is {
    public final int A00;
    public final Bitmap A01;
    public final ImageUrl A02;
    public final String A03;

    public C80623ir(Bitmap bitmap, ImageUrl imageUrl, String str, int i) {
        C14360o3.A0B(str, 3);
        this.A01 = bitmap;
        this.A02 = imageUrl;
        this.A03 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80623ir) {
                C80623ir c80623ir = (C80623ir) obj;
                if (!C14360o3.A0K(this.A01, c80623ir.A01) || !C14360o3.A0K(this.A02, c80623ir.A02) || !C14360o3.A0K(this.A03, c80623ir.A03) || this.A00 != c80623ir.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00;
    }
}
