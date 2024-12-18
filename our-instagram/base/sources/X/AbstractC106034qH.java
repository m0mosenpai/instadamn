package X;

import com.instagram.api.schemas.AudioMetadataLabels;

/* renamed from: X.4qH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106034qH {
    public static final AudioMetadataLabels A00(String str) {
        AudioMetadataLabels audioMetadataLabels = (AudioMetadataLabels) AudioMetadataLabels.A01.get(str);
        if (audioMetadataLabels == null) {
            return AudioMetadataLabels.A07;
        }
        return audioMetadataLabels;
    }
}
