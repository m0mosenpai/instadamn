package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.User;

/* renamed from: X.GHr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36748GHr implements MPL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public C36748GHr(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        this.A00 = i;
        this.A05 = z;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
        this.A04 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.MPL
    public final void Di0() {
        UserSession userSession;
        InterfaceC11380iw interfaceC11380iw;
        String A00;
        String str;
        String A05;
        switch (this.A00) {
            case 0:
                userSession = (UserSession) this.A01;
                User user = (User) this.A02;
                boolean z = this.A05;
                interfaceC11380iw = (InterfaceC11380iw) this.A03;
                A00 = "profile_action_sheet";
                str = this.A04;
                if (C18U.A06(C06090Tz.A05, userSession, 36325695223379220L)) {
                    A05 = C3YV.A03(user.getId());
                    if (!z || A05 == null) {
                        return;
                    }
                } else if (!z) {
                    return;
                } else {
                    A05 = C3YV.A03(user.getId());
                }
                AbstractC73317Y7a.A0J(interfaceC11380iw, userSession, A05, A00, "download_qr_code", str);
                return;
            case 1:
                boolean z2 = this.A05;
                UserSession userSession2 = (UserSession) this.A01;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A02;
                C38321qM c38321qM = (C38321qM) this.A03;
                String A002 = AbstractC43591JPw.A00(370);
                String str2 = this.A04;
                if (!z2) {
                    return;
                }
                String id = c38321qM.getId();
                String A1G = AbstractC25226BEj.A1G(c38321qM);
                C14360o3.A0B(str2, 5);
                AbstractC73317Y7a.A0I(interfaceC11380iw2, userSession2, null, id, A002, "download_qr_code", str2, A1G, null, null, null);
                return;
            case 2:
                boolean z3 = this.A05;
                userSession = (UserSession) this.A01;
                interfaceC11380iw = (InterfaceC11380iw) this.A02;
                Venue venue = (Venue) this.A03;
                A00 = AbstractC111324zv.A00(2692);
                str = this.A04;
                if (!z3) {
                    return;
                }
                A05 = venue.A05();
                AbstractC73317Y7a.A0J(interfaceC11380iw, userSession, A05, A00, "download_qr_code", str);
                return;
            default:
                boolean z4 = this.A05;
                userSession = (UserSession) this.A01;
                interfaceC11380iw = (InterfaceC11380iw) this.A02;
                Hashtag hashtag = (Hashtag) this.A03;
                A00 = "hashtag_page_overflow_menu";
                str = this.A04;
                if (z4) {
                    A05 = hashtag.getId();
                    AbstractC73317Y7a.A0J(interfaceC11380iw, userSession, A05, A00, "download_qr_code", str);
                    return;
                }
                return;
        }
    }
}
