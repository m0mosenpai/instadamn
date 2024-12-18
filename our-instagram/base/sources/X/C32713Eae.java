package X;

import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Eae, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32713Eae extends Dz7 {
    public AnonymousClass195 A00;

    @Override // X.Dz7
    public final C32055E6h A03(C37838Gks c37838Gks, EnumC33345Eoe enumC33345Eoe, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, ArrayList arrayList, List list, int i, boolean z) {
        C45209Jzp c45209Jzp;
        String str5;
        boolean z2;
        Boolean A0b = AbstractC166997dE.A0b();
        if (C14360o3.A0K(bool, A0b)) {
            C16930sl c16930sl = C16930sl.A00;
            return new C32055E6h(null, null, null, null, A0b, null, false, null, null, null, AbstractC166987dD.A1E(), c16930sl, c16930sl, c16930sl, c16930sl, 0, false, false);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (true) {
            c45209Jzp = null;
            String str6 = null;
            if (!it.hasNext()) {
                break;
            }
            C32050E6c c32050E6c = (C32050E6c) it.next();
            ImmutableList A00 = AbstractC34777FUb.A00(c32050E6c);
            UserSession userSession = this.A04;
            Resources resources = this.A01;
            String str7 = c32050E6c.A05;
            String str8 = this.A0D;
            String str9 = this.A09.A00;
            String str10 = userSession.userId;
            C7IH c7ih = this.A08.A04;
            User user2 = c32050E6c.A02;
            if (user2 != null) {
                str6 = user2.getId();
            }
            boolean A1W = AbstractC31171DnF.A1W(userSession, str6);
            C32869EdB A01 = AbstractC34777FUb.A01(resources, A00, userSession, this.A07, c7ih, C2EY.A0a, null, str7, str8, str9, str10, this.A0C, A1W);
            G5F g5f = new G5F(c7ih, str7, str8, A00.size());
            String str11 = this.A0A;
            String str12 = userSession.userId;
            Integer num = c32050E6c.A03;
            if (str4 != null) {
                z2 = true;
                if (!str4.equals(str7)) {
                    A1E.add(new C32716Eah(c37838Gks, c32050E6c, g5f, A01, null, null, null, num, str11, str12, z2, false, false));
                }
            }
            z2 = false;
            A1E.add(new C32716Eah(c37838Gks, c32050E6c, g5f, A01, null, null, null, num, str11, str12, z2, false, false));
        }
        if (str != null) {
            Resources resources2 = this.A01;
            if (user != null) {
                str5 = user.getUsername();
            } else {
                str5 = "";
            }
            String A0r = AbstractC166997dE.A0r(resources2, str5, 2131971102);
            C14360o3.A07(A0r);
            c45209Jzp = new C45209Jzp(null, null, str, A0r);
        }
        C16930sl c16930sl2 = C16930sl.A00;
        return new C32055E6h(null, c45209Jzp, enumC33345Eoe, user, bool, bool2, bool3, bool4, str, str2, arrayList, c16930sl2, A1E, c16930sl2, c16930sl2, i, z, AbstractC167007dF.A1W(str4));
    }
}
