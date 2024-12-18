package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Se0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63152Se0 {
    public Integer A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Map A08;

    public C63152Se0(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i, long j) {
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A08 = map;
        this.A02 = str5;
        this.A07 = str6;
        this.A01 = (j + TimeUnit.SECONDS.toMillis(i)) - 10000;
        this.A00 = num;
    }

    public static C63152Se0 A00(SPK spk, Integer num, String str, String str2, long j) {
        HashMap A1G = AbstractC166987dD.A1G();
        for (C62737SOd c62737SOd : spk.A06) {
            A1G.put(c62737SOd.A01, new C62435SBn(c62737SOd.A00, j));
        }
        String str3 = spk.A05;
        str3.getClass();
        String str4 = spk.A02;
        String str5 = spk.A03;
        String str6 = spk.A04;
        str6.getClass();
        return new C63152Se0(num, str3, str4, str5, str6, str, str2, A1G, spk.A00, j);
    }

    public static C63152Se0 A01(Integer num, String str, String str2, String str3, String str4, List list) {
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1G.put(it.next(), new C62435SBn(Integer.MAX_VALUE, System.currentTimeMillis()));
        }
        return new C63152Se0(num, "", str, "LOCAL", str2, str4, str3, A1G, Integer.MAX_VALUE, System.currentTimeMillis());
    }
}
