package X;

import android.content.Context;

/* renamed from: X.F6t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34195F6t {
    public static final boolean A00(Context context, String str, boolean z, boolean z2) {
        boolean A1R = AbstractC167007dF.A1R(0, context, str);
        int length = str.length() - (A1R ? 1 : 0);
        int i = 0;
        boolean z3 = false;
        while (i <= length) {
            int i2 = length;
            if (!z3) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(str, i2);
            if (!z3) {
                if (!A19) {
                    z3 = true;
                } else {
                    i++;
                }
            } else {
                if (!A19) {
                    break;
                }
                length--;
            }
        }
        int length2 = AbstractC31177DnL.A0g(str, length, i).length();
        if (length2 > 100) {
            C9GR.A03(context, AbstractC31177DnL.A0a(context, 100, 2131960717), "direct_thread_title_change_error_too_long", 0);
            return false;
        }
        if (z || length2 != 0 || z2) {
            return A1R;
        }
        return false;
    }
}
