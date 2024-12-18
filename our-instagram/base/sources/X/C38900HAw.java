package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.HAw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38900HAw extends C40781ul {
    public EnumC39587Hdx A00;
    public C38859H9h A01;
    public User A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public HashMap A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public final Map A0E;
    public final Map A0F;
    public final List A0G;
    public final Map A0H;
    public final Map A0I;
    public final Map A0J;
    public final java.util.Set A0K;

    public final void A02(UserSession userSession, C38900HAw c38900HAw, boolean z) {
        boolean z2;
        EnumC39587Hdx enumC39587Hdx = c38900HAw.A00;
        if (enumC39587Hdx != this.A00) {
            this.A00 = enumC39587Hdx;
        }
        if (!AbstractC50102Ry.A00(c38900HAw.A08, this.A08)) {
            this.A08 = c38900HAw.A08;
            z2 = true;
        } else {
            z2 = false;
        }
        String str = c38900HAw.A05;
        if (str != null && !AbstractC50102Ry.A00(str, this.A05)) {
            this.A05 = c38900HAw.A05;
            z2 = true;
        }
        User user = c38900HAw.A02;
        if (user != null && !AbstractC50102Ry.A00(user, this.A02)) {
            this.A02 = c38900HAw.A02;
        }
        if (z) {
            this.A0F.clear();
            this.A0A.clear();
            List list = this.A0B;
            if (list != null) {
                list.clear();
            }
        }
        if (!AbstractC50102Ry.A00(c38900HAw.A07, this.A07)) {
            this.A07 = c38900HAw.A07;
            z2 = true;
        }
        Iterator it = c38900HAw.A0A.iterator();
        while (it.hasNext()) {
            C38321qM A0i = AbstractC31172DnG.A0i(it);
            if (A00(A0i)) {
                Map map = this.A0F;
                if (!map.containsKey(A0i.getId())) {
                    this.A0A.add(A0i);
                    map.put(A0i.getId(), A0i);
                    z2 = true;
                }
            }
        }
        List<C105824pt> list2 = c38900HAw.A0B;
        if (list2 == null) {
            list2 = AbstractC166987dD.A1E();
        }
        for (C105824pt c105824pt : list2) {
            if (c105824pt.A02() == null) {
                String str2 = c105824pt.A0X;
                str2.getClass();
                C0w9.A03("InvalidLiveBroadcastInIGTVFeed", AnonymousClass001.A0R("id: ", str2));
            } else {
                List list3 = this.A0B;
                if (list3 == null) {
                    list3 = AbstractC166987dD.A1E();
                }
                this.A0B = list3;
                Map map2 = this.A0E;
                String str3 = c105824pt.A0X;
                str3.getClass();
                if (!map2.containsKey(str3)) {
                    this.A0B.add(c105824pt);
                    String str4 = c105824pt.A0X;
                    str4.getClass();
                    map2.put(str4, c105824pt);
                    z2 = true;
                }
            }
        }
        if (!AbstractC50102Ry.A00(c38900HAw.A06, this.A06)) {
            this.A06 = c38900HAw.A06;
            z2 = true;
        }
        if (!AbstractC50102Ry.A00(Boolean.valueOf(c38900HAw.A0D), Boolean.valueOf(this.A0D))) {
            this.A0D = c38900HAw.A0D;
            z2 = true;
        }
        if (!AbstractC50102Ry.A00(Boolean.valueOf(c38900HAw.A0C), Boolean.valueOf(this.A0C))) {
            this.A0C = c38900HAw.A0C;
            z2 = true;
        }
        if (!AbstractC50102Ry.A00(c38900HAw.A04, this.A04)) {
            this.A04 = c38900HAw.A04;
        } else if (!z2) {
            return;
        }
        AbstractC25651Mw.A00(userSession).A05(new C55992OtP(this));
    }

    public C38900HAw(EnumC39587Hdx enumC39587Hdx, String str, String str2) {
        this.A00 = EnumC39587Hdx.A0B;
        this.A0A = AbstractC166987dD.A1E();
        this.A0D = true;
        this.A09 = AbstractC166987dD.A1G();
        this.A0C = false;
        this.A0F = AbstractC166987dD.A1G();
        this.A0E = AbstractC166987dD.A1G();
        this.A0G = AbstractC166987dD.A1E();
        this.A0K = AbstractC166987dD.A1H();
        this.A0J = AbstractC166987dD.A1G();
        this.A0H = AbstractC166987dD.A1G();
        this.A0I = AbstractC166987dD.A1G();
        this.A03 = str;
        this.A00 = enumC39587Hdx;
        this.A08 = str2;
    }

    public static boolean A00(C38321qM c38321qM) {
        if (c38321qM.Cff() && c38321qM.A5B()) {
            return true;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("id: ");
        A1C.append(c38321qM.getId());
        A1C.append(" type: ");
        C0w9.A03("InvalidVideoMediaInIGTVFeed", AbstractC166997dE.A0v(c38321qM.BRp(), A1C));
        return false;
    }

    public final ArrayList A01(UserSession userSession) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (this.A0B != null) {
            C109144ve A00 = C109144ve.A00(userSession);
            for (C105824pt c105824pt : this.A0B) {
                EnumC109104va enumC109104va = c105824pt.A06;
                if (enumC109104va == null) {
                    enumC109104va = EnumC109104va.A0E;
                }
                if (!enumC109104va.A00() && !A00.A02(c105824pt)) {
                    A1E.add(c105824pt);
                }
            }
        }
        return A1E;
    }

    public C38900HAw() {
        this.A00 = EnumC39587Hdx.A0B;
        this.A0A = AbstractC166987dD.A1E();
        this.A0D = true;
        this.A09 = AbstractC166987dD.A1G();
        this.A0C = false;
        this.A0F = AbstractC166987dD.A1G();
        this.A0E = AbstractC166987dD.A1G();
        this.A0G = AbstractC166987dD.A1E();
        this.A0K = AbstractC166987dD.A1H();
        this.A0J = AbstractC166987dD.A1G();
        this.A0H = AbstractC166987dD.A1G();
        this.A0I = AbstractC166987dD.A1G();
    }
}
