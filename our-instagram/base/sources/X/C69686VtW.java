package X;

import android.os.Build;

/* renamed from: X.VtW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69686VtW {
    public final C4IA A00;
    public final C4IB A01;

    public C69686VtW(C4IA c4ia, C4IB c4ib) {
        C14360o3.A0B(c4ia, 1);
        this.A00 = c4ia;
        this.A01 = c4ib;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        if (r3 == r4) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4IC A00(java.util.Map r6) {
        /*
            r5 = this;
            X.4IA r1 = r5.A00
            X.4IA r0 = X.C4IA.A08
            if (r1 == r0) goto L67
            X.4IA r0 = X.C4IA.A07
            if (r1 == r0) goto L67
            X.4IA r0 = X.C4IA.A05
            if (r1 != r0) goto L1b
            java.lang.String r0 = "android.permission.CAMERA"
        L10:
            java.lang.Object r4 = r6.get(r0)
            X.4IC r4 = (X.C4IC) r4
        L16:
            if (r4 != 0) goto L1a
        L18:
            X.4IC r4 = X.C4IC.A05
        L1a:
            return r4
        L1b:
            X.4IA r0 = X.C4IA.A0A
            if (r1 != r0) goto L26
            r0 = 171(0xab, float:2.4E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L10
        L26:
            X.4IA r0 = X.C4IA.A06
            if (r1 != r0) goto L5c
            java.lang.String r2 = "android.permission.READ_CONTACTS"
            java.lang.Object r0 = r6.get(r2)
            X.4IC r4 = X.C4IC.A08
            if (r0 == r4) goto L1a
            java.lang.String r1 = "android.permission.WRITE_CONTACTS"
            java.lang.Object r0 = r6.get(r1)
            if (r0 == r4) goto L1a
            java.lang.Object r0 = r6.get(r2)
            X.4IC r4 = X.C4IC.A06
            boolean r3 = X.AbstractC167007dF.A1X(r0, r4)
            java.lang.Object r0 = r6.get(r1)
            boolean r2 = X.AbstractC167007dF.A1X(r0, r4)
            X.4IB r1 = r5.A01
            X.4IB r0 = X.C4IB.A03
            if (r1 != r0) goto L59
            if (r3 == 0) goto L18
            if (r2 == 0) goto L18
            return r4
        L59:
            if (r3 == 0) goto L18
            return r4
        L5c:
            X.4IA r0 = X.C4IA.A09
            if (r1 != r0) goto Lbf
            r0 = 8
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            goto L10
        L67:
            r0 = 5
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            java.lang.Object r3 = r6.get(r0)
            X.4IC r3 = (X.C4IC) r3
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Object r2 = r6.get(r0)
            X.4IA r0 = X.C4IA.A07
            if (r1 != r0) goto L8f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L8f
            java.lang.String r0 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            java.lang.Object r4 = r6.get(r0)
            X.4IC r4 = (X.C4IC) r4
            X.4IC r0 = X.C4IC.A06
            if (r4 == r0) goto L8f
            goto L16
        L8f:
            X.4IB r1 = r5.A01
            X.4IB r0 = X.C4IB.A05
            if (r1 != r0) goto La4
            X.4IC r4 = X.C4IC.A06
            if (r3 != r4) goto L9c
            if (r2 != r4) goto L9c
            return r4
        L9c:
            X.4IC r0 = X.C4IC.A05
            if (r2 != r0) goto Lb8
            if (r3 != r4) goto Lb8
            goto L18
        La4:
            X.4IB r0 = X.C4IB.A0C
            if (r1 != r0) goto Lc2
            X.4IC r4 = X.C4IC.A06
            if (r3 != r4) goto Laf
            if (r2 != r4) goto Laf
            return r4
        Laf:
            X.4IC r0 = X.C4IC.A05
            if (r2 != r0) goto Lb8
            if (r3 != r4) goto Lb8
            X.4IC r4 = X.C4IC.A07
            return r4
        Lb8:
            X.4IC r4 = X.C4IC.A08
            if (r2 == r4) goto L1a
            if (r3 != r4) goto L18
            return r4
        Lbf:
            X.4IC r4 = X.C4IC.A09
            return r4
        Lc2:
            if (r3 != 0) goto Lc6
            X.4IC r3 = X.C4IC.A05
        Lc6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69686VtW.A00(java.util.Map):X.4IC");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final String[] A01() {
        String A00;
        char c;
        int i;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        char c2;
        String str;
        switch (this.A00.ordinal()) {
            case 0:
                int ordinal = this.A01.ordinal();
                A00 = AbstractC43591JPw.A00(5);
                c = 0;
                i = 1;
                if (ordinal == 0 || ordinal != 1) {
                    strArr = new String[2];
                    strArr[0] = "android.permission.ACCESS_FINE_LOCATION";
                    strArr[i] = A00;
                    return strArr;
                }
                strArr2 = new String[i];
                strArr2[c] = A00;
                return strArr2;
            case 1:
                int ordinal2 = this.A01.ordinal();
                A00 = "android.permission.ACCESS_BACKGROUND_LOCATION";
                String A002 = AbstractC43591JPw.A00(5);
                i = 2;
                c = 1;
                if (ordinal2 != 0 && ordinal2 == 1) {
                    if (Build.VERSION.SDK_INT < 29) {
                        return new String[]{A002};
                    }
                    strArr2 = new String[2];
                    strArr2[0] = A002;
                    strArr2[c] = A00;
                    return strArr2;
                }
                if (Build.VERSION.SDK_INT < 29) {
                    return new String[]{"android.permission.ACCESS_FINE_LOCATION", A002};
                }
                strArr = new String[3];
                strArr[0] = "android.permission.ACCESS_FINE_LOCATION";
                strArr[1] = A002;
                strArr[i] = A00;
                return strArr;
            case 2:
            case 6:
            case 7:
            default:
                return new String[0];
            case 3:
                strArr3 = new String[1];
                c2 = 0;
                str = "android.permission.CAMERA";
                strArr3[c2] = str;
                return strArr3;
            case 4:
                A00 = "android.permission.READ_CONTACTS";
                c = 0;
                i = 1;
                if (this.A01 == C4IB.A03) {
                    return new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
                }
                strArr2 = new String[i];
                strArr2[c] = A00;
                return strArr2;
            case 5:
                strArr3 = new String[1];
                c2 = 0;
                str = AbstractC43591JPw.A00(8);
                strArr3[c2] = str;
                return strArr3;
            case 8:
                strArr3 = new String[1];
                c2 = 0;
                str = AbstractC111324zv.A00(171);
                strArr3[c2] = str;
                return strArr3;
        }
    }
}
