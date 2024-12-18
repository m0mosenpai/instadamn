package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.mediastreaming.opt.encoder.audio.AndroidPlatformAudioEncoderHybrid;
import com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

/* renamed from: X.OaT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55073OaT {
    public int A00;
    public int A01;
    public int A02;
    public MediaCodec.BufferInfo A03;
    public MediaCodec A04;
    public MediaFormat A05;
    public AudioEncoderConfig A06;
    public C54845OMq A07;
    public InterfaceC58107PpW A08;
    public boolean A09;
    public final AndroidPlatformAudioEncoderHybrid A0B;
    public boolean A0A = true;
    public final InterfaceC09390do A0C = AbstractC09440dt.A01(new C57243PbR(this, 39));

    public C55073OaT(AndroidPlatformAudioEncoderHybrid androidPlatformAudioEncoderHybrid) {
        this.A0B = androidPlatformAudioEncoderHybrid;
    }

    public static final ByteBuffer A00(MediaFormat mediaFormat, C55073OaT c55073OaT) {
        ByteBuffer byteBuffer;
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        if (mediaFormat == null || (byteBuffer = mediaFormat.getByteBuffer("csd-0")) == null) {
            return null;
        }
        if (c55073OaT.A0A) {
            byte[] array = byteBuffer.array();
            if (array != null) {
                bArr = array;
                z = true;
            }
            String str = "";
            if (z) {
                while (true) {
                    int i2 = i;
                    if (!AbstractC167007dF.A1Q(i, bArr.length)) {
                        break;
                    }
                    i++;
                    try {
                        str = AnonymousClass001.A0R(str, AbstractC166997dE.A0z("%02X ", AbstractC166997dE.A1b(Byte.valueOf(Byte.valueOf(bArr[i2]).byteValue()), 1)));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new NoSuchElementException(e.getMessage());
                    }
                }
            }
            C55219Oei.A05("mss:AndroidPlatformAudioEncoderImpl", AnonymousClass001.A0R("AudioEncoderConfig: ASC Hex value:", str), new Object[0]);
            c55073OaT.A0A = false;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
        allocateDirect.put(byteBuffer);
        return allocateDirect;
    }

    public final void A02() {
        C55219Oei.A03("mss:AndroidPlatformAudioEncoderImpl", "AndroidPlatformAudioEncoderImpl.stop", new Object[0]);
        MediaCodec mediaCodec = this.A04;
        if (mediaCodec != null) {
            try {
                C0fT.A06(mediaCodec, 89656251);
                C0fT.A03(mediaCodec, -149246662);
            } catch (Exception unused) {
            }
        }
        this.A04 = null;
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public static final void A01(C55073OaT c55073OaT, ByteBuffer byteBuffer, int i, long j) {
        ByteBuffer byteBuffer2;
        AudioEncoderConfig audioEncoderConfig = c55073OaT.A06;
        if (audioEncoderConfig != null && audioEncoderConfig.useAudioASC) {
            byteBuffer2 = A00(c55073OaT.A05, c55073OaT);
        } else {
            byteBuffer2 = null;
        }
        MediaCodec mediaCodec = c55073OaT.A04;
        if (mediaCodec != null) {
            c55073OaT.A0B.onEncoded(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), j, j, i, mediaCodec.getOutputFormat(), byteBuffer2);
        }
    }
}
