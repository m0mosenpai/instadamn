package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.ABs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22993ABs {
    public int A00;
    public int A01;
    public int A02;
    public C6S5 A03;
    public Integer A04;
    public Integer A05;
    public List A06;
    public List A07;
    public final String A08;
    public final HashMap A09;

    public final Map A00() {
        HashMap hashMap = this.A09;
        ArrayList arrayList = new ArrayList(hashMap.size());
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            Object key = A1K.getKey();
            Object value = A1K.getValue();
            Iterator it = this.A07.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (C14360o3.A0K(((US9) it.next()).A05, key)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            if (intValue == -1) {
                intValue = Integer.MAX_VALUE;
            }
            AbstractC166997dE.A1R(Integer.valueOf(intValue), value, arrayList);
        }
        return AbstractC06930Yk.A08(arrayList);
    }

    public C22993ABs(C6S5 c6s5, Integer num, Integer num2, String str, HashMap hashMap, List list, List list2, int i, int i2, int i3) {
        AbstractC167017dG.A1S(c6s5, list);
        AbstractC167007dF.A1I(list2, 7, hashMap);
        C14360o3.A0B(str, 10);
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = c6s5;
        this.A06 = list;
        this.A04 = num;
        this.A07 = list2;
        this.A09 = hashMap;
        this.A05 = num2;
        this.A08 = str;
    }
}
