package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes11.dex */
public final class WEB {
    public static final WEB A00 = new Object();

    public static final Object A01(C6FQ c6fq, C6FW c6fw) {
        View findViewById;
        InputMethodManager inputMethodManager;
        C6FG A002 = C103064kh.A00(c6fq, c6fw, 0);
        C102884kP c102884kP = AnonymousClass634.A02(A002).A06;
        C14360o3.A0C(c102884kP, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        View A05 = c102884kP.A05(A002);
        if (A05 != null) {
            InputMethodManager inputMethodManager2 = (InputMethodManager) A05.getContext().getSystemService("input_method");
            if (inputMethodManager2 != null) {
                inputMethodManager2.hideSoftInputFromWindow(A05.getWindowToken(), 0);
            }
            A05.clearFocus();
            return null;
        }
        Context context = A002.A00;
        Activity A003 = A00.A00(context);
        if (A003 == null || (findViewById = A003.findViewById(R.id.content)) == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return null;
        }
        inputMethodManager.hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
        return null;
    }

    private final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            C14360o3.A07(baseContext);
            return A00(baseContext);
        }
        return null;
    }
}
