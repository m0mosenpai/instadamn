package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KD2 extends AbstractC59962oe implements InterfaceC58055Pog {
    public static final String __redex_internal_original_name = "GalleryImportOAFragment";
    public C8BF A00;
    public C8A7 A01;
    public C48278LYb A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "gallery_import_oa_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToBottom() {
        boolean z;
        C48278LYb c48278LYb = this.A02;
        if (c48278LYb == null) {
            C14360o3.A0F("galleryImportOAController");
            throw C00O.createAndThrow();
        }
        RecyclerView recyclerView = c48278LYb.A00;
        if (recyclerView != null) {
            z = recyclerView.canScrollVertically(1);
        } else {
            z = false;
        }
        return !z;
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToTop() {
        boolean z;
        C48278LYb c48278LYb = this.A02;
        if (c48278LYb == null) {
            C14360o3.A0F("galleryImportOAController");
            throw C00O.createAndThrow();
        }
        RecyclerView recyclerView = c48278LYb.A00;
        if (recyclerView != null) {
            z = AbstractC43592JPx.A1X(recyclerView);
        } else {
            z = false;
        }
        return !z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2ba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.2ba, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-857039125);
        super.onCreate(bundle);
        this.A02 = new C48278LYb(this, AbstractC166987dD.A0r(this.A03), this);
        FragmentActivity requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        this.A01 = (C8A7) new C52942bb((InterfaceC52932ba) new Object(), requireActivity).A00(C8A7.class);
        FragmentActivity requireActivity2 = requireActivity();
        C14360o3.A0C(requireActivity2, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        this.A00 = (C8BF) new C52942bb((InterfaceC52932ba) new Object(), requireActivity2).A00(C8BF.class);
        C48278LYb c48278LYb = this.A02;
        if (c48278LYb == null) {
            C14360o3.A0F("galleryImportOAController");
            throw C00O.createAndThrow();
        }
        registerLifecycleListener(c48278LYb);
        C0f9.A09(839478858, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1439622940);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.gallery_grid, false);
        C0f9.A09(-802992671, A02);
        return A0R;
    }
}
