package X;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Luf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49526Luf implements InterfaceC71793Kc {
    public boolean A00;
    public final C1X8 A01;
    public final C71773Ka A02;
    public final C1Wr A03;
    public final InterfaceC19630xq A04;
    public final String A05;
    public final Map A06 = AbstractC166987dD.A1I();
    public final java.util.Set A07 = AbstractC166987dD.A1H();
    public final InterfaceC71833Kg A08;
    public final C1WJ A09;

    private synchronized void A00() {
        if (!this.A00) {
            throw AbstractC166987dD.A14("notification category not initialized");
        }
    }

    @Override // X.InterfaceC71793Kc
    public final void A9Z(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, Runnable runnable, String str) {
        A00();
        Map map = this.A06;
        List A12 = AbstractC43592JPx.A12(str, map);
        if (A12 == null) {
            A12 = AbstractC166987dD.A1E();
            map.put(str, A12);
        }
        A12.add(c116155Nu);
        InterfaceC19610xo ARD = this.A04.ARD();
        int A05 = AbstractC25226BEj.A05(A12);
        C14360o3.A0B(str, 0);
        ARD.E7K(AnonymousClass001.A0G(str, '|', A05), c116155Nu.A04());
        ARD.apply();
        this.A03.A03(c116155Nu, abstractC12990ll);
        A01(abstractC12990ll, runnable, str, A12, false, false);
    }

    @Override // X.InterfaceC71793Kc
    public final synchronized InterfaceC71793Kc ASk() {
        String str = this.A05;
        int hashCode = str.hashCode();
        if (!this.A00) {
            try {
                InterfaceC71833Kg interfaceC71833Kg = this.A08;
                interfaceC71833Kg.Ems(C05F.A00, str, hashCode, true);
                if (!this.A00) {
                    Map map = this.A06;
                    if (map.isEmpty()) {
                        java.util.Set set = this.A07;
                        if (set.isEmpty()) {
                            Iterator A15 = AbstractC166997dE.A15(this.A04.getAll());
                            while (A15.hasNext()) {
                                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                                String A17 = AbstractC31172DnG.A17(A1K);
                                int indexOf = A17.indexOf("|");
                                if (indexOf != -1) {
                                    String substring = A17.substring(0, indexOf);
                                    String substring2 = A17.substring(indexOf + 1);
                                    if ("showing".equals(substring2)) {
                                        set.add(substring);
                                    } else {
                                        List A12 = AbstractC43592JPx.A12(substring, map);
                                        if (A12 == null) {
                                            A12 = AbstractC166987dD.A1E();
                                            map.put(substring, A12);
                                        }
                                        try {
                                            int parseInt = Integer.parseInt(substring2);
                                            while (parseInt >= A12.size()) {
                                                A12.add(null);
                                            }
                                            C116155Nu c116155Nu = null;
                                            try {
                                                c116155Nu = C116155Nu.A01((String) A1K.getValue(), null);
                                            } catch (IOException unused) {
                                            }
                                            A12.set(parseInt, c116155Nu);
                                        } catch (NumberFormatException e) {
                                            StringBuilder A1C = AbstractC166987dD.A1C();
                                            A1C.append("Failed to parse location info: Key = ");
                                            A1C.append(A17);
                                            C0w9.A03("NotificationCategoryController", AbstractC167017dG.A0n(e, ", Exception: ", A1C));
                                        }
                                    }
                                }
                            }
                            this.A00 = true;
                            interfaceC71833Kg.EpM(map.values(), hashCode);
                        }
                    }
                }
                throw AbstractC166987dD.A14("attempted to initialize twice");
            } catch (Exception e2) {
                this.A08.AUj(hashCode, e2.getMessage());
                throw e2;
            }
        }
        return this;
    }

    @Override // X.InterfaceC71793Kc
    public final void FBW(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, Runnable runnable, String str) {
        A00();
        List list = (List) this.A06.get(str);
        if (list != null) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (this.A09.ACT((C116155Nu) list.get(i), c116155Nu)) {
                    if (i != -1) {
                        list.set(i, c116155Nu);
                        InterfaceC19610xo ARD = this.A04.ARD();
                        C14360o3.A0B(str, 0);
                        ARD.E7K(AnonymousClass001.A0G(str, '|', i), c116155Nu.A04());
                        ARD.apply();
                        if (this.A07.contains(str)) {
                            this.A03.A03(c116155Nu, abstractC12990ll);
                            A01(abstractC12990ll, runnable, str, list, true, true);
                            return;
                        }
                    }
                } else {
                    i++;
                }
            }
            this.A03.A04(c116155Nu, abstractC12990ll);
        }
    }

    private void A01(AbstractC12990ll abstractC12990ll, Runnable runnable, String str, List list, boolean z, boolean z2) {
        String A00 = AbstractC116145Nt.A00(this.A05, str);
        UserSession A01 = AbstractC03270Dk.A01(abstractC12990ll);
        C1WJ c1wj = this.A09;
        C47690L3x AEk = c1wj.AEk(A01, A00, str, list, z);
        AEk.A02 = z2;
        C116155Nu c116155Nu = AEk.A04;
        java.util.Set set = this.A07;
        if (!set.contains(str)) {
            set.add(str);
            AbstractC167007dF.A17(this.A04.ARD(), AnonymousClass001.A0R(str, "|showing"));
        }
        this.A03.A05(c116155Nu, abstractC12990ll);
        this.A01.A02(AEk, abstractC12990ll, runnable, A00, 64278);
        c1wj.AB1(c116155Nu, A01, str);
    }

    @Override // X.InterfaceC71793Kc
    public final void AWX(UserSession userSession, boolean z) {
        HashSet hashSet = new HashSet(this.A07);
        this.A01.A01();
        hashSet.addAll(this.A06.keySet());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C116155Nu EFs = EFs(userSession, AbstractC166987dD.A1B(it));
            if (EFs != null) {
                this.A03.A02(EFs, userSession);
            }
        }
        this.A02.A00();
    }

    @Override // X.InterfaceC71793Kc
    public final void EFt(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, Runnable runnable, String str) {
        String str2;
        String str3;
        A00();
        C1WJ c1wj = this.A09;
        if (c1wj instanceof AbstractC28611Zw) {
            LinkedList<String> linkedList = new LinkedList();
            linkedList.add(str);
            Map map = this.A06;
            linkedList.addAll(((AbstractC28611Zw) c1wj).A00(str, map.keySet()));
            int i = 0;
            for (String str4 : linkedList) {
                List list = (List) map.get(str4);
                if (list != null) {
                    Iterator it = list.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        C116155Nu c116155Nu2 = (C116155Nu) it.next();
                        if ((c116155Nu2 != null && (str2 = c116155Nu2.A0f) != null && (str3 = c116155Nu.A16) != null && str2.startsWith(str3)) || c1wj.ACT(c116155Nu2, c116155Nu)) {
                            int i3 = i2;
                            InterfaceC19610xo ARD = this.A04.ARD();
                            C14360o3.A0B(str4, 0);
                            ARD.EEj(AnonymousClass001.A0G(str4, '|', i2));
                            if (i2 < AbstractC25226BEj.A05(list)) {
                                while (true) {
                                    i3++;
                                    if (i3 >= list.size()) {
                                        break;
                                    }
                                    ARD.E7K(AnonymousClass001.A0G(str4, '|', i3 - 1), ((C116155Nu) list.get(i3)).A04());
                                    ARD.apply();
                                }
                                ARD.EEj(AnonymousClass001.A0G(str4, '|', AbstractC25226BEj.A05(list)));
                                ARD.apply();
                            }
                            ARD.apply();
                            it.remove();
                            c1wj.DW8(c116155Nu, AbstractC03270Dk.A01(abstractC12990ll));
                            if (list.isEmpty()) {
                                String A00 = AbstractC116145Nt.A00(this.A05, str4);
                                this.A01.A03(runnable, A00, 64278);
                                this.A02.A01(A00);
                                this.A07.remove(str4);
                            } else if (this.A07.contains(str4)) {
                                A01(abstractC12990ll, runnable, str4, list, true, false);
                            }
                            this.A03.A01(c116155Nu, c116155Nu2, abstractC12990ll);
                            i++;
                        }
                        i2++;
                    }
                }
            }
            if (i > 0) {
                this.A03.A06(c116155Nu, abstractC12990ll, i);
            } else {
                runnable.run();
                this.A03.A06(c116155Nu, abstractC12990ll, 0);
            }
            this.A02.A00();
        }
    }

    public final String toString() {
        C71473Il c71473Il = new C71473Il("\n");
        String str = this.A05;
        Iterator A15 = AbstractC166997dE.A15(this.A06);
        StringBuilder A1C = AbstractC166987dD.A1C();
        try {
            AbstractC62228S2z.A00(c71473Il, A1C, " = ", A15);
            String obj = A1C.toString();
            String obj2 = this.A07.toString();
            Iterator A152 = AbstractC166997dE.A15(this.A04.getAll());
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            try {
                AbstractC62228S2z.A00(c71473Il, A1C2, " = ", A152);
                return AnonymousClass001.A18("\nmCategoryName: ", str, "\nmAggregateMode: ", "\nmData: \n", obj, "\nmShowing: \n", obj2, "\nmPreferences: \n", A1C2.toString());
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public C49526Luf(C1X8 c1x8, C1Wr c1Wr, C1WJ c1wj, InterfaceC19630xq interfaceC19630xq) {
        InterfaceC71833Kg interfaceC71833Kg;
        if (C1AD.A06(C06090Tz.A05, 18305605882093463L)) {
            interfaceC71833Kg = C71823Kf.A00;
        } else {
            interfaceC71833Kg = C47898LDs.A00;
        }
        this.A08 = interfaceC71833Kg;
        this.A01 = c1x8;
        this.A09 = c1wj;
        this.A04 = interfaceC19630xq;
        this.A03 = c1Wr;
        String Amb = c1wj.Amb();
        this.A02 = new C71773Ka(c1x8);
        this.A05 = Amb;
        if (!Amb.contains("|")) {
        } else {
            throw AbstractC166987dD.A12("category cannot contain delimiter");
        }
    }

    @Override // X.InterfaceC71793Kc
    public final void EEq() {
        A00();
        String str = this.A05;
        C14360o3.A0B(str, 0);
        this.A01.A03(null, str, 64278);
        C71773Ka c71773Ka = this.A02;
        c71773Ka.A01(str);
        c71773Ka.A00();
        InterfaceC19610xo ARD = this.A04.ARD();
        ARD.EEj("aggregated");
        ARD.apply();
    }

    @Override // X.InterfaceC71793Kc
    public final void EEx(AbstractC12990ll abstractC12990ll) {
        A00();
        Iterator it = new HashSet(this.A07).iterator();
        while (it.hasNext()) {
            EFr(AbstractC166987dD.A1B(it));
        }
        EEq();
        InterfaceC19610xo ARD = this.A04.ARD();
        ARD.AHW();
        ARD.apply();
        this.A06.clear();
        this.A02.A00();
    }

    @Override // X.InterfaceC71793Kc
    public final void EEy(UserSession userSession, long j) {
        long j2;
        C116155Nu EFs;
        A00();
        HashMap A01 = this.A01.A01();
        HashSet hashSet = new HashSet(this.A07);
        hashSet.addAll(this.A06.keySet());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            StatusBarNotification statusBarNotification = (StatusBarNotification) A01.get(AbstractC116145Nt.A00(this.A05, A1B));
            if (statusBarNotification == null) {
                EFs(userSession, A1B);
            } else {
                Bundle bundle = statusBarNotification.getNotification().extras;
                if (bundle != null) {
                    j2 = bundle.getLong("com.instagram.android.igns.notification_life_time", j);
                } else {
                    j2 = j;
                }
                if (System.currentTimeMillis() >= statusBarNotification.getPostTime() + j2 && (EFs = EFs(userSession, A1B)) != null) {
                    this.A03.A07(EFs, userSession);
                }
            }
        }
        this.A02.A00();
    }

    @Override // X.InterfaceC71793Kc
    public final void EFr(String str) {
        A00();
        String A00 = AbstractC116145Nt.A00(this.A05, str);
        this.A01.A03(null, A00, 64278);
        C71773Ka c71773Ka = this.A02;
        c71773Ka.A01(A00);
        c71773Ka.A00();
        this.A07.remove(str);
        InterfaceC19610xo ARD = this.A04.ARD();
        C14360o3.A0B(str, 0);
        ARD.EEj(AnonymousClass001.A0R(str, "|showing"));
        ARD.apply();
    }

    @Override // X.InterfaceC71793Kc
    public final C116155Nu EFs(UserSession userSession, String str) {
        A00();
        InterfaceC19610xo ARD = this.A04.ARD();
        List list = (List) this.A06.remove(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C14360o3.A0B(str, 0);
                ARD.EEj(AnonymousClass001.A0G(str, '|', i));
                this.A09.DW8((C116155Nu) list.get(i), userSession);
            }
        }
        String A00 = AbstractC116145Nt.A00(this.A05, str);
        this.A01.A03(null, A00, 64278);
        this.A02.A01(A00);
        this.A07.remove(str);
        C14360o3.A0B(str, 0);
        ARD.EEj(AnonymousClass001.A0R(str, "|showing"));
        ARD.apply();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (C116155Nu) list.get(AbstractC25226BEj.A05(list));
    }
}
