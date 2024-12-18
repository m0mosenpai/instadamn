package com.instagram.react.perf;

import X.AbstractC12990ll;
import X.R3N;
import X.R6W;
import X.S5D;
import com.facebook.react.uimanager.ViewGroupManager;

/* loaded from: classes10.dex */
public class IgReactPerformanceLoggerFlagManager extends ViewGroupManager {
    public static final String REACT_CLASS = "ReactPerformanceLoggerFlag";
    public final S5D mReactPerformanceFlagListener;
    public final AbstractC12990ll mSession;

    public IgReactPerformanceLoggerFlagManager(S5D s5d, AbstractC12990ll abstractC12990ll) {
        super(null);
        this.mReactPerformanceFlagListener = s5d;
        this.mSession = abstractC12990ll;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public R6W createViewInstance(R3N r3n) {
        return new R6W(r3n, this.mSession, this.mReactPerformanceFlagListener);
    }
}
