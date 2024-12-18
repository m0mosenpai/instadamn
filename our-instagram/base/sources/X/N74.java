package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.api.schemas.MediaKitVisibility;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.mediakit.analytics.VisibilitySheetOrigin;
import com.instagram.mediakit.ui.model.MediaKitLink;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class N74 extends AbstractC59962oe implements InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitVisibilitySheetFragment";
    public VisibilitySheetOrigin A00;
    public InterfaceC16820sZ A01;
    public boolean A02;
    public final InterfaceC09390do A0D = AbstractC25225BEi.A0a(new C57546PgK(this, 2), new C57546PgK(this, 3), C57535Pg9.A00(null, this, 23), AbstractC25225BEi.A1D(C51053Mh7.class));
    public final InterfaceC09390do A0E = AbstractC09440dt.A01(new C57248PbW(this, 46));
    public final InterfaceC09390do A07 = OY0.A00(this, R.id.mk_visibility_sheet_private_toggle);
    public final InterfaceC09390do A08 = OY0.A00(this, R.id.mk_visibility_sheet_public_toggle);
    public final InterfaceC09390do A0C = OY0.A00(this, R.id.mk_share_actions_view);
    public final InterfaceC09390do A0B = OY0.A00(this, R.id.mk_visibility_sheet_share_title);
    public final InterfaceC09390do A0A = OY0.A00(this, R.id.mk_share_action_share);
    public final InterfaceC09390do A04 = OY0.A00(this, R.id.mk_share_action_direct);
    public final InterfaceC09390do A06 = OY0.A00(this, R.id.mk_share_action_link);
    public final InterfaceC09390do A03 = OY0.A00(this, R.id.mk_visibility_sheet_bottom_layout);
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C57248PbW(this, 45));
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Fragment fragment = this.mParentFragment;
        if (fragment != null) {
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = fragment.getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new PZP(viewLifecycleOwner, c07s, this, null, 29), C07Y.A00(viewLifecycleOwner));
        }
        IgdsListCell igdsListCell = (IgdsListCell) this.A07.getValue();
        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
        igdsListCell.A0G(enumC53237Nga, true);
        igdsListCell.A0H(AbstractC25227BEk.A0v(this, 2131966825));
        IgdsListCell igdsListCell2 = (IgdsListCell) this.A08.getValue();
        igdsListCell2.A0G(enumC53237Nga, true);
        igdsListCell2.A0H(AbstractC25227BEk.A0v(this, 2131966827));
        OY0.A01(AbstractC166987dD.A0d(this.A0A), new C57248PbW(this, 47));
        OY0.A01(AbstractC166987dD.A0d(this.A04), new C57248PbW(this, 48));
        OY0.A01(AbstractC166987dD.A0d(this.A06), new C57248PbW(this, 49));
        if (AbstractC167007dF.A1Z(this.A05)) {
            IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) this.A03.getValue();
            MediaKitLink mediaKitLink = new MediaKitLink(new C57546PgK(this, 1), 2131966822);
            Context requireContext = requireContext();
            String A0p = AbstractC166997dE.A0p(requireContext, 2131966822);
            SpannableStringBuilder A05 = AbstractC31175DnJ.A05(requireContext, 2131966823);
            AnonymousClass773.A04(A05, new NY0(mediaKitLink, AbstractC31174DnI.A02(requireContext)), A0p);
            igdsBottomButtonLayout.setFooterText(A05);
        }
        A00(this);
    }

    public static final void A00(N74 n74) {
        C3DN A0m;
        InterfaceC09390do interfaceC09390do = n74.A07;
        IgdsListCell igdsListCell = (IgdsListCell) interfaceC09390do.getValue();
        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
        igdsListCell.A0G(enumC53237Nga, true);
        InterfaceC09390do interfaceC09390do2 = n74.A08;
        ((IgdsListCell) interfaceC09390do2.getValue()).A0G(enumC53237Nga, true);
        ((IgdsListCell) interfaceC09390do.getValue()).A0D(null);
        ((IgdsListCell) interfaceC09390do2.getValue()).A0D(null);
        ((IgdsListCell) interfaceC09390do.getValue()).setChecked(!A02(n74));
        ((IgdsListCell) interfaceC09390do2.getValue()).setChecked(A02(n74));
        C55519OlD.A02((IgdsListCell) interfaceC09390do.getValue(), n74, 17);
        C55519OlD.A02((IgdsListCell) interfaceC09390do2.getValue(), n74, 18);
        int i = 0;
        AbstractC166987dD.A0d(n74.A0C).setVisibility(AbstractC167007dF.A05(A02(n74) ? 1 : 0));
        View A0d = AbstractC166987dD.A0d(n74.A0B);
        if (!A02(n74)) {
            i = 8;
        }
        A0d.setVisibility(i);
        if (A02(n74) && n74.A02 && (A0m = AbstractC25230BEn.A0m(n74)) != null) {
            A0m.A0U(C05F.A04);
        }
        n74.A02 = !A02(n74);
    }

    public static final boolean A02(N74 n74) {
        MediaKitVisibility mediaKitVisibility;
        C51851Mvt c51851Mvt = (C51851Mvt) MSW.A0l(n74.A0D).A0M.getValue();
        if (c51851Mvt == null || (mediaKitVisibility = c51851Mvt.A00) == null) {
            mediaKitVisibility = MediaKitVisibility.A04;
        }
        return AbstractC167007dF.A1X(mediaKitVisibility, MediaKitVisibility.A05);
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return (C54780OIu) this.A0E.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    public static final void A01(N74 n74, boolean z) {
        MediaKitVisibility mediaKitVisibility;
        if (z != A02(n74)) {
            if (A02(n74)) {
                mediaKitVisibility = MediaKitVisibility.A04;
            } else {
                mediaKitVisibility = MediaKitVisibility.A05;
            }
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(n74.A0D);
            PZM.A01(A0Z, mediaKitVisibility, AbstractC141776au.A00(A0Z), 31);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1201351756);
        super.onCreate(bundle);
        VisibilitySheetOrigin visibilitySheetOrigin = (VisibilitySheetOrigin) requireArguments().getParcelable("origin");
        if (visibilitySheetOrigin == null) {
            visibilitySheetOrigin = VisibilitySheetOrigin.A04;
        }
        this.A00 = visibilitySheetOrigin;
        Integer num = C05F.A05;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("origin", visibilitySheetOrigin.A00);
        AbstractC55033OXz.A02(this, num, A1G);
        C0f9.A09(-1806581020, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-737215948);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_visibility_settings_fragment, viewGroup, false);
        C0f9.A09(-645210854, A02);
        return inflate;
    }
}
