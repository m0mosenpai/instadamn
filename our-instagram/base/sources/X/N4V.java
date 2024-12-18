package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class N4V extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DismissNudgeUpsellsBottomSheetFragment";
    public OWU A00;
    public C54990OTy A01;
    public EnumC39589Hdz A02;
    public OLM A03;
    public String A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "dismiss_nudge_upsell_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public N4V() {
        C57529Pg3 A00 = C57529Pg3.A00(this, 12);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C57529Pg3.A00(C57529Pg3.A00(this, 9), 10));
        this.A06 = AbstractC25225BEi.A0a(C57529Pg3.A00(A002, 11), A00, new C29895DGj(7, null, A002), AbstractC25225BEi.A1D(C53030Nd2.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1560326127);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable = null;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC50532MSl.A00());
        } else {
            str = null;
        }
        this.A04 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        }
        this.A02 = (EnumC39589Hdz) serializable;
        OLM olm = new OLM(this, AbstractC166987dD.A0r(this.A05));
        this.A03 = olm;
        String str2 = this.A04;
        EnumC39589Hdz enumC39589Hdz = this.A02;
        EnumC72375XcB enumC72375XcB = EnumC72375XcB.A09;
        this.A00 = new OWU(enumC39589Hdz, olm, enumC72375XcB, str2);
        String str3 = this.A04;
        EnumC39589Hdz enumC39589Hdz2 = this.A02;
        OLM olm2 = this.A03;
        if (olm2 == null) {
            C14360o3.A0F("upsellsLogger");
            throw C00O.createAndThrow();
        }
        this.A01 = new C54990OTy(enumC39589Hdz2, olm2, enumC72375XcB, str3);
        C0f9.A09(-1091755303, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1412781121);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.dismiss_nudge_upsell_bottom_sheet, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) AbstractC166997dE.A0R(inflate, R.id.reminders_on);
        CompoundButton compoundButton2 = (CompoundButton) AbstractC166997dE.A0R(inflate, R.id.reminders_off);
        String A0p = AbstractC166997dE.A0p(requireContext(), 2131976380);
        String string = requireContext().getString(2131976379);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(inflate, R.id.upsell_bottom_sheet_headline);
        C14360o3.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline(A0p);
        if (string != null) {
            igdsHeadline.setBody(string);
        }
        OCY ocy = new OCY(new ViewOnClickListenerC55463OkI(this, 20), AbstractC25230BEn.A0m(this), 2131972699, 2131954754);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(inflate, R.id.bottom_bar);
        AbstractC54295NzF.A00(igdsBottomButtonLayout, ocy);
        AbstractC53034Nd6 A0v = MSW.A0v(this.A06);
        igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), A0v.A00, new C30184DRp(37, compoundButton2, igdsBottomButtonLayout, compoundButton), 42);
        C55519OlD.A01(compoundButton, this, 34);
        C55519OlD.A01(compoundButton2, this, 35);
        C0f9.A09(-1620510082, A02);
        return inflate;
    }
}
