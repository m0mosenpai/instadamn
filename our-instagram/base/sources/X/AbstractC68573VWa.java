package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.VWa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68573VWa {
    public static final void A00(C1P1 c1p1, UserSession userSession, U0K u0k, String str, String str2, int i) {
        int ordinal;
        String str3;
        C25621Ms A0c;
        String A0g;
        if (u0k == null) {
            ordinal = -1;
        } else {
            ordinal = u0k.ordinal();
        }
        Locale locale = Locale.getDefault();
        C14360o3.A07(locale);
        String lowerCase = str2.toLowerCase(locale);
        if (ordinal == 5) {
            C14360o3.A07(lowerCase);
            str3 = "map/remove_recent_search/";
        } else {
            C14360o3.A07(lowerCase);
            str3 = "fbsearch/hide_search_entities/";
        }
        C14360o3.A0B(str, 4);
        Object A0m = AbstractC166997dE.A0m(VZ1.A00, i);
        C14360o3.A0A(A0m);
        String str4 = (String) A0m;
        C14360o3.A0B(str4, 2);
        if (u0k == U0K.A06) {
            if (str4.equals("place")) {
                A0g = "LOCATION";
            } else {
                A0g = AbstractC65702TsY.A0g(str4);
            }
            A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0E = str3;
            A0c.A9s("target_id", str);
            A0c.A9s("target_type", A0g);
            AbstractC31173DnH.A1N(A0c);
            A0c.A0R = true;
        } else {
            A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0E = str3;
            A0c.A9s("section", lowerCase);
            AbstractC31173DnH.A1N(A0c);
            String A0b = AbstractC31175DnJ.A0b(AbstractC166987dD.A1J(str));
            C14360o3.A07(A0b);
            A0c.A9s(str4, A0b);
        }
        C1ON A0N = A0c.A0N();
        if (c1p1 != null) {
            A0N.A00 = c1p1;
        }
        C1GJ.A03(A0N);
    }
}
