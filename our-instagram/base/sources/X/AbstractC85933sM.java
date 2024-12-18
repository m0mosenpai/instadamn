package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;

/* renamed from: X.3sM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85933sM {
    public static final MediaGenAIDetectionMethod A00(String str) {
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = (MediaGenAIDetectionMethod) MediaGenAIDetectionMethod.A01.get(str);
        if (mediaGenAIDetectionMethod == null) {
            return MediaGenAIDetectionMethod.A0D;
        }
        return mediaGenAIDetectionMethod;
    }
}
