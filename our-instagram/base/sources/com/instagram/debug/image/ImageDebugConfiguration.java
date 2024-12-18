package com.instagram.debug.image;

import X.C0YR;
import X.C17280tP;
import X.InterfaceC16530ry;
import com.instagram.debug.network.DebugNetworkShapingConfigurationFactory$createStaticConfiguration$1;
import com.instagram.debug.network.NetworkShapingConfiguration;

/* loaded from: classes.dex */
public class ImageDebugConfiguration {
    public final boolean mIsDiskLayerEnabled;
    public final boolean mIsImageOverlayEnabled;
    public final boolean mIsMemoryLayerEnabled;
    public final boolean mLongClickToCopyUrl;
    public final NetworkShapingConfiguration mNetworkShapingConfig;
    public final OverlayDisplayMode mOverlayDisplayMode;
    public final boolean mShowCacheKey;
    public final boolean mShowColorFidelity;
    public final boolean mShowFileExtension;
    public final boolean mShowFileSize;
    public final boolean mShowHdrInfo;
    public final LoadSourceDisplayMode mShowLoadSource;
    public final boolean mShowOffscreenPixelsPerc;
    public final boolean mShowRes;
    public final boolean mShowScans;
    public final boolean mShowViewRes;
    public final boolean mVitoDebugOverlayEnabled;

    /* loaded from: classes.dex */
    public enum LoadSourceDisplayMode {
        HIDE,
        NAME,
        COLOR
    }

    /* loaded from: classes.dex */
    public enum OverlayDisplayMode {
        CONCISE,
        VERBOSE
    }

    public boolean isDiskLayerEnabled() {
        return this.mIsDiskLayerEnabled;
    }

    public boolean isImageOverlayOn() {
        return this.mIsImageOverlayEnabled;
    }

    public boolean isMemoryLayerEnabled() {
        return this.mIsMemoryLayerEnabled;
    }

    public boolean isNetworkShapingOn() {
        return this.mNetworkShapingConfig.isNetworkShapingOn();
    }

    public boolean shouldOverrideLongClick() {
        return this.mLongClickToCopyUrl;
    }

    public boolean shouldTrackViews() {
        if (!this.mIsImageOverlayEnabled && !this.mLongClickToCopyUrl) {
            return false;
        }
        return true;
    }

    public ImageDebugConfiguration() {
        C17280tP A00 = C17280tP.A00();
        InterfaceC16530ry interfaceC16530ry = A00.A0U;
        C0YR[] c0yrArr = C17280tP.A4G;
        this.mIsMemoryLayerEnabled = ((Boolean) interfaceC16530ry.CES(A00, c0yrArr[140])).booleanValue();
        this.mIsDiskLayerEnabled = ((Boolean) A00.A0T.CES(A00, c0yrArr[141])).booleanValue();
        this.mIsImageOverlayEnabled = ((Boolean) A00.A0e.CES(A00, c0yrArr[142])).booleanValue();
        this.mOverlayDisplayMode = (OverlayDisplayMode) getEnumFromInt(OverlayDisplayMode.class, ((Number) A00.A0d.CES(A00, c0yrArr[143])).intValue());
        this.mShowLoadSource = (LoadSourceDisplayMode) getEnumFromInt(LoadSourceDisplayMode.class, ((Number) A00.A0k.CES(A00, c0yrArr[144])).intValue());
        this.mShowRes = ((Boolean) A00.A0i.CES(A00, c0yrArr[145])).booleanValue();
        this.mShowViewRes = ((Boolean) A00.A0j.CES(A00, c0yrArr[146])).booleanValue();
        this.mShowOffscreenPixelsPerc = ((Boolean) A00.A0l.CES(A00, c0yrArr[147])).booleanValue();
        this.mShowScans = ((Boolean) A00.A0m.CES(A00, c0yrArr[148])).booleanValue();
        this.mShowHdrInfo = ((Boolean) A00.A0h.CES(A00, c0yrArr[149])).booleanValue();
        this.mShowFileSize = ((Boolean) A00.A0g.CES(A00, c0yrArr[151])).booleanValue();
        this.mShowFileExtension = ((Boolean) A00.A0f.CES(A00, c0yrArr[152])).booleanValue();
        this.mShowCacheKey = ((Boolean) A00.A0b.CES(A00, c0yrArr[150])).booleanValue();
        this.mShowColorFidelity = ((Boolean) A00.A0c.CES(A00, c0yrArr[159])).booleanValue();
        this.mNetworkShapingConfig = new DebugNetworkShapingConfigurationFactory$createStaticConfiguration$1(((Number) A00.A0Y.CES(A00, c0yrArr[153])).intValue(), ((Number) A00.A0Z.CES(A00, c0yrArr[154])).intValue(), ((Number) A00.A0a.CES(A00, c0yrArr[155])).intValue());
        this.mLongClickToCopyUrl = ((Number) A00.A0X.CES(A00, c0yrArr[156])).intValue() != 0;
        this.mVitoDebugOverlayEnabled = ((Boolean) A00.A0n.CES(A00, c0yrArr[160])).booleanValue();
    }

    public static Enum getEnumFromInt(Class cls, int i) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        enumArr.getClass();
        if (i < 0 || i >= enumArr.length) {
            i = 0;
        }
        return enumArr[i];
    }
}
