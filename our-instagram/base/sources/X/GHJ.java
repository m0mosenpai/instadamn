package X;

import android.app.Activity;
import android.webkit.URLUtil;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GHJ implements C7XU {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ ZonePolicy A01;
    public final /* synthetic */ AbstractC59962oe A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C28531Zo A04;
    public final /* synthetic */ C3o9 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    @Override // X.C7XU
    public final void DB3() {
    }

    public GHJ(Activity activity, ZonePolicy zonePolicy, AbstractC59962oe abstractC59962oe, UserSession userSession, C28531Zo c28531Zo, C3o9 c3o9, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A04 = c28531Zo;
        this.A03 = userSession;
        this.A00 = activity;
        this.A02 = abstractC59962oe;
        this.A0B = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A08 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A05 = c3o9;
        this.A01 = zonePolicy;
    }

    @Override // X.C7XU
    public final void DAy() {
        String guessUrl;
        UserSession userSession = this.A03;
        Activity activity = this.A00;
        AbstractC59962oe abstractC59962oe = this.A02;
        C14360o3.A0A(abstractC59962oe);
        String str = this.A0B;
        String str2 = this.A09;
        String str3 = this.A0A;
        String str4 = this.A08;
        String str5 = this.A06;
        String str6 = this.A07;
        C3o9 c3o9 = this.A05;
        ZonePolicy zonePolicy = this.A01;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        boolean A1b = AbstractC167017dG.A1b(A00, A00.A15, C23031Ai.A8c, 476);
        ZonePolicy zonePolicy2 = ZonePolicy.A0D;
        if (A1b) {
            if (zonePolicy != zonePolicy2) {
                String A002 = AbstractC111324zv.A00(5451);
                C25531Mh A003 = C162337Ov.A00(abstractC59962oe, userSession, c3o9, false, AbstractC14490oL.A0A(activity), AbstractC151386rg.A06(str));
                A003.A0R("destination", A002);
                A003.A0R("web_link_entry_source", str5);
                A003.A0R("viewer_session_id", str3);
                A003.A0R("message_id", str6);
                if (str2 != null) {
                    A003.A0Q("sender_id", AbstractC166997dE.A0j(str2));
                }
                A003.Cht();
                new FPG().A00(abstractC59962oe, userSession, str, str2, false);
            }
            C12260kU.A0G(activity, AbstractC08820cl.A03(str));
            return;
        }
        if (zonePolicy != zonePolicy2) {
            String A004 = AbstractC111324zv.A00(2529);
            C25531Mh A005 = C162337Ov.A00(abstractC59962oe, userSession, c3o9, false, AbstractC14490oL.A0A(activity), AbstractC151386rg.A06(str));
            A005.A0R("destination", A004);
            A005.A0R("web_link_entry_source", str5);
            A005.A0R("viewer_session_id", str3);
            A005.A0R("message_id", str6);
            if (str2 != null) {
                A005.A0Q("sender_id", AbstractC166997dE.A0j(str2));
            }
            A005.Cht();
            new FPG().A00(abstractC59962oe, userSession, str, str2, false);
        }
        android.net.Uri A01 = AbstractC08820cl.A01(AbstractC31175DnJ.A0B(), str);
        if (A01 != null && A01.getScheme() != null) {
            guessUrl = AbstractC166987dD.A19(A01);
        } else {
            guessUrl = URLUtil.guessUrl(str);
            if (guessUrl == null) {
                guessUrl = "";
            }
        }
        C63397SjR c63397SjR = new C63397SjR(activity, userSession, C2Fb.A1W, guessUrl, false);
        c63397SjR.A0E(userSession.userId);
        c63397SjR.A0F(str3);
        c63397SjR.A0S = str4;
        c63397SjR.A0r = false;
        c63397SjR.A0D = zonePolicy;
        c63397SjR.A0A();
    }
}
