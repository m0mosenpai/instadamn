package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6xX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC154826xX {
    public static final int A00(UserSession userSession) {
        List BmH = C17060sy.A01.A01(userSession).A03.BmH();
        if (BmH != null) {
            Object A0I = AbstractC001800i.A0I(BmH);
            if (C14360o3.A0K(A0I, "CA")) {
                return 2131954753;
            }
            if (C14360o3.A0K(A0I, "AU")) {
                return 2131953332;
            }
            return 2131977184;
        }
        return 2131977184;
    }

    public static final String A01(UserSession userSession) {
        String str;
        List BmH = C17060sy.A01.A01(userSession).A03.BmH();
        if (BmH == null) {
            str = "";
        } else {
            str = (String) AbstractC001800i.A0I(BmH);
        }
        String displayCountry = new Locale("", str).getDisplayCountry();
        C14360o3.A07(displayCountry);
        return displayCountry;
    }

    public static final boolean A02(UserSession userSession, User user) {
        Boolean Cbk;
        Boolean CWA;
        List BmH;
        Boolean Cbl;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36323835502407297L);
        User A01 = C17060sy.A01.A01(userSession);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36319411686088102L);
        if (A06) {
            if (!A062 || A01.A03.BmH() == null || (BmH = A01.A03.BmH()) == null || !(!BmH.isEmpty()) || user == null || (Cbl = user.A03.Cbl()) == null || !Cbl.booleanValue()) {
                return false;
            }
            return true;
        }
        if (A062 && user != null && (Cbk = user.A03.Cbk()) != null && Cbk.booleanValue() && (CWA = A01.A03.CWA()) != null && CWA.booleanValue()) {
            return true;
        }
        return false;
    }
}
