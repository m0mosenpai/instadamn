package X;

import com.instagram.api.schemas.MediaPromptPrefType;

/* renamed from: X.Hpu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40068Hpu {
    public static final MediaPromptPrefType A00(String str) {
        MediaPromptPrefType mediaPromptPrefType = (MediaPromptPrefType) MediaPromptPrefType.A01.get(str);
        if (mediaPromptPrefType == null) {
            return MediaPromptPrefType.A07;
        }
        return mediaPromptPrefType;
    }
}
