package com.facebook.cameracore.mediapipeline.services.avatars;

import X.YPu;

/* loaded from: classes12.dex */
public class AvatarsDataProviderDelegateBridge {
    public final YPu mDelegate;

    public String getPersonalAvatarUriOverride() {
        return this.mDelegate.Bcg();
    }

    public void onAvatarRendered() {
        this.mDelegate.Cyg();
    }

    public void onInitialAvatarColorizationApplied() {
        this.mDelegate.DM3();
    }

    public void onLoadFailure(String str) {
        this.mDelegate.DPm(str);
    }

    public void onLoadSuccess(String str) {
        this.mDelegate.DPy(str);
    }

    public void sendAvatarMemoryCreationSuccess(String str) {
        this.mDelegate.EN6(str);
    }

    public void sendAvatarMemoryLoadResult(String str, String str2, boolean z, String str3) {
        this.mDelegate.EN7(str, str2, z, str3);
    }

    public AvatarsDataProviderDelegateBridge(YPu yPu) {
        this.mDelegate = yPu;
    }

    public byte[] consumeAvatarFrame(String str) {
        return null;
    }

    public String getDefaultAvatarResourcePath(String str) {
        return null;
    }

    public void sendAvatarFrame(String str, byte[] bArr) {
    }

    public void sendAvatarRampUpdateEvent(String str, String str2) {
    }
}
