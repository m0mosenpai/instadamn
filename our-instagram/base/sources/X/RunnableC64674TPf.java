package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.TPf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64674TPf implements Runnable {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ View A02;

    public RunnableC64674TPf(Dialog dialog, Context context, View view) {
        this.A02 = view;
        this.A01 = context;
        this.A00 = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Window window;
        View view = this.A02;
        Context context = this.A01;
        if (context != null) {
            obj = context.getSystemService("input_method");
        } else {
            obj = null;
        }
        C14360o3.A0C(obj, MSV.A00(8));
        ((InputMethodManager) obj).showSoftInput(view, 1);
        Dialog dialog = this.A00;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }
}
