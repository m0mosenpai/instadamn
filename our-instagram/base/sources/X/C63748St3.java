package X;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.facebook.common.dextricks.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.St3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63748St3 implements InterfaceC65470Tkn {
    public final InterfaceC65470Tkn A00;
    public final C63361SiK A01;
    public final List A02;

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        try {
            byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray != null) {
                return this.A00.ANo(c63729Ssj, ByteBuffer.wrap(byteArray), i, i2);
            }
            return null;
        } catch (IOException e) {
            if (android.util.Log.isLoggable("StreamGifDecoder", 5)) {
                android.util.Log.w("StreamGifDecoder", "Error reading data from stream", e);
                return null;
            }
            return null;
        }
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        InputStream inputStream = (InputStream) obj;
        if (!AbstractC166987dD.A1a(c63729Ssj.A00(S8S.A01))) {
            if (AbstractC63044SbN.A01(this.A01, inputStream, this.A02) == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    public C63748St3(InterfaceC65470Tkn interfaceC65470Tkn, C63361SiK c63361SiK, List list) {
        this.A02 = list;
        this.A00 = interfaceC65470Tkn;
        this.A01 = c63361SiK;
    }
}
