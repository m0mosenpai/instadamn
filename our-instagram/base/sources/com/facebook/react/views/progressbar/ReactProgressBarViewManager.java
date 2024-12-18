package com.facebook.react.views.progressbar;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC70462WWz;
import X.C14360o3;
import X.C63055Sbc;
import X.EnumC78643fW;
import X.InterfaceC65496TlK;
import X.Q55;
import X.R3N;
import X.WF1;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.WeakHashMap;

@ReactModule(name = ReactProgressBarViewManager.REACT_CLASS)
/* loaded from: classes10.dex */
public final class ReactProgressBarViewManager extends BaseViewManager {
    public static final String DEFAULT_STYLE = "Normal";
    public static final String PROP_ANIMATING = "animating";
    public static final String PROP_ATTR = "typeAttr";
    public static final String PROP_INDETERMINATE = "indeterminate";
    public static final String PROP_PROGRESS = "progress";
    public static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    public final InterfaceC65496TlK delegate;
    public final WeakHashMap measuredStyles;
    public static final C63055Sbc Companion = new Object();
    public static final Object progressBarCtorLock = AbstractC58318PtA.A0b();

    public ReactProgressBarViewManager() {
        super(null);
        this.measuredStyles = new WeakHashMap();
        this.delegate = new AbstractC70462WWz(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Q55, android.widget.FrameLayout] */
    @Override // com.facebook.react.uimanager.ViewManager
    public Q55 createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        ?? frameLayout = new FrameLayout(r3n);
        frameLayout.A03 = true;
        frameLayout.A02 = true;
        return frameLayout;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, EnumC78643fW enumC78643fW, float f2, EnumC78643fW enumC78643fW2, float[] fArr) {
        AbstractC167007dF.A1D(context, 0, readableMap2);
        int A00 = C63055Sbc.A00(readableMap2.getString(PROP_STYLE));
        WeakHashMap weakHashMap = this.measuredStyles;
        Integer valueOf = Integer.valueOf(A00);
        Object obj = weakHashMap.get(valueOf);
        if (obj == null) {
            ProgressBar A01 = C63055Sbc.A01(context, A00);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            A01.measure(makeMeasureSpec, makeMeasureSpec);
            obj = Pair.create(Integer.valueOf(A01.getMeasuredWidth()), Integer.valueOf(A01.getMeasuredHeight()));
            weakHashMap.put(valueOf, obj);
        }
        Pair pair = (Pair) obj;
        float A002 = WF1.A00(AbstractC166987dD.A0H(pair.first));
        float A003 = WF1.A00(AbstractC166987dD.A0H(pair.second));
        return Float.floatToRawIntBits(A003) | (Float.floatToRawIntBits(A002) << 32);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(Q55 q55) {
        C14360o3.A0B(q55, 0);
        q55.A00();
    }

    @ReactProp(name = PROP_ANIMATING)
    public void setAnimating(Q55 q55, boolean z) {
        C14360o3.A0B(q55, 0);
        q55.A02 = z;
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(Q55 q55, Integer num) {
        C14360o3.A0B(q55, 0);
        q55.A01 = num;
    }

    @ReactProp(name = PROP_INDETERMINATE)
    public void setIndeterminate(Q55 q55, boolean z) {
        C14360o3.A0B(q55, 0);
        q55.A03 = z;
    }

    @ReactProp(name = PROP_PROGRESS)
    public void setProgress(Q55 q55, double d) {
        C14360o3.A0B(q55, 0);
        q55.A00 = d;
    }

    @ReactProp(name = PROP_STYLE)
    public void setStyleAttr(Q55 q55, String str) {
        C14360o3.A0B(q55, 0);
        q55.setStyle$xplat_js_react_native_github_packages_react_native_ReactAndroid_src_main_java_com_facebook_react_views_progressbar_progressbarAndroid(str);
    }

    public void setTestID(Q55 q55, String str) {
        C14360o3.A0B(q55, 0);
        super.setTestId(q55, str);
    }

    @ReactProp(name = PROP_ATTR)
    public void setTypeAttr(Q55 q55, String str) {
    }

    public /* bridge */ /* synthetic */ void setTypeAttr(View view, String str) {
    }

    public void updateExtraData(Q55 q55, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ ReactShadowNode createShadowNodeInstance() {
        return new ProgressBarShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC65496TlK getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ProgressBarShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ProgressBarShadowNode createShadowNodeInstance() {
        return new ProgressBarShadowNode();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Q55, android.widget.FrameLayout, android.view.View] */
    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        C14360o3.A0B(r3n, 0);
        ?? frameLayout = new FrameLayout(r3n);
        frameLayout.A03 = true;
        frameLayout.A02 = true;
        return frameLayout;
    }
}
