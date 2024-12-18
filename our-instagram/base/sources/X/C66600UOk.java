package X;

import java.nio.ByteBuffer;

/* renamed from: X.UOk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66600UOk extends C1349768w implements X98 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        C56502ij[] c56502ijArr = (C56502ij[]) WGe.A0A(C66599UOj.class, byteBuffer, i, 0, 4);
        if (c56502ijArr != null) {
            this.A01 = c56502ijArr;
            this.A00 = c56502ijArr.length;
            return;
        }
        throw new IllegalArgumentException(AbstractC111324zv.A00(4128));
    }
}
