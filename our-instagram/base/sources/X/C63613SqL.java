package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.SqL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63613SqL implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C63613SqL(T39 t39, String str, int i) {
        this.A00 = i;
        this.A01 = t39;
        this.A02 = str;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        List A18;
        Throwable th;
        List A182;
        if (this.A00 != 0) {
            C63406Sjd c63406Sjd = (C63406Sjd) obj;
            if (C63406Sjd.A0J(c63406Sjd)) {
                C62434SBm c62434SBm = AbstractC61535RpF.A00;
                if (c62434SBm == null) {
                    c62434SBm = new C62434SBm();
                    AbstractC61535RpF.A00 = c62434SBm;
                }
                T39 t39 = (T39) this.A01;
                String str = t39.A05;
                C63152Se0 c63152Se0 = (C63152Se0) C63406Sjd.A08(c63406Sjd);
                ConcurrentHashMap concurrentHashMap = c62434SBm.A00;
                if (concurrentHashMap.contains(str) && (A182 = MSW.A18(str, concurrentHashMap)) != null) {
                    A182.add(c63152Se0);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(c63152Se0);
                    concurrentHashMap.put(str, copyOnWriteArrayList);
                }
                ((InterfaceC65508Tld) t39.A02).DcO(this.A02);
                return;
            }
            if (C63406Sjd.A0G(c63406Sjd) && (th = c63406Sjd.A02) != null) {
                if (th instanceof C64865TXq) {
                    C64865TXq c64865TXq = (C64865TXq) th;
                    ((InterfaceC65508Tld) ((T39) this.A01).A02).DcL(Boolean.valueOf(c64865TXq.A01), Integer.valueOf(c64865TXq.A00), c64865TXq);
                    return;
                }
                ((InterfaceC65508Tld) ((T39) this.A01).A02).DcL(null, null, th);
            }
            ((InterfaceC65508Tld) ((T39) this.A01).A02).DcL(null, null, new Exception("An unknown error was thrown during the authorization process"));
            return;
        }
        C63406Sjd c63406Sjd2 = (C63406Sjd) obj;
        boolean A0J = C63406Sjd.A0J(c63406Sjd2);
        T39 t392 = (T39) this.A01;
        if (A0J) {
            ((InterfaceC65508Tld) t392.A02).DcO(this.A02);
            C62434SBm c62434SBm2 = AbstractC61535RpF.A00;
            if (c62434SBm2 == null) {
                c62434SBm2 = new C62434SBm();
                AbstractC61535RpF.A00 = c62434SBm2;
            }
            String str2 = t392.A05;
            C63152Se0 c63152Se02 = (C63152Se0) C63406Sjd.A08(c63406Sjd2);
            ConcurrentHashMap concurrentHashMap2 = c62434SBm2.A00;
            if (concurrentHashMap2.contains(str2) && (A18 = MSW.A18(str2, concurrentHashMap2)) != null) {
                A18.add(c63152Se02);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            copyOnWriteArrayList2.add(c63152Se02);
            concurrentHashMap2.put(str2, copyOnWriteArrayList2);
            return;
        }
        ((InterfaceC65508Tld) t392.A02).DcL(null, null, new Exception("An unknown error was thrown during the authorization process"));
    }
}
