package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import org.webrtc.HardwareVideoEncoder;

/* loaded from: classes9.dex */
public final class OU2 {
    public EnumC53209Ng7 A00;
    public EnumC53218NgG A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public static final MediaCodec A00(OU2 ou2, EnumC53209Ng7 enumC53209Ng7, EnumC53218NgG enumC53218NgG, float f, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        EnumC53218NgG enumC53218NgG2;
        OU2 ou22;
        EnumC53209Ng7 enumC53209Ng72;
        try {
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
            C14360o3.A07(createVideoFormat);
            float f2 = i4;
            AbstractC50522MSa.A0w(createVideoFormat, i3, i4);
            createVideoFormat.setFloat("i-frame-interval", f);
            createVideoFormat.setInteger("channel-count", 1);
            int ordinal = enumC53218NgG.ordinal();
            int i7 = 2;
            if (ordinal != 1 && ordinal != 2) {
                if (ordinal != 3) {
                    i7 = 1;
                }
            } else {
                i7 = 8;
            }
            createVideoFormat.setInteger("profile", i7);
            int i8 = 256;
            if (ordinal == 2) {
                i8 = 512;
            }
            createVideoFormat.setInteger("level", i8);
            createVideoFormat.setFloat("max-fps-to-encoder", f2);
            if (z2) {
                createVideoFormat.setInteger("latency", i5);
                createVideoFormat.setInteger("priority", i6);
            }
            if (z) {
                createVideoFormat.setInteger("color-transfer", 3);
                createVideoFormat.setInteger("color-standard", 1);
            }
            if (enumC53209Ng7 != EnumC53209Ng7.A05) {
                int ordinal2 = enumC53209Ng7.ordinal();
                int i9 = 2;
                if (ordinal2 != 1) {
                    i9 = 0;
                    if (ordinal2 != 2) {
                        i9 = -1;
                    }
                }
                createVideoFormat.setInteger(HardwareVideoEncoder.KEY_BITRATE_MODE, i9);
            }
            C55219Oei.A05("mss:VideoEncoderSetup", "Trying to get video encoder for profile: %s, bitrate mode: %s, format: %s", enumC53218NgG.name(), enumC53209Ng7.name(), createVideoFormat.toString());
            try {
                String string = createVideoFormat.getString("mime");
                if (string != null) {
                    MediaCodec A02 = C0fT.A02(string, 1554375336);
                    C0fT.A07(A02, null, createVideoFormat, null, 1, -383515467);
                    return A02;
                }
                throw AbstractC166997dE.A0g();
            } catch (IOException e) {
                throw new RuntimeException("MediaCodec creation failed", e);
            }
        } catch (Exception e2) {
            if (enumC53218NgG == EnumC53218NgG.A05) {
                C55219Oei.A02("mss:VideoEncoderSetup", "Error getting videoencoder for profile: %s, bitrate mode: %s. Trying default high profile mode", e2, "HIGH31", enumC53209Ng7.name());
                ou2.A04 = true;
                EnumC53218NgG enumC53218NgG3 = EnumC53218NgG.A04;
                ou2.A01 = enumC53218NgG3;
                return A00(ou2, enumC53209Ng7, enumC53218NgG3, f, i, i2, i3, i4, i5, i6, z, z2);
            }
            EnumC53209Ng7 enumC53209Ng73 = EnumC53209Ng7.A05;
            if (enumC53209Ng7 != enumC53209Ng73) {
                C55219Oei.A02("mss:VideoEncoderSetup", "Error getting videoencoder for profile: %s, bitrate mode: %s. Trying default mode", e2, enumC53218NgG.name(), enumC53209Ng7.name());
                ou2.A03 = true;
                ou2.A00 = enumC53209Ng73;
                ou22 = ou2;
                enumC53209Ng72 = enumC53209Ng73;
                enumC53218NgG2 = enumC53218NgG;
            } else {
                enumC53218NgG2 = EnumC53218NgG.A03;
                if (enumC53218NgG != enumC53218NgG2) {
                    C55219Oei.A02("mss:VideoEncoderSetup", "Error getting videoencoder for profile: %s, bitrate mode: %s. Trying baseline", e2, enumC53218NgG.name(), "DEFAULT");
                    ou2.A02 = true;
                    ou2.A01 = enumC53218NgG2;
                    ou22 = ou2;
                    enumC53209Ng72 = enumC53209Ng73;
                } else {
                    throw new RuntimeException("MediaCodec creation failed", e2);
                }
            }
            return A00(ou22, enumC53209Ng72, enumC53218NgG2, f, i, i2, i3, i4, i5, i6, z, z2);
        }
    }
}
