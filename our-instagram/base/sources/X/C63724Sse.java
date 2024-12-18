package X;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.Sse, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63724Sse implements InterfaceC65557Tmd {
    @Override // X.InterfaceC65557Tmd
    public final int BZf(C63361SiK c63361SiK, InputStream inputStream) {
        int A0M = new C60782q2(inputStream).A0M("Orientation", 1);
        if (A0M == 0) {
            return -1;
        }
        return A0M;
    }

    @Override // X.InterfaceC65557Tmd
    public final int BZg(C63361SiK c63361SiK, ByteBuffer byteBuffer) {
        return BZf(c63361SiK, new C61041ReD(byteBuffer));
    }

    @Override // X.InterfaceC65557Tmd
    public final ImageHeaderParser$ImageType CBI(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // X.InterfaceC65557Tmd
    public final ImageHeaderParser$ImageType CBJ(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
