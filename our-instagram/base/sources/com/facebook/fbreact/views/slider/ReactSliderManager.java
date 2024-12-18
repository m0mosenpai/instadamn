package com.facebook.fbreact.views.slider;

import X.AbstractC05810Sj;
import X.AbstractC31174DnI;
import X.AbstractC65702TsY;
import X.AbstractC70462WWz;
import X.AbstractC78533fL;
import X.AbstractC78733ff;
import X.C66362UDb;
import X.C66375UEj;
import X.EnumC78643fW;
import X.InterfaceC50872Vi;
import X.InterfaceC65496TlK;
import X.R3N;
import X.WF1;
import X.WP5;
import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.common.collect.LinkedHashMultimap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class ReactSliderManager extends SimpleViewManager {
    public static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new WP5();
    public static final String REACT_CLASS = "RCTSlider";
    public static final int STYLE = 16842875;
    public final InterfaceC65496TlK mDelegate;

    /* loaded from: classes11.dex */
    public class ReactSliderShadowNode extends LayoutShadowNode implements InterfaceC50872Vi {
        public int A00;
        public int A01;
        public boolean A02;

        @Override // X.InterfaceC50872Vi
        public final long CpA(EnumC78643fW enumC78643fW, EnumC78643fW enumC78643fW2, AbstractC78533fL abstractC78533fL, float f, float f2) {
            if (!this.A02) {
                R3N r3n = this.A0A;
                AbstractC05810Sj.A00(r3n);
                C66362UDb c66362UDb = new C66362UDb(r3n);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                c66362UDb.measure(makeMeasureSpec, makeMeasureSpec);
                this.A01 = c66362UDb.getMeasuredWidth();
                this.A00 = c66362UDb.getMeasuredHeight();
                this.A02 = true;
            }
            return AbstractC78733ff.A00(this.A01, this.A00);
        }

        public ReactSliderShadowNode() {
            A09(this);
        }
    }

    public ReactSliderManager() {
        super(null);
        this.mDelegate = new AbstractC70462WWz(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "disabled")
    public void setDisabled(C66362UDb c66362UDb, boolean z) {
    }

    @ReactProp(customType = "ImageSource", name = "maximumTrackImage")
    public void setMaximumTrackImage(C66362UDb c66362UDb, ReadableMap readableMap) {
    }

    @ReactProp(customType = "ImageSource", name = "minimumTrackImage")
    public void setMinimumTrackImage(C66362UDb c66362UDb, ReadableMap readableMap) {
    }

    @ReactProp(customType = "ImageSource", name = "thumbImage")
    public void setThumbImage(C66362UDb c66362UDb, ReadableMap readableMap) {
    }

    @ReactProp(customType = "ImageSource", name = "trackImage")
    public void setTrackImage(C66362UDb c66362UDb, ReadableMap readableMap) {
    }

    @ReactProp(defaultDouble = 0.0d, name = IntentModule.EXTRA_MAP_KEY_FOR_VALUE)
    public void setValue(C66362UDb c66362UDb, double d) {
        c66362UDb.setOnSeekBarChangeListener(null);
        c66362UDb.setValue(d);
        c66362UDb.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void addEventEmitters(R3N r3n, View view) {
        ((SeekBar) view).setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSliderShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C66362UDb createViewInstance(R3N r3n) {
        C66362UDb c66362UDb = new C66362UDb(r3n);
        C66375UEj.A02(c66362UDb, c66362UDb.getImportantForAccessibility(), c66362UDb.isFocusable());
        return c66362UDb;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC65496TlK getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return ReactSliderShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, EnumC78643fW enumC78643fW, float f2, EnumC78643fW enumC78643fW2, float[] fArr) {
        C66362UDb c66362UDb = new C66362UDb(context);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
        c66362UDb.measure(makeMeasureSpec, makeMeasureSpec);
        float A00 = WF1.A00(c66362UDb.getMeasuredWidth());
        float A002 = WF1.A00(c66362UDb.getMeasuredHeight());
        return Float.floatToRawIntBits(A002) | (Float.floatToRawIntBits(A00) << 32);
    }

    @ReactProp(defaultDouble = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR, name = "maximumValue")
    public /* bridge */ /* synthetic */ void setMaximumValue(View view, double d) {
        ((C66362UDb) view).setMaxValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "minimumValue")
    public /* bridge */ /* synthetic */ void setMinimumValue(View view, double d) {
        ((C66362UDb) view).setMinValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = OptSvcAnalyticsStore.LOGGING_KEY_STEP)
    public /* bridge */ /* synthetic */ void setStep(View view, double d) {
        ((C66362UDb) view).setStep(d);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        Map exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        HashMap hashMap = new HashMap();
        hashMap.put("topValueChange", AbstractC31174DnI.A12("phasedRegistrationNames", AbstractC65702TsY.A0m("bubbled", "onValueChange", "captured", "onValueChangeCapture")));
        exportedCustomBubblingEventTypeConstants.putAll(hashMap);
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        exportedCustomDirectEventTypeConstants.putAll(AbstractC31174DnI.A12("topSlidingComplete", AbstractC31174DnI.A12("registrationName", "onSlidingComplete")));
        return exportedCustomDirectEventTypeConstants;
    }

    @ReactProp(name = "disabled")
    public /* bridge */ /* synthetic */ void setDisabled(View view, boolean z) {
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(C66362UDb c66362UDb, boolean z) {
        c66362UDb.setEnabled(z);
    }

    @ReactProp(customType = "ImageSource", name = "maximumTrackImage")
    public /* bridge */ /* synthetic */ void setMaximumTrackImage(View view, ReadableMap readableMap) {
    }

    @ReactProp(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(C66362UDb c66362UDb, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) c66362UDb.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.background);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(customType = "ImageSource", name = "minimumTrackImage")
    public /* bridge */ /* synthetic */ void setMinimumTrackImage(View view, ReadableMap readableMap) {
    }

    @ReactProp(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(C66362UDb c66362UDb, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) c66362UDb.getProgressDrawable().getCurrent()).findDrawableByLayerId(R.id.progress);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public void setTestID(C66362UDb c66362UDb, String str) {
        super.setTestId(c66362UDb, str);
    }

    @ReactProp(customType = "ImageSource", name = "thumbImage")
    public /* bridge */ /* synthetic */ void setThumbImage(View view, ReadableMap readableMap) {
    }

    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(C66362UDb c66362UDb, Integer num) {
        Drawable thumb = c66362UDb.getThumb();
        if (num == null) {
            thumb.clearColorFilter();
        } else {
            thumb.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(customType = "ImageSource", name = "trackImage")
    public /* bridge */ /* synthetic */ void setTrackImage(View view, ReadableMap readableMap) {
    }

    public void addEventEmitters(R3N r3n, C66362UDb c66362UDb) {
        c66362UDb.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ ReactShadowNode createShadowNodeInstance() {
        return new ReactSliderShadowNode();
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(View view, boolean z) {
        view.setEnabled(z);
    }

    @ReactProp(defaultDouble = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR, name = "maximumValue")
    public void setMaximumValue(C66362UDb c66362UDb, double d) {
        c66362UDb.setMaxValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(C66362UDb c66362UDb, double d) {
        c66362UDb.setMinValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = OptSvcAnalyticsStore.LOGGING_KEY_STEP)
    public void setStep(C66362UDb c66362UDb, double d) {
        c66362UDb.setStep(d);
    }

    public /* bridge */ /* synthetic */ void setTestID(View view, String str) {
        super.setTestId(view, str);
    }
}
