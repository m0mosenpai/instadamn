package X;

import java.nio.ByteBuffer;

/* renamed from: X.68z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1350068z extends AnonymousClass690 implements C68Y {
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A00 = AbstractC1348468a.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            b = byteBuffer.get(A00);
        }
        this.A00 = b;
        this.A01 = (C3LS) AbstractC1348468a.A01(C68g.class, byteBuffer, i, 1);
        this.A02 = (C3LS) AbstractC1348468a.A01(C68g.class, byteBuffer, i, 2);
    }
}
