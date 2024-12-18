package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class Py1 {
    public double A00;
    public String A01;
    public final Gson A02;
    public final UserSession A03;
    public final InterfaceC19630xq A04;

    public Py1(UserSession userSession) {
        ArrayList A17;
        ArrayList A172;
        this.A03 = userSession;
        InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A0o);
        this.A04 = A03;
        C58579Pxx c58579Pxx = new C58579Pxx();
        c58579Pxx.A02(new Object(), QIe.class);
        this.A02 = c58579Pxx.A00();
        AbstractC58321PtD.A1N(userSession, A03);
        synchronized (this) {
            long A05 = AbstractC58320PtC.A05(90, System.currentTimeMillis());
            Type type = new Py2().A00;
            InterfaceC19630xq interfaceC19630xq = this.A04;
            String string = interfaceC19630xq.getString("KEY_SWIPE_HISTORY_V2", null);
            if (string != null) {
                Object A09 = this.A02.A09(string, type);
                C14360o3.A07(A09);
                A17 = (ArrayList) A09;
            } else {
                A17 = AbstractC25225BEi.A17(20);
            }
            AbstractC58319PtB.A1M(A17, new JXD(A05, 21), 10);
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            Gson gson = this.A02;
            ARD.E7K("KEY_SWIPE_HISTORY_V2", gson.A0B(A17));
            ARD.apply();
            if (Py0.A02(this.A03)) {
                String string2 = interfaceC19630xq.getString("KEY_PROFILE_SWIPE_HISTORY", null);
                if (string2 != null) {
                    Object A092 = gson.A09(string2, type);
                    C14360o3.A07(A092);
                    A172 = (ArrayList) A092;
                } else {
                    A172 = AbstractC25225BEi.A17(20);
                }
                AbstractC58319PtB.A1M(A172, new JXD(A05, 22), 10);
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7K("KEY_PROFILE_SWIPE_HISTORY", gson.A0B(A172));
                ARD2.apply();
            }
        }
    }

    public static final boolean A00(Py1 py1, ArrayList arrayList, double d, int i, int i2) {
        String str;
        int i3;
        double d2;
        int i4;
        long A05 = AbstractC58320PtC.A05(i, System.currentTimeMillis());
        UserSession userSession = py1.A03;
        long A00 = Py0.A00(userSession);
        boolean A02 = Py0.A02(userSession);
        AbstractC58319PtB.A1M(arrayList, new JXD(A05, 19), 10);
        boolean z = false;
        if (arrayList.size() >= i2) {
            List A0h = AbstractC001800i.A0h(arrayList, i2);
            boolean z2 = A0h instanceof Collection;
            if (z2 && A0h.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it = A0h.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    Boolean bool = ((QIe) it.next()).A01;
                    if (bool != null && bool.equals(true) && (i3 = i3 + 1) < 0) {
                        break;
                    }
                }
            }
            double d3 = i3;
            if (arrayList.size() > 0) {
                d2 = d3 / i2;
            } else {
                d2 = py1.A00;
            }
            py1.A00 = d2;
            if (A02) {
                if (z2 && A0h.isEmpty()) {
                    i4 = 0;
                } else {
                    Iterator it2 = A0h.iterator();
                    i4 = 0;
                    while (it2.hasNext()) {
                        Long l = ((QIe) it2.next()).A02;
                        if (l != null && l.longValue() >= A00 && (i4 = i4 + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                }
                double d4 = i4;
                if (arrayList.size() > 0) {
                    d2 = (d3 + d4) / i2;
                } else {
                    d2 = py1.A00;
                }
                py1.A00 = d2;
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
        py1.A01 = str;
        return z;
    }

    public static final boolean A01(Py1 py1, ArrayList arrayList, double d, int i, int i2) {
        String str;
        int i3;
        int i4;
        long A05 = AbstractC58320PtC.A05(i, System.currentTimeMillis());
        UserSession userSession = py1.A03;
        long A00 = Py0.A00(userSession);
        boolean A02 = Py0.A02(userSession);
        AbstractC58319PtB.A1M(arrayList, new JXD(A05, 20), 10);
        boolean z = false;
        if (arrayList.size() >= i2) {
            boolean z2 = arrayList instanceof Collection;
            if (z2 && arrayList.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it = arrayList.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    Boolean bool = ((QIe) it.next()).A01;
                    if (bool != null && bool.equals(true) && (i3 = i3 + 1) < 0) {
                        break;
                    }
                }
            }
            double d2 = i3;
            double size = d2 / arrayList.size();
            py1.A00 = size;
            if (A02) {
                if (z2 && arrayList.isEmpty()) {
                    i4 = 0;
                } else {
                    Iterator it2 = arrayList.iterator();
                    i4 = 0;
                    while (it2.hasNext()) {
                        Long l = ((QIe) it2.next()).A02;
                        if (l != null && l.longValue() >= A00 && (i4 = i4 + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                }
                size = (d2 + i4) / arrayList.size();
                py1.A00 = size;
            }
            if (size >= d) {
                z = true;
                str = "good_swiper";
            } else {
                str = "bad_swiper";
            }
        } else {
            str = "not_swiper";
        }
        py1.A01 = str;
        return z;
    }
}
