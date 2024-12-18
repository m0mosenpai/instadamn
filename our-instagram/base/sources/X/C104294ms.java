package X;

import com.instagram.api.schemas.FeedItemType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104294ms implements C1NI {
    public C38661qx A00;

    public final void A02(List list) {
        C38661qx c38661qx = this.A00;
        C14360o3.A0B(c38661qx, 1);
        String str = c38661qx.A03;
        int i = c38661qx.A00;
        boolean z = c38661qx.A08;
        boolean z2 = c38661qx.A09;
        long j = c38661qx.A01;
        boolean z3 = c38661qx.A0A;
        boolean z4 = c38661qx.A0B;
        boolean z5 = c38661qx.A0C;
        boolean z6 = c38661qx.A0D;
        FeedItemType feedItemType = c38661qx.A02;
        boolean z7 = c38661qx.A0E;
        String str2 = c38661qx.A04;
        boolean z8 = c38661qx.A0F;
        boolean z9 = c38661qx.A0G;
        String str3 = c38661qx.A05;
        String str4 = c38661qx.A06;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC139206Sb interfaceC139206Sb = (InterfaceC139206Sb) it.next();
            C14360o3.A0B(interfaceC139206Sb, 0);
            C139196Sa c139196Sa = (C139196Sa) interfaceC139206Sb;
            String str5 = c139196Sa.A09;
            String str6 = c139196Sa.A0D;
            User user = c139196Sa.A02;
            C14360o3.A0B(str5, 0);
            C14360o3.A0B(str6, 1);
            C14360o3.A0B(user, 2);
            C47E c47e = null;
            new C1DY((C1DV) new C37761pD(null), 6, false);
            C115875Md c115875Md = null;
            C47G c47g = new C47G(null, null, user, null, null, null, null, null, null, str5, null, null, null, str6, null, null, null, null, null, null);
            String str7 = c47g.A09;
            String str8 = c47g.A0D;
            User user2 = c47g.A02;
            String str9 = c139196Sa.A0A;
            String str10 = c139196Sa.A0B;
            C47F c47f = c139196Sa.A01;
            Boolean bool = c139196Sa.A03;
            Boolean bool2 = c139196Sa.A04;
            String str11 = c139196Sa.A0C;
            Boolean bool3 = c139196Sa.A05;
            List list2 = c139196Sa.A0F;
            Integer num = c139196Sa.A08;
            List list3 = c139196Sa.A0G;
            List list4 = c139196Sa.A0H;
            C115875Md c115875Md2 = c139196Sa.A00;
            Float f = c139196Sa.A06;
            List list5 = c139196Sa.A0I;
            List list6 = c139196Sa.A0J;
            String str12 = c139196Sa.A0E;
            Float f2 = c139196Sa.A07;
            C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
            if (c47f != null) {
                c47e = c47f.EzI();
            }
            if (c115875Md2 != null) {
                c115875Md = c115875Md2.ExT(c1dy);
            }
            arrayList.add(new C47G(c115875Md, c47e, user2, bool, bool2, bool3, f, f2, num, str7, str9, str10, str11, str8, str12, list2, list3, list4, list5, list6));
        }
        C1DY c1dy2 = new C1DY((C1DV) new C37761pD(null), 6, false);
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C47H) it2.next()).F2Y(c1dy2));
        }
        this.A00 = new C38661qx(feedItemType, str, str2, str3, str4, arrayList2, i, j, z, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    public final List A01() {
        List<C47G> list = this.A00.A07;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        for (C47G c47g : list) {
            C14360o3.A0B(c47g, 0);
            String str = c47g.A09;
            if (str == null) {
                str = "unknown";
            }
            String str2 = c47g.A0D;
            if (str2 == null) {
                str2 = "";
            }
            User user = c47g.A02;
            C14360o3.A0B(user, 2);
            C47E c47e = null;
            new C1DY((C1DV) new C37761pD(null), 6, false);
            C115875Md c115875Md = null;
            C139196Sa c139196Sa = new C139196Sa(null, null, user, null, null, null, null, null, null, str, null, null, null, str2, null, null, null, null, null, null);
            String str3 = c139196Sa.A09;
            String str4 = c139196Sa.A0D;
            User user2 = c139196Sa.A02;
            String str5 = c47g.A0A;
            String str6 = c47g.A0B;
            C47F c47f = c47g.A01;
            Boolean bool = c47g.A03;
            Boolean bool2 = c47g.A04;
            String str7 = c47g.A0C;
            Boolean bool3 = c47g.A05;
            List list2 = c47g.A0F;
            Integer num = c47g.A08;
            List list3 = c47g.A0G;
            List list4 = c47g.A0H;
            C115875Md c115875Md2 = c47g.A00;
            Float f = c47g.A06;
            List list5 = c47g.A0I;
            List list6 = c47g.A0J;
            String str8 = c47g.A0E;
            Float f2 = c47g.A07;
            new C1DY((C1DV) new C37761pD(null), 6, false);
            if (c47f != null) {
                c47e = c47f.EzI();
            }
            if (c115875Md2 != null) {
                c115875Md = c115875Md2;
            }
            arrayList.add(new C139196Sa(c115875Md, c47e, user2, bool, bool2, bool3, f, f2, num, str3, str5, str6, str7, str4, str8, list2, list3, list4, list5, list6));
        }
        return arrayList;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return false;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return false;
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return String.valueOf(this.A00.A01);
    }

    public final List A00() {
        List A01 = A01();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A01, 10));
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC139226Sd.A00((InterfaceC139206Sb) it.next()).getId());
        }
        return arrayList;
    }
}
