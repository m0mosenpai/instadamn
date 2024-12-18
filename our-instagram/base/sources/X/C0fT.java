package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: X.0fT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fT {
    public static MediaCodec A00(String str, int i) {
        if (!C0IL.A02()) {
            return MediaCodec.createByCodecName(str);
        }
        try {
            C0IL.A00(new C04210Kn(i, str));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            C0IL.A00(new C04170Kj(createByCodecName, str, i));
            return createByCodecName;
        } catch (Exception e) {
            C0IL.A00(new C04220Ko(e, i));
            throw e;
        }
    }

    public static MediaCodec A01(String str, int i) {
        if (!C0IL.A02()) {
            return MediaCodec.createDecoderByType(str);
        }
        try {
            C0IL.A00(new C0KT(i, str));
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(str);
            C0IL.A00(new C0KQ(i, createDecoderByType.hashCode(), str));
            return createDecoderByType;
        } catch (Exception e) {
            C0IL.A00(new C0KY(e, i));
            throw e;
        }
    }

    public static MediaCodec A02(String str, int i) {
        if (!C0IL.A02()) {
            return MediaCodec.createEncoderByType(str);
        }
        try {
            C0IL.A00(new C0KO(i, str));
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(str);
            C0IL.A00(new C0KN(createEncoderByType, str, i));
            return createEncoderByType;
        } catch (Exception e) {
            C0IL.A00(new C0KP(e, i));
            throw e;
        }
    }

    public static void A03(MediaCodec mediaCodec, int i) {
        if (!C0IL.A02()) {
            mediaCodec.release();
            return;
        }
        try {
            C0IL.A00(new C0IG(i, Integer.valueOf(mediaCodec.hashCode())));
            mediaCodec.release();
            C0IL.A00(new C0IG(i, Integer.valueOf(mediaCodec.hashCode())));
        } catch (Exception e) {
            C0IL.A00(new C0KM(e, i, mediaCodec.hashCode()));
            throw e;
        }
    }

    public static void A04(MediaCodec mediaCodec, int i) {
        if (!C0IL.A02()) {
            mediaCodec.reset();
            return;
        }
        try {
            C0IL.A00(new C0IG(i, Integer.valueOf(mediaCodec.hashCode())));
            mediaCodec.reset();
            C0IL.A00(new C0IG(i, Integer.valueOf(mediaCodec.hashCode())));
        } catch (Exception e) {
            C0IL.A00(new C03890Je(e, i, mediaCodec.hashCode()));
            throw e;
        }
    }

    public static void A05(MediaCodec mediaCodec, int i) {
        if (!C0IL.A02()) {
            mediaCodec.start();
            return;
        }
        try {
            C0IL.A00(new C0IG(i, Integer.valueOf(mediaCodec.hashCode())));
            mediaCodec.start();
            C0IL.A00(new C0IG(i, Integer.valueOf(mediaCodec.hashCode())));
        } catch (Exception e) {
            C0IL.A00(new C0JH(e, i, mediaCodec.hashCode()));
            throw e;
        }
    }

    public static void A06(MediaCodec mediaCodec, int i) {
        if (!C0IL.A02()) {
            mediaCodec.stop();
            return;
        }
        try {
            C0IL.A00(new C0IG(i, Integer.valueOf(mediaCodec.hashCode())));
            mediaCodec.stop();
            C0IL.A00(new C0IG(i, Integer.valueOf(mediaCodec.hashCode())));
        } catch (Exception e) {
            C0IL.A00(new C03750Iq(e, i, mediaCodec.hashCode()));
            throw e;
        }
    }

    public static void A07(final MediaCodec mediaCodec, final MediaCrypto mediaCrypto, final MediaFormat mediaFormat, final Surface surface, int i, final int i2) {
        if (!C0IL.A02()) {
            mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
            return;
        }
        try {
            C0IL.A00(new C0LF(mediaCodec, mediaCrypto, mediaFormat, surface, i2, i));
            mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
            C0IL.A00(new C0IG(mediaCodec, mediaCrypto, mediaFormat, surface, i2) { // from class: X.0L7
                public final MediaCrypto A00;
                public final MediaFormat A01;
                public final Surface A02;

                {
                    super(i2, Integer.valueOf(mediaCodec.hashCode()));
                    this.A01 = mediaFormat;
                    this.A02 = surface;
                    this.A00 = mediaCrypto;
                }
            });
        } catch (Exception e) {
            C0IL.A00(new C0LQ(mediaCodec, mediaCrypto, mediaFormat, surface, e, i2));
            throw e;
        }
    }
}
