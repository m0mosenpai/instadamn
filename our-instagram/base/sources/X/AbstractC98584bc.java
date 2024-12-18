package X;

import android.media.MediaFormat;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.4bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC98584bc {
    public static void A02(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AnonymousClass001.A0O("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static ColorInfo A00(MediaFormat mediaFormat) {
        byte[] bArr;
        if (Util.A00 < 29) {
            return null;
        }
        int integer = mediaFormat.getInteger("color-standard", -1);
        int integer2 = mediaFormat.getInteger("color-range", -1);
        int integer3 = mediaFormat.getInteger("color-transfer", -1);
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
        if (byteBuffer != null) {
            bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
        } else {
            bArr = null;
        }
        if (integer != 2 && integer != 1 && integer != 6 && integer != -1) {
            integer = -1;
        }
        if (integer2 != 2 && integer2 != 1 && integer2 != -1) {
            integer2 = -1;
        }
        if (integer3 != 3 && integer3 != 6 && integer3 != 7 && integer3 != -1) {
            integer3 = -1;
        }
        if (integer == -1 && integer2 == -1 && integer3 == -1 && bArr == null) {
            return null;
        }
        return new ColorInfo(integer, integer2, integer3, bArr);
    }

    public static void A01(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            int i = colorInfo.A03;
            if (i != -1) {
                mediaFormat.setInteger("color-transfer", i);
            }
            int i2 = colorInfo.A02;
            if (i2 != -1) {
                mediaFormat.setInteger("color-standard", i2);
            }
            int i3 = colorInfo.A01;
            if (i3 != -1) {
                mediaFormat.setInteger("color-range", i3);
            }
            byte[] bArr = colorInfo.A04;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }
}
