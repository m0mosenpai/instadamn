package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* renamed from: X.6lr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148216lr {
    public C5SW A00;
    public C33I A01;
    public final Context A02;
    public final UserSession A04;
    public final C23031Ai A05;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final Runnable A06 = new Runnable() { // from class: X.6ls
        @Override // java.lang.Runnable
        public final void run() {
            C148216lr c148216lr = C148216lr.this;
            C5SW c5sw = c148216lr.A00;
            if (c5sw != null) {
                c5sw.A07(c148216lr.A04);
            }
        }
    };

    public C148216lr(Context context, UserSession userSession) {
        this.A02 = context;
        this.A04 = userSession;
        this.A05 = AbstractC23021Ah.A00(userSession);
    }
}
