package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0SR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SR extends C0YY implements InterfaceC16660sJ {
    public static final C0SR A00 = new C0SR();

    public C0SR() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewGroup viewGroup;
        View view = (View) obj;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        return new C12500ku(viewGroup);
    }
}
