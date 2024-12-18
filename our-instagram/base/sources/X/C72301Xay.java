package X;

import java.nio.ByteBuffer;

/* renamed from: X.Xay, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72301Xay extends C72867Xpa {
    public final ByteBuffer A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72301Xay(XO3 xo3, byte[] bArr) {
        super(xo3, 4);
        C14360o3.A0B(bArr, 2);
        C14360o3.A0A(xo3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16);
        allocateDirect.put(bArr);
        C14360o3.A0B(xo3, 1);
        this.A00 = allocateDirect;
    }
}
