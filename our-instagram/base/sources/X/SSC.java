package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes10.dex */
public abstract class SSC {
    public static final void A00(View view) {
        Context context;
        if (view != null && (context = view.getContext()) != null) {
            Object systemService = context.getSystemService("input_method");
            C14360o3.A0C(systemService, MSV.A00(8));
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            IBinder windowToken = view.getWindowToken();
            if (windowToken != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }

    public static final void A01(View view) {
        Context context;
        if (view != null && (context = view.getContext()) != null) {
            Configuration A08 = AbstractC58319PtB.A08(context);
            Object systemService = context.getSystemService("input_method");
            C14360o3.A0C(systemService, MSV.A00(8));
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (A08.keyboard == 1 || A08.hardKeyboardHidden != 1) {
                inputMethodManager.showSoftInput(view, 2);
            }
        }
    }
}
