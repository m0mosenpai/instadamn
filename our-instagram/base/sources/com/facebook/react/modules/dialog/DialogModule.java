package com.facebook.react.modules.dialog;

import X.AbstractC166987dD;
import X.AbstractC25227BEk;
import X.AbstractC58321PtD;
import X.C0I2;
import X.C0SG;
import X.C62791SRl;
import X.C63255SgD;
import X.InterfaceC65542TmH;
import X.R3M;
import X.RunnableC64700TQf;
import X.SWM;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = NativeDialogManagerAndroidSpec.NAME)
/* loaded from: classes10.dex */
public class DialogModule extends NativeDialogManagerAndroidSpec implements InterfaceC65542TmH {
    public static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    public static final String ACTION_DISMISSED = "dismissed";
    public static final Map CONSTANTS;
    public static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    public static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    public static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    public static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    public static final String KEY_CANCELABLE = "cancelable";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TITLE = "title";
    public boolean mIsInForeground;

    @Override // X.InterfaceC65542TmH
    public void onHostDestroy() {
    }

    @Override // X.InterfaceC65542TmH
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // X.InterfaceC65542TmH
    public void onHostResume() {
        this.mIsInForeground = true;
        SWM fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            C62791SRl.A00(fragmentManagerHelper.A02.mIsInForeground, "showPendingAlert() called in background");
            if (fragmentManagerHelper.A00 != null) {
                SWM.A00(fragmentManagerHelper);
                ((C0SG) fragmentManagerHelper.A00).A0B(fragmentManagerHelper.A01, FRAGMENT_TAG);
                fragmentManagerHelper.A00 = null;
                return;
            }
            return;
        }
        C0I2.A00(DialogModule.class, "onHostResume called but no FragmentManager found");
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public Map getTypedExportedConstants() {
        return CONSTANTS;
    }

    static {
        Integer A0o = AbstractC25227BEk.A0o();
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED);
        A1G.put(ACTION_DISMISSED, ACTION_DISMISSED);
        A1G.put(KEY_BUTTON_POSITIVE, A0o);
        A1G.put(KEY_BUTTON_NEGATIVE, -2);
        A1G.put(KEY_BUTTON_NEUTRAL, -3);
        CONSTANTS = A1G;
    }

    public DialogModule(R3M r3m) {
        super(r3m);
    }

    private SWM getFragmentManagerHelper() {
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 != null && (A01 instanceof FragmentActivity)) {
            return new SWM(((FragmentActivity) A01).getSupportFragmentManager(), this);
        }
        return null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        AbstractC58321PtD.A0b(this).A0A(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        AbstractC58321PtD.A0b(this).A0B(this);
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        SWM fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            AbstractC58321PtD.A1K(callback, "Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle A0b = AbstractC166987dD.A0b();
        if (readableMap.hasKey(KEY_TITLE)) {
            A0b.putString(KEY_TITLE, readableMap.getString(KEY_TITLE));
        }
        if (readableMap.hasKey(KEY_MESSAGE)) {
            A0b.putString(KEY_MESSAGE, readableMap.getString(KEY_MESSAGE));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            A0b.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            A0b.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            A0b.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            A0b.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            A0b.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        C63255SgD.A01(new RunnableC64700TQf(A0b, callback2, fragmentManagerHelper, this));
    }
}
