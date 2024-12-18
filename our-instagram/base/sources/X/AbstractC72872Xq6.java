package X;

/* renamed from: X.Xq6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72872Xq6 {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r5 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.XfN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.XfN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C72508XfN A00(X.C56082hw r6, X.C72508XfN r7, java.util.ArrayList r8, int r9) {
        /*
            if (r9 != 0) goto Lbc
            int r5 = r6.A07
        L4:
            r3 = 0
            r4 = -1
            if (r5 == r4) goto L6c
            if (r7 == 0) goto Le
            int r0 = r7.A00
            if (r5 == r0) goto L59
        Le:
            r2 = 0
        Lf:
            int r0 = r8.size()
            if (r2 >= r0) goto L6c
            java.lang.Object r1 = r8.get(r2)
            X.XfN r1 = (X.C72508XfN) r1
            int r0 = r1.A00
            if (r0 != r5) goto L69
            if (r7 == 0) goto L27
            r7.A01(r1, r9)
            r8.remove(r7)
        L27:
            r7 = r1
        L28:
            java.util.ArrayList r1 = r7.A04
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L59
            r1.add(r6)
            boolean r0 = r6 instanceof X.C3OH
            if (r0 == 0) goto L44
            r0 = r6
            X.3OH r0 = (X.C3OH) r0
            X.2hz r1 = r0.A04
            int r0 = r0.A01
            if (r0 != 0) goto L41
            r3 = 1
        L41:
            r1.A07(r7, r8, r3)
        L44:
            int r0 = r7.A00
            if (r9 != 0) goto L5a
            r6.A07 = r0
            X.2hz r0 = r6.A0e
            r0.A07(r7, r8, r9)
            X.2hz r0 = r6.A0f
        L51:
            r0.A07(r7, r8, r9)
            X.2hz r0 = r6.A0b
            r0.A07(r7, r8, r9)
        L59:
            return r7
        L5a:
            r6.A0X = r0
            X.2hz r0 = r6.A0g
            r0.A07(r7, r8, r9)
            X.2hz r0 = r6.A0Z
            r0.A07(r7, r8, r9)
            X.2hz r0 = r6.A0a
            goto L51
        L69:
            int r2 = r2 + 1
            goto Lf
        L6c:
            if (r7 != 0) goto L28
            boolean r0 = r6 instanceof X.C3O7
            if (r0 == 0) goto L9d
            r5 = r6
            X.3O7 r5 = (X.C3O7) r5
            r1 = 0
        L76:
            int r0 = r5.A00
            if (r1 >= r0) goto L9d
            X.2hw[] r0 = r5.A01
            r0 = r0[r1]
            if (r9 != 0) goto L9a
            int r2 = r0.A07
        L82:
            int r1 = r1 + 1
            if (r2 == r4) goto L76
            r1 = 0
        L87:
            int r0 = r8.size()
            if (r1 >= r0) goto L9d
            java.lang.Object r7 = r8.get(r1)
            X.XfN r7 = (X.C72508XfN) r7
            int r0 = r7.A00
            if (r0 == r2) goto Lb7
            int r1 = r1 + 1
            goto L87
        L9a:
            int r2 = r0.A0X
            goto L82
        L9d:
            X.XfN r7 = new X.XfN
            r7.<init>()
            java.util.ArrayList r0 = X.AbstractC166987dD.A1E()
            r7.A04 = r0
            r0 = 0
            r7.A03 = r0
            r7.A01 = r4
            int r1 = X.C72508XfN.A05
            int r0 = r1 + 1
            X.C72508XfN.A05 = r0
            r7.A00 = r1
            r7.A02 = r9
        Lb7:
            r8.add(r7)
            goto L28
        Lbc:
            int r5 = r6.A0X
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC72872Xq6.A00(X.2hw, X.XfN, java.util.ArrayList, int):X.XfN");
    }

    public static boolean A01(Integer num, Integer num2, Integer num3, Integer num4) {
        boolean z;
        boolean z2;
        Integer num5;
        Integer num6;
        Integer num7 = C05F.A00;
        if (num3 == num7 || num3 == (num6 = C05F.A01) || (num3 == C05F.A0N && num != num6)) {
            z = true;
        } else {
            z = false;
        }
        if (num4 == num7 || num4 == (num5 = C05F.A01) || (num4 == C05F.A0N && num2 != num5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }
}
