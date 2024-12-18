package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137756Lx implements InterfaceC13050lr {
    public static final C137746Lw A03 = new Object();
    public final C42221xC A00;
    public final C137766Ly A01;
    public final UserSession A02;

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C137766Ly c137766Ly = this.A01;
        UserSession userSession = this.A02;
        SessionedNotificationCenter sessionedNotificationCenter = C61A.A02(userSession, AbstractC94034Kn.A00(userSession)).getSessionedNotificationCenter();
        sessionedNotificationCenter.removeObserver(c137766Ly.A00, "MEMOfflineHandlingCompletionNotification", null);
        sessionedNotificationCenter.removeObserver(c137766Ly.A01, "MEMOfflineHandlingPreviewNotification", null);
        sessionedNotificationCenter.removeObserver(c137766Ly.A02, "MEMRemovedMessageIdReadyNotification", null);
    }

    public C137756Lx(C42221xC c42221xC, UserSession userSession, C137766Ly c137766Ly) {
        this.A02 = userSession;
        this.A01 = c137766Ly;
        this.A00 = c42221xC;
    }
}
