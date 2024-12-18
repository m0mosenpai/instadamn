package X;

import android.media.MediaCodecList;
import android.media.MediaFormat;

/* loaded from: classes11.dex */
public final class X4N extends C0YY implements InterfaceC16820sZ {
    public static final X4N A00 = new X4N();

    public X4N() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "video/dolby-vision");
        mediaFormat.setInteger("profile", 256);
        mediaFormat.setInteger("color-transfer", 7);
        mediaFormat.setInteger("color-standard", 6);
        return mediaCodecList.findEncoderForFormat(mediaFormat);
    }
}
