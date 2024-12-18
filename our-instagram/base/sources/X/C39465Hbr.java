package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hbr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39465Hbr extends AbstractC37623GhI {
    public final Activity A00;
    public final UserSession A01;
    public final C37560GgG A02;

    public final void A0B(C120985dq c120985dq, JG9 jg9, C37540Gfw c37540Gfw, C37546Gg2 c37546Gg2) {
        C14360o3.A0B(c37546Gg2, 2);
        C42650Iu7 c42650Iu7 = new C42650Iu7(c120985dq, jg9, c37540Gfw, c37546Gg2, this);
        C38909HBg c38909HBg = new C38909HBg();
        c38909HBg.A00 = c42650Iu7;
        IN9 in9 = super.A01;
        if (in9 != null) {
            in9.A00(null, c38909HBg, this.A00.getResources().getString(2131963515), true);
        }
    }

    public C39465Hbr(Activity activity, UserSession userSession, C37560GgG c37560GgG) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = c37560GgG;
    }
}
