package com.facebook.catalyst.views.art;

import X.AbstractC61750Rt5;
import android.graphics.RectF;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;

/* loaded from: classes10.dex */
public class ARTGroupShadowNode extends ARTVirtualNode {
    public RectF A00;

    @ReactProp(name = "clipping")
    public void setClipping(ReadableArray readableArray) {
        float[] A00 = AbstractC61750Rt5.A00(readableArray);
        if (A00 != null) {
            if (A00.length == 4) {
                float f = A00[0];
                float f2 = A00[1];
                this.A00 = new RectF(f, f2, A00[2] + f, A00[3] + f2);
                A07();
                return;
            }
            throw new RuntimeException("Clipping should be array of length 4 (e.g. [x, y, width, height])");
        }
    }
}
