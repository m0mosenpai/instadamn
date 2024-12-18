package com.instagram.react.modules.base;

import X.AbstractC166987dD;
import X.AbstractC25227BEk;
import X.AbstractC58321PtD;
import X.C0fJ;
import X.C193328hC;
import X.DialogInterfaceOnDismissListenerC63429Sk8;
import X.R3M;
import android.app.Activity;
import android.app.Dialog;
import com.facebook.fbreact.specs.NativeIgDialogSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "IgDialog")
/* loaded from: classes10.dex */
public class IgReactDialogModule extends NativeIgDialogSpec {
    public static final String CANCELABLE_KEY = "IS_CANCELABLE";
    public static final String CANCELED_ON_TOUCH_OUTSIDE_KEY = "CANCELED_ON_TOUCH_OUTSIDE";
    public static final String GRAVITY_BOTTOM = "BOTTOM";
    public static final String GRAVITY_CENTER = "CENTER";
    public static final String GRAVITY_TOP = "TOP";
    public static final String MODULE_NAME = "IgDialog";
    public static final String NEGATIVE_BUTTON_KEY = "NEGATIVE_BUTTON";
    public static final String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT";
    public static final String POSITIVE_BUTTON_KEY = "POSITIVE_BUTTON";
    public static final String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT";

    @Override // com.facebook.fbreact.specs.NativeIgDialogSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IgDialog";
    }

    public IgReactDialogModule(R3M r3m) {
        super(r3m);
    }

    @Override // com.facebook.fbreact.specs.NativeIgDialogSpec
    public Map getTypedExportedConstants() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(CANCELABLE_KEY, CANCELABLE_KEY);
        A1G.put(CANCELED_ON_TOUCH_OUTSIDE_KEY, CANCELED_ON_TOUCH_OUTSIDE_KEY);
        A1G.put(NEGATIVE_BUTTON_TEXT_KEY, NEGATIVE_BUTTON_TEXT_KEY);
        A1G.put(NEGATIVE_BUTTON_KEY, -2);
        A1G.put(POSITIVE_BUTTON_KEY, AbstractC25227BEk.A0o());
        A1G.put(POSITIVE_BUTTON_TEXT_KEY, POSITIVE_BUTTON_TEXT_KEY);
        A1G.put("TOP", 48);
        A1G.put("CENTER", 17);
        A1G.put("BOTTOM", 80);
        return A1G;
    }

    public Dialog showDialogHelper(String str, String str2, ReadableMap readableMap, Callback callback, Callback callback2) {
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 == null) {
            return null;
        }
        C193328hC c193328hC = new C193328hC(A01);
        if (str != null && !str.isEmpty()) {
            c193328hC.A05 = str;
        }
        if (str2 != null && !str2.isEmpty()) {
            c193328hC.A0r(str2);
        }
        if (readableMap.hasKey(CANCELABLE_KEY)) {
            c193328hC.A0s(readableMap.getBoolean(CANCELABLE_KEY));
        }
        if (readableMap.hasKey(CANCELED_ON_TOUCH_OUTSIDE_KEY)) {
            c193328hC.A0t(readableMap.getBoolean(CANCELED_ON_TOUCH_OUTSIDE_KEY));
        }
        DialogInterfaceOnDismissListenerC63429Sk8 dialogInterfaceOnDismissListenerC63429Sk8 = new DialogInterfaceOnDismissListenerC63429Sk8(callback2, callback);
        if (readableMap.hasKey(NEGATIVE_BUTTON_TEXT_KEY)) {
            c193328hC.A0c(dialogInterfaceOnDismissListenerC63429Sk8, readableMap.getString(NEGATIVE_BUTTON_TEXT_KEY));
        }
        if (readableMap.hasKey(POSITIVE_BUTTON_TEXT_KEY)) {
            c193328hC.A0d(dialogInterfaceOnDismissListenerC63429Sk8, readableMap.getString(POSITIVE_BUTTON_TEXT_KEY));
        }
        c193328hC.A0g(dialogInterfaceOnDismissListenerC63429Sk8);
        Dialog A02 = c193328hC.A02();
        C0fJ.A00(A02);
        return A02;
    }

    @Override // com.facebook.fbreact.specs.NativeIgDialogSpec
    public void showDialog(String str, String str2, ReadableMap readableMap, Callback callback, Callback callback2) {
        showDialogHelper(str, str2, readableMap, callback, callback2);
    }
}
