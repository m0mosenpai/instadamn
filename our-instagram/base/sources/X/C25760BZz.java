package X;

import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.BZz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25760BZz extends C62Y {
    public final int A00;
    public final Object A01;

    public C25760BZz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C62Y
    public final Shader A01(long j) {
        long A02;
        long A022;
        if (this.A00 != 0) {
            long j2 = C1132359l.A09;
            C1132359l A0S = AbstractC25225BEi.A0S(j2);
            C1132359l A0S2 = AbstractC25225BEi.A0S(j2);
            A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j2 & 63)], C1132359l.A03(j2), C1132359l.A02(j2), C1132359l.A01(j2), 0.5f);
            C1132359l A0S3 = AbstractC25225BEi.A0S(A02);
            A022 = C5AC.A02(AbstractC1132459m.A0K[(int) (j2 & 63)], C1132359l.A03(j2), C1132359l.A02(j2), C1132359l.A01(j2), 0.08f);
            List A1Q = AbstractC16960so.A1Q(A0S, A0S2, A0S3, AbstractC25225BEi.A0S(A022));
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
            long A00 = AbstractC119395aw.A00(((PointF) ((C25547BRj) interfaceC74953Yl.getValue()).A01).x * C5YC.A02(j), ((PointF) ((C25547BRj) interfaceC74953Yl.getValue()).A01).y * C5YC.A00(j));
            float A023 = ((C25547BRj) interfaceC74953Yl.getValue()).A00 * C5YC.A02(j);
            AbstractC25292BHl.A01(A1Q, null);
            return new RadialGradient(C119365at.A01(A00), C119365at.A02(A00), A023, AbstractC25292BHl.A02(A1Q), (float[]) null, AbstractC25293BHm.A00(0));
        }
        return (Shader) this.A01;
    }
}
