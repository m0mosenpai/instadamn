package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.0RZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RZ extends C0YY implements InterfaceC16660sJ {
    public static final C0RZ A00 = new C0RZ();

    public C0RZ() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        C14360o3.A0B(view, 0);
        Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
        if (!(tag instanceof InterfaceC018407e)) {
            return null;
        }
        return tag;
    }
}
