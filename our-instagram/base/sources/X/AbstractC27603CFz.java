package X;

import android.content.res.Resources;

/* renamed from: X.CFz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27603CFz {
    public static final String A00(C2XE c2xe, C169207gt c169207gt, int i, int i2, int i3) {
        String string;
        if (c169207gt.A00 > 0) {
            try {
                string = c2xe.A0C.getResources().getQuantityString(i2, i, Integer.valueOf(i));
            } catch (Resources.NotFoundException unused) {
                string = c2xe.A0C.getString(i3);
            }
        } else {
            string = c2xe.A0C.getString(i3);
        }
        C14360o3.A0A(string);
        return string;
    }
}
