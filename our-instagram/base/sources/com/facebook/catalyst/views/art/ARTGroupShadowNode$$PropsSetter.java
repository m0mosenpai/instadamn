package com.facebook.catalyst.views.art;

import X.AbstractC166987dD;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter;
import java.util.Map;

/* loaded from: classes10.dex */
public class ARTGroupShadowNode$$PropsSetter implements ViewManagerPropertyUpdater$ShadowNodeSetter {
    @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater$Settable
    public final void Bir(Map map) {
        map.put("clipping", "Array");
        map.put("opacity", "number");
        map.put("transform", "Array");
    }

    @Override // com.facebook.react.uimanager.ViewManagerPropertyUpdater$ShadowNodeSetter
    public final /* bridge */ /* synthetic */ void Ebo(ReactShadowNode reactShadowNode, Object obj, String str) {
        float A09;
        int i;
        ARTGroupShadowNode aRTGroupShadowNode = (ARTGroupShadowNode) reactShadowNode;
        switch (str.hashCode()) {
            case -1267206133:
                if (!str.equals("opacity")) {
                    return;
                }
                if (!(obj instanceof Double)) {
                    A09 = 1.0f;
                } else {
                    A09 = AbstractC166987dD.A09(obj);
                }
                aRTGroupShadowNode.setOpacity(A09);
                return;
            case 918617282:
                if (!str.equals("clipping")) {
                    return;
                }
                i = 1;
                break;
            case 1052666732:
                if (!str.equals("transform")) {
                    return;
                }
                i = 2;
                break;
            default:
                return;
        }
        ReadableArray readableArray = null;
        boolean z = obj instanceof ReadableArray;
        if (1 - i != 0) {
            if (z) {
                readableArray = (ReadableArray) obj;
            }
            aRTGroupShadowNode.setTransform(readableArray);
        } else {
            if (z) {
                readableArray = (ReadableArray) obj;
            }
            aRTGroupShadowNode.setClipping(readableArray);
        }
    }
}
