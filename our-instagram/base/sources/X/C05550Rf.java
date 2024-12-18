package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0Rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05550Rf extends C0YY implements InterfaceC16660sJ {
    public static final C05550Rf A00 = new C05550Rf();

    public C05550Rf() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        C14360o3.A0B(view, 0);
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return null;
        }
        return parent;
    }
}
