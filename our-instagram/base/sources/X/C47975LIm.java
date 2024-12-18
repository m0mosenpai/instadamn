package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.LIm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47975LIm {
    public static final C47975LIm A00 = new Object();
    public static final int[][] A01 = {new int[]{-1, 0}, new int[]{1, 0}, new int[]{0, -1}, new int[]{0, 1}};

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] A01(float[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47975LIm.A01(float[], int, int):float[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        if (r8[(r1 * r21) + r0] < r14[r13 + 1][r12 + 1]) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] A02(float[] r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47975LIm.A02(float[], int, int):float[]");
    }

    public static final float[] A00(float[] fArr, int i, int i2) {
        Object next;
        Number number;
        float[] fArr2 = fArr;
        HashMap A1G = AbstractC166987dD.A1G();
        int length = fArr2.length;
        int[] iArr = new int[length];
        boolean[] zArr = new boolean[length];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = (i4 * i) + i5;
                if (!zArr[i6] && fArr2[i6] != 0.0f) {
                    Stack stack = new Stack();
                    AbstractC166997dE.A1W(stack, i6);
                    i3++;
                    while (!stack.isEmpty()) {
                        int A0H = AbstractC166987dD.A0H(stack.pop());
                        if (A0H >= 0 && A0H < length && !zArr[A0H] && fArr2[A0H] != 0.0f) {
                            zArr[A0H] = true;
                            iArr[A0H] = i3;
                            Integer valueOf = Integer.valueOf(i3);
                            AbstractC166997dE.A1U(valueOf, A1G, AbstractC167017dG.A0K(AbstractC31171DnF.A0W(valueOf, A1G)) + 1);
                            int[][] iArr2 = A01;
                            int i7 = 0;
                            do {
                                int[] iArr3 = iArr2[i7];
                                stack.push(Integer.valueOf((((A0H / i) + iArr3[0]) * i) + (A0H % i) + iArr3[1]));
                                i7++;
                            } while (i7 < 4);
                        }
                    }
                }
            }
        }
        java.util.Set entrySet = A1G.entrySet();
        C14360o3.A07(entrySet);
        Iterator it = entrySet.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Integer num = (Integer) ((Map.Entry) next).getValue();
                do {
                    Object next2 = it.next();
                    Integer num2 = (Integer) ((Map.Entry) next2).getValue();
                    if (num.compareTo(num2) < 0) {
                        next = next2;
                        num = num2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (number = (Number) entry.getKey()) != null) {
            int intValue = number.intValue();
            fArr2 = new float[length];
            for (int i8 = 0; i8 < i2; i8++) {
                for (int i9 = 0; i9 < i; i9++) {
                    int i10 = (i8 * i) + i9;
                    if (iArr[i10] == intValue) {
                        fArr2[i10] = 1.0f;
                    }
                }
            }
        }
        return fArr2;
    }
}
