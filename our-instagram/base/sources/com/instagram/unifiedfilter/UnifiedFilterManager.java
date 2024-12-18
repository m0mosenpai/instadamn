package com.instagram.unifiedfilter;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.C06090Tz;
import X.C09170dP;
import X.C18U;
import X.C54242NyN;
import android.content.res.AssetManager;
import android.os.Looper;
import android.view.Surface;
import com.facebook.jni.HybridData;
import com.instagram.common.session.UserSession;
import java.util.UUID;

/* loaded from: classes9.dex */
public final class UnifiedFilterManager {
    public static final C54242NyN Companion = new Object();
    public final int id = UUID.randomUUID().hashCode();
    public final HybridData mHybridData = initHybrid();

    private final native void addOverlay(int i, int i2, String str, boolean z, float[] fArr, int i3);

    private final native void cleanup(int i);

    private final native String[] getAllFilterIds(int i);

    private final native int getInputTextureId(int i);

    private final native void init(int i, AssetManager assetManager, Surface surface, boolean z);

    public static final native HybridData initHybrid();

    private final native void initVideoInput(int i, int i2, int i3, boolean z);

    private final native void present(int i);

    private final native void render(int i, boolean z);

    private final native void renderAt(int i, long j, boolean z);

    private final native void setBoolParameter(int i, int i2, String str, boolean z);

    private final native void setFilter(int i, int i2, String str);

    private final native void setFilterEnabled(int i, int i2, boolean z);

    private final native void setFilterOutputSize(int i, int i2, int i3, int i4);

    private final native void setFiltersEnabled(int i, int[] iArr, int i2);

    private final native void setInputImage(int i, String str, int i2);

    private final native boolean setInputTexture(int i, int i2, int i3, int i4, int i5);

    private final native void setIntParameter(int i, int i2, String str, int i3);

    private final native void setIntVectorParameter(int i, int i2, String str, int[] iArr);

    private final native void setIsOnscreenRender(int i, boolean z);

    private final native void setOutput(int i, int i2, int i3, int i4, int i5);

    private final native void setOverlayImage(int i, int i2, String str, int i3);

    private final native void setParameter(int i, int i2, String str, float[] fArr, int i3);

    private final native void setSplitScreenLeftFilter(int i, int i2, String str);

    private final native void setSplitScreenRightFilter(int i, int i2, String str);

    private final native void setStringParameter(int i, int i2, String str, String str2);

    private final native void setSurface(int i, Surface surface);

    public final void addOverlay(int i, String str, boolean z, float[] fArr, int i2) {
        AbstractC167017dG.A1Q(str, fArr);
        addOverlay(this.id, i, str, false, fArr, 12);
    }

    public final void render(boolean z) {
        render(this.id, true);
    }

    public final boolean setInputTexture(int i, int i2, int i3, int i4) {
        return setInputTexture(this.id, i, i2, i3, i4);
    }

    public final void setOutput(int i, int i2, int i3, int i4) {
        setOutput(this.id, i, i2, i3, i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NyN, java.lang.Object] */
    static {
        if (AbstractC25225BEi.A1a(Looper.myLooper(), Looper.getMainLooper())) {
            C09170dP.A0C("unifiedfilter");
            return;
        }
        throw AbstractC166987dD.A14("unifiedfilter library should not be loaded in the UI thread");
    }

    public final void cleanup() {
        cleanup(this.id);
    }

    public final void setFilter(int i, String str) {
        setFilter(this.id, i, str);
    }

    public final void setFilterEnabled(int i, boolean z) {
        setFilterEnabled(this.id, i, z);
    }

    public final void setFilterOutputSize(int i, int i2, int i3) {
        setFilterOutputSize(this.id, i, i2, i3);
    }

    public final void setIsOnscreenRender(boolean z) {
        setIsOnscreenRender(this.id, z);
    }

    public final void setParameter(int i, String str, int i2) {
        setIntParameter(this.id, i, str, i2);
    }

    public final void setSurface(Surface surface) {
        setSurface(this.id, surface);
    }

    public final void init(UserSession userSession, AssetManager assetManager, Surface surface) {
        AbstractC167017dG.A1N(userSession, assetManager);
        init(this.id, assetManager, surface, C18U.A06(C06090Tz.A05, userSession, 36316233410285758L));
    }

    public final void setParameter(int i, String str, float[] fArr, int i2) {
        setParameter(this.id, i, str, fArr, i2);
    }
}
