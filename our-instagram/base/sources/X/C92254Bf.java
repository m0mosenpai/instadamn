package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92254Bf {
    public float A00;
    public C4B6 A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final C4B6 A0D;
    public final C4B6 A0E;
    public final C4B6 A0F;
    public final String A0G;
    public final boolean A0J;
    public final C4B6[] A0K;
    public final List A0L;
    public final ArrayList A0I = new ArrayList();
    public final StringBuilder A0H = new StringBuilder();
    public Map A07 = new HashMap();
    public Map A06 = new HashMap();

    public static void A00(C92264Bg c92264Bg, String str, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":[");
        sb2.append(c92264Bg.A01);
        sb2.append("-");
        sb2.append(c92264Bg.A02);
        sb2.append("-");
        sb2.append(c92264Bg.A04);
        sb2.append("-");
        sb2.append(c92264Bg.A03);
        sb2.append("];");
        sb.append(sb2.toString());
    }

    public final String A01() {
        StringBuilder sb = new StringBuilder();
        for (C4BX c4bx : this.A0L) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(c4bx.A00);
        }
        return sb.toString();
    }

    public final String A02() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.A0I.iterator();
        while (it.hasNext()) {
            String str = ((EnumC92204Ba) it.next()).A00;
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final void A03(EnumC96564Vr enumC96564Vr, String str) {
        String str2 = enumC96564Vr.A00;
        StringBuilder sb = this.A0H;
        String A0g = AnonymousClass001.A0g(str2, " ", str);
        if (sb.length() > 0) {
            sb.append(";");
        }
        sb.append(A0g);
    }

    public final void A04(String str, int i, long j, long j2, long j3, long j4) {
        if (str == null || str.isEmpty()) {
            str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        this.A07.put(str, new C92264Bg(i, j, j2, j3, j4));
    }

    public C92254Bf(C4B6 c4b6, C4B6 c4b62, C4B6 c4b63, String str, String str2, String str3, String str4, String str5, List list, C4B6[] c4b6Arr, float f, int i, long j, long j2, long j3, long j4, boolean z) {
        this.A0A = j / 1000;
        this.A09 = j2 / 1000;
        this.A0B = j4 / 1000;
        this.A0C = j3 / 1000;
        this.A0D = c4b6;
        this.A0K = c4b6Arr;
        this.A0E = c4b62;
        this.A0F = c4b63;
        this.A0L = list;
        this.A08 = i;
        this.A0G = str;
        this.A0J = z;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A05 = str5;
        this.A00 = f;
    }
}
