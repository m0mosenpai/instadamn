package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class N4R extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LikeVisibilityBottomSheetFragment";
    public OWU A00;
    public C54990OTy A01;
    public OLM A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "unliked_your_activity_upsell_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public N4R() {
        C57529Pg3 A00 = C57529Pg3.A00(this, 17);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C57529Pg3.A00(C57529Pg3.A00(this, 14), 15));
        this.A04 = AbstractC25225BEi.A0a(C57529Pg3.A00(A002, 16), A00, new C29895DGj(8, null, A002), AbstractC25225BEi.A1D(C53033Nd5.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1585352506);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable = null;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC50532MSl.A00());
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        }
        EnumC39589Hdz enumC39589Hdz = (EnumC39589Hdz) serializable;
        OLM olm = new OLM(this, AbstractC166987dD.A0r(this.A03));
        this.A02 = olm;
        EnumC72375XcB enumC72375XcB = EnumC72375XcB.A07;
        this.A00 = new OWU(enumC39589Hdz, olm, enumC72375XcB, str);
        OLM olm2 = this.A02;
        if (olm2 == null) {
            C14360o3.A0F("upsellsLogger");
            throw C00O.createAndThrow();
        }
        this.A01 = new C54990OTy(enumC39589Hdz, olm2, enumC72375XcB, str);
        C0f9.A09(1792994443, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1322793055);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.like_visibility_setting_bottom_sheet, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) AbstractC166997dE.A0R(inflate, R.id.everyone_radio);
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0S(inflate, R.id.people_you_follow_radio);
        CompoundButton compoundButton2 = (CompoundButton) AbstractC166997dE.A0S(inflate, R.id.off_radio);
        IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166997dE.A0S(inflate, R.id.close_friends_radio);
        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
        igdsListCell.setTextCellType(enumC53237Nga);
        igdsListCell2.setTextCellType(enumC53237Nga);
        String A0p = AbstractC166997dE.A0p(requireContext(), 2131976381);
        String A0p2 = AbstractC166997dE.A0p(requireContext(), 2131976386);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(inflate, R.id.upsell_bottom_sheet_headline);
        C14360o3.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline(A0p2);
        igdsHeadline.setBody(A0p);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0S(inflate, R.id.bottom_bar);
        AbstractC54295NzF.A00(igdsBottomButtonLayout, new OCY(new ViewOnClickListenerC55463OkI(this, 21), AbstractC25230BEn.A0m(this), 2131972699, 2131968687));
        igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
        C53033Nd5 c53033Nd5 = (C53033Nd5) this.A04.getValue();
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((AbstractC53034Nd6) c53033Nd5).A00, new MIL(23, igdsListCell2, igdsListCell, igdsBottomButtonLayout, compoundButton2, compoundButton), 43);
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), c53033Nd5.A00, new C30184DRp(38, igdsListCell, igdsListCell2, this), 43);
        C57157PZb.A01(c53033Nd5, this, AbstractC25235BEs.A0S(this), 24);
        C55519OlD.A01(compoundButton, this, 36);
        C55519OlD.A02(igdsListCell, this, 37);
        C55519OlD.A02(igdsListCell2, this, 38);
        C55519OlD.A01(compoundButton2, this, 39);
        C0f9.A09(108127416, A02);
        return inflate;
    }
}
