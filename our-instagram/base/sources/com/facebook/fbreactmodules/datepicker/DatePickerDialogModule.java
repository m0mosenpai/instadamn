package com.facebook.fbreactmodules.datepicker;

import X.AbstractC10360h2;
import X.AbstractC166987dD;
import X.AbstractC58321PtD;
import X.AbstractC58323PtF;
import X.C0SG;
import X.InterfaceC65622ToD;
import X.R3M;
import X.Rkt;
import X.RunnableC64695TQa;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeDatePickerAndroidSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "DatePickerAndroid")
/* loaded from: classes10.dex */
public class DatePickerDialogModule extends NativeDatePickerAndroidSpec {
    public static final String ACTION_DATE_SET = "dateSetAction";
    public static final String ACTION_DISMISSED = "dismissedAction";
    public static final String ARG_DATE = "date";
    public static final String ARG_MAXDATE = "maxDate";
    public static final String ARG_MINDATE = "minDate";
    public static final String ARG_MODE = "mode";
    public static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    public static final String FRAGMENT_TAG = "DatePickerAndroid";
    public Rkt _UL_mInjectionContext;

    public DatePickerDialogModule(R3M r3m) {
        super(r3m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC58323PtF.A17(A0b, readableMap, ARG_DATE);
        AbstractC58323PtF.A17(A0b, readableMap, ARG_MINDATE);
        AbstractC58323PtF.A17(A0b, readableMap, ARG_MAXDATE);
        if (readableMap.hasKey(ARG_MODE) && !readableMap.isNull(ARG_MODE)) {
            A0b.putString(ARG_MODE, readableMap.getString(ARG_MODE));
        }
        return A0b;
    }

    @Override // com.facebook.fbreact.specs.NativeDatePickerAndroidSpec
    public void open(ReadableMap readableMap, InterfaceC65622ToD interfaceC65622ToD) {
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (A01 != null && (A01 instanceof FragmentActivity)) {
            FragmentActivity fragmentActivity = (FragmentActivity) A01;
            AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            C0SG c0sg = (C0SG) supportFragmentManager.A0Q("DatePickerAndroid");
            if (c0sg != null) {
                c0sg.A07();
            }
            fragmentActivity.runOnUiThread(new RunnableC64695TQa(supportFragmentManager, this, interfaceC65622ToD, readableMap));
            return;
        }
        interfaceC65622ToD.reject(ERROR_NO_ACTIVITY, "Tried to open a DatePicker dialog while not attached to a FragmentActivity");
    }
}
