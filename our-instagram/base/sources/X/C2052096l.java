package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.96l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2052096l implements InterfaceC13000lm {
    public long A00;
    public InterfaceC12870lZ A01;
    public String A02;
    public boolean A03;
    public final Context A04;
    public final UserSession A05;

    public static final boolean A00(C2052096l c2052096l) {
        UserSession userSession = c2052096l.A05;
        if (C18U.A06(C06090Tz.A06, userSession, 36311388687237638L)) {
            return true;
        }
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - AbstractC23021Ah.A00(userSession).A01.getLong(AbstractC58317Pt9.A00(307), 0L)) >= 90) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InterfaceC12870lZ interfaceC12870lZ = this.A01;
        if (interfaceC12870lZ != null) {
            C218914p.A06(interfaceC12870lZ);
        }
        C34H.A00.clear();
    }

    public C2052096l(UserSession userSession, Context context) {
        this.A05 = userSession;
        this.A04 = context;
    }
}
