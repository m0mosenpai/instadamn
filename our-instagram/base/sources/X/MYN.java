package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.instagram.common.session.UserSession;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class MYN {
    public MediaFormat A00;
    public ByteBuffer[] A01;
    public ByteBuffer[] A02;
    public final MediaCodec A03;
    public final UserSession A04;
    public final boolean A05;

    public static void A00(Throwable th) {
        if (!(th instanceof IllegalStateException)) {
            if (th instanceof IllegalArgumentException) {
                throw new IllegalArgumentException(th.getMessage(), th);
            }
            throw th;
        }
        throw new IllegalStateException(th.getMessage(), th);
    }

    public MYN(MediaCodec mediaCodec, UserSession userSession, boolean z) {
        this.A04 = userSession;
        this.A03 = mediaCodec;
        this.A05 = z;
    }
}
