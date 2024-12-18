package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.W6n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70136W6n {
    public static void A00(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, Hashtag hashtag, Integer num, String str) {
        String str2;
        String str3;
        if (num == C05F.A00) {
            str2 = "create";
        } else {
            str2 = "destroy";
        }
        C19280xC A01 = C19280xC.A01(AbstractC111324zv.A00(4471), interfaceC11380iw.getModuleName());
        A01.A0C("request_type", str2);
        A01.A0C("entity_id", hashtag.getId());
        A01.A0C("entity_type", "hashtag");
        String A00 = AbstractC111324zv.A00(402);
        if (num.intValue() != 0) {
            str3 = AbstractC111324zv.A00(2760);
        } else {
            str3 = "following";
        }
        A01.A0C(A00, str3);
        A01.A0C(AbstractC111324zv.A00(798), str);
        A01.A0C("follow_status", str3);
        A01.A0C("hashtag_follow_status", str3);
        A01.A07(AbstractC129005sL.A02, hashtag.getId());
        A01.A07(AbstractC129005sL.A03, hashtag.getName());
        A01.A0C("request_type", str2);
        if (c19260xA != null) {
            A01.A04(c19260xA);
        }
        WE1.A01(A01, userSession);
        AbstractC31173DnH.A1S(A01, userSession);
    }

    public static void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Hashtag hashtag, String str, Throwable th) {
        String message;
        C19280xC A01 = C19280xC.A01("follow_button_tap_failure", interfaceC11380iw.getModuleName());
        A01.A0C("request_type", str);
        if (th == null) {
            message = null;
        } else {
            message = th.getMessage();
        }
        if (message != null) {
            A01.A0C(TraceFieldType.Error, message);
        }
        WE2.A03(A01, hashtag);
        WE1.A01(A01, userSession);
        AbstractC31173DnH.A1S(A01, userSession);
    }

    public static void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, Hashtag hashtag, int i) {
        C19260xA c19260xA;
        C19280xC A01 = C19280xC.A01("report_irrelevant_hashtag_media", interfaceC11380iw.getModuleName());
        A01.A0C("m_pk", c38321qM.getId());
        A01.A08(Integer.valueOf(c38321qM.BRp().A00), "m_t");
        if (interfaceC11380iw instanceof AnonymousClass309) {
            c19260xA = ((AnonymousClass309) interfaceC11380iw).E6Q(c38321qM).A00();
        } else {
            c19260xA = new C19260xA();
        }
        A01.A04(c19260xA);
        A01.A08(Integer.valueOf(i), "m_ix");
        WE2.A03(A01, hashtag);
        WE1.A01(A01, userSession);
        AbstractC31173DnH.A1S(A01, userSession);
    }
}
