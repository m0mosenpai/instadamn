package X;

import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;

/* renamed from: X.Vvr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69805Vvr {
    public static int A00(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return -1;
    }

    public static C70130W5r A01(MediaFormat mediaFormat) {
        byte[] bArr;
        C70116W4o c70116W4o = new C70116W4o();
        c70116W4o.A00(mediaFormat.getString("mime"));
        c70116W4o.A0V = mediaFormat.getString("language");
        c70116W4o.A0D = A00(mediaFormat, "max-bitrate");
        c70116W4o.A03 = A00(mediaFormat, TraceFieldType.Bitrate);
        c70116W4o.A0R = mediaFormat.getString("codecs-string");
        float f = -1.0f;
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                f = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                f = mediaFormat.getInteger("frame-rate");
            }
        }
        c70116W4o.A00 = f;
        c70116W4o.A0L = A00(mediaFormat, IgReactMediaPickerNativeModule.WIDTH);
        c70116W4o.A09 = A00(mediaFormat, IgReactMediaPickerNativeModule.HEIGHT);
        float f2 = 1.0f;
        if (mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            f2 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        c70116W4o.A01 = f2;
        c70116W4o.A0A = A00(mediaFormat, "max-input-size");
        int i = 0;
        int i2 = 0;
        if (mediaFormat.containsKey("rotation-degrees")) {
            i2 = mediaFormat.getInteger("rotation-degrees");
        }
        c70116W4o.A0F = i2;
        C70171WEr c70171WEr = null;
        int A00 = A00(mediaFormat, "color-standard");
        int A002 = A00(mediaFormat, "color-range");
        int A003 = A00(mediaFormat, "color-transfer");
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
        } else {
            bArr = null;
        }
        if (A00 != -1 || A002 != -1 || A003 != -1 || bArr != null) {
            c70171WEr = new C70171WEr(bArr, A00, A002, A003, -1, -1);
        }
        c70116W4o.A0N = c70171WEr;
        c70116W4o.A0G = A00(mediaFormat, "sample-rate");
        c70116W4o.A04 = A00(mediaFormat, "channel-count");
        c70116W4o.A0C = A00(mediaFormat, "pcm-encoding");
        ImmutableList.Builder builder = new ImmutableList.Builder();
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer(AnonymousClass001.A0O("csd-", i));
            if (byteBuffer2 == null) {
                c70116W4o.A0X = builder.build();
                return new C70130W5r(c70116W4o);
            }
            byte[] bArr2 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr2);
            byteBuffer2.rewind();
            builder.add((Object) bArr2);
            i++;
        }
    }
}
