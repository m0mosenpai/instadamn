package X;

import android.graphics.drawable.Drawable;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;

/* renamed from: X.9zM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226649zM {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C5NL A00(Drawable drawable) {
        C5NL c5nl;
        String str;
        String str2;
        String str3;
        if (drawable instanceof C5RO) {
            String str4 = null;
            C5RO c5ro = (C5RO) drawable;
            if (c5ro != null) {
                Drawable Afg = c5ro.Afg();
                if (Afg != null) {
                    c5nl = A07.A00(Afg);
                } else {
                    c5nl = null;
                }
                C9C2 CBG = c5ro.CBG();
                if (c5nl != null) {
                    String id = c5ro.getId();
                    int Bzk = c5ro.Bzk();
                    int B25 = c5ro.B25();
                    if (CBG != null) {
                        VoiceOption voiceOption = (VoiceOption) CBG.A01;
                        if (voiceOption != null) {
                            str = voiceOption.A02;
                        } else {
                            str = null;
                        }
                        if (voiceOption != null) {
                            str2 = voiceOption.A00;
                        } else {
                            str2 = null;
                        }
                        if (voiceOption != null) {
                            str3 = voiceOption.A01;
                        } else {
                            str3 = null;
                        }
                        str4 = CBG.A02;
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    return new C5QI(c5nl, id, str, str2, str3, str4, Bzk, B25);
                }
            }
            return null;
        }
        return A07.A00(drawable);
    }
}
