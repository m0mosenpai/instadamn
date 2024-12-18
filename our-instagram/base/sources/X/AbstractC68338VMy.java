package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.util.ArrayList;

/* renamed from: X.VMy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68338VMy {
    public static ArrayList A00(MediaExtractor mediaExtractor) {
        ArrayList arrayList = new ArrayList();
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            if (trackFormat.getString("mime").startsWith("video/")) {
                arrayList.add(new C68922VeM(trackFormat, i));
            }
        }
        return arrayList;
    }
}
