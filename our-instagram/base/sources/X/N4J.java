package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class N4J extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MediaKitAddSectionSheetFragment";
    public RecyclerView A00;
    public final InterfaceC09390do A02 = AbstractC25225BEi.A0a(new C57248PbW(this, 36), new C57248PbW(this, 37), C57535Pg9.A00(null, this, 20), AbstractC25225BEi.A1D(C51053Mh7.class));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31172DnG.A0G(view, R.id.mk_add_section_types_list);
        C66362zD A0R = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new Object());
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(A0R);
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.A10(new C51189MjX(requireContext().getColor(R.color.igds_quick_send_divider_background), AbstractC167017dG.A03(requireContext())));
                ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                ArrayList A1N = AbstractC16960so.A1N(new C56109OvT(MediaKitSectionType.A07, this, AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131966738), AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131966737)), new C56109OvT(MediaKitSectionType.A06, this, AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131966734), AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131966733)), new C56109OvT(MediaKitSectionType.A04, this, AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131966736), AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131966735)));
                C51053Mh7 A0l = MSW.A0l(this.A02);
                if (A0l.A08.A04) {
                    ArrayList arrayList = A0l.A07.A02.A04;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((C51850Mvs) it.next()).A01 == MediaKitSectionType.A05) {
                                break;
                            }
                        }
                    }
                    A1N.add(new C56109OvT(MediaKitSectionType.A05, this, AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131966732), AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131966731)));
                }
                A0E.A01(A1N);
                A0R.A05(A0E);
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1330430032);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_add_section_bottom_sheet_fragment, false);
        C0f9.A09(1359127020, A02);
        return A0R;
    }
}
