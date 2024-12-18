package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import java.util.LinkedList;

/* renamed from: X.W1x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70080W1x {
    public static final int A02;
    public final LinkedList A01 = new LinkedList();
    public final LinkedList A00 = new LinkedList();

    static {
        int i;
        try {
            MediaCodec A01 = C0fT.A01("audio/mp4a-latm", 656189169);
            MediaCodecInfo codecInfo = A01.getCodecInfo();
            C0fT.A03(A01, -1309177863);
            i = codecInfo.getCapabilitiesForType("audio/mp4a-latm").getMaxSupportedInstances();
        } catch (Exception unused) {
            i = 1;
        }
        A02 = i;
    }
}
