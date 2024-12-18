package com.instagram.debug.devoptions.debughead.data.provider;

import X.AbstractC167007dF;
import X.InterfaceC82193lg;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider;
import com.instagram.debug.devoptions.debughead.data.delegates.ImageFailureDelegate;
import com.instagram.debug.devoptions.debughead.data.delegates.ImagePprDelegate;

/* loaded from: classes12.dex */
public class DebugHeadImagePerformanceListener implements ImagePerformanceProvider {
    public static DebugHeadImagePerformanceListener sInstance;
    public ImageFailureDelegate mFailureDelegate;
    public ImagePprDelegate mPprDelegate;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.instagram.debug.devoptions.debughead.data.provider.DebugHeadImagePerformanceListener] */
    public static synchronized DebugHeadImagePerformanceListener getInstance() {
        DebugHeadImagePerformanceListener debugHeadImagePerformanceListener;
        synchronized (DebugHeadImagePerformanceListener.class) {
            DebugHeadImagePerformanceListener debugHeadImagePerformanceListener2 = sInstance;
            debugHeadImagePerformanceListener = debugHeadImagePerformanceListener2;
            if (debugHeadImagePerformanceListener2 == null) {
                ?? obj = new Object();
                sInstance = obj;
                debugHeadImagePerformanceListener = obj;
            }
        }
        return debugHeadImagePerformanceListener;
    }

    public static synchronized boolean isEnabled() {
        boolean A1W;
        synchronized (DebugHeadImagePerformanceListener.class) {
            A1W = AbstractC167007dF.A1W(sInstance);
        }
        return A1W;
    }

    @Override // com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider
    public void onEnterViewport() {
        ImagePprDelegate imagePprDelegate = this.mPprDelegate;
        if (imagePprDelegate != null) {
            imagePprDelegate.onEnterViewport();
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider
    public void onImageFailure(String str, Object obj) {
        ImageFailureDelegate imageFailureDelegate = this.mFailureDelegate;
        if (imageFailureDelegate != null) {
            imageFailureDelegate.onImageFailure(str, (InterfaceC82193lg) obj);
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider
    public void onImageSuccess(String str) {
        ImageFailureDelegate imageFailureDelegate = this.mFailureDelegate;
        if (imageFailureDelegate != null) {
            imageFailureDelegate.onImageSuccess(str);
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider
    public void onLeaveViewportRendered(ImageUrl imageUrl) {
        ImagePprDelegate imagePprDelegate = this.mPprDelegate;
        if (imagePprDelegate != null) {
            imagePprDelegate.onLeaveViewportRendered(imageUrl);
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider
    public void onLeaveViewportUnrendered(ImageUrl imageUrl) {
        ImagePprDelegate imagePprDelegate = this.mPprDelegate;
        if (imagePprDelegate != null) {
            imagePprDelegate.onLeaveViewportUnrendered(imageUrl);
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.ImagePerformanceProvider
    public void onRender(long j) {
        ImagePprDelegate imagePprDelegate = this.mPprDelegate;
        if (imagePprDelegate != null) {
            imagePprDelegate.onRender(j);
        }
    }

    public void setFailureDelegate(ImageFailureDelegate imageFailureDelegate) {
        this.mFailureDelegate = imageFailureDelegate;
    }

    public void setPprDelegate(ImagePprDelegate imagePprDelegate) {
        this.mPprDelegate = imagePprDelegate;
    }
}
