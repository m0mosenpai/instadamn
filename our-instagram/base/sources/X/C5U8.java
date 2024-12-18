package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.5U8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5U8 extends C0YY implements InterfaceC16660sJ {
    public static final C5U8 A00 = new C5U8();

    public C5U8() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        C14360o3.A0B(view, 0);
        Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
        if (!(tag instanceof InterfaceC08430c6)) {
            return null;
        }
        return tag;
    }
}
