package X;

/* renamed from: X.RMf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60687RMf extends AbstractC60694RMm {
    public static C60687RMf A00;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r2 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0K(java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.String r18, int r19) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60687RMf.A0K(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, int):void");
    }

    public static String A00(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = AbstractC31171DnF.A0V(AbstractC166987dD.A0H(obj));
        }
        String str = "-";
        if (obj instanceof Long) {
            long abs = Math.abs(AbstractC166987dD.A0N(obj));
            String valueOf = String.valueOf(obj);
            if (abs < 100) {
                return valueOf;
            }
            if (AbstractC58318PtA.A00(valueOf) != '-') {
                str = "";
            }
            String valueOf2 = String.valueOf(abs);
            StringBuilder A11 = AbstractC166997dE.A11(str);
            int length = valueOf2.length();
            A11.append(Math.round(Math.pow(10.0d, length - 1)));
            A11.append("...");
            A11.append(str);
            A11.append(Math.round(Math.pow(10.0d, length) - 1.0d));
            return A11.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return "-";
        }
        return AbstractC58319PtB.A0u(obj);
    }

    public final void A0J(SZ8 sz8, String str) {
        String str2;
        if (sz8 != null) {
            str2 = sz8.toString();
        } else {
            str2 = "no hit data";
        }
        A0F(AbstractC58321PtD.A0w("Discarding hit. ", str), str2);
    }
}
