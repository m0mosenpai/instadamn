package X;

import com.instagram.api.schemas.MediaPromptPrefType;

/* renamed from: X.8be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC190208be {
    public static final MediaPromptPrefType A00(MediaPromptPrefType mediaPromptPrefType) {
        C14360o3.A0B(mediaPromptPrefType, 0);
        int ordinal = mediaPromptPrefType.ordinal();
        if (ordinal != 3) {
            if (ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal == 0) {
                        return MediaPromptPrefType.A07;
                    }
                    throw new RuntimeException();
                }
                return MediaPromptPrefType.A04;
            }
            return MediaPromptPrefType.A06;
        }
        return MediaPromptPrefType.A05;
    }

    public static final String A01(String str) {
        if (str == null) {
            return "UNKNOWN";
        }
        if (str.equals("")) {
            return "ADD_YOURS";
        }
        return str.equals("clips_creator_invite") ? "CREATOR_INVITE" : "UNKNOWN";
    }
}
