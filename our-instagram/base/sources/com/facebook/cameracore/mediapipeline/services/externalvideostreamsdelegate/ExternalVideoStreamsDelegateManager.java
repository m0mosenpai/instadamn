package com.facebook.cameracore.mediapipeline.services.externalvideostreamsdelegate;

import X.AbstractC166987dD;
import X.AnonymousClass810;
import X.AnonymousClass811;
import com.facebook.jni.HybridData;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public class ExternalVideoStreamsDelegateManager {
    public final Set mDelegates = AbstractC166987dD.A1H();
    public HybridData mHybridData;

    private native HybridData initHybrid();

    private int[] getStreamTextureMetadata(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("getStreamTextureMetadata");
            }
        }
        return null;
    }

    private boolean hasStreamTextureForIdentifier(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("hasStreamTextureForIdentifier");
            }
        }
        return false;
    }

    private boolean hasStreamUpdatedForIdentifier(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("hasStreamUpdatedForIdentifier");
            }
        }
        return false;
    }

    private void onStreamTextureMade(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onStreamTextureMade");
            }
        }
    }

    private void onStreamTexturesUpdateBegin() {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onStreamTexturesUpdateBegin");
            }
        }
    }

    private void onStreamTexturesUpdateEnd() {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onStreamTexturesUpdateEnd");
            }
        }
    }

    private void updateStreamTexture(String str, int i, int i2, int i3, int i4) {
        AnonymousClass811 anonymousClass811 = new AnonymousClass811(str);
        anonymousClass811.A04 = i;
        anonymousClass811.A02 = i2;
        anonymousClass811.A00 = i3;
        anonymousClass811.A01 = i4;
        anonymousClass811.A08 = true;
        AnonymousClass810 anonymousClass810 = new AnonymousClass810(anonymousClass811);
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("updateStreamTexture");
            }
        }
        anonymousClass810.A01();
    }
}
