package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;

/* renamed from: X.99Q, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C99Q {
    public static final C99R A00(AccountSession accountSession, String str) {
        C14360o3.A0B(accountSession, 1);
        Execution.initialize();
        return new C99R(accountSession, str, 2);
    }

    public static final C99R A01(String str) {
        Execution.initialize();
        return new C99R(null, str, 1);
    }
}
