package com.instagram.debug.devoptions.debughead.data.provider;

import X.AbstractC167007dF;
import X.C19280xC;
import X.C193668hm;
import X.InterfaceC62962tZ;
import com.instagram.debug.devoptions.debughead.data.delegates.DropFrameDelegate;

/* loaded from: classes12.dex */
public class DebugHeadDebugDropFrameListener implements InterfaceC62962tZ {
    public static DebugHeadDebugDropFrameListener sInstance;
    public DropFrameDelegate mDelegate;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.debug.devoptions.debughead.data.provider.DebugHeadDebugDropFrameListener, java.lang.Object] */
    public static synchronized DebugHeadDebugDropFrameListener getInstance() {
        DebugHeadDebugDropFrameListener debugHeadDebugDropFrameListener;
        synchronized (DebugHeadDebugDropFrameListener.class) {
            DebugHeadDebugDropFrameListener debugHeadDebugDropFrameListener2 = sInstance;
            debugHeadDebugDropFrameListener = debugHeadDebugDropFrameListener2;
            if (debugHeadDebugDropFrameListener2 == null) {
                ?? obj = new Object();
                sInstance = obj;
                debugHeadDebugDropFrameListener = obj;
            }
        }
        return debugHeadDebugDropFrameListener;
    }

    public static synchronized boolean isEnabled() {
        boolean A1W;
        synchronized (DebugHeadDebugDropFrameListener.class) {
            A1W = AbstractC167007dF.A1W(sInstance);
        }
        return A1W;
    }

    @Override // X.InterfaceC62962tZ
    public void onLargeFrameDrop(String str, int i) {
        this.mDelegate.onFrameDrop(str, i);
    }

    @Override // X.InterfaceC62962tZ
    public void onScrollStart() {
        this.mDelegate.onScrollStatusChange(DropFrameDelegate.ScrollStatus.START);
    }

    @Override // X.InterfaceC62962tZ
    public void onScrollStop() {
        this.mDelegate.onScrollStatusChange(DropFrameDelegate.ScrollStatus.STOP);
    }

    @Override // X.InterfaceC62962tZ
    public void onScrolled(int i, int i2) {
        this.mDelegate.onScrolled(i, i2);
    }

    @Override // X.InterfaceC62962tZ
    public void onSmallFrameDrop(String str) {
        this.mDelegate.onFrameDrop(str, 1);
    }

    @Override // X.InterfaceC62962tZ
    public void registerModule(String str) {
        this.mDelegate.onRegisterModule(str);
    }

    public void reportScrollForDebug(C19280xC c19280xC) {
        this.mDelegate.reportScrollForDebug(c19280xC);
    }

    @Override // X.InterfaceC62962tZ
    public void reportScrollForDebugNew(C193668hm c193668hm) {
        this.mDelegate.reportScrollForDebugNew(c193668hm);
    }

    public void setDelegate(DropFrameDelegate dropFrameDelegate) {
        this.mDelegate = dropFrameDelegate;
    }
}
