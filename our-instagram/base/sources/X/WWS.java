package X;

import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class WWS implements X98 {
    public static final Integer A01 = C05F.A0N;
    public Integer A00 = A01;

    @Override // X.X98
    public final void ANn(ByteBuffer byteBuffer, int i) {
        C14360o3.A0B(byteBuffer, 0);
        Integer num = C05F.A00(10)[byteBuffer.get(i)];
        C14360o3.A0B(num, 0);
        this.A00 = num;
    }
}
