package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes10.dex */
public final class TNE implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;

    public TNE(View view, Context context) {
        this.A01 = view;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        View view = this.A01;
        Context context = this.A00;
        if (context != null) {
            obj = context.getSystemService("input_method");
        } else {
            obj = null;
        }
        C14360o3.A0C(obj, MSV.A00(8));
        ((InputMethodManager) obj).showSoftInput(view, 1);
    }
}
