package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.0Re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05540Re extends C0YY implements InterfaceC16660sJ {
    public static final C05540Re A00 = new C05540Re();

    public C05540Re() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        C14360o3.A0B(view, 0);
        Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
        if (!(tag instanceof C07X)) {
            return null;
        }
        return tag;
    }
}
