package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.FzV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36278FzV implements InterfaceC13000lm {
    public final C31287Dp9 A00;
    public final java.util.Set A01;
    public final boolean A02;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public C36278FzV(UserSession userSession, C31287Dp9 c31287Dp9) {
        java.util.Set stringSet;
        this.A00 = c31287Dp9;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36312659997492433L);
        this.A02 = A06;
        HashSet A1H = AbstractC166987dD.A1H();
        this.A01 = A1H;
        if (A06) {
            synchronized (c31287Dp9) {
                stringSet = c31287Dp9.A00.getStringSet("thread_restrict_warned_on", null);
            }
            if (stringSet != null) {
                A1H.addAll(stringSet);
            }
        }
    }
}
