package com.facebook.fbreact.views.picker;

import X.AbstractC70462WWz;
import X.InterfaceC65496TlK;
import X.R3N;
import X.UDc;
import android.view.View;
import android.widget.Spinner;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = ReactDropdownPickerManager.REACT_CLASS)
/* loaded from: classes11.dex */
public class ReactDropdownPickerManager extends ReactPickerManager {
    public static final String REACT_CLASS = "AndroidDropdownPicker";
    public final InterfaceC65496TlK mDelegate;

    public ReactDropdownPickerManager() {
        super(null);
        this.mDelegate = new AbstractC70462WWz(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public UDc createViewInstance(R3N r3n) {
        return new UDc(r3n, 1);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC65496TlK getDelegate() {
        return this.mDelegate;
    }

    @ReactProp(customType = "Color", name = "color")
    public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
        ((UDc) view).A02 = num;
    }

    @ReactProp(name = DialogModule.KEY_ITEMS)
    public /* bridge */ /* synthetic */ void setItems(View view, ReadableArray readableArray) {
        super.setItems((UDc) view, readableArray);
    }

    @ReactProp(name = "prompt")
    public /* bridge */ /* synthetic */ void setPrompt(View view, String str) {
        ((Spinner) view).setPrompt(str);
    }

    @ReactProp(name = "selected")
    public /* bridge */ /* synthetic */ void setSelected(View view, int i) {
        ((UDc) view).setStagedSelection(i);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(UDc uDc, int i) {
        uDc.A01 = Integer.valueOf(i);
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(View view, boolean z) {
        view.setEnabled(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ View createViewInstance(R3N r3n) {
        return new UDc(r3n, 1);
    }
}
