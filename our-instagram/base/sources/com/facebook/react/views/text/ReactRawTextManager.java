package com.facebook.react.views.text;

import X.AbstractC166987dD;
import X.C00O;
import X.C66365UDi;
import X.R3N;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;

@ReactModule(name = ReactRawTextManager.REACT_CLASS)
/* loaded from: classes10.dex */
public class ReactRawTextManager extends ViewManager {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ ReactShadowNode createShadowNodeInstance() {
        return new ReactRawTextShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactRawTextShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View prepareToRecycleView(R3N r3n, View view) {
        throw AbstractC166987dD.A14("Attempt to recycle a native view for RCTRawText");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        createViewInstance(r3n);
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactRawTextShadowNode createShadowNodeInstance() {
        return new ReactRawTextShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C66365UDi createViewInstance(R3N r3n) {
        throw AbstractC166987dD.A14("Attempt to create a native view for RCTRawText");
    }
}
