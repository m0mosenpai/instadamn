package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;

/* loaded from: classes9.dex */
public final class N4Y extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ArchiveQuickSnapFragment";
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C194218ig A04;
    public C6WQ A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C57519Pft(this, 8));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C3P9 A0s = AbstractC166987dD.A0s(AbstractC166997dE.A0S(view, R.id.quick_snap_empty_archive_qs_camera));
        A0s.A06 = false;
        C52374NFq.A00(A0s, this, 24);
        this.A01 = view.requireViewById(R.id.quick_snap_empty_archive);
        View requireViewById = view.requireViewById(R.id.quick_snap_recap_button);
        C14360o3.A0A(requireViewById);
        requireViewById.setVisibility(8);
        ViewOnClickListenerC55456OkA.A00(requireViewById, 54, this);
        this.A02 = requireViewById;
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        InterfaceC09390do interfaceC09390do = this.A06;
        A0R.A01(new NFA(this, (QuickSnapArchiveViewModel) interfaceC09390do.getValue()));
        A0R.A08 = true;
        A0R.A06 = "QuickSnapArchiveController";
        this.A04 = new C194218ig(A0R.A00());
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.quick_snap_archive_recycler_view);
        C194218ig c194218ig = this.A04;
        if (c194218ig != null) {
            A0G.setAdapter(c194218ig.A01);
            GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getActivity(), 3, 1, false);
            C194218ig c194218ig2 = this.A04;
            if (c194218ig2 != null) {
                gridLayoutManager.A01 = new C194418j2(c194218ig2.A01, 3);
                A0G.setLayoutManager(gridLayoutManager);
                this.A03 = A0G;
                this.A00 = view.requireViewById(R.id.quick_snap_archive_spinner);
                ((QuickSnapArchiveViewModel) interfaceC09390do.getValue()).A05();
                ((QuickSnapArchiveViewModel) interfaceC09390do.getValue()).A04();
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 24), C07Y.A00(viewLifecycleOwner));
                return;
            }
        }
        C14360o3.A0F("archiveAdapter");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    public N4Y() {
        C57519Pft c57519Pft = new C57519Pft(this, 7);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57519Pft(new C57519Pft(this, 9), 10));
        this.A06 = AbstractC25225BEi.A0a(new C57519Pft(A00, 11), c57519Pft, new C57257Pbf(27, null, A00), AbstractC25225BEi.A1D(QuickSnapArchiveViewModel.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(506612346);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_quick_snap_archive_grid, false);
        C0f9.A09(-1364955977, A02);
        return A0R;
    }
}
