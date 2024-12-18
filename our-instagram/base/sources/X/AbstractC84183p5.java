package X;

import com.instagram.api.schemas.MusicMuteAudioReason;

/* renamed from: X.3p5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84183p5 {
    public static final MusicMuteAudioReason A00(String str) {
        MusicMuteAudioReason musicMuteAudioReason = (MusicMuteAudioReason) MusicMuteAudioReason.A01.get(str);
        if (musicMuteAudioReason == null) {
            return MusicMuteAudioReason.A09;
        }
        return musicMuteAudioReason;
    }
}
