package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.TQr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64710TQr implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C62929SXl A02;
    public final /* synthetic */ Integer A03;

    public RunnableC64710TQr(Context context, UserSession userSession, C62929SXl c62929SXl, Integer num) {
        this.A02 = c62929SXl;
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C62929SXl.A00(this.A00, this.A01, this.A03);
    }
}
