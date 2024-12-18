package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* renamed from: X.Shk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63333Shk {
    public double A00;
    public String A01;
    public final C44S A02;
    public final UserSession A03;
    public final InterfaceC19630xq A04;

    public static final ArrayList A00(C63333Shk c63333Shk) {
        boolean z;
        long j;
        String obj;
        Long A0j;
        String obj2;
        Boolean A0A;
        String string = c63333Shk.A04.getString("KEY_SWIPE_HISTORY_V2", null);
        ArrayList A17 = AbstractC25225BEi.A17(20);
        if (string != null) {
            Iterator it = AbstractC100754fe.A02((JsonElement) AbstractC73763Sg.A03.A00(string, JsonElementSerializer.A00)).iterator();
            while (it.hasNext()) {
                JsonElement jsonElement = (JsonElement) it.next();
                Object obj3 = AbstractC100754fe.A03(jsonElement).get("goodSwipe");
                if (obj3 != null && (obj2 = obj3.toString()) != null && (A0A = AbstractC001900j.A0A(obj2)) != null) {
                    z = A0A.booleanValue();
                } else {
                    z = true;
                }
                Object obj4 = AbstractC100754fe.A03(jsonElement).get("timeStamp");
                if (obj4 != null && (obj = obj4.toString()) != null && (A0j = AbstractC166997dE.A0j(obj)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                A17.add(new QIv(j, 2, z));
            }
        }
        return A17;
    }

    public static final ArrayList A01(C63333Shk c63333Shk) {
        long j;
        String obj;
        Long A0j;
        String obj2;
        Long A0j2;
        String string = c63333Shk.A04.getString("KEY_PROFILE_SWIPE_HISTORY", null);
        ArrayList A17 = AbstractC25225BEi.A17(20);
        if (string != null) {
            Iterator it = AbstractC100754fe.A02((JsonElement) AbstractC73763Sg.A03.A00(string, JsonElementSerializer.A00)).iterator();
            while (it.hasNext()) {
                JsonElement jsonElement = (JsonElement) it.next();
                Object obj3 = AbstractC100754fe.A03(jsonElement).get("dwellTime");
                long j2 = 0;
                if (obj3 != null && (obj2 = obj3.toString()) != null && (A0j2 = AbstractC166997dE.A0j(obj2)) != null) {
                    j = A0j2.longValue();
                } else {
                    j = 0;
                }
                Object obj4 = AbstractC100754fe.A03(jsonElement).get("timeStamp");
                if (obj4 != null && (obj = obj4.toString()) != null && (A0j = AbstractC166997dE.A0j(obj)) != null) {
                    j2 = A0j.longValue();
                }
                A17.add(new C58913QIr(j, j2, 2));
            }
        }
        return A17;
    }

    public static final boolean A02(C63333Shk c63333Shk, ArrayList arrayList, ArrayList arrayList2, double d, int i, int i2) {
        int i3;
        String str;
        double d2;
        double d3;
        int i4;
        int i5;
        long A05 = AbstractC58320PtC.A05(i, System.currentTimeMillis());
        UserSession userSession = c63333Shk.A03;
        long A00 = Py0.A00(userSession);
        boolean A02 = Py0.A02(userSession);
        AbstractC58319PtB.A1M(arrayList, new JXD(A05, 23), 11);
        if (arrayList2 != null) {
            AbstractC58319PtB.A1M(arrayList2, new JXD(A05, 24), 11);
        }
        boolean z = false;
        int size = arrayList.size();
        if (A02 && arrayList2 != null) {
            i3 = arrayList2.size();
        } else {
            i3 = 0;
        }
        if (i3 + size >= i2) {
            List A0h = AbstractC001800i.A0h(arrayList, i2);
            if (A0h != null) {
                if ((A0h instanceof Collection) && A0h.isEmpty()) {
                    i5 = 0;
                } else {
                    Iterator it = A0h.iterator();
                    i5 = 0;
                    while (it.hasNext()) {
                        if (((QIv) it.next()).A01 && (i5 = i5 + 1) < 0) {
                            break;
                        }
                    }
                }
                d2 = i5;
            } else {
                d2 = 0.0d;
            }
            double d4 = i2;
            double d5 = d2 / d4;
            c63333Shk.A00 = d5;
            if (A02) {
                if (arrayList2 != null) {
                    int i6 = i2 - size;
                    if (i6 <= 0) {
                        i6 = 0;
                    }
                    List A0h2 = AbstractC001800i.A0h(arrayList2, i6);
                    if (A0h2 != null) {
                        if ((A0h2 instanceof Collection) && A0h2.isEmpty()) {
                            i4 = 0;
                        } else {
                            Iterator it2 = A0h2.iterator();
                            i4 = 0;
                            while (it2.hasNext()) {
                                if (((C58913QIr) it2.next()).A00 >= A00 && (i4 = i4 + 1) < 0) {
                                    AbstractC16960so.A1T();
                                    throw C00O.createAndThrow();
                                }
                            }
                        }
                        d3 = i4;
                        d5 = (d2 + d3) / d4;
                        c63333Shk.A00 = d5;
                    }
                }
                d3 = 0.0d;
                d5 = (d2 + d3) / d4;
                c63333Shk.A00 = d5;
            }
            if (d5 >= d) {
                z = true;
                str = "good_swiper";
            } else {
                str = "bad_swiper";
            }
        } else {
            str = "not_swiper";
        }
        c63333Shk.A01 = str;
        return z;
    }

    public C63333Shk(UserSession userSession) {
        this.A03 = userSession;
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A0o);
        this.A04 = A03;
        this.A02 = new C44S(null);
        AbstractC58321PtD.A1N(userSession, A03);
        synchronized (this) {
            long A05 = AbstractC58320PtC.A05(90, System.currentTimeMillis());
            ArrayList A00 = A00(this);
            AbstractC58319PtB.A1M(A00, new JXD(A05, 27), 11);
            InterfaceC19630xq interfaceC19630xq = this.A04;
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            C44S c44s = this.A02;
            ARD.E7K("KEY_SWIPE_HISTORY_V2", c44s.A0F(A00));
            ARD.apply();
            if (Py0.A02(this.A03)) {
                ArrayList A01 = A01(this);
                AbstractC58319PtB.A1M(A01, new JXD(A05, 28), 11);
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7K("KEY_PROFILE_SWIPE_HISTORY", c44s.A0F(A01));
                ARD2.apply();
            }
        }
    }

    public static final boolean A03(C63333Shk c63333Shk, ArrayList arrayList, ArrayList arrayList2, double d, int i, int i2) {
        int i3;
        String str;
        int i4;
        double d2;
        int i5;
        long A05 = AbstractC58320PtC.A05(i, System.currentTimeMillis());
        UserSession userSession = c63333Shk.A03;
        long A00 = Py0.A00(userSession);
        boolean A02 = Py0.A02(userSession);
        AbstractC58319PtB.A1M(arrayList, new JXD(A05, 25), 11);
        if (arrayList2 != null) {
            AbstractC58319PtB.A1M(arrayList2, new JXD(A05, 26), 11);
        }
        boolean z = false;
        int size = arrayList.size();
        if (A02 && arrayList2 != null) {
            i3 = arrayList2.size();
        } else {
            i3 = 0;
        }
        int i6 = i3 + size;
        if (i6 >= i2) {
            double d3 = 0.0d;
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                i4 = 0;
            } else {
                Iterator it = arrayList.iterator();
                i4 = 0;
                while (it.hasNext()) {
                    if (((QIv) it.next()).A01 && (i4 = i4 + 1) < 0) {
                        break;
                    }
                }
            }
            double d4 = i4;
            if (size > 0) {
                d2 = d4 / size;
            } else {
                d2 = c63333Shk.A00;
            }
            c63333Shk.A00 = d2;
            if (A02) {
                if (arrayList2 != null) {
                    if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
                        i5 = 0;
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        i5 = 0;
                        while (it2.hasNext()) {
                            if (((C58913QIr) it2.next()).A00 >= A00 && (i5 = i5 + 1) < 0) {
                                AbstractC16960so.A1T();
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                    d3 = i5;
                }
                d2 = (d4 + d3) / i6;
                c63333Shk.A00 = d2;
            }
            if (d2 >= d) {
                z = true;
                str = "good_swiper";
            } else {
                str = "bad_swiper";
            }
        } else {
            str = "not_swiper";
        }
        c63333Shk.A01 = str;
        return z;
    }
}
