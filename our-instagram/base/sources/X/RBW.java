package X;

/* loaded from: classes10.dex */
public final class RBW extends RBE {
    public final java.util.Set A00;

    public RBW(C45T c45t, AnonymousClass454 anonymousClass454) {
        super(c45t, anonymousClass454, null);
        this.A00 = AbstractC166987dD.A1H();
        Class cls = anonymousClass454.A05;
        RuntimeException runtimeException = C62940SYi.A04;
        if (runtimeException == null) {
            C62940SYi c62940SYi = C62940SYi.A03;
            Object[] A00 = c62940SYi.A00(cls);
            int length = A00.length;
            String[] strArr = new String[length];
            int i = 0;
            while (i < length) {
                try {
                    strArr[i] = (String) c62940SYi.A00.invoke(A00[i], new Object[0]);
                    i++;
                } catch (Exception e) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(length), C914045z.A06(cls)), e);
                }
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.A00.add(strArr[i2]);
            }
            return;
        }
        throw runtimeException;
    }

    @Override // X.RBE, X.SN9
    public final String A03(RBK rbk, String str) {
        if (this.A00.contains(str)) {
            return str;
        }
        return super.A03(rbk, str);
    }
}
