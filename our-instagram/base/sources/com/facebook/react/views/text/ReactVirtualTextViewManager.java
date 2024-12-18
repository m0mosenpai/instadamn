package com.facebook.react.views.text;

import X.AbstractC166987dD;
import X.R3N;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNode;

@ReactModule(name = ReactVirtualTextViewManager.REACT_CLASS)
/* loaded from: classes10.dex */
public class ReactVirtualTextViewManager extends BaseViewManager {
    public static final String REACT_CLASS = "RCTVirtualText";

    public ReactVirtualTextViewManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ ReactShadowNode createShadowNodeInstance() {
        return new ReactBaseTextShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(R3N r3n) {
        throw AbstractC166987dD.A14("Attempt to create a native view for RCTVirtualText");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactVirtualTextShadowNode.class;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.react.views.text.ReactBaseTextShadowNode, com.facebook.react.views.text.ReactVirtualTextShadowNode] */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactVirtualTextShadowNode createShadowNodeInstance() {
        return new ReactBaseTextShadowNode();
    }
}
