package X;

import android.os.Process;
import android.text.TextUtils;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: X.SXj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62927SXj {
    public final String A00;

    public static String A00(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                android.util.Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = AnonymousClass001.A0u(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return AnonymousClass001.A0g(str, " : ", str2);
    }

    public final void A01(String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            A00(this.A00, str, objArr);
        }
    }

    public C62927SXj(String str) {
        this.A00 = AnonymousClass001.A0n("UID: [", "]  PID: [", "] ", Process.myUid(), Process.myPid()).concat(str);
    }
}
