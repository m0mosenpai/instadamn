package X;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes9.dex */
public final class N42 extends AbstractC72473Mu {
    public RecyclerView A00;
    public InterfaceC16660sJ A01;
    public final InterfaceC09390do A02;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.country_recycler_view);
        this.A00 = A0G;
        if (A0G != null) {
            AbstractC31174DnI.A15(getActivity(), A0G);
        }
        InterfaceC09390do interfaceC09390do = this.A02;
        C51113MiI c51113MiI = new C51113MiI(new C57743PjW(this, 8), ((C50931Mf0) interfaceC09390do.getValue()).A05);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(c51113MiI);
        }
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((C50931Mf0) interfaceC09390do.getValue()).A00, new C50362MLo(21, c51113MiI, this), 37);
        ((IgdsInlineSearchBox) AbstractC166997dE.A0R(view, R.id.search_box)).A02 = new P39(this, 1);
        AbstractC166997dE.A0S(view, R.id.nav_buttons_and_title_container).setVisibility(AbstractC167007dF.A05(((C50931Mf0) interfaceC09390do.getValue()).A04 ? 1 : 0));
        if (((C50931Mf0) interfaceC09390do.getValue()).A04) {
            ViewOnClickListenerC55461OkG.A00(AbstractC166997dE.A0S(view, R.id.back_button_icon), 2, this);
        }
    }

    public N42() {
        C57554PgS A01 = C57554PgS.A01(this, 38);
        InterfaceC09390do A00 = C57554PgS.A00(C57554PgS.A01(this, 35), EnumC09460dv.A02, 36);
        this.A02 = AbstractC25225BEi.A0a(C57554PgS.A01(A00, 37), A01, C57534Pg8.A00(A00, null, 14), AbstractC25225BEi.A1D(C50931Mf0.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1891906798);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_lead_gen_country_picker, viewGroup, false);
        C0f9.A09(1343740376, A02);
        return inflate;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1291030140);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(1139877462, A02);
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        int A02 = C0f9.A02(-634709617);
        super.onStart();
        if (((C50931Mf0) this.A02.getValue()).A04) {
            int i = Resources.getSystem().getDisplayMetrics().widthPixels;
            int i2 = Resources.getSystem().getDisplayMetrics().heightPixels;
            Dialog dialog = super.A01;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setLayout((int) (i * 0.9d), (int) (i2 * 0.9d));
            }
        }
        C0f9.A09(1545980879, A02);
    }
}
