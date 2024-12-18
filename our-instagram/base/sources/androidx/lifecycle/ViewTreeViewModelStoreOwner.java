package androidx.lifecycle;

import X.AbstractC224517h;
import X.AbstractC224717j;
import X.C05510Rb;
import X.C0RZ;
import X.C14360o3;
import X.InterfaceC018407e;
import android.view.View;
import com.facebook.R;

/* loaded from: classes2.dex */
public abstract class ViewTreeViewModelStoreOwner {
    public static final InterfaceC018407e A00(View view) {
        C14360o3.A0B(view, 0);
        return (InterfaceC018407e) AbstractC224517h.A01(AbstractC224517h.A06(C0RZ.A00, AbstractC224717j.A0C(view, C05510Rb.A00)));
    }

    public static final void A01(View view, InterfaceC018407e interfaceC018407e) {
        C14360o3.A0B(view, 0);
        view.setTag(R.id.view_tree_view_model_store_owner, interfaceC018407e);
    }
}
