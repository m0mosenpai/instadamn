package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FMv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34612FMv {
    public final Activity A00;
    public final UserSession A01;
    public final C99694dm A02;
    public final C143436di A03;
    public final String A04;

    public C34612FMv(UserSession userSession, Activity activity, String str) {
        C14360o3.A0B(str, 3);
        C143436di A00 = AbstractC149676oK.A00(userSession);
        C99694dm A002 = AbstractC99684dl.A00(userSession);
        AbstractC167017dG.A1S(A00, A002);
        this.A00 = activity;
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = A00;
        this.A02 = A002;
    }
}
