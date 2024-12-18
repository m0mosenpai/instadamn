package X;

import com.instagram.model.venue.LocationDict;

/* renamed from: X.Vyk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69969Vyk {
    public static final LocationDict A00(C66613UPa c66613UPa) {
        String str;
        C14360o3.A0B(c66613UPa, 0);
        String str2 = c66613UPa.A0E;
        String str3 = c66613UPa.A0F;
        String str4 = c66613UPa.A0G;
        Integer num = c66613UPa.A04;
        Integer num2 = c66613UPa.A05;
        Integer num3 = c66613UPa.A06;
        Long l = c66613UPa.A0A;
        String str5 = null;
        if (l != null) {
            str = l.toString();
        } else {
            str = null;
        }
        String str6 = c66613UPa.A0H;
        String str7 = c66613UPa.A0I;
        Long l2 = c66613UPa.A0B;
        if (l2 != null) {
            str5 = l2.toString();
        }
        Long l3 = c66613UPa.A0C;
        String str8 = c66613UPa.A0J;
        return new LocationDict(c66613UPa.A00, c66613UPa.A01, c66613UPa.A02, c66613UPa.A03, num, num2, num3, c66613UPa.A07, c66613UPa.A08, c66613UPa.A09, l3, c66613UPa.A0D, str2, str3, str4, str, str6, str7, str5, str8, c66613UPa.A0K, c66613UPa.A0L, c66613UPa.A0M, c66613UPa.A0N);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.UPa] */
    public static final C66613UPa A01(LocationDict locationDict) {
        Long l;
        ?? obj = new Object();
        obj.A0E = null;
        obj.A0F = null;
        obj.A0G = null;
        obj.A04 = null;
        obj.A05 = null;
        obj.A06 = null;
        obj.A0A = null;
        obj.A0H = null;
        obj.A0I = null;
        obj.A0B = null;
        obj.A0C = null;
        obj.A0J = null;
        obj.A00 = null;
        obj.A01 = null;
        obj.A02 = null;
        obj.A03 = null;
        obj.A07 = null;
        obj.A0K = null;
        obj.A0D = null;
        obj.A0L = null;
        obj.A0M = null;
        obj.A08 = null;
        obj.A09 = null;
        obj.A0N = null;
        obj.A0E = locationDict.A0C;
        obj.A0F = locationDict.A0D;
        obj.A0G = locationDict.A0E;
        obj.A04 = locationDict.A04;
        obj.A05 = locationDict.A05;
        obj.A06 = locationDict.A06;
        String str = locationDict.A0F;
        if (str != null) {
            l = AbstractC003100w.A0k(10, str);
        } else {
            l = null;
        }
        obj.A0A = l;
        obj.A0H = locationDict.A0G;
        obj.A0I = locationDict.A0H;
        String str2 = locationDict.A0I;
        obj.A0B = str2 != null ? AbstractC003100w.A0k(10, str2) : null;
        obj.A0C = locationDict.A0A;
        obj.A0J = locationDict.A0J;
        obj.A00 = locationDict.A00;
        obj.A01 = locationDict.A01;
        obj.A02 = locationDict.A02;
        obj.A03 = locationDict.A03;
        obj.A07 = locationDict.A07;
        obj.A0K = locationDict.A0K;
        obj.A0D = locationDict.A0B;
        obj.A0L = locationDict.A0L;
        obj.A0M = locationDict.A0M;
        obj.A08 = locationDict.A08;
        obj.A09 = locationDict.A09;
        obj.A0N = locationDict.A0N;
        return obj;
    }
}
