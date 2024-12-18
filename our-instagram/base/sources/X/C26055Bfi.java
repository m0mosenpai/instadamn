package X;

import android.graphics.Bitmap;
import com.facebook.R;

/* renamed from: X.Bfi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26055Bfi extends C0T6 {
    public final int A00 = 0;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26055Bfi) && ((C26055Bfi) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (A00(obj, 1)) {
                    C26055Bfi c26055Bfi = (C26055Bfi) obj;
                    if (this.A01 == c26055Bfi.A01 && C14360o3.A0K(this.A03, c26055Bfi.A03) && C14360o3.A0K(this.A04, c26055Bfi.A04)) {
                        str = this.A02;
                        str2 = c26055Bfi.A02;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!A00(obj, 0)) {
                return false;
            }
            C26055Bfi c26055Bfi2 = (C26055Bfi) obj;
            if (this.A01 != c26055Bfi2.A01 || !C14360o3.A0K(this.A03, c26055Bfi2.A03) || !C14360o3.A0K(this.A04, c26055Bfi2.A04) || !C14360o3.A0K(this.A02, c26055Bfi2.A02)) {
                return false;
            }
            str = null;
            str2 = null;
        } else {
            return true;
        }
        if (!C14360o3.A0K(str, str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K;
        int i;
        int i2 = this.A00;
        int A0K2 = AbstractC166997dE.A0K(this.A03, this.A01 * 31);
        String str = this.A04;
        if (i2 != 0) {
            A0K = AbstractC166997dE.A0K(str, A0K2) * 31;
            i = this.A02.hashCode();
        } else {
            A0K = AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(str, A0K2));
            i = 0;
        }
        return A0K + i;
    }

    public C26055Bfi(String str, String str2, String str3) {
        C14360o3.A0B(str2, 3);
        this.A01 = R.drawable.instagram_contacts_pano_outline_24;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
    }

    public C26055Bfi(Bitmap bitmap, String str, String str2, String str3, int i, int i2) {
        C14360o3.A0B(str2, 3);
        this.A01 = R.drawable.instagram_contacts_pano_outline_24;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
    }
}
