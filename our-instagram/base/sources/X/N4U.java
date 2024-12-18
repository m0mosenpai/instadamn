package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class N4U extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "RemixSettingsUpsellsBottomSheetFragment";
    public EnumC39589Hdz A00;
    public OLM A01;
    public C54990OTy A02;
    public String A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "remix_settings_upsell_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public N4U() {
        C57529Pg3 A00 = C57529Pg3.A00(this, 22);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C57529Pg3.A00(C57529Pg3.A00(this, 19), 20));
        this.A05 = AbstractC25225BEi.A0a(C57529Pg3.A00(A002, 21), A00, new C29895DGj(9, null, A002), AbstractC25225BEi.A1D(C53031Nd3.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1143949258);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable = null;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC50532MSl.A00());
        } else {
            str = null;
        }
        this.A03 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        }
        this.A00 = (EnumC39589Hdz) serializable;
        OLM olm = new OLM(this, AbstractC166987dD.A0r(this.A04));
        this.A01 = olm;
        this.A02 = new C54990OTy(this.A00, olm, EnumC72375XcB.A08, this.A03);
        C0f9.A09(114605898, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1900082170);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.remix_settings_upsell_bottom_sheet, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) AbstractC166997dE.A0R(inflate, R.id.everyone_radio);
        CompoundButton compoundButton2 = (CompoundButton) AbstractC166997dE.A0R(inflate, R.id.people_you_follow_radio);
        CompoundButton compoundButton3 = (CompoundButton) AbstractC166997dE.A0R(inflate, R.id.off_radio);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.upsell_remix_settings_body2);
        String A0v = AbstractC25227BEk.A0v(this, 2131976393);
        String A0q = MSZ.A0q(this, A0v, 2131976392);
        NY0 ny0 = new NY0(this, AbstractC25233BEq.A04(this));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0q);
        AnonymousClass773.A02(A0H, ny0, A0v);
        AbstractC31176DnK.A1G(A0N, A0H);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(inflate, R.id.upsell_bottom_sheet_headline);
        String A0p = AbstractC166997dE.A0p(requireContext(), 2131976397);
        C14360o3.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline(A0p);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(inflate, R.id.bottom_bar);
        AbstractC54295NzF.A00(igdsBottomButtonLayout, new OCY(new ViewOnClickListenerC55463OkI(this, 22), AbstractC25230BEn.A0m(this), 2131972699, 2131968687));
        AbstractC53034Nd6 A0v2 = MSW.A0v(this.A05);
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), A0v2.A00, new C30177DRh(26, compoundButton2, compoundButton, igdsBottomButtonLayout, compoundButton3), 44);
        C57157PZb.A01(A0v2, this, AbstractC25235BEs.A0S(this), 25);
        C55519OlD.A01(compoundButton, this, 40);
        C55519OlD.A01(compoundButton2, this, 41);
        C55519OlD.A01(compoundButton3, this, 42);
        C0f9.A09(-1165880708, A02);
        return inflate;
    }
}
