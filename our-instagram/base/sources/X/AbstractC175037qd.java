package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.7qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC175037qd {
    public static int A00;
    public static final C1814082s A01 = new C1814082s();

    public static void A01(String str, String str2) {
        A00(0, 0, AnonymousClass001.A0g(str, ": ", str2));
    }

    public static void A02(String str, String str2) {
        A00(3, 0, AnonymousClass001.A0g(str, ": ", str2));
    }

    public static void A03(String str, String str2) {
        A00(2, 0, AnonymousClass001.A0g(str, ": ", str2));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.7tH, java.lang.Object] */
    public static void A00(int i, int i2, Object obj) {
        C176597tH c176597tH;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List list = A01.A00;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC175017qb interfaceC175017qb = (InterfaceC175017qb) list.get(i3);
            C175857rz c175857rz = (C175857rz) interfaceC175017qb;
            HandlerC174707q5 handlerC174707q5 = c175857rz.A02;
            C176587tG c176587tG = c175857rz.A00;
            if (c176587tG == null) {
                c176587tG = new C176587tG(c175857rz);
                c175857rz.A00 = c176587tG;
            }
            long now = c176587tG.A00.now();
            int i4 = A00;
            synchronized (C176597tH.A08) {
                C176597tH c176597tH2 = C176597tH.A07;
                if (c176597tH2 != null) {
                    C176597tH.A07 = c176597tH2.A00;
                    c176597tH2.A00 = null;
                    C176597tH.A06--;
                    c176597tH = c176597tH2;
                } else {
                    ?? obj2 = new Object();
                    obj2.A00 = null;
                    c176597tH = obj2;
                }
                c176597tH.A04 = interfaceC175017qb;
                c176597tH.A05 = obj;
                c176597tH.A02 = elapsedRealtime;
                c176597tH.A03 = now;
                c176597tH.A01 = i4;
            }
            handlerC174707q5.obtainMessage(i, i2, 0, c176597tH).sendToTarget();
        }
    }
}
