package X;

import android.media.MediaCodecInfo;
import android.os.Build;

/* renamed from: X.XqG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72882XqG {
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0080. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.SharedPreferences r51) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC72882XqG.A00(android.content.SharedPreferences):void");
    }

    public static boolean A01(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isHardwareAccelerated();
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase();
        if (!lowerCase.startsWith("omx.google.") && !lowerCase.startsWith("omx.ffmpeg.")) {
            if ((!lowerCase.startsWith("omx.sec.") || !lowerCase.contains(".sw.")) && !lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") && !lowerCase.startsWith("c2.android.") && !lowerCase.startsWith("c2.google.")) {
                if (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
