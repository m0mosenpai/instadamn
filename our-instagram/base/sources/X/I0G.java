package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I0G {
    public static C38321qM A00(UserSession userSession, C38668Gz9 c38668Gz9, C38321qM c38321qM, String str, String str2, String str3, List list, boolean z, boolean z2) {
        String str4;
        Boolean bool;
        C106024qG c106024qG;
        C14360o3.A0B(userSession, 0);
        C38321qM c38321qM2 = new C38321qM();
        c38321qM2.A46(userSession, c38321qM, false);
        if (z2) {
            c38321qM2.A42(0);
            c38321qM2.A0C.Eh3(0);
            c38321qM2.A4C(EnumC77173d3.A03);
            c38321qM2.A0C.ERm(0);
            C40041tV c40041tV = c38321qM2.A0d;
            c40041tV.A01();
            c40041tV.A05.A01();
            c40041tV.A06.A01();
        }
        if (str != null) {
            c38321qM2.A0C.EYC(str);
            if (c38321qM2.A3Y().isEmpty()) {
                Integer valueOf = Integer.valueOf(EnumC906041v.AD_DESTINATION_WEB.A00);
                String A00 = AbstractC111324zv.A00(2461);
                c38321qM2.A0C.EPg(AbstractC166987dD.A1J(new AndroidLinkImpl(null, null, null, null, null, null, valueOf, null, null, null, null, null, null, null, A00, null, null, null, null, "Package", null, null, null, null, null, null, A00)));
            }
        }
        if (str3 != null && AbstractC37300Gc1.A0F(c38321qM2) == null) {
            User A2E = c38321qM.A2E(userSession);
            if (str2 != null && str2.length() != 0 && A2E != null) {
                str4 = A2E.B8y();
            } else {
                str4 = null;
            }
            C87853vt c87853vt = new C87853vt(C37472Geq.A00());
            c87853vt.A0i = str4;
            if (str2 != null && str2.length() != 0) {
                bool = true;
            } else {
                bool = null;
            }
            c87853vt.A0M = bool;
            c87853vt.A0r = str3;
            if (str2 != null && str2.length() != 0) {
                c106024qG = new C106024qG(str2);
            } else {
                c106024qG = null;
            }
            c87853vt.A07 = c106024qG;
            c38321qM2.A4D(c87853vt.A00());
        }
        if (z) {
            c38321qM2.A0C.EYW(null);
            InterfaceC38831rF interfaceC38831rF = c38321qM2.A0C;
            Float valueOf2 = Float.valueOf(0.0f);
            interfaceC38831rF.EX1(valueOf2);
            c38321qM2.A0C.EYS(valueOf2);
        }
        if (list != null) {
            c38321qM2.A0C.ERF(list);
            c38321qM2.A44(null);
        }
        c38321qM2.A0A = c38668Gz9;
        return c38321qM2;
    }
}
