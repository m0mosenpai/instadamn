package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.IGRevShareProductType;

/* loaded from: classes9.dex */
public final class N5F extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PublisherControlBlockedCategoriesFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131963840);
        interfaceC56362iU.EkT(new ViewOnClickListenerC28666ClE(this, 15), true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "publisher_control_blocked_categories";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        BVI bvi;
        String string;
        SpannableStringBuilder A0H;
        int A02;
        int i;
        String quantityString;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.blocked_category_disclaimer_text);
        InterfaceC09390do interfaceC09390do = this.A03;
        IGRevShareProductType iGRevShareProductType = ((C50975Mfi) interfaceC09390do.getValue()).A02;
        IGRevShareProductType iGRevShareProductType2 = IGRevShareProductType.A04;
        Object value = interfaceC09390do.getValue();
        if (iGRevShareProductType == iGRevShareProductType2) {
            bvi = new BVI(value, 21);
            string = AbstractC166997dE.A0p(requireContext(), 2131963844);
            int i2 = ((C50975Mfi) interfaceC09390do.getValue()).A01;
            if (i2 == -1) {
                Context requireContext = requireContext();
                int i3 = 2131963849;
                if (AbstractC167007dF.A1Z(this.A00)) {
                    i3 = 2131963831;
                }
                quantityString = AbstractC167007dF.A0f(requireContext, string, i3);
            } else {
                Resources A0N2 = AbstractC166997dE.A0N(this);
                boolean A1Z = AbstractC167007dF.A1Z(this.A00);
                int i4 = R.plurals.ig_profile_publisher_control_non_revshare_blocked_categories_screen_description_text;
                if (A1Z) {
                    i4 = R.plurals.ig_profile_feed_reels_publisher_control_non_revshare_blocked_categories_screen_description_text;
                }
                quantityString = A0N2.getQuantityString(i4, i2, AbstractC25228BEl.A1Z(string, i2));
            }
            A0H = AbstractC25225BEi.A0H(quantityString);
            A02 = AbstractC31181DnP.A02(this);
            i = 4;
        } else {
            bvi = new BVI(value, 22);
            int i5 = ((C50975Mfi) interfaceC09390do.getValue()).A01;
            string = requireContext().getString(2131963844);
            A0H = AbstractC25225BEi.A0H(AbstractC31180DnO.A02(this, string).getQuantityString(R.plurals.ig_overlay_ads_publisher_control_revshare_blocked_categories_screen_description_text, i5, AbstractC25228BEl.A1Z(string, i5)));
            A02 = AbstractC31181DnP.A02(this);
            i = 3;
        }
        AnonymousClass773.A05(A0H, new C27280C2f(bvi, A02, i), string);
        AbstractC31176DnK.A1G(A0N, A0H);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0S(view, R.id.recycler_view);
        AbstractC31178DnM.A0z(this, recyclerView);
        C51128MiX c51128MiX = new C51128MiX(new BVI(interfaceC09390do.getValue(), 23));
        recyclerView.setAdapter(c51128MiX);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCR(view, c07s, c51128MiX, recyclerView, this, viewLifecycleOwner, (InterfaceC23621Ds) null, 22), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public N5F() {
        C57509Pfj c57509Pfj = new C57509Pfj(this, 39);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57509Pfj(new C57509Pfj(this, 36), 37));
        this.A03 = AbstractC25225BEi.A0a(new C57509Pfj(A00, 38), c57509Pfj, new C57255Pbd(28, null, A00), AbstractC25225BEi.A1D(C50975Mfi.class));
        this.A00 = C57509Pfj.A00(this, 34);
        this.A01 = C57509Pfj.A00(this, 35);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(60368995);
        super.onCreate(bundle);
        ((MTJ) this.A01.getValue()).A00.A04();
        C0f9.A09(1412940939, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1927008881);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_blocked_category, false);
        C0f9.A09(1061087750, A02);
        return A0R;
    }
}
