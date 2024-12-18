package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vf9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68971Vf9 {
    public final UserSession A00;
    public final List A01;

    public C68971Vf9(UserSession userSession) {
        this.A00 = userSession;
        String A04 = C18U.A04(C06090Tz.A05, userSession, 36891522804745121L);
        List A0m = AbstractC167007dF.A0m(A04.length() == 0 ? "48x64x80x100x120x140x160x200x240x280x332x403x480x540x640x720x810x960x1080x1286x1500x1800" : A04, "x", 0);
        ArrayList A0q = AbstractC167017dG.A0q(A0m);
        Iterator it = A0m.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1W(A0q, Integer.parseInt((String) it.next()));
        }
        this.A01 = A0q;
    }
}
