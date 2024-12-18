package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.M6k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50021M6k implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C47925LEu A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public RunnableC50021M6k(Context context, UserSession userSession, C47925LEu c47925LEu, String str, String str2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c47925LEu;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC46883KoQ.A00(this.A00, this.A01, this.A02.A03, this.A04, this.A03);
    }
}
