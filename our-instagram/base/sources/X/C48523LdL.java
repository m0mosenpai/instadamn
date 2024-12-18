package X;

import com.facebook.msys.mci.SessionedNotificationCenter;

/* renamed from: X.LdL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48523LdL implements InterfaceC13050lr {
    public final C6Eh A00;
    public final C6Eh A01;
    public final java.util.Set A02;
    public final SessionedNotificationCenter A03;

    public C48523LdL(SessionedNotificationCenter sessionedNotificationCenter) {
        C14360o3.A0B(sessionedNotificationCenter, 1);
        this.A03 = sessionedNotificationCenter;
        this.A02 = AbstractC31171DnF.A0l();
        this.A01 = new LVO(this, 8);
        this.A00 = new LVO(this, 7);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        SessionedNotificationCenter sessionedNotificationCenter = this.A03;
        sessionedNotificationCenter.removeObserver(this.A01, AbstractC111324zv.A00(1690), null);
        sessionedNotificationCenter.removeObserver(this.A00, "MEMOfflineHandlingCompletionNotification", null);
    }
}
