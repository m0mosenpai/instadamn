package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;

/* loaded from: classes4.dex */
public abstract class A1C {
    public static final void A00(Context context, TextView textView, String str, String str2) {
        int i;
        Object[] objArr;
        AbstractC167017dG.A1P(textView, str);
        Resources resources = context.getResources();
        if (str2 != null) {
            i = 2131970239;
            objArr = new Object[]{str2, str};
        } else {
            i = 2131970240;
            objArr = new Object[]{str};
        }
        String string = resources.getString(i, objArr);
        C14360o3.A0A(string);
        textView.setText(C2UX.A00().Cny(-1, string));
    }
}
