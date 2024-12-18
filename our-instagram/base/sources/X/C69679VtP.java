package X;

import android.content.Context;

/* renamed from: X.VtP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69679VtP {
    public final Context A00;

    public final C60615REa A00(String str, String str2) {
        C14360o3.A0B(str, 0);
        return new C60615REa(this.A00, str, str2);
    }

    public final boolean A01(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return false;
        }
        int i = length - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= i) {
            int i3 = i;
            if (!z) {
                i3 = i2;
            }
            boolean A19 = AbstractC167027dH.A19(str, i3);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!A19) {
                    break;
                }
                i--;
            }
        }
        if (AbstractC31177DnL.A0g(str, i, i2).length() != 0) {
            return AbstractC81033jX.A04(str);
        }
        return false;
    }

    public C69679VtP(Context context) {
        this.A00 = context;
    }
}
