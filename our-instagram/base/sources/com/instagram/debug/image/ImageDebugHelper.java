package com.instagram.debug.image;

import X.C5G0;
import X.InterfaceC114695Fz;
import com.instagram.debug.network.DebugNetworkShapingRequestCallbackWrapper;

/* loaded from: classes.dex */
public class ImageDebugHelper {
    public static final String TAG = "IgImageDebugDevTools";
    public static ImageDebugHelper sInstance;
    public ImageDebugConfiguration mConfiguration;
    public DebugImageViewsTrackerImpl mDebugImageViewsTracker;
    public boolean mIsEnabled = false;

    public static ImageDebugHelper getInstance() {
        ImageDebugHelper imageDebugHelper = sInstance;
        if (imageDebugHelper == null) {
            ImageDebugHelper imageDebugHelper2 = new ImageDebugHelper();
            sInstance = imageDebugHelper2;
            return imageDebugHelper2;
        }
        return imageDebugHelper;
    }

    public static void log(String str) {
    }

    public InterfaceC114695Fz getDebugImageViewsTracker() {
        if (this.mIsEnabled) {
            ImageDebugConfiguration imageDebugConfiguration = this.mConfiguration;
            imageDebugConfiguration.getClass();
            if (imageDebugConfiguration.shouldTrackViews()) {
                return this.mDebugImageViewsTracker;
            }
            return null;
        }
        return null;
    }

    public DebugNetworkShapingRequestCallbackWrapper getDebugNetworkCallbackWrapper() {
        this.mConfiguration.getClass();
        if (this.mIsEnabled && this.mConfiguration.mNetworkShapingConfig.isNetworkShapingOn()) {
            return new DebugNetworkShapingRequestCallbackWrapper(this.mConfiguration.mNetworkShapingConfig, TAG);
        }
        return null;
    }

    public C5G0 getDebugOverlayDrawer() {
        if (this.mIsEnabled) {
            this.mConfiguration.getClass();
            ImageDebugConfiguration imageDebugConfiguration = this.mConfiguration;
            if (imageDebugConfiguration.mIsImageOverlayEnabled) {
                return new DebugOverlayDrawerImpl(imageDebugConfiguration);
            }
            return null;
        }
        return null;
    }

    public boolean getIsDiskLayerEnabled() {
        this.mConfiguration.getClass();
        return this.mConfiguration.mIsDiskLayerEnabled;
    }

    public boolean getIsMemoryLayerEnabled() {
        this.mConfiguration.getClass();
        return this.mConfiguration.mIsMemoryLayerEnabled;
    }

    public boolean getIsVitoDebugOverlayEnabled() {
        this.mConfiguration.getClass();
        return this.mConfiguration.mVitoDebugOverlayEnabled;
    }

    public void setEnabled(boolean z) {
        this.mIsEnabled = z;
        ImageDebugConfiguration imageDebugConfiguration = new ImageDebugConfiguration();
        this.mConfiguration = imageDebugConfiguration;
        boolean z2 = this.mIsEnabled;
        DebugImageViewsTrackerImpl debugImageViewsTrackerImpl = this.mDebugImageViewsTracker;
        if (z2) {
            if (debugImageViewsTrackerImpl == null) {
                debugImageViewsTrackerImpl = new DebugImageViewsTrackerImpl();
                this.mDebugImageViewsTracker = debugImageViewsTrackerImpl;
            }
            debugImageViewsTrackerImpl.setImageViewInitializer(new ImageViewInitializer(imageDebugConfiguration));
            if (!this.mConfiguration.shouldTrackViews()) {
                debugImageViewsTrackerImpl = this.mDebugImageViewsTracker;
            } else {
                return;
            }
        } else if (debugImageViewsTrackerImpl == null) {
            return;
        }
        debugImageViewsTrackerImpl.reset();
    }
}
