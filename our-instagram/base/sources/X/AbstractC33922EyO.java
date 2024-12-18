package X;

import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EyO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33922EyO {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C111184zg c111184zg;
        C102884kP c102884kP;
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        Object A01 = c6fw.A01();
        if ((A01 instanceof C102884kP) && (c102884kP = (C102884kP) A01) != null && c102884kP.A0E() != null) {
            String str = "";
            String str2 = "";
            String A0E = c102884kP.A0E();
            if (A0E != null) {
                str2 = A0E;
            }
            String str3 = "";
            String A0J = c102884kP.A0J();
            if (A0J != null) {
                str3 = A0J;
            }
            String str4 = "";
            String A0H = c102884kP.A0H();
            if (A0H != null) {
                str4 = A0H;
            }
            ActionButtonPartnerType actionButtonPartnerType = (ActionButtonPartnerType) ActionButtonPartnerType.A01.get(str4);
            if (actionButtonPartnerType == null) {
                actionButtonPartnerType = ActionButtonPartnerType.A07;
            }
            String str5 = "";
            String A0K = c102884kP.A0K();
            if (A0K != null) {
                str5 = A0K;
            }
            C111184zg c111184zg2 = new C111184zg(actionButtonPartnerType, str2, null, null, null, null, str3, str5);
            String str6 = c111184zg2.A01;
            String str7 = c111184zg2.A06;
            ActionButtonPartnerType actionButtonPartnerType2 = c111184zg2.A00;
            String str8 = c111184zg2.A07;
            String str9 = "";
            String A0G = c102884kP.A0G();
            if (A0G != null) {
                str9 = A0G;
            }
            String A0I = c102884kP.A0I();
            if (A0I != null) {
                str = A0I;
            }
            c111184zg = new C111184zg(actionButtonPartnerType2, str6, null, str9, str, null, str7, str8);
        } else {
            c111184zg = null;
        }
        User A10 = AbstractC166987dD.A10(A0W);
        A10.A03.EeU(c111184zg);
        AbstractC31172DnG.A1R(A0W, A10);
        return null;
    }
}
