package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wue, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71478Wue implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C5SU A01;

    public RunnableC71478Wue(UserSession userSession, C5SU c5su) {
        this.A01 = c5su;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00().A07(this.A00);
    }
}