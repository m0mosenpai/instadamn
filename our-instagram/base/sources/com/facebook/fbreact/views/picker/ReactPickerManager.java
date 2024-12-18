package com.facebook.fbreact.views.picker;

import X.AbstractC31174DnI;
import X.AbstractC65702TsY;
import X.C0fA;
import X.C68900Vdx;
import X.R3N;
import X.UB5;
import X.UDc;
import X.WVC;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.SpinnerAdapter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class ReactPickerManager extends SimpleViewManager {
    public ReactPickerManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(UDc uDc, String str, ReadableArray readableArray) {
        if (str.equals("setNativeSelectedPosition") && readableArray != null) {
            uDc.setImmediateSelection(readableArray.getInt(0));
        }
    }

    @ReactProp(name = DialogModule.KEY_ITEMS)
    public void setItems(UDc uDc, ReadableArray readableArray) {
        ArrayList arrayList;
        if (readableArray == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readableArray.size());
            for (int i = 0; i < readableArray.size(); i++) {
                arrayList.add(new C68900Vdx(readableArray.getMap(i)));
            }
        }
        uDc.A05 = arrayList;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(R3N r3n, UDc uDc) {
        uDc.A00 = new WVC(uDc, UIManagerHelper.A05(r3n, uDc.getId()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        Map exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        HashMap hashMap = new HashMap();
        hashMap.put("topSelect", AbstractC31174DnI.A12("phasedRegistrationNames", AbstractC65702TsY.A0m("bubbled", "onSelect", "captured", "onSelectCapture")));
        exportedCustomBubblingEventTypeConstants.putAll(hashMap);
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(UDc uDc) {
        int intValue;
        super.onAfterUpdateTransaction((View) uDc);
        uDc.setOnItemSelectedListener(null);
        UB5 ub5 = (UB5) uDc.getAdapter();
        int selectedItemPosition = uDc.getSelectedItemPosition();
        List list = uDc.A05;
        if (list != null && list != uDc.A04) {
            uDc.A04 = list;
            uDc.A05 = null;
            if (ub5 == null) {
                ub5 = new UB5(uDc.getContext(), list);
                uDc.setAdapter((SpinnerAdapter) ub5);
            } else {
                ub5.clear();
                ub5.addAll(uDc.A04);
                C0fA.A00(ub5, 1142137060);
            }
        }
        Integer num = uDc.A03;
        if (num != null && (intValue = num.intValue()) != selectedItemPosition) {
            uDc.setSelection(intValue, false);
            uDc.A03 = null;
        }
        Integer num2 = uDc.A02;
        if (num2 != null && ub5 != null && num2 != ub5.A01) {
            ub5.A01 = num2;
            C0fA.A00(ub5, 1237627749);
            uDc.setBackgroundTintList(ColorStateList.valueOf(uDc.A02.intValue()));
            uDc.A02 = null;
        }
        Integer num3 = uDc.A01;
        if (num3 != null && ub5 != null && num3 != ub5.A00) {
            ub5.A00 = num3;
            C0fA.A00(ub5, -600922149);
            uDc.A01 = null;
        }
        uDc.setOnItemSelectedListener(uDc.A07);
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(UDc uDc, Integer num) {
        uDc.A02 = num;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(UDc uDc, boolean z) {
        uDc.setEnabled(z);
    }

    @ReactProp(name = "prompt")
    public void setPrompt(UDc uDc, String str) {
        uDc.setPrompt(str);
    }

    @ReactProp(name = "selected")
    public void setSelected(UDc uDc, int i) {
        uDc.setStagedSelection(i);
    }
}
