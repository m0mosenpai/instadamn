package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.XfN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72508XfN {
    public static int A05;
    public int A00;
    public int A01;
    public int A02;
    public ArrayList A03;
    public ArrayList A04;

    public final int A00(C56142i3 c56142i3, int i) {
        int A00;
        C56112hz c56112hz;
        ArrayList arrayList = this.A04;
        if (arrayList.size() == 0) {
            return 0;
        }
        C56062hu c56062hu = (C56062hu) ((C56082hw) arrayList.get(0)).A0h;
        c56142i3.A0B();
        c56062hu.A0O(c56142i3, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C56082hw) arrayList.get(i2)).A0O(c56142i3, false);
        }
        if (i == 0) {
            if (c56062hu.A00 > 0) {
                C3OM.A00(c56142i3, c56062hu, arrayList, 0);
            }
        } else if (c56062hu.A04 > 0) {
            C3OM.A00(c56142i3, c56062hu, arrayList, 1);
        }
        try {
            c56142i3.A0A();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.A03 = AbstractC166987dD.A1E();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.A03.add(new C72701XlZ((C56082hw) arrayList.get(i3), this));
        }
        if (i == 0) {
            A00 = C56142i3.A00(c56062hu.A0e);
            c56112hz = c56062hu.A0f;
        } else {
            A00 = C56142i3.A00(c56062hu.A0g);
            c56112hz = c56062hu.A0a;
        }
        int A002 = C56142i3.A00(c56112hz);
        c56142i3.A0B();
        return A002 - A00;
    }

    public final void A01(C72508XfN c72508XfN, int i) {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C56082hw c56082hw = (C56082hw) it.next();
            ArrayList arrayList = c72508XfN.A04;
            if (!arrayList.contains(c56082hw)) {
                arrayList.add(c56082hw);
            }
            int i2 = c72508XfN.A00;
            if (i == 0) {
                c56082hw.A07 = i2;
            } else {
                c56082hw.A0X = i2;
            }
        }
        this.A01 = c72508XfN.A00;
    }

    public final void A02(ArrayList arrayList) {
        int size = this.A04.size();
        if (this.A01 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C72508XfN c72508XfN = (C72508XfN) arrayList.get(i);
                if (this.A01 == c72508XfN.A00) {
                    A01(c72508XfN, this.A02);
                }
            }
            return;
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final String toString() {
        String str;
        int i = this.A02;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = "Both";
        }
        String A06 = AnonymousClass001.A06(this.A00, str, " [", "] <");
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            A06 = AnonymousClass001.A0g(A06, " ", ((C56082hw) it.next()).A0n);
        }
        return AnonymousClass001.A0R(A06, " >");
    }
}
