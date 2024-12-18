package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1QQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QQ {
    public String A00;
    public String A01;
    public String A02;
    public final List A03 = new ArrayList();

    private String A00(boolean z) {
        List list;
        String str;
        List list2;
        List list3;
        List list4 = this.A03;
        int size = list4.size();
        int i = (size - 3) - 7;
        if (i > 0) {
            ArrayList arrayList = new ArrayList(list4.subList(0, 3));
            arrayList.add(new C3NJ(AnonymousClass001.A0O("TRUNCATEDx", i), "", 0, 0, "", ""));
            arrayList.addAll(list4.subList(size - 7, size));
            list = arrayList;
            if (z) {
                list3 = AbstractC92144Au.A02(new C42110IlK(this), arrayList);
                str = ",\n";
                list2 = list3;
            }
            str = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
            list2 = list;
        } else {
            list = list4;
            if (z) {
                list3 = AbstractC92144Au.A02(new C42110IlK(this), list4);
                str = ",\n";
                list2 = list3;
            }
            str = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
            list2 = list;
        }
        return AbstractC13670mt.A05(str, list2);
    }

    public static void A01(C1QQ c1qq) {
        c1qq.A00 = c1qq.A00(false);
        c1qq.A02 = c1qq.A00(false);
        if (C1QR.A02 != null) {
            c1qq.A01 = c1qq.A00(true);
        }
    }

    public final boolean A02(C3NJ c3nj) {
        List list = this.A03;
        int size = list.size();
        for (int i = size - 2; i > -1; i--) {
            if (list.get(i).equals(c3nj)) {
                list.subList(i + 1, size).clear();
                int size2 = list.size();
                if (size2 != 0) {
                    int i2 = size2 - 1;
                    C3NJ c3nj2 = (C3NJ) list.get(i2);
                    if (c3nj2.A00 != null) {
                        c3nj2.A00 = null;
                        list.set(i2, c3nj2);
                    }
                }
                A01(this);
                return true;
            }
        }
        return false;
    }

    public C1QQ() {
        A01(this);
    }
}
