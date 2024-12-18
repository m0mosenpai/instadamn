package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Drd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31433Drd {
    public final InterfaceC11380iw A00;
    public final C31434Dre A01;
    public final C123835ix A02;
    public final java.util.Set A03;
    public final java.util.Set A04;
    public final C63702ur A05;
    public final java.util.Set A06;

    public AbstractC31433Drd(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, String str, String str2, String str3) {
        HashMap A03;
        C14360o3.A0B(userSession, 2);
        this.A03 = AbstractC166987dD.A1H();
        this.A06 = AbstractC166987dD.A1H();
        this.A04 = AbstractC166987dD.A1H();
        this.A00 = interfaceC11380iw;
        if (c19260xA == null) {
            A03 = AbstractC166987dD.A1G();
        } else {
            A03 = AbstractC11490j8.A03(c19260xA);
        }
        this.A01 = new C31434Dre(interfaceC11380iw, userSession, str, str2, str3, A03);
        this.A02 = new C123835ix(interfaceC11380iw, userSession, null, str, str3);
        this.A05 = new C63702ur(interfaceC11380iw, userSession);
    }

    public Hashtag A01(Hashtag hashtag, int i) {
        C69730VuP c69730VuP = new C69730VuP(hashtag);
        c69730VuP.A08 = 1;
        return c69730VuP.A00();
    }

    public void A05() {
    }

    public void A07(EnumC33444EqG enumC33444EqG) {
    }

    public void A0C(C47O c47o, int i) {
        C14360o3.A0B(c47o, 1);
        this.A05.A0B(new C6PH(A00(this, c47o)));
    }

    public void A0D(C47O c47o, int i) {
        C14360o3.A0B(c47o, 1);
        this.A05.A07(new C6PH(A00(this, c47o)));
    }

    public void A0E(C47O c47o, int i) {
        C14360o3.A0B(c47o, 1);
        C63702ur c63702ur = this.A05;
        C6PG A00 = A00(this, c47o);
        A00.A0A = C63702ur.A00(c47o.A03);
        c63702ur.A08(new C6PH(A00));
    }

    public final void A0F(C47O c47o, long j) {
        C14360o3.A0B(c47o, 1);
        if (this.A06.add(c47o.getId())) {
            C63702ur c63702ur = this.A05;
            C6PG A00 = A00(this, c47o);
            A00.A03 = Long.valueOf(j);
            c63702ur.A09(new C6PH(A00));
        }
    }

    public Hashtag A02(Hashtag hashtag, int i) {
        C69730VuP c69730VuP = new C69730VuP(hashtag);
        c69730VuP.A08 = AbstractC25227BEk.A0p();
        return c69730VuP.A00();
    }

    public void A03() {
        C31434Dre c31434Dre = this.A01;
        InterfaceC11380iw interfaceC11380iw = c31434Dre.A01;
        UserSession userSession = c31434Dre.A02;
        String str = c31434Dre.A03;
        String str2 = c31434Dre.A04;
        Map map = c31434Dre.A00;
        C19280xC A00 = C19280xC.A00(interfaceC11380iw, "similar_user_suggestions_closed");
        if (str != null) {
            A00.A0C("uid_based_on", str);
        }
        A00.A0C("view", str2);
        A00.A0F(map);
        AbstractC31173DnH.A1S(A00, userSession);
    }

    public void A04() {
        this.A03.clear();
        this.A06.clear();
        this.A04.clear();
    }

    public void A06(View view, User user, int i) {
        C123835ix c123835ix = this.A02;
        String id = user.getId();
        String A0O = user.A0O();
        String A0e = AbstractC31171DnF.A0e(user);
        String str = c123835ix.A02;
        if (str != null) {
            String str2 = c123835ix.A03;
            if (str2 != null) {
                c123835ix.A03(id, str, str2, A0O, A0e, i);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public void A08(Hashtag hashtag, int i) {
        this.A01.A00(hashtag, "similar_entity_tapped", i);
    }

    public void A09(User user, int i) {
        C123835ix c123835ix = this.A02;
        String id = user.getId();
        String A0O = user.A0O();
        String A0e = AbstractC31171DnF.A0e(user);
        String str = c123835ix.A02;
        if (str != null) {
            String str2 = c123835ix.A03;
            if (str2 != null) {
                c123835ix.A01(id, str, str2, A0O, A0e, i);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final void A0B(User user, int i) {
        if (this.A03.add(user.getId())) {
            this.A02.A00(0L, user.getId(), i, user.A0O(), AbstractC31171DnF.A0e(user));
        }
    }

    public void A0G(boolean z, String str) {
        if (z) {
            C123835ix c123835ix = this.A02;
            if (c123835ix.A04) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c123835ix.A06, AbstractC111324zv.A00(1210));
                A0f.AAP("view_module", str);
                AbstractC31175DnJ.A14(A0f, c123835ix.A00);
                A0f.Cht();
            }
        }
    }

    public static C6PG A00(AbstractC31433Drd abstractC31433Drd, C47O c47o) {
        C6PG c6pg = new C6PG("self_profile_chaining", c47o.getId(), abstractC31433Drd.A00.getModuleName());
        c6pg.A04 = c47o.A04;
        c6pg.A0B = c47o.A05;
        String str = c47o.A08;
        if (str != null) {
            c6pg.A07 = str;
        }
        return c6pg;
    }

    public void A0A(User user, int i) {
        String A0O = user.A0O();
        C123835ix c123835ix = this.A02;
        String id = user.getId();
        String A0e = AbstractC31171DnF.A0e(user);
        String str = c123835ix.A02;
        if (str != null) {
            String str2 = c123835ix.A03;
            if (str2 != null) {
                c123835ix.A02(id, str, str2, A0O, A0e, i);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public AbstractC31433Drd(InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, String str) {
        this.A03 = AbstractC166987dD.A1H();
        this.A06 = AbstractC166987dD.A1H();
        this.A04 = AbstractC166987dD.A1H();
        this.A00 = interfaceC11380iw;
        this.A01 = new C31434Dre(interfaceC11380iw, userSession, str, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "profile", null);
        this.A02 = new C123835ix(interfaceC11380iw, userSession, user, str, "profile");
        this.A05 = new C63702ur(interfaceC11380iw, userSession);
    }
}
