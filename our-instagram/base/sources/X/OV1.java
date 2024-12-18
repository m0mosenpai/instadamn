package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;

/* loaded from: classes9.dex */
public final class OV1 {
    public static final OV1 A00 = new Object();

    public final Float A00(String str) {
        Float f;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                C14360o3.A07(trackFormat);
                String string = trackFormat.getString("mime");
                boolean z = true;
                if (string == null || !AbstractC002300n.A0h(string, "video/", false)) {
                    z = false;
                }
                if (z) {
                    if (trackFormat.containsKey("frame-rate")) {
                        f = Float.valueOf(trackFormat.getInteger("frame-rate"));
                    } else {
                        mediaExtractor.release();
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(str);
                            f = null;
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(25);
                            if (extractMetadata != null) {
                                f = Float.valueOf(Float.parseFloat(extractMetadata));
                            }
                        } finally {
                            mediaMetadataRetriever.release();
                        }
                    }
                    return f;
                }
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }
}
