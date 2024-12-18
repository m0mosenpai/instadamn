package X;

import com.facebook.mobileconfig.MobileConfigFileRepository;
import java.nio.ByteBuffer;

/* renamed from: X.1Ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23091Ao extends AbstractC226118l {
    public ByteBuffer A00 = null;
    public final String A01;

    public final void finalize() {
        MobileConfigFileRepository.releaseBuffer(this.A01);
    }

    @Override // X.AbstractC226118l
    public final ByteBuffer getJavaByteBuffer() {
        ByteBuffer byteBuffer = this.A00;
        if (byteBuffer == null) {
            ByteBuffer javaByteBuffer = MobileConfigFileRepository.getJavaByteBuffer(this.A01);
            this.A00 = javaByteBuffer;
            return javaByteBuffer;
        }
        return byteBuffer;
    }

    public C23091Ao(String str) {
        this.A01 = str;
    }
}
