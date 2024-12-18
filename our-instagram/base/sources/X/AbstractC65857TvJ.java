package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.TvJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65857TvJ {
    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        String str;
        String str2;
        String host;
        User CDj;
        String str3 = null;
        if (c38321qM != null) {
            str = c38321qM.A0C.BW0();
            str2 = c38321qM.A0C.Bua();
        } else {
            str = null;
            str2 = null;
        }
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            android.net.Uri A01 = AbstractC08820cl.A01(new C1QF("IgSecureUriParser").A00, A01(str));
            if (A01 != null && (host = A01.getHost()) != null && host.length() != 0) {
                if (c38321qM != null && (CDj = c38321qM.A0C.CDj()) != null) {
                    str3 = CDj.getId();
                }
                if ((C14360o3.A0K(str3, userSession.userId) && C18U.A06(C06090Tz.A05, userSession, 36322761761237483L)) || C18U.A06(C06090Tz.A05, userSession, 36322761760647655L)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final String A00(String str) {
        String host;
        String A01 = A01(str);
        android.net.Uri A012 = AbstractC08820cl.A01(AbstractC31175DnJ.A0B(), A01(str));
        if (A012 != null && (host = A012.getHost()) != null) {
            A01 = host;
        }
        return new C11L("^www\\.").A01(AbstractC37303Gc4.A0X(A01), "");
    }

    public static final String A01(String str) {
        String A1A = AbstractC25228BEl.A1A(str);
        if (A1A.length() > 0 && !new C11L(AbstractC43591JPw.A00(123)).A08(A1A)) {
            return AnonymousClass001.A0R("http://", A1A);
        }
        return A1A;
    }
}
