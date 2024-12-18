package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;

/* renamed from: X.HBi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38911HBi extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ContactPointUpdateUpsellsBottomSheetFragment";
    public OWU A00;
    public EnumC39594He4 A01;
    public EnumC39589Hdz A02;
    public OLM A03;
    public String A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "contact_point_update_upsell_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Serializable serializable;
        int A02 = C0f9.A02(392452175);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable2 = null;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC50532MSl.A00());
        } else {
            str = null;
        }
        this.A04 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        } else {
            serializable = null;
        }
        this.A02 = (EnumC39589Hdz) serializable;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            serializable2 = bundle4.getSerializable("copy_version");
        }
        C14360o3.A0C(serializable2, "null cannot be cast to non-null type com.instagram.wellbeing.upsells.analytics.ContactPointUpdateUpsellVersion");
        this.A01 = (EnumC39594He4) serializable2;
        OLM olm = new OLM(this, AbstractC166987dD.A0r(this.A05));
        this.A03 = olm;
        this.A00 = new OWU(this.A02, olm, EnumC72375XcB.A04, this.A04);
        C0f9.A09(-761118687, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1567723028);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.contact_point_upsell_bottom_sheet, viewGroup, false);
        Context requireContext = requireContext();
        EnumC39594He4 enumC39594He4 = this.A01;
        if (enumC39594He4 != null) {
            String A0p = AbstractC166997dE.A0p(requireContext, enumC39594He4.A02);
            Context requireContext2 = requireContext();
            EnumC39594He4 enumC39594He42 = this.A01;
            if (enumC39594He42 != null) {
                String string = requireContext2.getString(enumC39594He42.A00);
                IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(inflate, R.id.upsell_bottom_sheet_headline);
                C14360o3.A0B(igdsHeadline, 0);
                igdsHeadline.A02 = true;
                igdsHeadline.setHeadline(A0p);
                if (string != null) {
                    igdsHeadline.setBody(string);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(inflate, R.id.bottom_bar);
                ViewOnClickListenerC42035Ik4 A00 = ViewOnClickListenerC42035Ik4.A00(this, 49);
                C3DN A0m = AbstractC25230BEn.A0m(this);
                EnumC39594He4 enumC39594He43 = this.A01;
                if (enumC39594He43 != null) {
                    AbstractC54295NzF.A00(igdsBottomButtonLayout, new OCY(A00, A0m, enumC39594He43.A01, 2131976364));
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
                    C0f9.A09(2025294122, A02);
                    return inflate;
                }
            }
        }
        C14360o3.A0F("copyVersion");
        throw C00O.createAndThrow();
    }
}
