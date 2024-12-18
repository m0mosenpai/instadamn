package com.instagram.react.views.image;

import X.AbstractC111324zv;
import X.AbstractC31174DnI;
import X.AbstractC65702TsY;
import X.AnonymousClass001;
import X.C68007V5z;
import X.R3N;
import X.WF1;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class IgReactImageManager extends SimpleViewManager {
    public IgReactImageManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTImageView";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C68007V5z createViewInstance(R3N r3n) {
        return new C68007V5z(r3n);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(C68007V5z c68007V5z, String str) {
        ImageView.ScaleType scaleType;
        if (AbstractC111324zv.A00(2179).equals(str)) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            if (!"cover".equals(str)) {
                if ("stretch".equals(str)) {
                    scaleType = ImageView.ScaleType.FIT_XY;
                } else if (!"center".equals(str) && str != null) {
                    throw new RuntimeException(AnonymousClass001.A0S("Invalid resize mode: '", str, '\''));
                }
            }
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        c68007V5z.setScaleTypeNoUpdate(scaleType);
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(C68007V5z c68007V5z, Integer num) {
        if (num == null) {
            c68007V5z.clearColorFilter();
        } else {
            c68007V5z.setColorFilter(num.intValue());
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        HashMap A12 = AbstractC31174DnI.A12("registrationName", "onError");
        HashMap A122 = AbstractC31174DnI.A12("registrationName", "onLoad");
        HashMap A123 = AbstractC31174DnI.A12("registrationName", "onLoadEnd");
        HashMap A124 = AbstractC31174DnI.A12("registrationName", "onLoadStart");
        HashMap A0m = AbstractC65702TsY.A0m("topError", A12, "topLoad", A122);
        A0m.put("topLoadEnd", A123);
        A0m.put("topLoadStart", A124);
        exportedCustomDirectEventTypeConstants.putAll(A0m);
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C68007V5z c68007V5z) {
        super.onAfterUpdateTransaction((View) c68007V5z);
        c68007V5z.A0H();
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C68007V5z c68007V5z, int i, float f) {
        if (!Float.isNaN(f)) {
            f = WF1.A01(f);
        }
        if (i == 0) {
            c68007V5z.setBorderRadius(f);
        }
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public void setShouldNotifyLoadEvents(C68007V5z c68007V5z, boolean z) {
        c68007V5z.setShouldNotifyLoadEvents(z);
    }

    @ReactProp(name = "src")
    public void setSource(C68007V5z c68007V5z, ReadableArray readableArray) {
        c68007V5z.setSource(readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        return new C68007V5z(r3n);
    }
}
