package com.facebook.catalyst.views.art;

import X.AbstractC166987dD;
import X.AbstractC31175DnJ;
import X.R3N;
import android.view.View;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;

/* loaded from: classes10.dex */
public class ARTRenderableViewManager extends ViewManager {
    public static final String CLASS_GROUP = "ARTGroup";
    public static final String CLASS_SHAPE = "ARTShape";
    public static final String CLASS_TEXT = "ARTText";
    public final String mClassName;

    public static ARTRenderableViewManager createARTGroupViewManager() {
        return new ARTGroupViewManager();
    }

    public static ARTRenderableViewManager createARTShapeViewManager() {
        return new ARTShapeViewManager();
    }

    public static ARTRenderableViewManager createARTTextViewManager() {
        return new ARTTextViewManager();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactShadowNode createShadowNodeInstance() {
        String str = this.mClassName;
        if (CLASS_GROUP.equals(str)) {
            return new ARTVirtualNode();
        }
        if (CLASS_SHAPE.equals(str)) {
            return new ARTShapeShadowNode();
        }
        if (CLASS_TEXT.equals(str)) {
            return new ARTTextShadowNode();
        }
        throw AbstractC31175DnJ.A0V("Unexpected type ", str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(R3N r3n) {
        throw AbstractC166987dD.A14("ARTShape does not map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        String str = this.mClassName;
        if (CLASS_GROUP.equals(str)) {
            return ARTGroupShadowNode.class;
        }
        if (CLASS_SHAPE.equals(str)) {
            return ARTShapeShadowNode.class;
        }
        if (CLASS_TEXT.equals(str)) {
            return ARTTextShadowNode.class;
        }
        throw AbstractC31175DnJ.A0V("Unexpected type ", str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View prepareToRecycleView(R3N r3n, View view) {
        throw AbstractC166987dD.A14("ARTShape does not map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
        throw AbstractC166987dD.A14("ARTShape does not map into a native view");
    }

    public ARTRenderableViewManager(String str) {
        this.mClassName = str;
    }
}
