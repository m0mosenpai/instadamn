package X;

import android.os.Handler;

/* renamed from: X.KiE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46515KiE {
    public abstract void A01(Integer num);

    public final void A00() {
        Integer num;
        Integer[] numArr;
        Integer num2;
        int i;
        int i2 = VZE.A01.get();
        Integer[] A00 = C05F.A00(4);
        int length = A00.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                num = A00[i3];
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i != i2) {
                    i3++;
                }
            } else {
                num = C05F.A00;
            }
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        numArr = new Integer[8];
                        numArr[0] = C05F.A00;
                        numArr[1] = C05F.A01;
                        numArr[2] = C05F.A0C;
                        numArr[3] = C05F.A0N;
                        numArr[4] = C05F.A0Y;
                        numArr[5] = C05F.A0j;
                        numArr[6] = C05F.A0u;
                        num2 = C05F.A02;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    numArr = new Integer[8];
                    numArr[0] = C05F.A00;
                    numArr[1] = C05F.A01;
                    numArr[2] = C05F.A0C;
                    numArr[3] = C05F.A0N;
                    numArr[4] = C05F.A0Y;
                    numArr[5] = C05F.A0j;
                    numArr[6] = C05F.A0u;
                    num2 = C05F.A1I;
                }
            } else {
                numArr = new Integer[]{C05F.A00, C05F.A01, C05F.A0C, C05F.A0N, C05F.A0Y, C05F.A1F};
                Object obj = new Object();
                Handler A0J = AbstractC167007dF.A0J();
                C17050sx A01 = AbstractC09440dt.A01(new ME7(5, A0J, this, obj, numArr));
                A0J.removeCallbacks((Runnable) A01.getValue());
                A0J.postDelayed((Runnable) A01.getValue(), 1000L);
            }
        } else {
            numArr = new Integer[8];
            numArr[0] = C05F.A00;
            numArr[1] = C05F.A01;
            numArr[2] = C05F.A0C;
            numArr[3] = C05F.A0N;
            numArr[4] = C05F.A0Y;
            numArr[5] = C05F.A0j;
            numArr[6] = C05F.A0u;
            num2 = C05F.A15;
        }
        numArr[7] = num2;
        Object obj2 = new Object();
        Handler A0J2 = AbstractC167007dF.A0J();
        C17050sx A012 = AbstractC09440dt.A01(new ME7(5, A0J2, this, obj2, numArr));
        A0J2.removeCallbacks((Runnable) A012.getValue());
        A0J2.postDelayed((Runnable) A012.getValue(), 1000L);
    }
}
