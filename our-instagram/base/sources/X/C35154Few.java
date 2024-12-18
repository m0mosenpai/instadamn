package X;

/* renamed from: X.Few, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35154Few {
    public static C35154Few A0B;
    public FOM A00;
    public EnumC31713DwI A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public final synchronized void A02(FOM fom, Integer num, String str, String str2) {
        C35154Few c35154Few = A0B;
        c35154Few.A02 = num;
        c35154Few.A08 = str;
        c35154Few.A00 = fom;
        c35154Few.A07 = str2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.FOM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.Few] */
    public static synchronized C35154Few A00() {
        C35154Few c35154Few;
        synchronized (C35154Few.class) {
            if (A0B == null) {
                ?? obj = new Object();
                A0B = obj;
                obj.A02(new Object(), C05F.A1F, "", "");
                C35154Few c35154Few2 = A0B;
                EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0z;
                synchronized (c35154Few2) {
                    C35154Few c35154Few3 = A0B;
                    c35154Few3.A0A = "";
                    c35154Few3.A09 = "";
                    c35154Few3.A01 = enumC31713DwI;
                }
                C35154Few c35154Few4 = A0B;
                Integer num = C05F.A00;
                synchronized (c35154Few4) {
                    A0B.A05 = num;
                }
                synchronized (A0B) {
                }
                C35154Few c35154Few5 = A0B;
                Integer num2 = C05F.A0C;
                synchronized (c35154Few5) {
                    A0B.A03 = num2;
                }
            }
            c35154Few = A0B;
        }
        return c35154Few;
    }

    public static String A01() {
        if (A00().A04 == C05F.A00) {
            return C1Q9.A01();
        }
        return null;
    }
}
