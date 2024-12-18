package X;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.WtW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71408WtW implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public RunnableC71408WtW(Context context, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = context;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager;
        Context context = this.A00;
        Object systemService = context.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        } else {
            inputMethodManager = null;
        }
        Activity A00 = C66224U4u.A00(context);
        if (A00 != null && A00.getWindow() != null && inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(AbstractC43592JPx.A08(A00).getWindowToken(), 0);
        }
        this.A01.invoke();
    }
}
