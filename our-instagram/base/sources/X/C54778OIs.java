package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.OIs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54778OIs {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;
    public final List A03;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0JO, java.lang.Object] */
    public final void A00(Venue venue) {
        UserSession userSession = this.A01;
        C52452NIw c52452NIw = new C52452NIw(new Object(), this.A00, userSession, C05F.A0C, true);
        c52452NIw.A03();
        List list = this.A03;
        c52452NIw.A01("", this.A02, list);
        String A02 = venue.A02();
        C14360o3.A07(A02);
        c52452NIw.A02(A02, list);
    }

    public C54778OIs(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, List list) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = list;
        this.A02 = str;
    }
}
