package com.facebook.catalyst.views.gradient;

import X.AbstractC166987dD;
import X.AbstractC70462WWz;
import X.C00O;
import X.C3e2;
import X.C62795SRp;
import X.C63233Sfl;
import X.InterfaceC65496TlK;
import X.Q4N;
import X.R3N;
import X.WF1;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;

@ReactModule(name = ReactAxialGradientManager.REACT_CLASS)
/* loaded from: classes10.dex */
public class ReactAxialGradientManager extends SimpleViewManager {
    public static final String REACT_CLASS = "RCTAxialGradientView";
    public final InterfaceC65496TlK mDelegate;

    public ReactAxialGradientManager() {
        super(null);
        this.mDelegate = new AbstractC70462WWz(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    private void throwBorderRadiusNotImplementedException() {
        throw AbstractC166987dD.A18("Border radius type not yet implemented!");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Q4N createViewInstance(R3N r3n) {
        return new Q4N(r3n);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC65496TlK getDelegate() {
        return this.mDelegate;
    }

    @ReactProp(customType = "ColorArray", name = "colors")
    public void setColors(Q4N q4n, ReadableArray readableArray) {
        int i;
        if (readableArray != null && readableArray.size() >= 2) {
            int[] iArr = new int[readableArray.size()];
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                if (readableArray.getType(i2) == ReadableType.Map) {
                    i = C63233Sfl.A00(q4n.getContext(), readableArray.getMap(i2)).intValue();
                } else {
                    i = readableArray.getInt(i2);
                }
                iArr[i2] = i;
            }
            q4n.A08 = iArr;
            return;
        }
        throw new RuntimeException("The gradient must contain at least 2 colors");
    }

    @ReactProp(name = "locations")
    public void setLocations(Q4N q4n, ReadableArray readableArray) {
        float[] fArr;
        if (readableArray == null) {
            fArr = null;
        } else {
            fArr = new float[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                fArr[i] = (float) readableArray.getDouble(i);
            }
        }
        q4n.A07 = fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.react.uimanager.BaseViewManager
    /* renamed from: setBorderRadiusInternal, reason: merged with bridge method [inline-methods] */
    public void setBorderRadius(Q4N q4n, float f) {
        if (!C3e2.A00(f)) {
            f = WF1.A01(f);
        }
        if (!C62795SRp.A00(q4n.A00, f)) {
            q4n.A00 = f;
        }
    }

    public void onAfterUpdateTransaction(Q4N q4n) {
        q4n.invalidate();
    }

    public void setBorderBottomLeftRadius(Q4N q4n, float f) {
        throwBorderRadiusNotImplementedException();
        throw C00O.createAndThrow();
    }

    public void setBorderBottomRightRadius(Q4N q4n, float f) {
        throwBorderRadiusNotImplementedException();
        throw C00O.createAndThrow();
    }

    public void setBorderTopLeftRadius(Q4N q4n, float f) {
        throwBorderRadiusNotImplementedException();
        throw C00O.createAndThrow();
    }

    public void setBorderTopRightRadius(Q4N q4n, float f) {
        throwBorderRadiusNotImplementedException();
        throw C00O.createAndThrow();
    }

    @ReactProp(name = "endX")
    public void setEndX(Q4N q4n, float f) {
        if (!Float.isNaN(f)) {
            q4n.A01 = f;
            return;
        }
        throw new RuntimeException("Invalid float for endX");
    }

    @ReactProp(name = "endY")
    public void setEndY(Q4N q4n, float f) {
        if (!Float.isNaN(f)) {
            q4n.A02 = f;
            return;
        }
        throw new RuntimeException("Invalid float for endY");
    }

    @ReactProp(name = "startX")
    public void setStartX(Q4N q4n, float f) {
        if (!Float.isNaN(f)) {
            q4n.A03 = f;
            return;
        }
        throw new RuntimeException("Invalid float for startX");
    }

    @ReactProp(name = "startY")
    public void setStartY(Q4N q4n, float f) {
        if (!Float.isNaN(f)) {
            q4n.A04 = f;
            return;
        }
        throw new RuntimeException("Invalid float for startY");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        return new Q4N(r3n);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
        view.invalidate();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public /* bridge */ /* synthetic */ void setBorderBottomLeftRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public /* bridge */ /* synthetic */ void setBorderBottomRightRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
        throw C00O.createAndThrow();
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(Q4N q4n, int i, float f) {
        if (i == 0) {
            setBorderRadius(q4n, f);
        } else {
            throwBorderRadiusNotImplementedException();
            throw C00O.createAndThrow();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public /* bridge */ /* synthetic */ void setBorderTopLeftRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public /* bridge */ /* synthetic */ void setBorderTopRightRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
        throw C00O.createAndThrow();
    }

    public void setBorderRadius(Q4N q4n, float f) {
        setBorderRadius(q4n, f);
    }
}
