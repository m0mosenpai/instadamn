package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0Rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05510Rb extends C0YY implements InterfaceC16660sJ {
    public static final C05510Rb A00 = new C05510Rb();

    public C05510Rb() {
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
