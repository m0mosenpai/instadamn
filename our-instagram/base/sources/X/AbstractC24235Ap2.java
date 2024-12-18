package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.util.ArrayList;

/* renamed from: X.Ap2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC24235Ap2 implements AutoCloseable {
    public static int A00(MediaExtractor mediaExtractor) {
        C17u A0C = C17s.A0C(0, mediaExtractor.getTrackCount());
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0C) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(AbstractC166987dD.A0H(obj));
            C14360o3.A07(trackFormat);
            String string = trackFormat.getString("mime");
            if (string != null && AbstractC002300n.A0h(string, "audio/", false)) {
                A1E.add(obj);
            }
        }
        return A1E.size();
    }
}
