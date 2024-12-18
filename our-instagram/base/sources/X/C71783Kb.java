package X;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71783Kb implements InterfaceC71793Kc {
    public boolean A00;
    public final C1X8 A01;
    public final C71773Ka A02;
    public final InterfaceC71833Kg A03;
    public final C1Wr A04;
    public final C71803Kd A05;
    public final C3KZ A06;
    public final C1WJ A07;
    public final String A08;
    public final InterfaceC16820sZ A09;
    public final boolean A0A;

    @Override // X.InterfaceC71793Kc
    public final void A9Z(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, Runnable runnable, String str) {
        C14360o3.A0B(str, 1);
        C3KZ c3kz = this.A06;
        Map map = c3kz.A05;
        Object obj = map.get(str);
        if (obj == null) {
            obj = C16930sl.A00;
            map.put(str, obj);
        }
        map.put(str, AbstractC001800i.A0T(c116155Nu, (Collection) obj));
        InterfaceC19610xo ARD = c3kz.A03.ARD();
        ARD.E7K(AnonymousClass001.A0G(str, '|', r1.size() - 1), c116155Nu.A04());
        ARD.apply();
        this.A04.A03(c116155Nu, abstractC12990ll);
        this.A05.A01(abstractC12990ll, runnable, str, false, false);
        this.A02.A00();
    }

    @Override // X.InterfaceC71793Kc
    public final void AWX(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        Iterator it = AbstractC001800i.A0a(this.A06.A05.keySet()).iterator();
        while (it.hasNext()) {
            C116155Nu A00 = this.A05.A00((String) it.next(), true);
            if (A00 != null) {
                this.A04.A02(A00, userSession);
            }
        }
        this.A02.A00();
    }

    @Override // X.InterfaceC71793Kc
    public final void EEq() {
    }

    @Override // X.InterfaceC71793Kc
    public final void EFr(String str) {
        C14360o3.A0B(str, 0);
        this.A05.A00(str, !this.A0A);
        this.A02.A00();
    }

    @Override // X.InterfaceC71793Kc
    public final C116155Nu EFs(UserSession userSession, String str) {
        C14360o3.A0B(str, 1);
        C116155Nu A00 = this.A05.A00(str, true);
        this.A02.A00();
        return A00;
    }

    @Override // X.InterfaceC71793Kc
    public final void EFt(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, Runnable runnable, String str) {
        String str2;
        String str3;
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 1);
        C1WJ c1wj = this.A07;
        if (c1wj instanceof AbstractC28611Zw) {
            C3KZ c3kz = this.A06;
            Map map = c3kz.A05;
            Iterator it = AbstractC001800i.A0T(str, ((AbstractC28611Zw) c1wj).A00(str, AbstractC001800i.A0a(map.keySet()))).iterator();
            int i = 0;
            while (it.hasNext()) {
                String str4 = (String) it.next();
                C14360o3.A0B(str4, 0);
                List list = (List) map.get(str4);
                if (list == null) {
                    list = C16930sl.A00;
                }
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        C116155Nu c116155Nu2 = (C116155Nu) obj;
                        if ((c116155Nu2 != null && (str2 = c116155Nu2.A0f) != null && (str3 = c116155Nu.A16) != null && AbstractC002300n.A0h(str2, str3, false)) || c1wj.ACT(c116155Nu2, c116155Nu)) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        continue;
                    } else {
                        java.util.Set A0k = AbstractC001800i.A0k(arrayList);
                        List list2 = (List) map.get(str4);
                        if (list2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (!A0k.contains(obj2)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            List A0h = AbstractC001800i.A0h(arrayList2, c3kz.A01);
                            if (!list2.equals(A0h)) {
                                InterfaceC19610xo ARD = c3kz.A03.ARD();
                                int i2 = 0;
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    it2.next();
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        AbstractC16960so.A1U();
                                        throw C00O.createAndThrow();
                                    }
                                    C116155Nu c116155Nu3 = (C116155Nu) AbstractC001800i.A0O(A0h, i2);
                                    String A0G = AnonymousClass001.A0G(str4, '|', i2);
                                    if (c116155Nu3 != null) {
                                        ARD.E7K(A0G, c116155Nu3.A04());
                                    } else {
                                        ARD.EEj(A0G);
                                    }
                                    i2 = i3;
                                }
                                ARD.apply();
                                map.put(str4, A0h);
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            this.A04.A01(c116155Nu, (C116155Nu) it3.next(), abstractC12990ll);
                        }
                        if (list.size() == arrayList.size()) {
                            String A00 = AbstractC116145Nt.A00(this.A08, str4);
                            this.A01.A03(runnable, A00, 64278);
                            this.A02.A01(A00);
                            InterfaceC19610xo ARD2 = c3kz.A03.ARD();
                            ARD2.EEj(AnonymousClass001.A0R(str4, "|showing"));
                            ARD2.apply();
                        } else if (c3kz.A03.contains(AnonymousClass001.A0R(str4, "|showing"))) {
                            this.A05.A01(abstractC12990ll, runnable, str4, true, false);
                        }
                        i += arrayList.size();
                    }
                }
            }
            this.A04.A06(c116155Nu, abstractC12990ll, i);
            this.A02.A00();
            if (i == 0) {
                runnable.run();
            }
        }
    }

    @Override // X.InterfaceC71793Kc
    public final void FBW(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, Runnable runnable, String str) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 1);
        C3KZ c3kz = this.A06;
        Map map = c3kz.A05;
        List list = (List) map.get(str);
        if (list == null) {
            list = C16930sl.A00;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (this.A07.ACT((C116155Nu) next, c116155Nu)) {
                if (next != null) {
                    Object obj = map.get(str);
                    if (obj == null) {
                        obj = C16930sl.A00;
                        map.put(str, obj);
                    }
                    List list2 = (List) obj;
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                    int i = 0;
                    for (Object obj2 : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        if (C14360o3.A0K(obj2, next)) {
                            InterfaceC19610xo ARD = c3kz.A03.ARD();
                            ARD.E7K(AnonymousClass001.A0G(str, '|', i), c116155Nu.A04());
                            ARD.apply();
                            obj2 = c116155Nu;
                        }
                        arrayList.add(obj2);
                        i = i2;
                    }
                    map.put(str, arrayList);
                    if (c3kz.A03.contains(AnonymousClass001.A0R(str, "|showing"))) {
                        this.A04.A03(c116155Nu, abstractC12990ll);
                        this.A05.A01(abstractC12990ll, runnable, str, true, true);
                        return;
                    }
                }
            }
        }
        this.A04.A04(c116155Nu, abstractC12990ll);
    }

    public /* synthetic */ C71783Kb(C1X8 c1x8, C71773Ka c71773Ka, C1Wr c1Wr, C3KZ c3kz, C1WJ c1wj, String str, boolean z) {
        InterfaceC71833Kg interfaceC71833Kg;
        C71803Kd c71803Kd = new C71803Kd(c1x8, c71773Ka, c1Wr, c3kz, c1wj, str);
        C71813Ke c71813Ke = C71813Ke.A00;
        C14360o3.A0B(c1Wr, 5);
        C14360o3.A0B(str, 6);
        C14360o3.A0B(c71813Ke, 8);
        this.A01 = c1x8;
        this.A07 = c1wj;
        this.A06 = c3kz;
        this.A02 = c71773Ka;
        this.A04 = c1Wr;
        this.A08 = str;
        this.A05 = c71803Kd;
        this.A09 = c71813Ke;
        this.A0A = z;
        if (C1AD.A06(C06090Tz.A05, 18305605882093463L)) {
            interfaceC71833Kg = C71823Kf.A00;
        } else {
            interfaceC71833Kg = C47898LDs.A00;
        }
        this.A03 = interfaceC71833Kg;
        if (!AbstractC001900j.A0a(str, "|", false)) {
        } else {
            throw new IllegalArgumentException(AbstractC43591JPw.A00(831));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x015e A[Catch: all -> 0x01e8, LOOP:2: B:56:0x0117->B:78:0x015e, LOOP_END, TryCatch #4 {, blocks: (B:13:0x0022, B:15:0x0026, B:16:0x0047, B:18:0x004d, B:21:0x0065, B:24:0x007d, B:26:0x0083, B:27:0x008a, B:34:0x00a1, B:39:0x00a7, B:40:0x00bf, B:42:0x00c5, B:45:0x00e1, B:47:0x00f2, B:50:0x0100, B:54:0x0109, B:65:0x013a, B:68:0x013f, B:71:0x0145, B:73:0x014d, B:76:0x0156, B:78:0x015e, B:86:0x0135, B:87:0x0161, B:96:0x016a, B:97:0x0179, B:99:0x017f, B:102:0x0199, B:104:0x01a8, B:105:0x01af, B:106:0x01b4, B:108:0x01ba, B:112:0x01c2, B:113:0x01c9, B:110:0x01ca, B:119:0x01db, B:120:0x01de, B:29:0x0090, B:58:0x0118, B:60:0x0126, B:64:0x012b), top: B:12:0x0022, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161 A[EDGE_INSN: B:79:0x0161->B:87:0x0161 BREAK  A[LOOP:2: B:56:0x0117->B:78:0x015e], SYNTHETIC] */
    @Override // X.InterfaceC71793Kc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC71793Kc ASk() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71783Kb.ASk():X.3Kc");
    }

    @Override // X.InterfaceC71793Kc
    public final void EEx(AbstractC12990ll abstractC12990ll) {
        Iterator it = AbstractC001800i.A0a(this.A06.A05.keySet()).iterator();
        while (it.hasNext()) {
            C116155Nu A00 = this.A05.A00((String) it.next(), true);
            if (A00 != null) {
                this.A04.A02(A00, abstractC12990ll);
            }
        }
        this.A02.A00();
    }

    @Override // X.InterfaceC71793Kc
    public final void EEy(UserSession userSession, long j) {
        long j2;
        C116155Nu A00;
        HashMap A01 = this.A01.A01();
        for (String str : AbstractC001800i.A0a(this.A06.A05.keySet())) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) A01.get(AbstractC116145Nt.A00(this.A08, str));
            if (statusBarNotification == null) {
                this.A05.A00(str, true);
            } else {
                Bundle bundle = statusBarNotification.getNotification().extras;
                if (bundle != null) {
                    j2 = bundle.getLong("com.instagram.android.igns.notification_life_time", j);
                } else {
                    j2 = j;
                }
                if (((Number) this.A09.invoke()).longValue() >= statusBarNotification.getPostTime() + j2 && (A00 = this.A05.A00(str, true)) != null) {
                    this.A04.A07(A00, userSession);
                }
            }
        }
        this.A02.A00();
    }
}
