package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class TIC implements Serializable {
    public final int A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object other) {
        if (this != other) {
            if (!(other instanceof TIC)) {
                return false;
            }
            TIC tic = (TIC) other;
            if (!AbstractC50102Ry.A00(this.A01, tic.A01) || this.A00 != tic.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(AbstractC25228BEl.A1Z(this.A01, this.A00));
    }

    public final String toString() {
        String str = this.A01;
        StringBuilder A0q = AbstractC58318PtA.A0q(str.length() + 8);
        if (str.indexOf(58) >= 0) {
            A0q.append('[');
            A0q.append(str);
            A0q.append(']');
        } else {
            A0q.append(str);
        }
        int i = this.A00;
        if (i >= 0) {
            A0q.append(':');
            A0q.append(i);
        }
        return A0q.toString();
    }

    public TIC(String host, int port, boolean hasBracketlessColons) {
        this.A01 = host;
        this.A00 = port;
        this.A02 = hasBracketlessColons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        if (r3 > 65535) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r2 <= r4) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.TIC A00(java.lang.String r10) {
        /*
            r10.getClass()
            java.lang.String r0 = "["
            boolean r0 = r10.startsWith(r0)
            r3 = -1
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L90
            char r1 = r10.charAt(r6)
            r0 = 91
            boolean r1 = X.AbstractC167007dF.A1P(r1, r0)
            java.lang.String r0 = "Bracketed host-port string must start with a bracket: %s"
            X.C18C.A0A(r10, r0, r1)
            r9 = 58
            int r4 = r10.indexOf(r9)
            r0 = 93
            int r2 = r10.lastIndexOf(r0)
            if (r4 <= r3) goto L2e
            r1 = 1
            if (r2 > r4) goto L2f
        L2e:
            r1 = 0
        L2f:
            java.lang.String r0 = "Invalid bracketed host/port: %s"
            X.C18C.A0A(r10, r0, r1)
            java.lang.String r8 = r10.substring(r5, r2)
            int r0 = r2 + 1
            int r7 = r10.length()
            if (r0 != r7) goto L69
            java.lang.String r0 = ""
        L42:
            java.lang.String[] r0 = new java.lang.String[]{r8, r0}
            r4 = r0[r6]
            r0 = r0[r5]
        L4a:
            r2 = 0
        L4b:
            boolean r1 = X.AbstractC116315Ok.A00(r0)
            if (r1 != 0) goto Lc9
            java.lang.String r1 = "+"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L67
            X.T7z r1 = X.C60741RPf.A00
            boolean r1 = r1.A0A(r0)
            if (r1 == 0) goto L67
        L61:
            java.lang.String r1 = "Unparseable port number: %s"
            X.C18C.A0A(r10, r1, r5)
            goto Laf
        L67:
            r5 = 0
            goto L61
        L69:
            char r0 = r10.charAt(r0)
            boolean r1 = X.AbstractC167007dF.A1P(r0, r9)
            java.lang.String r0 = "Only a colon may follow a close bracket: %s"
            X.C18C.A0A(r10, r0, r1)
            int r4 = r2 + 2
            r2 = r4
        L79:
            if (r2 >= r7) goto L8b
            char r0 = r10.charAt(r2)
            boolean r1 = java.lang.Character.isDigit(r0)
            java.lang.String r0 = "Port must be numeric: %s"
            X.C18C.A0A(r10, r0, r1)
            int r2 = r2 + 1
            goto L79
        L8b:
            java.lang.String r0 = r10.substring(r4)
            goto L42
        L90:
            r0 = 58
            int r2 = r10.indexOf(r0)
            if (r2 < 0) goto Lab
            int r1 = r2 + 1
            int r0 = r10.indexOf(r0, r1)
            if (r0 != r3) goto La9
            java.lang.String r4 = r10.substring(r6, r2)
            java.lang.String r0 = r10.substring(r1)
            goto L4a
        La9:
            r2 = 1
            goto Lac
        Lab:
            r2 = 0
        Lac:
            r0 = 0
            r4 = r10
            goto L4b
        Laf:
            int r3 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lb6
            if (r3 < 0) goto Lc3
            goto Lbd
        Lb6:
            java.lang.String r0 = "Unparseable port number: "
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r0, r10)
            throw r0
        Lbd:
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = 1
            if (r3 <= r0) goto Lc4
        Lc3:
            r1 = 0
        Lc4:
            java.lang.String r0 = "Port number out of range: %s"
            X.C18C.A0A(r10, r0, r1)
        Lc9:
            X.TIC r0 = new X.TIC
            r0.<init>(r4, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TIC.A00(java.lang.String):X.TIC");
    }
}
