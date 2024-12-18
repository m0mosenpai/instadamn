package X;

import android.os.Bundle;
import com.google.gson.Gson;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.SqV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63623SqV implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C63623SqV(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A06 = str;
        this.A02 = obj3;
        this.A03 = obj;
        this.A04 = obj5;
        this.A05 = obj2;
    }

    @Override // X.InterfaceC58362lv
    public final void onChanged(Object obj) {
        InterfaceC65507Tlc interfaceC65507Tlc;
        C2GT c2gt;
        int i = this.A00;
        C63345Si1 c63345Si1 = (C63345Si1) this.A01;
        switch (i) {
            case 0:
                Queue queue = (Queue) this.A02;
                C2GS c2gs = (C2GS) this.A03;
                String str = this.A06;
                Object obj2 = this.A04;
                SE2 se2 = (SE2) this.A05;
                C63406Sjd c63406Sjd = (C63406Sjd) obj;
                if (C63406Sjd.A0J(c63406Sjd)) {
                    String str2 = (String) C63406Sjd.A08(c63406Sjd);
                    C02R.A06(!queue.isEmpty(), "factors can not be empty!");
                    Object poll = queue.poll();
                    poll.getClass();
                    SPN spn = (SPN) poll;
                    if ("SDC".equalsIgnoreCase(spn.A00)) {
                        C2FP.A0D();
                        throw AbstractC166987dD.A12("SDC auth factor not supported");
                    }
                    SE2 A00 = AbstractC63061Sbi.A00(se2.A01, spn, str2);
                    C64190T2z c64190T2z = c63345Si1.A00;
                    if (c64190T2z != null) {
                        c64190T2z.A01 = spn;
                        c64190T2z.A00 = A00;
                        interfaceC65507Tlc = c64190T2z;
                    } else {
                        C58443PvM c58443PvM = c63345Si1.A04;
                        C07X c07x = c63345Si1.A01;
                        if (c07x == null) {
                            c07x = c63345Si1.A02;
                            c07x.getClass();
                        }
                        interfaceC65507Tlc = new T30(c07x, c2gs, c63345Si1.A03, A00, c63345Si1, c58443PvM, obj2, str, queue);
                    }
                    Bundle bundle = A00.A01;
                    String A0j = AbstractC31173DnH.A0j(bundle, "AUTH_METHOD_TYPE");
                    List list = c63345Si1.A05;
                    list.add(A0j);
                    C2GC c2gc = C2FP.A03().A01;
                    HashMap A002 = SSA.A00(bundle);
                    A002.put("DYNAMIC_AUTH_OPERATION_NAME", str);
                    A002.put("DYNAMIC_AUTH_AUTH_TYPES", Collections.unmodifiableList(list));
                    c2gc.Chz("client_verify_dynamic_auth_display", Collections.unmodifiableMap(A002));
                    if ("BIO".equalsIgnoreCase(A0j)) {
                        C2GT c2gt2 = c63345Si1.A03.A02;
                        C07X c07x2 = c63345Si1.A01;
                        if (c07x2 == null) {
                            c07x2 = c63345Si1.A02;
                            c07x2.getClass();
                        }
                        C63406Sjd.A09(c07x2, c2gt2, new C63626SqY(10, c63345Si1, interfaceC65507Tlc, A00));
                        return;
                    }
                    C63345Si1.A02(interfaceC65507Tlc, A00, c63345Si1);
                    return;
                }
                c2gs.A0A(C63406Sjd.A06(c63406Sjd.A02));
                return;
            case 1:
                SE2 se22 = (SE2) this.A02;
                C2GS c2gs2 = (C2GS) this.A03;
                String str3 = this.A06;
                Object obj3 = this.A04;
                C1N8 c1n8 = (C1N8) this.A05;
                C63406Sjd c63406Sjd2 = (C63406Sjd) obj;
                if (C63406Sjd.A0G(c63406Sjd2)) {
                    Throwable th = c63406Sjd2.A02;
                    if (th instanceof REX) {
                        th.getClass();
                        REX rex = (REX) th;
                        try {
                            se22.A01.putString("AUTH_EXCEPTION", new Gson().A0B(rex));
                            ArrayDeque arrayDeque = new ArrayDeque();
                            if (rex != null) {
                                List<SP0> list2 = rex.A00.A01;
                                Iterator<SP0> it = list2.iterator();
                                while (it.hasNext()) {
                                    if (!it.next().A00.isEmpty()) {
                                        Iterator<SP0> it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            for (SPN spn2 : it2.next().A00) {
                                                String str4 = spn2.A00;
                                                if ("BIO".equalsIgnoreCase(str4) || "PIN".equalsIgnoreCase(str4) || "CSC".equalsIgnoreCase(str4) || "SDC".equalsIgnoreCase(str4) || "PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(str4) || "FB_ACCESS_TOKEN".equalsIgnoreCase(str4) || "IG_ACCESS_TOKEN".equalsIgnoreCase(str4) || "THREE_DS".equalsIgnoreCase(str4)) {
                                                    arrayDeque.add(spn2);
                                                } else {
                                                    throw AbstractC167007dF.A0c("Not supported auth factor:", str4);
                                                }
                                            }
                                        }
                                        C64190T2z c64190T2z2 = c63345Si1.A00;
                                        if (c64190T2z2 != null) {
                                            Iterator it3 = arrayDeque.iterator();
                                            while (it3.hasNext()) {
                                                SPN spn3 = (SPN) it3.next();
                                                Map map = c64190T2z2.A07;
                                                Iterator A12 = AbstractC43593JPy.A12(map);
                                                while (true) {
                                                    if (A12.hasNext()) {
                                                        Object next = A12.next();
                                                        if (C14360o3.A0K(((SPN) next).A00, spn3.A00)) {
                                                            if (next != null) {
                                                                map.remove(next);
                                                            }
                                                        }
                                                    }
                                                }
                                                map.put(spn3, null);
                                            }
                                        }
                                        c63345Si1.A06(c2gs2, se22, obj3, str3, arrayDeque);
                                        return;
                                    }
                                }
                            }
                            throw AbstractC166987dD.A12("AuthException does not have group or any factor.");
                        } catch (IllegalArgumentException e) {
                            c2gs2.A0A(C63406Sjd.A06(e));
                            return;
                        }
                    }
                }
                if (c63345Si1.A00 != null) {
                    if (AbstractC58319PtB.A1W(REX.A01, AbstractC63064Sbl.A00(c63406Sjd2.A02))) {
                        C64190T2z c64190T2z3 = c63345Si1.A00;
                        Map map2 = c64190T2z3.A07;
                        Iterator it4 = AbstractC31171DnF.A0k(map2.keySet()).iterator();
                        while (it4.hasNext()) {
                            SPN spn4 = (SPN) it4.next();
                            if (C14360o3.A0K(spn4.A00, "BIO")) {
                                map2.remove(spn4);
                            } else {
                                SGB sgb = (SGB) map2.get(spn4);
                                if (sgb != null && sgb.A01 != null) {
                                    map2.put(spn4, null);
                                }
                            }
                        }
                        c64190T2z3.A00(null);
                        return;
                    }
                }
                if (c63345Si1.A00 == null || c1n8 == null || C63406Sjd.A0H(c63406Sjd2) || (c2gt = (C2GT) c1n8.apply(c63406Sjd2.A01)) == null) {
                    return;
                }
                C63406Sjd.A0B(c2gt, new C63625SqX(10, c2gs2, c63345Si1));
                return;
            default:
                String str5 = this.A06;
                SE2 se23 = (SE2) this.A02;
                C1N8 c1n82 = (C1N8) this.A03;
                Object obj4 = this.A04;
                C58252li c58252li = (C58252li) this.A05;
                C63406Sjd c63406Sjd3 = (C63406Sjd) obj;
                if (C63406Sjd.A0J(c63406Sjd3)) {
                    Object A08 = C63406Sjd.A08(c63406Sjd3);
                    C58443PvM c58443PvM2 = c63345Si1.A04;
                    C63174SeZ A04 = C2FP.A04();
                    HashSet A0x = AbstractC58322PtE.A0x((C63152Se0) A08);
                    C64193T3c c64193T3c = new C64193T3c(0, c63345Si1.A03, se23);
                    Bundle bundle2 = se23.A01;
                    String string = bundle2.getString("PAYMENT_ACCOUNT_ID");
                    String string2 = bundle2.getString("PAYMENT_OTC_SESSION_ID");
                    String string3 = bundle2.getString("PAYMENT_OTC_TYPE");
                    Map A01 = SSA.A01(bundle2);
                    C14360o3.A0B(str5, 0);
                    AbstractC167007dF.A1H(obj4, 1, A01);
                    C60623REi A02 = AbstractC63245Sfz.A02(c1n82, A04, c58443PvM2, new SXG(AbstractC63063Sbk.A00(c64193T3c, A0x), obj4, str5, string, string2, string3, null, null, A01, A0x));
                    AbstractC63144Sdq.A02(A02);
                    Q8J q8j = ((AbstractC63144Sdq) A02).A03;
                    C07X c07x3 = c63345Si1.A01;
                    if (c07x3 == null) {
                        c07x3 = c63345Si1.A02;
                        c07x3.getClass();
                    }
                    q8j.A06(c07x3, new C63624SqW(c1n82, q8j, c58252li, se23, c63345Si1, obj4, str5, 0));
                    return;
                }
                C63345Si1.A01(c1n82, c58252li, se23, c63345Si1, obj4, str5);
                return;
        }
    }
}
