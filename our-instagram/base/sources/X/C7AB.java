package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7AB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AB {
    public boolean A00;
    public boolean A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C7U0 A04;

    public C7AB(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7U0 c7u0) {
        C14360o3.A0B(c7u0, 3);
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = c7u0;
    }

    public final void A00() {
        UserSession userSession = this.A03;
        if (C18U.A06(C06090Tz.A06, userSession, 36329865636561459L)) {
            C18920wW A01 = AbstractC12220kQ.A01(this.A02, userSession);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_business_chat_animated_header_impression");
            List BSH = this.A04.C7r().BSH();
            if (BSH.size() == 1) {
                A00.A9K("consumer_igid", Long.valueOf(Long.parseLong(userSession.userId)));
                A00.A9K("business_igid", Long.valueOf(Long.parseLong(((User) BSH.get(0)).getId())));
                A00.AAP(AbstractC43591JPw.A00(187), AbstractC58317Pt9.A00(77));
                A00.Cht();
            }
        }
    }
}
