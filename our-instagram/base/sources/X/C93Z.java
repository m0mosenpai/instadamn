package X;

import com.facebook.common.dextricks.Constants;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.93Z, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C93Z {
    public static final AtomicInteger A0J = new AtomicInteger();
    public Integer A00;
    public final int A01;
    public final C93Y A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final InterfaceC16820sZ A09;
    public final InterfaceC16820sZ A0A;
    public final InterfaceC16660sJ A0B;
    public final InterfaceC16620sF A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public /* synthetic */ C93Z(C93Y c93y, Integer num, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C2044393a c2044393a;
        Integer num2;
        boolean z7 = z6;
        boolean z8 = z4;
        boolean z9 = (i & 64) != 0 ? false : z3;
        z8 = (i & 128) != 0 ? false : z8;
        str3 = (i & 512) != 0 ? null : str3;
        if ((i & C3OO.FLAG_MOVED) != 0) {
            c2044393a = C2044393a.A00;
        } else {
            c2044393a = null;
        }
        C93b c93b = (i & 4096) != 0 ? C93b.A00 : null;
        C93c c93c = (i & 8192) != 0 ? C93c.A00 : null;
        C2044493d c2044493d = (i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? C2044493d.A00 : null;
        z7 = (i & Constants.LOAD_RESULT_PGO) != 0 ? false : z7;
        C14360o3.A0B(str2, 4);
        C14360o3.A0B(c2044393a, 12);
        C14360o3.A0B(c93b, 13);
        C14360o3.A0B(c93c, 14);
        C14360o3.A0B(c2044493d, 15);
        this.A02 = c93y;
        this.A03 = num;
        this.A04 = str;
        this.A07 = str2;
        this.A0I = z;
        this.A0E = z2;
        this.A0G = z9;
        this.A0D = z8;
        this.A0H = z5;
        this.A05 = str3;
        this.A08 = str4;
        this.A09 = c2044393a;
        this.A0A = c93b;
        this.A0B = c93c;
        this.A0C = c2044493d;
        this.A0F = z7;
        this.A06 = AnonymousClass001.A0g(C93X.A01(c93y), ",max_id:", str3);
        this.A01 = A0J.incrementAndGet();
        switch (num.intValue()) {
            case 0:
            case 1:
                num2 = C05F.A01;
                break;
            case 2:
                num2 = C05F.A0C;
                break;
            case 3:
                num2 = C05F.A0N;
                break;
            case 4:
            case 5:
            default:
                num2 = C05F.A00;
                break;
            case 6:
                num2 = C05F.A0Y;
                break;
        }
        this.A00 = num2;
    }
}
