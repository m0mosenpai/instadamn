package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58982mw {
    public static final C57112jm A00(View view) {
        C14360o3.A0B(view, 0);
        return A01(AbstractC58952mt.A00(view));
    }

    public static final C57112jm A01(InterfaceC58972mv interfaceC58972mv) {
        View view;
        C2d7 c2d7 = (C2d7) AbstractC13320mI.A00(interfaceC58972mv.getContext(), C2d7.class);
        if (c2d7 == null) {
            if ((interfaceC58972mv instanceof C58962mu) && (view = (View) ((C58962mu) interfaceC58972mv).A00.get()) != null) {
                Object parent = view.getParent();
                while (parent instanceof ViewGroup) {
                    View view2 = (View) parent;
                    c2d7 = (C2d7) AbstractC13320mI.A00(view2.getContext(), C2d7.class);
                    parent = view2.getParent();
                    if (c2d7 == null) {
                    }
                }
                return null;
            }
            return null;
        }
        return c2d7.CGS();
    }
}
