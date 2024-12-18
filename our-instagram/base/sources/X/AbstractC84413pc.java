package X;

import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import java.io.IOException;

/* renamed from: X.3pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84413pc {
    public static AudioMutingInfo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            MusicMuteAudioReason musicMuteAudioReason = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("allow_audio_editing".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("mute_audio".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("mute_reason".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    musicMuteAudioReason = AbstractC84183p5.A00(A1P);
                } else if ("mute_reason_str".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("show_muted_audio_toast".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("allow_audio_editing", "AudioMutingInfo");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("mute_reason_str", "AudioMutingInfo");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("show_muted_audio_toast", "AudioMutingInfo");
                } else {
                    return new AudioMutingInfo(musicMuteAudioReason, str, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("mute_audio", "AudioMutingInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, AudioMutingInfo audioMutingInfo) {
        anonymousClass182.A0d();
        anonymousClass182.A0T("allow_audio_editing", audioMutingInfo.A02);
        anonymousClass182.A0T("mute_audio", audioMutingInfo.A03);
        MusicMuteAudioReason musicMuteAudioReason = audioMutingInfo.A00;
        if (musicMuteAudioReason != null) {
            anonymousClass182.A0S("mute_reason", musicMuteAudioReason.A00);
        }
        String str = audioMutingInfo.A01;
        if (str != null) {
            anonymousClass182.A0S("mute_reason_str", str);
        }
        anonymousClass182.A0T("show_muted_audio_toast", audioMutingInfo.A04);
        anonymousClass182.A0a();
    }
}
