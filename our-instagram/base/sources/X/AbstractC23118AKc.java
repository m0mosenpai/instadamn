package X;

import android.opengl.GLES20;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AKc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23118AKc {
    public static final ArrayList A01(List list, int[] iArr, C8Is[] c8IsArr, float f, float f2, float f3) {
        boolean A1a = AbstractC167017dG.A1a(c8IsArr, list);
        float f4 = f / (1000.0f / 33.0f);
        ArrayList A1E = AbstractC166987dD.A1E();
        int i = 0;
        for (C8Is c8Is : c8IsArr) {
            c8Is.A00(list, A1E, f4, f2, f3);
            float f5 = c8Is.A00;
            if (f5 == 1.0f || f5 == 0.0f) {
                iArr[i] = A1E.size() - (A1a ? 1 : 0);
                i++;
            }
        }
        return A1E;
    }

    public static final void A02(AKR akr, C201278vB c201278vB, List list, float[] fArr, int i, int i2, long j) {
        float f;
        C14360o3.A0B(akr, 0);
        AbstractC167017dG.A1R(c201278vB, fArr);
        if (i < i2) {
            c201278vB.A01(((C200688uB) list.get(i)).A03, fArr, j);
            akr.A04(c201278vB);
            return;
        }
        long A0A = AbstractC166987dD.A0A(list.size() - i2, 0.3f);
        long A0A2 = AbstractC166987dD.A0A(list.size() - i2, 0.7f);
        int size = list.size() - 1;
        long j2 = i;
        long j3 = i2;
        long j4 = j3 + A0A;
        float f2 = 0.05f;
        float f3 = 825.0467f;
        float f4 = 0.02f;
        float f5 = 1620.0f;
        if (j2 < j4) {
            f = (i - i2) / ((float) A0A);
            f2 = 0.0f;
            f3 = 750.0f;
            f5 = 825.0467f;
        } else {
            long j5 = j3 + A0A2;
            if (j2 < j5) {
                f = ((float) (j2 - j4)) / ((float) (A0A2 - A0A));
                f2 = 0.02f;
                f4 = 0.05f;
            } else {
                f = ((float) (j2 - j5)) / ((float) (size - j5));
                f3 = 1620.0f;
                f4 = 0.0f;
            }
        }
        c201278vB.A01(((C200688uB) list.get(i)).A03, fArr, j);
        float f6 = ((C200688uB) list.get(i)).A02;
        float f7 = ((C200688uB) list.get(i)).A01;
        AKR.A01(akr, c201278vB);
        C9K4 A00 = AKR.A00(akr, C05F.A0C);
        A00.A02("uAmplitude", f2 + ((f4 - f2) * f));
        A00.A02("uFrequency", f3 + (f * (f5 - f3)));
        GLES20.glUniform2f(C9K4.A00(A00, "uRenderSize"), f6, f7);
        akr.A03(A00, c201278vB);
    }

    public static final void A03(AKR akr, C201278vB c201278vB, List list, float[] fArr, int i, long j) {
        C9K4 A00;
        AnonymousClass810 anonymousClass810;
        String str;
        C14360o3.A0B(akr, 0);
        AbstractC167017dG.A1R(c201278vB, fArr);
        long A0A = AbstractC166987dD.A0A(list.size(), 0.16666667f);
        long size = list.size() - A0A;
        int size2 = (list.size() - 1) - i;
        int A0A2 = AbstractC166987dD.A0A(list.size(), 0.05f);
        int A0A3 = AbstractC166987dD.A0A(list.size(), 0.11666667f);
        int A0A4 = AbstractC166987dD.A0A(list.size(), 0.18333334f);
        ArrayList A1E = AbstractC166987dD.A1E();
        if (i >= A0A2) {
            A1E.add(new Pair(((C200688uB) list.get(i - A0A2)).A03, Float.valueOf(A00(i, (int) A0A, (int) size, A0A2, size2) * 0.25f)));
        }
        if (i >= A0A3) {
            A1E.add(new Pair(((C200688uB) list.get(i - A0A3)).A03, Float.valueOf(A00(i, (int) A0A, (int) size, A0A3, size2) * 0.2f)));
        }
        if (i >= A0A4) {
            A1E.add(new Pair(((C200688uB) list.get(i - A0A4)).A03, Float.valueOf(A00(i, (int) A0A, (int) size, A0A4, size2) * 0.15f)));
        }
        c201278vB.A01(((C200688uB) list.get(i)).A03, fArr, j);
        AKR.A01(akr, c201278vB);
        if (A1E.isEmpty()) {
            A00 = AKR.A00(akr, C05F.A00);
        } else {
            A00 = AKR.A00(akr, C05F.A01);
            for (int i2 = 0; i2 < A1E.size(); i2++) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            A00.A02("uThirdFrameOpacity", AbstractC166987dD.A09(((Pair) A1E.get(i2)).second));
                            anonymousClass810 = (AnonymousClass810) ((Pair) A1E.get(i2)).first;
                            str = "sThirdFrameTexture";
                        }
                    } else {
                        A00.A02("uSecondFrameOpacity", AbstractC166987dD.A09(((Pair) A1E.get(i2)).second));
                        anonymousClass810 = (AnonymousClass810) ((Pair) A1E.get(i2)).first;
                        str = "sSecondFrameTexture";
                    }
                } else {
                    A00.A02("uFirstFrameOpacity", AbstractC166987dD.A09(((Pair) A1E.get(i2)).second));
                    anonymousClass810 = (AnonymousClass810) ((Pair) A1E.get(i2)).first;
                    str = "sFirstFrameTexture";
                }
                A00.A03(str, anonymousClass810);
            }
        }
        akr.A03(A00, c201278vB);
    }

    public static final float A00(int i, int i2, int i3, int i4, int i5) {
        double pow;
        if (i <= i2) {
            pow = Math.sqrt((i - i4) / (i2 - i4));
        } else {
            if (i < i3) {
                return 1.0f;
            }
            pow = Math.pow(i5 / i2, 2.0d);
        }
        return (float) pow;
    }
}
