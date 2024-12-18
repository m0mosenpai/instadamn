package com.instagram.react.impl;

import X.AbstractC18680vv;
import X.R3M;
import X.S5D;
import com.facebook.catalyst.views.art.ARTGroupViewManager;
import com.facebook.catalyst.views.art.ARTShapeViewManager;
import com.facebook.catalyst.views.art.ARTTextViewManager;
import com.facebook.catalyst.views.gradient.ReactAxialGradientManager;
import com.facebook.fbreact.views.picker.ReactDialogPickerManager;
import com.facebook.fbreact.views.picker.ReactDropdownPickerManager;
import com.facebook.fbreact.views.slider.ReactSliderManager;
import com.facebook.react.LazyReactPackage;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.safeareaview.ReactSafeAreaViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.react.perf.IgReactPerformanceLoggerFlagManager;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class IgReactPackage extends LazyReactPackage {
    public final AbstractC18680vv A00;
    public final S5D A01 = new Object();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Tiw, java.lang.Object] */
    @Override // X.InterfaceC65493TlF
    public final List ANV(R3M r3m) {
        return Arrays.asList(new ARTGroupViewManager(), new ARTShapeViewManager(), new ARTTextViewManager(), new ViewManager(null), new ViewManager(null), new ViewManager(null), new ReactAxialGradientManager(), new ReactViewManager(), new ReactHorizontalScrollViewManager(), new ReactModalHostManager(), new ReactProgressBarViewManager(), new ViewManager(), new ReactScrollViewManager(), new ReactSliderManager(), new ViewManager(null), new ViewManager(null), new ReactTextViewManager(), new ReactViewManager(), new ReactWebViewManager(new Object(), null), new ViewManager(null), new ReactDropdownPickerManager(), new ReactDialogPickerManager(), new SwipeRefreshLayoutManager(), new IgReactPerformanceLoggerFlagManager(this.A01, this.A00), new ViewManager(null), new ReactSafeAreaViewManager());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.S5D, java.lang.Object] */
    public IgReactPackage(AbstractC18680vv abstractC18680vv) {
        this.A00 = abstractC18680vv;
    }
}
