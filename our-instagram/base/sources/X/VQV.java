package X;

/* loaded from: classes11.dex */
public abstract class VQV {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object A0a = MSY.A0a(c6fw);
        if (A0a != null) {
            str = C6AN.A00(A0a);
        } else {
            str = null;
        }
        boolean A01 = C6DZ.A01(c6fw.A02());
        AbstractC10360h2 A05 = C6BQ.A05(c6fq);
        if (str != null) {
            if (A05 != null) {
                A05.A0x(str, A01 ? 1 : 0);
            }
            return null;
        }
        AbstractC70132W6e.A00(C6BQ.A04(c6fq), A05);
        return null;
    }
}
