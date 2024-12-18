package X;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class AG3 {
    public int A00;
    public ByteBuffer A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.AG3] */
    public static AG3 A00(byte[] bArr, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.position(0);
        ?? obj = new Object();
        obj.A00 = i;
        obj.A01 = allocateDirect;
        return obj;
    }

    public AG3(Class cls, ByteBuffer byteBuffer) {
        this.A00 = cls.hashCode();
        this.A01 = byteBuffer;
    }
}
