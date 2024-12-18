package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.0j0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11420j0 {
    public int A00;
    public ArrayList A01;

    public final Object A02(String str) {
        for (int i = 0; i < this.A00; i++) {
            ArrayList arrayList = this.A01;
            int i2 = i * 2;
            if (arrayList.get(i2).equals(str)) {
                return arrayList.get(i2 + 1);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (X.AbstractC50102Ry.A00(r3, r9.A02(r4)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 1
            if (r8 == r9) goto L49
            boolean r0 = r9 instanceof X.C11420j0
            r6 = 0
            if (r0 == 0) goto L48
            X.0j0 r9 = (X.C11420j0) r9
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 != r0) goto L48
            r5 = 0
        L11:
            int r0 = r8.A00
            if (r5 >= r0) goto L49
            java.util.ArrayList r1 = r8.A01
            int r0 = r5 * 2
            java.lang.Object r4 = r1.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            int r0 = r0 + 1
            java.lang.Object r3 = r1.get(r0)
            r2 = 0
        L26:
            int r0 = r9.A00
            if (r2 >= r0) goto L48
            java.util.ArrayList r1 = r9.A01
            int r0 = r2 * 2
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L45
            java.lang.Object r0 = r9.A02(r4)
            boolean r0 = X.AbstractC50102Ry.A00(r3, r0)
            if (r0 == 0) goto L48
            int r5 = r5 + 1
            goto L11
        L45:
            int r2 = r2 + 1
            goto L26
        L48:
            return r6
        L49:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11420j0.equals(java.lang.Object):boolean");
    }

    private void A00(int i, int i2) {
        if (i >= 0 && i < this.A00) {
            if (i2 >= 0 && i2 < this.A01.size()) {
                return;
            } else {
                throw new ArrayIndexOutOfBoundsException(AnonymousClass001.A02(i2, this.A01.size(), "Internal Index: ", ", Internal Size: "));
            }
        }
        throw new ArrayIndexOutOfBoundsException(AnonymousClass001.A02(i, this.A00, "Index: ", ", Size: "));
    }

    public final Object A01(int i) {
        int i2 = (i * 2) + 1;
        A00(i, i2);
        return this.A01.get(i2);
    }

    public final String A03(int i) {
        int i2 = i * 2;
        A00(i, i2);
        Object obj = this.A01.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException("CompactArrayMap keys must be strings.");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00)});
    }
}
