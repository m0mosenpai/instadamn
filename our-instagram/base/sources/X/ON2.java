package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public abstract class ON2 {
    public static final Map A01(Context context, MediaComposition mediaComposition, boolean z) {
        Number number;
        if (mediaComposition != null && (number = (Number) AbstractC001800i.A0A(A00(mediaComposition, z))) != null) {
            C1125956n A04 = mediaComposition.A04(EnumC1125356h.AUDIO, number.intValue());
            if (A04 != null) {
                long A01 = AbstractC66047Tyk.A01(new C55772Opg(context, VYI.A00), A04);
                if (Long.valueOf(A01) != null) {
                    C06860Yd c06860Yd = new C06860Yd(1);
                    c06860Yd.put("video_duration", String.valueOf(TimeUnit.MICROSECONDS.toMillis(A01)));
                    return AbstractC16850sd.A0N(c06860Yd);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return null;
    }

    public static final HashSet A00(MediaComposition mediaComposition, boolean z) {
        int A02;
        HashSet A1H = AbstractC166987dD.A1H();
        if (z && (A02 = mediaComposition.A02(EnumC1125356h.AUDIO, "video_audio_0")) != -1) {
            AbstractC166997dE.A1W(A1H, A02);
        }
        return A1H;
    }
}
