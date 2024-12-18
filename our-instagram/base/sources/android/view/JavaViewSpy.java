package android.view;

import X.AbstractC166987dD;
import android.content.Context;

/* loaded from: classes10.dex */
public class JavaViewSpy extends View {
    public JavaViewSpy(Context context) {
        super(context);
        throw AbstractC166987dD.A1D("This class isn't meant to be instantiated");
    }

    public static int windowAttachCount(View view) {
        return view.getWindowAttachCount();
    }
}
