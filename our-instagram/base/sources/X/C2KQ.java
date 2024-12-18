package X;

import android.os.Process;
import android.text.TextUtils;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: X.2KQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2KQ {
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
        if (android.util.Log.isLoggable("PlayCore", 3)) {
            A00(this.A00, str, objArr);
        }
    }

    public final void A02(String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            android.util.Log.e("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public final void A03(String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            A00(this.A00, str, objArr);
        }
    }

    public final void A04(String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 5)) {
            android.util.Log.w("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public final void A05(Throwable th, String str, Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            android.util.Log.e("PlayCore", A00(this.A00, str, objArr), th);
        }
    }

    public C2KQ(String str) {
        this.A00 = AnonymousClass001.A0n("UID: [", "]  PID: [", "] ", Process.myUid(), Process.myPid()).concat(str);
    }
}
