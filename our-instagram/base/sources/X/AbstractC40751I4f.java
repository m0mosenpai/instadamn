package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.I4f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40751I4f {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, Long l, String str, String str2, String str3, String str4) {
        AbstractC167007dF.A1H(str, 1, c18920wW);
        C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(2562)), 299);
        if (AbstractC25226BEj.A1Z(c25531Mh)) {
            c25531Mh.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            c25531Mh.A0j(str3);
            c25531Mh.A0R("container_module", interfaceC11380iw.getModuleName());
            c25531Mh.A0Q("ig_userid", C4SX.A00(userSession.userId).A00);
            c25531Mh.A0R("netego_id", str2);
            c25531Mh.A0Q("netego_subtype", l);
            c25531Mh.A0R("tracking_token", str4);
            c25531Mh.Cht();
        }
    }
}
