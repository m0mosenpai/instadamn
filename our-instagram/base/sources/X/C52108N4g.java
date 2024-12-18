package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.N4g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52108N4g extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LeadGenCreateFormMediaPickerFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public RecyclerView A04;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A07 = AbstractC25225BEi.A0a(C57554PgS.A01(this, 42), C57554PgS.A01(this, 43), C57534Pg8.A00(this, null, 16), AbstractC25225BEi.A1D(UFL.class));
    public final InterfaceC09390do A05 = C1XM.A00(C57554PgS.A01(this, 41));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_gen_create_form_media_picker";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A07;
        UFL ufl = (UFL) interfaceC09390do.getValue();
        if (ufl.A00 == 0) {
            ufl.A00();
        }
        this.A03 = view.findViewById(R.id.loading_spinner);
        this.A00 = view.findViewById(R.id.media_picker_empty_state_icon);
        this.A02 = view.findViewById(R.id.media_picker_empty_state_title);
        this.A01 = view.findViewById(R.id.media_picker_empty_state_subtitle);
        RecyclerView A0B = AbstractC43592JPx.A0B(view, R.id.media_container);
        this.A04 = A0B;
        if (A0B != null) {
            A0B.setLayoutManager(new GridLayoutManager(getActivity(), 3));
            A0B.A10(new C51184MjS(A0B.getResources().getDimensionPixelOffset(R.dimen.account_recs_header_image_margin), 3));
            A0B.setAdapter((C2UU) AbstractC166987dD.A17(this.A05));
            A0B.setItemAnimator(null);
            AbstractC37304Gc5.A0y(A0B.A0D, A0B, new P2N(this, 0), C153146ui.A07);
        }
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((UFL) interfaceC09390do.getValue()).A03, new C57743PjW(this, 10), 39);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1830990148);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_create_form_media_picker, viewGroup, false);
        C0f9.A09(-2134119029, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2145061037);
        super.onDestroyView();
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        C0f9.A09(-1480309062, A02);
    }
}
