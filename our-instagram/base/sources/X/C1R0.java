package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1R0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1R0 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C26701Qz A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;
    public java.util.Set A0C;
    public java.util.Set A0D;

    public static String A01(C1R0 c1r0) {
        String str = c1r0.A08;
        if (str == null) {
            return "";
        }
        if (!str.startsWith("2,")) {
            return str;
        }
        String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        if (split.length != 3) {
            return "";
        }
        return split[1];
    }

    public final String A03() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nRewrite Rules: \n");
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append("\n\n");
        }
        return sb.toString();
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nToken Features: \n");
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LiteZeroToken{CarrierID='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append(", Hash='");
        sb.append(this.A09);
        sb.append('\'');
        sb.append(", Ttl='");
        sb.append(this.A02);
        sb.append(", FetchedAt='");
        sb.append(this.A03);
        sb.append(A03());
        sb.append(A04());
        return sb.toString();
    }

    public C1R0(C26701Qz c26701Qz, String str, String str2, String str3, String str4, String str5, List list, List list2, java.util.Set set, java.util.Set set2, int i, int i2, int i3, long j) {
        this.A09 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A0B = list;
        this.A0A = list2;
        this.A0C = set;
        this.A05 = str4;
        this.A02 = i;
        this.A00 = i2;
        this.A0D = set2;
        this.A03 = j;
        this.A01 = i3;
        this.A04 = c26701Qz;
        this.A08 = str5;
    }

    public static C1R0 A00() {
        return new C1R0(new C26701Qz(), "", "", "", null, "", Collections.emptyList(), Collections.emptyList(), Collections.emptySet(), Collections.emptySet(), 0, 0, 86400, 0L);
    }

    public final long A02() {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - this.A03;
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        int i = this.A02;
        if (i != 0) {
            j = i * 1000;
        } else {
            j = 3600000;
        }
        return j - currentTimeMillis;
    }
}
