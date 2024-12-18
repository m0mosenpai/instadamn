package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.GiJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37682GiJ {
    public final UserSession A00;
    public final AbstractC39459Hbl A01;

    public final String A00() {
        String id;
        C40971v4 A07;
        List<C120985dq> A0J = this.A01.A0J();
        if (A0J == null) {
            return null;
        }
        try {
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A06 = AbstractC37301Gc2.A06(A0O);
            for (C120985dq c120985dq : A0J) {
                if (c120985dq.A01 != EnumC129395t1.A08) {
                    C38321qM c38321qM = c120985dq.A02;
                    Integer A00 = AbstractC37725Gj0.A00(c120985dq);
                    boolean A0G = c120985dq.A0G();
                    int i = 0;
                    if (A0G) {
                        C40971v4 c40971v4 = (C40971v4) AbstractC001800i.A0O((List) c120985dq.A03().A01.A00, 0);
                        if (c40971v4 != null) {
                            id = c40971v4.A0S;
                        } else {
                            id = null;
                        }
                        if (id == null) {
                            id = "";
                        }
                    } else {
                        id = c120985dq.getId();
                    }
                    if (c38321qM != null) {
                        c38321qM.A0C.EhL(true);
                    }
                    A06.A0d();
                    A06.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, id);
                    if (A00 != null) {
                        i = A00.intValue();
                    }
                    A06.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
                    A06.A0T("is_multi_ads", A0G);
                    if (C18U.A06(C06090Tz.A06, this.A00, 36315112425524245L) && (A07 = c120985dq.A07()) != null) {
                        A06.A0S("overlay_ad_id", A07.A0S);
                    }
                    A06.A0a();
                }
            }
            A06.A0Z();
            A06.close();
            return A0O.toString();
        } catch (IOException e) {
            C0K8.A0F("ClipsViewStateUtil", "Failed building JSON: ", e);
            return null;
        }
    }

    public C37682GiJ(UserSession userSession, AbstractC39459Hbl abstractC39459Hbl) {
        AbstractC167017dG.A1P(userSession, abstractC39459Hbl);
        this.A00 = userSession;
        this.A01 = abstractC39459Hbl;
    }
}
