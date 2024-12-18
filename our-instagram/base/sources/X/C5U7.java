package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.5U7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5U7 extends C0YY implements InterfaceC16660sJ {
    public static final C5U7 A00 = new C5U7();

    public C5U7() {
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
