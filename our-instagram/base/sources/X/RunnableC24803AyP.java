package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AyP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24803AyP implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C24018Akw A01;
    public final /* synthetic */ C144226f4 A02;

    public RunnableC24803AyP(UserSession userSession, C24018Akw c24018Akw, C144226f4 c144226f4) {
        this.A02 = c144226f4;
        this.A00 = userSession;
        this.A01 = c24018Akw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144226f4.A02(this.A00, this.A01, this.A02);
    }
}
