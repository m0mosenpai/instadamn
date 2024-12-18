package X;

/* loaded from: classes10.dex */
public abstract class S4T {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        boolean A01 = C6DZ.A01(c6fw.A02());
        int A0D = AbstractC25230BEn.A0D(c6fw.A00(), "null cannot be cast to non-null type kotlin.Number");
        C25671My A00 = AbstractC25651Mw.A00(AbstractC31175DnJ.A0J(c6fq));
        Integer valueOf = Integer.valueOf(A0D);
        Integer[] A002 = C05F.A00(4);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A002[i];
                int A003 = AbstractC62242S3n.A00(num);
                if (valueOf != null && A003 == A0D) {
                    break;
                }
                i++;
            } else {
                num = C05F.A00;
                break;
            }
        }
        A00.E4s(new C36106Fwg(num, A0d, A01));
        return null;
    }
}
