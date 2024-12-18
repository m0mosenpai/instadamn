package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.71Q, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C71Q {
    public static InterfaceC56002hn A00(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof InterfaceC56002hn)) {
            parent = parent.getParent();
        }
        return (InterfaceC56002hn) parent;
    }
}
