package X;

import com.facebook.R;

/* renamed from: X.Bhz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26174Bhz extends C0T6 implements InterfaceC31095Dld {
    public final int A01 = R.drawable.instagram_arrow_left_pano_outline_24;
    public final int A00 = 2131963913;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26174Bhz) {
                C26174Bhz c26174Bhz = (C26174Bhz) obj;
                if (this.A01 != c26174Bhz.A01 || this.A00 != c26174Bhz.A00) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01 * 31) + this.A00) * 31;
    }
}
