package com.facebook.cameracore.musiceffect;

import X.C09170dP;
import X.C224109uu;
import X.C224119uv;
import X.C224129uw;
import X.C224999wO;
import android.os.Build;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class AudioServiceConfigurationAnnouncer {
    public static final C224999wO Companion = new Object();
    public HybridData mHybridData;

    private final native boolean announce(String str, String str2, String str3, String str4, long j, long j2, String str5);

    public static final native HybridData initHybrid();

    public final native float audioClipProgress();

    public final native boolean pause();

    public final native boolean resume();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9wO, java.lang.Object] */
    static {
        C09170dP.A0C("musiceffect-native");
    }

    public final boolean announce(C224129uw c224129uw) {
        C224119uv c224119uv = c224129uw.A01;
        C224109uu c224109uu = c224129uw.A00;
        return announce(null, c224119uv.A00, null, c224119uv.A01, c224109uu.A00, 0L, c224109uu.A01);
    }

    public AudioServiceConfigurationAnnouncer() {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            this.mHybridData = initHybrid();
        }
    }
}
