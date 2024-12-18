package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.C203858zu;
import X.InterfaceC203868zv;
import X.RunnableC200708uD;
import X.RunnableC200718uE;
import X.RunnableC203878zy;
import X.RunnableC24259ApQ;
import X.RunnableC24544Au1;
import X.RunnableC24545Au2;
import X.RunnableC24546Au3;
import X.RunnableC24547Au4;
import X.RunnableC24548Au5;
import X.RunnableC24729AxD;
import X.RunnableC24880Azf;
import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: classes4.dex */
public class UIControlServiceDelegateWrapper implements InterfaceC203868zv {
    public final C203858zu mCommonDelegate;
    public final String mEffectId;
    public NativeDataPromise mPromise;

    public void enterTextEditMode(String str, boolean z, int i, int i2, NativeDataPromise nativeDataPromise) {
        this.mPromise = nativeDataPromise;
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC24880Azf(c203858zu, this, str, i, i2, z));
    }

    public void configurePicker(PickerConfiguration pickerConfiguration) {
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC24548Au5(pickerConfiguration, c203858zu));
    }

    public void configureSlider(SliderConfiguration sliderConfiguration) {
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC203878zy(sliderConfiguration, c203858zu));
    }

    public void enterRawTextEditMode(String str, RawEditableTextListener rawEditableTextListener) {
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC24729AxD(c203858zu, rawEditableTextListener, str));
    }

    public void exitRawTextEditMode() {
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC24259ApQ(c203858zu));
    }

    public void hidePicker() {
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC200718uE(c203858zu));
    }

    public void hideSlider() {
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC200708uD(c203858zu));
    }

    @Override // X.InterfaceC203868zv
    public void onTextEditComplete(String str) {
        NativeDataPromise nativeDataPromise = this.mPromise;
        if (nativeDataPromise != null) {
            nativeDataPromise.setValue(new EditedText(str.trim()));
        }
    }

    public void setPickerSelectedIndex(int i) {
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC24544Au1(c203858zu, i));
    }

    public void setSliderValue(float f) {
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC24546Au3(c203858zu, f));
    }

    public void showPicker(OnPickerItemSelectedListener onPickerItemSelectedListener) {
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC24547Au4(c203858zu, onPickerItemSelectedListener));
    }

    public void showSlider(OnAdjustableValueChangedListener onAdjustableValueChangedListener) {
        C203858zu c203858zu = this.mCommonDelegate;
        c203858zu.A00.post(new RunnableC24545Au2(c203858zu, onAdjustableValueChangedListener));
    }

    public UIControlServiceDelegateWrapper(String str, C203858zu c203858zu) {
        this.mEffectId = str;
        this.mCommonDelegate = c203858zu;
        c203858zu.A00.post(new RunnableC203878zy(new SliderConfiguration(0, 0, null, null), c203858zu));
    }
}
