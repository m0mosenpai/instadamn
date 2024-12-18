package com.instagram.react.views.custom;

import X.C14360o3;
import X.R3N;
import com.facebook.R;
import com.facebook.react.uimanager.SimpleViewManager;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes10.dex */
public final class IgLoadingIndicatorViewManager extends SimpleViewManager {
    public IgLoadingIndicatorViewManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public SpinnerImageView createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        SpinnerImageView spinnerImageView = new SpinnerImageView(r3n);
        spinnerImageView.setImageResource(R.drawable.spinner_large);
        return spinnerImageView;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IgLoadingIndicator";
    }
}
