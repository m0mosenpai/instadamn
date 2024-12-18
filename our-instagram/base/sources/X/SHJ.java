package X;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class SHJ {
    public Context A00;
    public QF6 A01;
    public boolean A02;
    public boolean A03;

    public static long A00(String str) {
        long parseLong;
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            parseLong = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        if (parseLong < 0) {
            return -1L;
        }
        return parseLong;
    }
}
