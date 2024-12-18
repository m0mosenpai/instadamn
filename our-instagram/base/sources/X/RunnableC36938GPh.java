package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.GPh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36938GPh implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ EfQ A01;
    public final /* synthetic */ EUW A02;

    public RunnableC36938GPh(UserSession userSession, EfQ efQ, EUW euw) {
        this.A02 = euw;
        this.A00 = userSession;
        this.A01 = efQ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC31172DnG.A1A();
        UserSession userSession = this.A00;
        EfQ efQ = this.A01;
        String str = efQ.A00;
        String str2 = efQ.A01;
        EUW euw = this.A02;
        android.net.Uri uri = euw.A05;
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("argument_token", str);
        A05.putString("argument_source", str2);
        if (uri != null) {
            A05.putParcelable("argument_redirect_uri", uri);
        }
        AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.setArguments(A05);
        AbstractC31177DnL.A15(abstractC59962oe, euw.A00, euw.A02);
    }
}
