package X;

import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.0me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13520me extends AbstractC20550zX {
    public AbstractC20580zb A00;

    public C13520me() {
        super(new C14800ou());
        try {
            this.A00 = new C14050nV();
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = new C14340ny();
        }
    }

    @Override // X.AbstractC20550zX
    public final void A01(long j, long j2) {
        super.A01(j, j2);
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(j);
        allocate.putLong(j2);
        AbstractC20580zb abstractC20580zb = this.A00;
        byte[] array = allocate.array();
        abstractC20580zb.A00(array, 0, array.length);
    }
}
