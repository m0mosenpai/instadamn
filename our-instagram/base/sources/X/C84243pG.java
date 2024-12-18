package X;

import android.net.NetworkInfo;
import com.facebook.tigon.appnetsessionid.SessionIdGenerator;
import com.instagram.common.session.UserSession;

/* renamed from: X.3pG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84243pG implements InterfaceC12870lZ, InterfaceC13000lm, InterfaceC15680qO {
    public final SessionIdGenerator A00 = new SessionIdGenerator();
    public final UserSession A01;

    @Override // X.InterfaceC12870lZ
    public final synchronized void onAppBackgrounded() {
        int A03 = C0f9.A03(1312821224);
        this.A00.onBackground();
        C0f9.A0A(-747039300, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final synchronized void onAppForegrounded() {
        int A03 = C0f9.A03(-459785917);
        this.A00.onForeground();
        C0f9.A0A(991462570, A03);
    }

    @Override // X.InterfaceC15680qO
    public final synchronized void onConnectionChanged(NetworkInfo networkInfo) {
        this.A00.onNetworkChange();
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        C218914p.A06(this);
        C15670qN.A00(this);
    }

    public C84243pG(UserSession userSession) {
        this.A01 = userSession;
    }
}
