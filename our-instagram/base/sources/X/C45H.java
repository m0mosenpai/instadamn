package X;

import java.io.Serializable;

/* renamed from: X.45H, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45H implements Serializable {
    public static final C45H A04;
    public final C45I A00;
    public final C45I A01;
    public final Class A02;
    public final Class A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C45H c45h = (C45H) obj;
            if (c45h.A01 != this.A01 || c45h.A00 != this.A00 || c45h.A03 != this.A03 || c45h.A02 != this.A02) {
                return false;
            }
        }
        return true;
    }

    static {
        C45I c45i = C45I.USE_DEFAULTS;
        A04 = new C45H(c45i, c45i, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r8 == X.C45I.USE_DEFAULTS) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == X.C45I.USE_DEFAULTS) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C45H A00(X.C45H r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L48
            X.45H r0 = X.C45H.A04
            if (r11 == r0) goto L48
            X.45I r9 = r11.A01
            X.45I r8 = r11.A00
            java.lang.Class r7 = r11.A03
            java.lang.Class r6 = r11.A02
            X.45I r5 = r10.A01
            r4 = 1
            if (r9 == r5) goto L18
            X.45I r0 = X.C45I.USE_DEFAULTS
            r3 = 1
            if (r9 != r0) goto L19
        L18:
            r3 = 0
        L19:
            X.45I r2 = r10.A00
            if (r8 == r2) goto L22
            X.45I r0 = X.C45I.USE_DEFAULTS
            r1 = 1
            if (r8 != r0) goto L23
        L22:
            r1 = 0
        L23:
            java.lang.Class r0 = r10.A03
            if (r7 != r0) goto L2a
            if (r6 != r0) goto L2a
            r4 = 0
        L2a:
            if (r3 == 0) goto L38
            X.45H r0 = new X.45H
            if (r1 == 0) goto L34
            r0.<init>(r9, r8, r7, r6)
            return r0
        L34:
            r0.<init>(r9, r2, r7, r6)
            return r0
        L38:
            if (r1 == 0) goto L40
            X.45H r0 = new X.45H
            r0.<init>(r5, r8, r7, r6)
            return r0
        L40:
            if (r4 == 0) goto L48
            X.45H r0 = new X.45H
            r0.<init>(r5, r2, r7, r6)
            return r0
        L48:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45H.A00(X.45H):X.45H");
    }

    public final int hashCode() {
        return (this.A01.hashCode() << 2) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("JsonInclude.Value(value=");
        sb.append(this.A01);
        sb.append(MSV.A00(302));
        sb.append(this.A00);
        Class cls = this.A03;
        if (cls != null) {
            sb.append(",valueFilter=");
            sb.append(cls.getName());
            sb.append(".class");
        }
        Class cls2 = this.A02;
        if (cls2 != null) {
            sb.append(",contentFilter=");
            sb.append(cls2.getName());
            sb.append(".class");
        }
        sb.append(')');
        return sb.toString();
    }

    public C45H(C45I c45i, C45I c45i2, Class cls, Class cls2) {
        this.A01 = c45i == null ? C45I.USE_DEFAULTS : c45i;
        this.A00 = c45i2 == null ? C45I.USE_DEFAULTS : c45i2;
        this.A03 = cls == Void.class ? null : cls;
        this.A02 = cls2 == Void.class ? null : cls2;
    }
}
