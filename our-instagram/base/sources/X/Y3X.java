package X;

import android.media.MediaCodec;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public final class Y3X {
    public static int A06;
    public static final int[] A07 = {60, 30, 15};
    public final MediaCodec A01;
    public final EnumC185018Iq A02;
    public final UserSession A05;
    public final AtomicInteger A03 = new AtomicInteger(0);
    public final byte[] A04 = new byte[4096];
    public Integer A00 = 0;

    public static void A00(Y3X y3x) {
        boolean A062 = C18U.A06(C06090Tz.A05, y3x.A05, 36316654317539929L);
        MediaCodec mediaCodec = y3x.A01;
        if (A062) {
            if (mediaCodec != null) {
                Y2X.A01(mediaCodec);
                Y2X.A00(mediaCodec);
                return;
            }
            return;
        }
        C0fT.A06(mediaCodec, 1626044916);
        C0fT.A03(mediaCodec, 1011797371);
    }

    public Y3X(MediaCodec mediaCodec, EnumC185018Iq enumC185018Iq, UserSession userSession) {
        this.A01 = mediaCodec;
        this.A02 = enumC185018Iq;
        this.A05 = userSession;
    }
}
