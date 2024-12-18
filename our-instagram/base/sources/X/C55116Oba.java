package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.Window;

/* renamed from: X.Oba, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55116Oba {
    public static final C55116Oba A00 = new Object();

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

    public static final Object A01(C6FQ c6fq, C6FW c6fw) {
        Window window;
        boolean A01 = C6DZ.A01(c6fw.A01());
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Activity A002 = A00.A00(c6fg.A00);
            if (A002 != null && (window = A002.getWindow()) != null) {
                if (A01) {
                    window.addFlags(8192);
                } else {
                    window.clearFlags(8192);
                    return null;
                }
            }
        }
        return null;
    }
}
