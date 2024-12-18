package X;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.SbN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63044SbN {
    public static int A00(C63361SiK c63361SiK, InputStream inputStream, List list) {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new C61005RdY(c63361SiK, inputStream);
            }
            inputStream.mark(5242880);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    int BZf = ((InterfaceC65557Tmd) list.get(i)).BZf(c63361SiK, inputStream);
                    if (BZf != -1) {
                        return BZf;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType A01(C63361SiK c63361SiK, InputStream inputStream, List list) {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new C61005RdY(c63361SiK, inputStream);
            }
            inputStream.mark(5242880);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    ImageHeaderParser$ImageType CBI = ((InterfaceC65557Tmd) list.get(i)).CBI(inputStream);
                    inputStream.reset();
                    if (CBI != ImageHeaderParser$ImageType.UNKNOWN) {
                        return CBI;
                    }
                } catch (Throwable th) {
                    inputStream.reset();
                    throw th;
                }
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType A02(ByteBuffer byteBuffer, List list) {
        if (byteBuffer != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    ImageHeaderParser$ImageType CBJ = ((InterfaceC65557Tmd) list.get(i)).CBJ(byteBuffer);
                    byteBuffer.position(0);
                    if (CBJ != ImageHeaderParser$ImageType.UNKNOWN) {
                        return CBJ;
                    }
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
