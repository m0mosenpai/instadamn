package X;

import java.nio.ByteBuffer;

/* renamed from: X.68h, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68h extends C68i implements C68Y {
    public float A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        float f = -1.0f;
        int A00 = AbstractC1348468a.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            f = byteBuffer.getFloat(A00);
        }
        this.A00 = f;
        float[] A05 = AbstractC1348468a.A05(byteBuffer, i, 1);
        if (A05 != null) {
            ((C68i) this).A00 = A05;
            float[] A052 = AbstractC1348468a.A05(byteBuffer, i, 2);
            if (A052 != null) {
                ((C68f) this).A00 = A052;
                AnonymousClass690[] anonymousClass690Arr = (AnonymousClass690[]) AbstractC1348468a.A06(C1350068z.class, byteBuffer, i, 3);
                if (anonymousClass690Arr != null) {
                    this.A01 = anonymousClass690Arr;
                }
            }
        }
    }
}
