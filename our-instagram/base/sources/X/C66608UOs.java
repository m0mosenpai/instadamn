package X;

import java.nio.ByteBuffer;

/* renamed from: X.UOs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66608UOs extends C68i implements X98 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        float[] A07 = WGe.A07(byteBuffer, i, 0);
        if (A07 != null) {
            ((C68i) this).A00 = A07;
            float[] A072 = WGe.A07(byteBuffer, i, 1);
            if (A072 != null) {
                ((C68f) this).A00 = A072;
                AnonymousClass690[] anonymousClass690Arr = (AnonymousClass690[]) WGe.A09(UOw.class, byteBuffer, i, 2);
                if (anonymousClass690Arr != null) {
                    this.A01 = anonymousClass690Arr;
                    return;
                }
                throw new IllegalArgumentException("tweens cannot be null");
            }
            throw new IllegalArgumentException("keyframes cannot be null");
        }
        throw new IllegalArgumentException("values cannot be null");
    }
}
