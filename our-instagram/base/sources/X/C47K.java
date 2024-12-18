package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Deprecated;

/* renamed from: X.47K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47K implements InterfaceC73233Pz {
    public int A00;
    public int A01;
    public C39561sd A02;
    public C103434lJ A03;
    public C914346k A04;
    public C1XV A05;
    public C103464lM A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public List A0O;
    public List A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public Map A0T;
    public Map A0U;

    @Deprecated(message = "")
    public final boolean A0A(String str) {
        List list = this.A0M;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C47O) next).A03.getId().equalsIgnoreCase(str)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        List list2 = this.A0P;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                C47L c47l = (C47L) next2;
                if (c47l.A07 == C47R.A0A) {
                    C47O A00 = c47l.A00();
                    if (A00 != null) {
                        if (str.equalsIgnoreCase(A00.A03.getId())) {
                            if (next2 != null) {
                                return true;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        List A04 = A04();
        if (A04 != null) {
            Iterator it3 = A04.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                String str2 = ((FOC) next3).A04;
                if (str2 != null && str2.equalsIgnoreCase(str)) {
                    if (next3 != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public C47K(C47J c47j) {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C103434lJ c103434lJ;
        C914346k c914346k;
        String str8;
        Integer num;
        Integer num2;
        C39561sd c39561sd;
        InterfaceC39571se interfaceC39571se;
        Boolean bool;
        String str9;
        Boolean bool2;
        Boolean bool3;
        List list;
        List list2;
        List list3;
        String str10;
        Integer num3;
        String str11;
        String str12 = "";
        this.A0F = (c47j == null || (str11 = c47j.A0B) == null) ? "" : str11;
        if (c47j != null && (num3 = c47j.A08) != null) {
            i = num3.intValue();
        } else {
            i = 0;
        }
        this.A01 = i;
        this.A0G = (c47j == null || (str10 = c47j.A0L) == null) ? "" : str10;
        if (c47j != null && (list3 = c47j.A0O) != null) {
            arrayList = new ArrayList(list3);
        } else {
            arrayList = null;
        }
        this.A0N = arrayList;
        if (arrayList != null) {
            ArrayList arrayList6 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C47M c47m = (C47M) it.next();
                C14360o3.A0B(c47m, 0);
                arrayList6.add(new C47O(c47m));
            }
            arrayList2 = AbstractC001800i.A0U(arrayList6);
        } else {
            arrayList2 = null;
        }
        this.A0M = arrayList2;
        if (c47j != null && (list2 = c47j.A0N) != null) {
            arrayList3 = new ArrayList(list2);
        } else {
            arrayList3 = null;
        }
        this.A0O = arrayList3;
        if (arrayList3 != null) {
            ArrayList arrayList7 = new ArrayList(AbstractC06950Ym.A1E(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList7.add(new C47L((C47I) it2.next()));
            }
            arrayList4 = AbstractC001800i.A0U(arrayList7);
        } else {
            arrayList4 = null;
        }
        this.A0P = arrayList4;
        if (c47j != null && (list = c47j.A0P) != null) {
            arrayList5 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C132765yz c132765yz = (C132765yz) ((InterfaceC132775z0) it3.next());
                String str13 = c132765yz.A02;
                Hashtag hashtag = c132765yz.A00;
                List list4 = c132765yz.A06;
                String str14 = c132765yz.A03;
                String str15 = c132765yz.A04;
                String str16 = c132765yz.A05;
                List list5 = c132765yz.A07;
                User user = c132765yz.A01;
                HashtagImpl hashtagImpl = null;
                new C1DY((C1DV) new C37761pD(null), 6, false);
                if (hashtag != null) {
                    hashtagImpl = hashtag.F59();
                }
                arrayList5.add(new C132765yz(hashtagImpl, user, str13, str14, str15, str16, list4, list5));
            }
        } else {
            arrayList5 = null;
        }
        this.A0L = arrayList5;
        if (c47j != null && (bool3 = c47j.A03) != null) {
            z = bool3.booleanValue();
        } else {
            z = true;
        }
        this.A0Q = z;
        if (c47j != null && (bool2 = c47j.A04) != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        this.A0R = z2;
        if (c47j != null && (str9 = c47j.A0K) != null) {
            str12 = str9;
        }
        this.A0K = str12;
        if (c47j != null) {
            str = c47j.A0J;
        } else {
            str = null;
        }
        this.A0J = str;
        if (c47j != null) {
            str2 = c47j.A0M;
        } else {
            str2 = null;
        }
        this.A0A = str2;
        if (c47j != null && (bool = c47j.A06) != null) {
            z3 = bool.booleanValue();
        } else {
            z3 = false;
        }
        this.A0S = z3;
        if (c47j != null) {
            str3 = c47j.A0F;
        } else {
            str3 = null;
        }
        this.A0E = str3;
        if (c47j != null) {
            str4 = c47j.A0E;
        } else {
            str4 = null;
        }
        this.A0D = str4;
        if (c47j != null) {
            str5 = c47j.A0G;
        } else {
            str5 = null;
        }
        this.A0H = str5;
        if (c47j != null) {
            str6 = c47j.A0C;
        } else {
            str6 = null;
        }
        this.A0C = str6;
        if (c47j != null) {
            str7 = c47j.A0I;
        } else {
            str7 = null;
        }
        this.A0I = str7;
        if (c47j != null) {
            c103434lJ = c47j.A01;
        } else {
            c103434lJ = null;
        }
        this.A03 = c103434lJ;
        if (c47j != null) {
            c914346k = c47j.A02;
        } else {
            c914346k = null;
        }
        this.A04 = c914346k;
        if (c47j != null) {
            str8 = c47j.A0A;
        } else {
            str8 = null;
        }
        this.A0B = str8;
        if (c47j != null) {
            num = c47j.A09;
        } else {
            num = null;
        }
        this.A08 = num;
        if (c47j != null) {
            num2 = c47j.A07;
        } else {
            num2 = null;
        }
        this.A07 = num2;
        if (c47j != null && (interfaceC39571se = c47j.A00) != null) {
            c39561sd = interfaceC39571se.Eyq();
        } else {
            c39561sd = null;
        }
        this.A02 = c39561sd;
        this.A05 = (C1XV) C1XV.A01.get(c47j != null ? c47j.A0H : null);
        this.A0U = new HashMap();
        this.A0T = new HashMap();
        this.A00 = -1;
        if (c47j != null) {
            A05();
        }
    }

    public final int A00(FOC foc) {
        Number number = (Number) this.A0T.get(foc);
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public final int A01(C47O c47o) {
        Number number = (Number) this.A0U.get(c47o);
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public final C47L A02(int i) {
        List list = this.A0P;
        if (list == null || i >= list.size() || i < 0) {
            return null;
        }
        return (C47L) list.get(i);
    }

    public final ArrayList A03() {
        ArrayList arrayList = new ArrayList();
        List<C47L> list = this.A0P;
        if (list != null) {
            for (C47L c47l : list) {
                if (c47l.A07 == C47R.A0A) {
                    C47O A00 = c47l.A00();
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                } else {
                    C0w9.A03("SuggestedUsers", "You should only call `getRecommendedUsersListFromSuggestedItems(...)` if you are certain the suggested items are all of type SUGGESTED_USER. This hairiness should only occur during the migration from the List<RecommendedUser> to the List<SuggestedItem> response.");
                }
            }
        }
        return arrayList;
    }

    public final List A04() {
        List list = this.A0L;
        if (list != null) {
            return FVZ.A01(list);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.4lM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.47L] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47K.A05():void");
    }

    public final void A06(String str) {
        if (str != null && str.length() != 0) {
            List<C47L> list = this.A0P;
            if (list != null) {
                for (C47L c47l : list) {
                    if (c47l.A07 == C47R.A0A) {
                        C47O A00 = c47l.A00();
                        if (A00 != null) {
                            if (str.equals(A00.A03.getId())) {
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                throw new NoSuchElementException(MSV.A00(1));
            }
            c47l = null;
            List list2 = this.A0P;
            if (list2 != null) {
                C15500q5.A00(list2).remove(c47l);
            }
        }
    }

    @Deprecated(message = "")
    public final boolean A07() {
        List list = this.A0M;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A08() {
        List list = this.A0P;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A09() {
        Integer num = this.A08;
        if (num != null && num.intValue() == 161) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        C1XV c1xv = this.A05;
        if (c1xv == null) {
            return C1XV.A0v;
        }
        return c1xv;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A07;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A02;
    }

    @Override // X.InterfaceC73233Pz
    public final Integer BWa() {
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return this.A0G;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A08;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        String str = this.A0F;
        if (str == null) {
            return "";
        }
        return str;
    }

    public C47K() {
        this(null);
    }
}
