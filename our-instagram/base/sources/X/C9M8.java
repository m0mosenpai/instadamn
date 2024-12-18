package X;

import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.9M8, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9M8 {
    public static final boolean A00(AbstractC193598he abstractC193598he) {
        if (abstractC193598he.A00 != 3 || ((AudioOverlayTrack) abstractC193598he.A00()).A06 != null) {
            return true;
        }
        AbstractC12120kG.A05("ClipsAudioStore", "Audio overlay track resource set to success without downloaded track", null);
        return false;
    }
}
