package X;

import android.content.Context;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: X.EkU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33183EkU extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "QuietModePauseBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quiet_mode_pause";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1417060822);
        super.onResume();
        Context requireContext = requireContext();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new C34940FaQ(R.drawable.ig_illustrations_qp_moon_refresh));
        InterfaceC09390do interfaceC09390do = this.A00;
        int i = 2131971403;
        if (AbstractC455527p.A01(AbstractC166987dD.A0r(interfaceC09390do))) {
            i = 2131974161;
        }
        C34965Fap c34965Fap = new C34965Fap(requireContext.getString(i));
        c34965Fap.A03 = R.style.igds_emphasized_title_panorama;
        c34965Fap.A02 = 4;
        c34965Fap.A05 = new C34626FNj(requireContext.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), AbstractC167017dG.A03(requireContext), AbstractC166997dE.A04(requireContext, R.dimen.abc_dropdownitem_icon_width), 0, AbstractC166997dE.A04(requireContext, R.dimen.abc_dropdownitem_icon_width), AbstractC166997dE.A04(requireContext, R.dimen.abc_dropdownitem_icon_width));
        A1E.add(c34965Fap);
        C17060sy.A01.A01(AbstractC166987dD.A0r(interfaceC09390do));
        long A06 = AbstractC31177DnL.A06();
        long A03 = AbstractC206099Aq.A03(AbstractC166987dD.A0r(interfaceC09390do), A06);
        Date A04 = AbstractC206099Aq.A04(AbstractC166987dD.A0r(interfaceC09390do), A06);
        int i2 = 2131971397;
        if (AbstractC455527p.A01(AbstractC166987dD.A0r(interfaceC09390do))) {
            i2 = 2131974155;
        }
        C34965Fap c34965Fap2 = new C34965Fap(AbstractC167007dF.A0f(requireContext, AbstractC35218FgB.A03(requireContext, A03).format(A04), i2));
        c34965Fap2.A03 = R.style.igds_body_1;
        c34965Fap2.A02 = 4;
        c34965Fap2.A05 = new C34626FNj(AbstractC166997dE.A04(requireContext, R.dimen.abc_dropdownitem_icon_width), AbstractC167017dG.A0F(requireContext), AbstractC166997dE.A04(requireContext, R.dimen.abc_dropdownitem_icon_width), AbstractC167017dG.A03(requireContext), AbstractC166997dE.A04(requireContext, R.dimen.abc_dropdownitem_icon_width), AbstractC166997dE.A04(requireContext, R.dimen.abc_dropdownitem_icon_width));
        A1E.add(c34965Fap2);
        setItems(A1E);
        AbstractC31174DnI.A0G(this).setPadding(0, AbstractC166997dE.A04(requireContext, R.dimen.abc_dropdownitem_icon_width), 0, 0);
        C0f9.A09(460338851, A02);
    }
}
