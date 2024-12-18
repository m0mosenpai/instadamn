package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.Nw7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54109Nw7 {
    public static final boolean A00(Medium medium) {
        int i;
        int i2;
        int i3 = medium.A07;
        if (i3 != 3 && i3 != 1) {
            i = medium.A0B;
            i2 = medium.A04;
        } else {
            i = medium.A04;
            i2 = medium.A0B;
        }
        if (i <= i2) {
            return false;
        }
        return true;
    }
}
