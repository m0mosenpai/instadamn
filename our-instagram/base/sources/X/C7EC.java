package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.7EC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7EC {
    public final C18920wW A00;

    public final void A00(EnumC46202Kce enumC46202Kce, C3o9 c3o9, String str) {
        Boolean bool;
        String str2;
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_quoted_reply_sent");
        if (A00.isSampled()) {
            Long l = null;
            if (c3o9 != null) {
                bool = Boolean.valueOf(JRE.A09(c3o9));
                str2 = AbstractC43827JZq.A01(c3o9);
                l = AbstractC43827JZq.A00(c3o9);
            } else {
                bool = null;
                str2 = null;
            }
            A00.AAP("action", enumC46202Kce.A00);
            A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            A00.A7v("is_e2ee", bool);
            A00.AAP("open_thread_id", str2);
            A00.A9K("occamadillo_thread_id", l);
            A00.Cht();
        }
    }

    public C7EC(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
