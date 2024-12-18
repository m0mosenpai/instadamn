package X;

/* loaded from: classes10.dex */
public class RBE extends SN9 {
    public final String A01;
    public final boolean A02;
    public final C45T A03;
    public final AnonymousClass454 A04;
    public final String A05 = "get";
    public final String A00 = "is";

    public RBE(C45T c45t, AnonymousClass454 anonymousClass454, String str) {
        this.A03 = c45t;
        this.A04 = anonymousClass454;
        this.A02 = c45t.A08(C45Y.A0V);
        this.A01 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r1.startsWith(r0) == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    @Override // X.SN9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String A03(X.RBK r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r2 = r4.A05
            r3 = 0
            if (r2 == 0) goto L47
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L47
            java.lang.String r0 = "getCallbacks"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L48
            java.lang.reflect.Method r0 = r5.A01
            java.lang.Class r1 = r0.getReturnType()
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L5d
            java.lang.Class r0 = r1.getComponentType()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = ".cglib"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L5d
            java.lang.String r0 = "net.sf.cglib"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = "org.hibernate.repackage.cglib"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = "org.springframework.cglib"
        L41:
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L5d
        L47:
            return r3
        L48:
            java.lang.String r0 = "getMetaClass"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L5d
            java.lang.reflect.Method r0 = r5.A01
            java.lang.Class r0 = r0.getReturnType()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "groovy.lang"
            goto L41
        L5d:
            boolean r1 = r4.A02
            int r0 = r2.length()
            if (r1 == 0) goto L6a
            java.lang.String r3 = A01(r6, r0)
            return r3
        L6a:
            java.lang.String r3 = A00(r6, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RBE.A03(X.RBK, java.lang.String):java.lang.String");
    }

    public static final String A00(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder A0q = AbstractC58318PtA.A0q(length - i);
        while (true) {
            A0q.append(lowerCase);
            i++;
            if (i >= length) {
                break;
            }
            char charAt2 = str.charAt(i);
            lowerCase = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase) {
                A0q.append((CharSequence) str, i, length);
                break;
            }
        }
        return A0q.toString();
    }

    public static final String A01(String str, int i) {
        int i2;
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase || ((i2 = i + 1) < length && Character.isUpperCase(str.charAt(i2)))) {
            return str.substring(i);
        }
        StringBuilder A0q = AbstractC58318PtA.A0q(length - i);
        A0q.append(lowerCase);
        A0q.append((CharSequence) str, i2, length);
        return A0q.toString();
    }
}
