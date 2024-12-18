package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.78E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78E {
    public Map A00;

    public final int A00(String str) {
        Integer num;
        int i = -1;
        int binarySearch = Arrays.binarySearch(C78N.A00, str);
        if (binarySearch < 0) {
            synchronized (this) {
                Map map = this.A00;
                if (map != null && (num = (Integer) map.get(str)) != null) {
                    i = num.intValue();
                }
            }
            return i;
        }
        return C78N.A01[binarySearch];
    }

    public final boolean A03(String str) {
        int A00;
        ArrayList A02;
        return (str == null || (A00 = A00(str)) == -1 || (A02 = A02(A00)) == null || (A02.size() == 1 && "001".equals(A02.get(0)))) ? false : true;
    }

    public final String A01(int i) {
        short[] sArr = C78Q.A01;
        int binarySearch = Arrays.binarySearch(sArr, (short) i);
        if (binarySearch < 0) {
            return "ZZ";
        }
        while (sArr[binarySearch] == i && binarySearch - 1 >= 0) {
        }
        int i2 = binarySearch + 1;
        if (i2 < 0) {
            return "ZZ";
        }
        return C78Q.A00[i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        r2 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r2 < 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        r3 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r2 >= 253) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (r4[r2] != r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        r3.add(X.C78Q.A00[r2]);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:
    
        if (r1 < 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r4[r1] != r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        if (r1 < 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A02(int r6) {
        /*
            r5 = this;
            short[] r4 = X.C78Q.A01
            short r0 = (short) r6
            int r1 = java.util.Arrays.binarySearch(r4, r0)
            if (r1 >= 0) goto Ld
        L9:
            r3 = 0
        La:
            return r3
        Lb:
            if (r1 < 0) goto L14
        Ld:
            short r0 = r4[r1]
            if (r0 != r6) goto L14
            int r1 = r1 + (-1)
            goto Lb
        L14:
            int r2 = r1 + 1
            if (r2 < 0) goto L9
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1 = 253(0xfd, float:3.55E-43)
        L1f:
            if (r2 >= r1) goto La
            short r0 = r4[r2]
            if (r0 != r6) goto La
            java.lang.String[] r0 = X.C78Q.A00
            r0 = r0[r2]
            r3.add(r0)
            int r2 = r2 + 1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78E.A02(int):java.util.ArrayList");
    }
}
