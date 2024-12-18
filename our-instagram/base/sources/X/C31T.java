package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.31T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31T {
    public int A00;
    public int A01 = -1;
    public int A02;
    public C75113Zb A03;
    public C32S A04;
    public Integer A05;
    public Integer A06;
    public List A07;
    public List A08;
    public boolean A09;
    public final UserSession A0A;
    public final C65192xH A0B;

    public final String A02(Integer num, List list, List list2) {
        int i;
        List subList;
        C1XV c1xv;
        if (list2.isEmpty()) {
            return "EMPTY_EAGER_RESPONSE";
        }
        List list3 = this.A07;
        if (list3 != null && (i = this.A00) <= list3.size() && 0 <= i && (subList = list3.subList(0, i)) != null) {
            int i2 = this.A01;
            if (i2 != -1) {
                C3XG c3xg = (C3XG) AbstractC001800i.A0O(list, i2 + 1);
                if (c3xg != null) {
                    c1xv = c3xg.A06;
                } else {
                    c1xv = null;
                }
                if (c1xv == C1XV.A0T) {
                    if (C18U.A06(C06090Tz.A06, this.A0A, 36323217027640402L)) {
                        ArrayList arrayList = new ArrayList(list);
                        list = arrayList;
                        arrayList.remove(this.A01 + 1);
                        this.A09 = true;
                    }
                }
            }
            UserSession userSession = this.A0A;
            if (C18U.A06(C06090Tz.A06, userSession, 36323217027902550L)) {
                subList = this.A07;
            } else {
                int i3 = this.A00;
                if (i3 <= list.size() && 0 <= i3) {
                    list = list.subList(0, i3);
                } else {
                    list = null;
                }
            }
            if (C14360o3.A0K(subList, list)) {
                if (num != null && num.intValue() > this.A01 + ((int) C18U.A01(C06090Tz.A05, userSession, 36604692003951726L))) {
                    return "MAX_UNSEEN_INDEX_CHANGED";
                }
                return null;
            }
            return "FEED_ITEMS_HAVE_CHANGED";
        }
        return "FEED_ITEMS_HAVE_CHANGED";
    }

    public static final boolean A00(C1EU c1eu) {
        Map map = c1eu.A0D;
        if (map.containsKey("is_feed_eager_refresh") && C14360o3.A0K(map.get("is_feed_eager_refresh"), "true")) {
            return true;
        }
        return false;
    }

    public final String A01() {
        String str;
        List<C38321qM> list = this.A08;
        if (list != null) {
            ArrayList<String> arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            for (C38321qM c38321qM : list) {
                if (c38321qM != null) {
                    str = c38321qM.getId();
                } else {
                    str = null;
                }
                arrayList.add(str);
            }
            try {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0c();
                for (String str2 : arrayList) {
                    if (str2 != null) {
                        A0A.A0u(str2);
                    }
                }
                A0A.A0Z();
                A0A.close();
                return stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public C31T(UserSession userSession, C65192xH c65192xH) {
        this.A0A = userSession;
        this.A0B = c65192xH;
        Integer num = C05F.A00;
        this.A06 = num;
        this.A05 = num;
        this.A00 = -1;
    }
}
