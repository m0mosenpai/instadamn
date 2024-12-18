package X;

import java.nio.ByteBuffer;

/* renamed from: X.68v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1349668v extends C1349768w implements C68Y {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        C56502ij[] c56502ijArr = (C56502ij[]) AbstractC1348468a.A06(C68o.class, byteBuffer, i, 0);
        if (c56502ijArr != null) {
            this.A01 = c56502ijArr;
            this.A00 = c56502ijArr.length;
            return;
        }
        throw new IllegalArgumentException("colors cannot be null");
    }
}
