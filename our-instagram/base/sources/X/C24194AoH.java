package X;

import com.facebook.common.math.matrix.Matrix4;

/* renamed from: X.AoH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24194AoH implements BCH {
    @Override // X.BCH
    public final InterfaceC58163PqS ANQ(C199758sR c199758sR, C199758sR c199758sR2, C210399Se c210399Se, C5NO c5no) {
        C14360o3.A0B(c210399Se, 2);
        UMG umg = new UMG();
        Matrix4 matrix4 = new Matrix4();
        AbstractC23049AEf.A00(c199758sR, c199758sR2, matrix4, c5no);
        float f = 1.0f;
        if (c210399Se.A06) {
            f = -1.0f;
        }
        matrix4.A02(f, -1.0f);
        AbstractC23049AEf.A01(c199758sR, matrix4, c210399Se);
        C206169Az c206169Az = c210399Se.A03;
        boolean z = false;
        float f2 = c206169Az.A01;
        float[] fArr = {c206169Az.A02, c206169Az.A03, c206169Az.A00, f2};
        C69491VoE c69491VoE = umg.A02;
        if (c69491VoE != null) {
            c69491VoE.A07 = fArr[0];
            c69491VoE.A08 = fArr[1];
            c69491VoE.A01 = fArr[2];
            c69491VoE.A02 = f2;
        }
        float intrinsicWidth = c210399Se.getIntrinsicWidth();
        float A06 = AbstractC166987dD.A06(c210399Se);
        C69491VoE c69491VoE2 = umg.A02;
        if (c69491VoE2 != null) {
            c69491VoE2.A06 = intrinsicWidth;
            c69491VoE2.A05 = A06;
            c69491VoE2.A03 = intrinsicWidth / 2.0f;
            c69491VoE2.A04 = A06 / 2.0f;
        }
        EnumC222939sY enumC222939sY = c210399Se.A04;
        boolean A1X = AbstractC167007dF.A1X(enumC222939sY, EnumC222939sY.A05);
        if (enumC222939sY == EnumC222939sY.A08) {
            z = true;
        }
        c69491VoE2.getClass();
        c69491VoE2.A0Q = A1X;
        C69491VoE c69491VoE3 = umg.A02;
        c69491VoE3.getClass();
        c69491VoE3.A0R = z;
        C69491VoE c69491VoE4 = umg.A02;
        c69491VoE4.getClass();
        c69491VoE4.A0S.A04(matrix4);
        return umg;
    }
}
