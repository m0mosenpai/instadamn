package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.2v3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63822v3 {
    public final Context A00;
    public final AbstractC018607g A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    public static C1ON A00(UserSession userSession, Hashtag hashtag) {
        String encode;
        String name = hashtag.getName();
        if (name == null) {
            encode = "";
        } else {
            encode = android.net.Uri.encode(name.trim());
        }
        String A06 = AbstractC13670mt.A06("tags/follow/%s/", encode);
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B(A06);
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static C1ON A01(UserSession userSession, Hashtag hashtag) {
        String encode;
        String name = hashtag.getName();
        if (name == null) {
            encode = "";
        } else {
            encode = android.net.Uri.encode(name.trim());
        }
        String A06 = AbstractC13670mt.A06("tags/unfollow/%s/", encode);
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B(A06);
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public final void A02(C19260xA c19260xA, UserSession userSession, InterfaceC63862v7 interfaceC63862v7, Hashtag hashtag, String str) {
        C1ON A00 = A00(userSession, hashtag);
        A00.A00 = new C39021HFx(interfaceC63862v7, this, hashtag);
        C1GJ.A00(this.A00, this.A01, A00);
        AbstractC70136W6n.A00(this.A02, c19260xA, this.A03, hashtag, C05F.A00, str);
    }

    public final void A03(C19260xA c19260xA, UserSession userSession, InterfaceC63862v7 interfaceC63862v7, Hashtag hashtag, String str) {
        C1ON A01 = A01(userSession, hashtag);
        A01.A00 = new C39022HFy(interfaceC63862v7, this, hashtag);
        C1GJ.A00(this.A00, this.A01, A01);
        AbstractC70136W6n.A00(this.A02, c19260xA, this.A03, hashtag, C05F.A01, str);
    }

    public final void A05(UserSession userSession, InterfaceC63862v7 interfaceC63862v7, Hashtag hashtag, String str) {
        A02(null, userSession, interfaceC63862v7, hashtag, str);
    }

    public final void A06(UserSession userSession, InterfaceC63862v7 interfaceC63862v7, Hashtag hashtag, String str) {
        A03(null, userSession, interfaceC63862v7, hashtag, str);
    }

    public final void A04(C1P1 c1p1, UserSession userSession, String str) {
        String encode;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A06();
        if (str == null) {
            encode = "";
        } else {
            encode = android.net.Uri.encode(str.trim());
        }
        c25621Ms.A0B(AbstractC13670mt.A06("tags/%s/info/", encode));
        c25621Ms.A0S(C38898HAu.class, C41327IQx.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        C1GJ.A00(this.A00, this.A01, A0N);
    }

    public C63822v3(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = context;
        this.A01 = abstractC018607g;
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
    }
}
