package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.ShG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63310ShG {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.Srr, X.QAf] */
    public static QAf A00(SQ2 sq2, THX thx) {
        return new AbstractC63684Srr(AbstractC63085Sc8.A00(sq2, Ss7.A00, thx, 1.0f, false));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Srr, X.QAg] */
    public static C58799QAg A01(SQ2 sq2, THX thx, boolean z) {
        float f;
        if (z) {
            f = AbstractC63359SiH.A00();
        } else {
            f = 1.0f;
        }
        return new AbstractC63684Srr(AbstractC63085Sc8.A00(sq2, Ss8.A00, thx, f, false));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Srr, X.QAh] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.Thn, X.Ss6] */
    public static C58800QAh A02(SQ2 sq2, THX thx, int i) {
        float[] fArr;
        int length;
        float[] fArr2;
        int length2;
        ?? obj = new Object();
        obj.A00 = i;
        ArrayList A00 = AbstractC63085Sc8.A00(sq2, obj, thx, 1.0f, false);
        for (int i2 = 0; i2 < A00.size(); i2++) {
            C63366SiP c63366SiP = (C63366SiP) A00.get(i2);
            SOT sot = (SOT) c63366SiP.A0E;
            SOT sot2 = (SOT) c63366SiP.A08;
            if (sot != null && sot2 != null && (length = (fArr = sot.A00).length) != (length2 = (fArr2 = sot2.A00).length)) {
                int i3 = length + length2;
                float[] fArr3 = new float[i3];
                System.arraycopy(fArr, 0, fArr3, 0, length);
                System.arraycopy(fArr2, 0, fArr3, length, length2);
                Arrays.sort(fArr3);
                float f = Float.NaN;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    float f2 = fArr3[i5];
                    if (f2 != f) {
                        fArr3[i4] = f2;
                        i4++;
                        f = fArr3[i5];
                    }
                }
                float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                c63366SiP = new C63366SiP(sot.A00(copyOfRange), sot2.A00(copyOfRange));
            }
            A00.set(i2, c63366SiP);
        }
        return new AbstractC63684Srr(A00);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Srr, X.QAi] */
    public static C58801QAi A03(SQ2 sq2, THX thx) {
        return new AbstractC63684Srr(AbstractC63085Sc8.A00(sq2, Ss9.A00, thx, 1.0f, false));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Srr, X.QAj] */
    public static C58802QAj A04(SQ2 sq2, THX thx) {
        return new AbstractC63684Srr(AbstractC63085Sc8.A00(sq2, C63697SsB.A00, thx, AbstractC63359SiH.A00(), true));
    }
}
