package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.3DO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DO {
    /* JADX WARN: Multi-variable type inference failed */
    public final C3DN A00(Activity activity) {
        InterfaceC47352Fi interfaceC47352Fi;
        C3DN A00;
        if (activity != 0) {
            Activity parent = activity.getParent();
            if (parent != null && (A00 = A00(parent)) != null) {
                return A00;
            }
            if ((activity instanceof InterfaceC47352Fi) && (interfaceC47352Fi = (InterfaceC47352Fi) activity) != null) {
                return interfaceC47352Fi.getBottomSheetNavigator();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3DN A01(Context context) {
        InterfaceC47352Fi interfaceC47352Fi;
        Activity parent;
        C3DN A00;
        if (context != null) {
            Activity activity = (Activity) AbstractC13320mI.A00(context, Activity.class);
            if (activity != 0 && (parent = activity.getParent()) != null && (A00 = A00(parent)) != null) {
                return A00;
            }
            if ((activity instanceof InterfaceC47352Fi) && (interfaceC47352Fi = (InterfaceC47352Fi) activity) != null) {
                return interfaceC47352Fi.getBottomSheetNavigator();
            }
        }
        return null;
    }
}
