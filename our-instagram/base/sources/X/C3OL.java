package X;

/* renamed from: X.3OL, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3OL {
    public static boolean[] A00 = new boolean[3];

    public static void A00(C56142i3 c56142i3, C56082hw c56082hw, C56062hu c56062hu) {
        c56082hw.A0D = -1;
        c56082hw.A0Q = -1;
        Integer[] numArr = c56062hu.A14;
        Integer num = numArr[0];
        Integer num2 = C05F.A01;
        if (num != num2 && c56082hw.A14[0] == C05F.A0N) {
            C56112hz c56112hz = c56082hw.A0e;
            int i = c56112hz.A02;
            int A07 = c56062hu.A07();
            C56112hz c56112hz2 = c56082hw.A0f;
            int i2 = A07 - c56112hz2.A02;
            c56112hz.A03 = c56142i3.A09(c56112hz);
            c56112hz2.A03 = c56142i3.A09(c56112hz2);
            c56142i3.A0D(c56112hz.A03, i);
            c56142i3.A0D(c56112hz2.A03, i2);
            c56082hw.A0D = 2;
            c56082hw.A0V = i;
            int i3 = i2 - i;
            c56082hw.A0S = i3;
            int i4 = c56082hw.A0N;
            if (i3 < i4) {
                c56082hw.A0S = i4;
            }
        }
        if (numArr[1] != num2 && c56082hw.A14[1] == C05F.A0N) {
            C56112hz c56112hz3 = c56082hw.A0g;
            int i5 = c56112hz3.A02;
            int A06 = c56062hu.A06();
            C56112hz c56112hz4 = c56082hw.A0a;
            int i6 = A06 - c56112hz4.A02;
            c56112hz3.A03 = c56142i3.A09(c56112hz3);
            c56112hz4.A03 = c56142i3.A09(c56112hz4);
            c56142i3.A0D(c56112hz3.A03, i5);
            c56142i3.A0D(c56112hz4.A03, i6);
            if (c56082hw.A08 > 0 || c56082hw.A0R == 8) {
                C56112hz c56112hz5 = c56082hw.A0Z;
                C56152i4 A09 = c56142i3.A09(c56112hz5);
                c56112hz5.A03 = A09;
                c56142i3.A0D(A09, c56082hw.A08 + i5);
            }
            c56082hw.A0Q = 2;
            c56082hw.A0W = i5;
            int i7 = i6 - i5;
            c56082hw.A0A = i7;
            int i8 = c56082hw.A0M;
            if (i7 < i8) {
                c56082hw.A0A = i8;
            }
        }
    }
}
