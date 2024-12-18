package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L7W {
    public boolean A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;

    public final void A00(View view, EnumC58132lV enumC58132lV, Integer num, String str) {
        InterfaceC16820sZ c50170MDx;
        if (num == C05F.A0Y) {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A02);
            if (C23031Ai.A07(A00, "notes_music_reshare_creation_tooltip_last_impression_timestamp_ms", 1L) && A00.A01.getInt("notes_music_reshare_creation_tooltip_seen_count", 0) < 3) {
                c50170MDx = new C50246MHb(A00, 36);
            } else {
                return;
            }
        } else if (((InterfaceC19630xq) this.A03.getValue()).getBoolean(AbstractC46769KmQ.A00(num), false)) {
            return;
        } else {
            c50170MDx = new C50170MDx(33, num, this);
        }
        InterfaceC16820sZ interfaceC16820sZ = c50170MDx;
        if (this.A00) {
            this.A00 = !view.postDelayed(new RunnableC50015M6e(view, this, enumC58132lV, str, interfaceC16820sZ), 1000L);
        }
    }

    public L7W(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A00 = A1V;
        this.A03 = C50246MHb.A01(this, 37);
    }
}
