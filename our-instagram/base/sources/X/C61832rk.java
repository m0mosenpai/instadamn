package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.2rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61832rk {
    public final C60662pp A00;
    public final C61792rg A01;
    public final UserSession A02;

    public final void A00() {
        C60662pp c60662pp = this.A00;
        if (c60662pp.mView != null) {
            ViewGroup CFj = c60662pp.getScrollingViewProxy().CFj();
            if (CFj != null && CFj.getHeight() == 0) {
                return;
            }
            c60662pp.A09().A00().A02 = false;
            c60662pp.A0W(false);
            if (C18U.A06(C06090Tz.A05, this.A02, 36323530559728980L)) {
                this.A01.A07(null);
            }
            c60662pp.getScrollingViewProxy().EMU(c60662pp);
        }
    }

    public C61832rk(C61792rg c61792rg, UserSession userSession, C60662pp c60662pp) {
        this.A00 = c60662pp;
        this.A02 = userSession;
        this.A01 = c61792rg;
    }
}
