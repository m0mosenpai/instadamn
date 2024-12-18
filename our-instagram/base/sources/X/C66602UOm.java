package X;

import java.nio.ByteBuffer;

/* renamed from: X.UOm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66602UOm extends AbstractC1348968m implements X98 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.68y] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.68w, java.lang.Object] */
    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A01 = WGe.A01(byteBuffer, i, 0);
        if (A01 != 0) {
            b = byteBuffer.get(A01);
        }
        this.A00 = b;
        this.A07 = (C3LS) WGe.A03(C66606UOq.class, byteBuffer, i, 1);
        this.A05 = (AbstractC1348868e) WGe.A02(C66594UOe.class, byteBuffer, i, 2);
        this.A06 = (C3LS) WGe.A03(C66606UOq.class, byteBuffer, i, 3);
        this.A04 = (AbstractC1348868e) WGe.A02(C66594UOe.class, byteBuffer, i, 4);
        C56502ij[] c56502ijArr = (C56502ij[]) WGe.A0A(C66599UOj.class, byteBuffer, i, 5, 4);
        if (c56502ijArr != null) {
            ?? obj = new Object();
            obj.A01 = c56502ijArr;
            obj.A00 = c56502ijArr.length;
            this.A01 = obj;
        }
        this.A02 = (AbstractC1348868e) WGe.A02(C66592UOc.class, byteBuffer, i, 6);
        float[] A07 = WGe.A07(byteBuffer, i, 7);
        if (A07 != null) {
            ?? obj2 = new Object();
            obj2.A01 = A07;
            obj2.A00 = A07.length;
            this.A08 = obj2;
        }
        this.A03 = (AbstractC1348868e) WGe.A02(C66595UOf.class, byteBuffer, i, 8);
    }
}
