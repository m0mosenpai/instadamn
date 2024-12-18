package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import java.util.Date;

/* renamed from: X.EkZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33187EkZ extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "QuietModeBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quiet_mode";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.setBackgroundResource(AbstractC53242c7.A02(getContext()));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-473067057);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A00;
        C71603Jf c71603Jf = new C71603Jf(AbstractC166987dD.A0r(interfaceC09390do));
        C34940FaQ c34940FaQ = new C34940FaQ(R.drawable.ig_illustrations_qp_moon_refresh);
        Context requireContext = requireContext();
        long A00 = (C123815iv.A00() / 1000) + c71603Jf.A00();
        int i = 2131971407;
        if (AbstractC455527p.A01(AbstractC166987dD.A0r(interfaceC09390do))) {
            i = 2131974166;
        }
        C34965Fap c34965Fap = new C34965Fap(AbstractC167007dF.A0f(requireContext, AbstractC35218FgB.A02(requireContext).format(new Date(A00 * 1000)), i));
        c34965Fap.A03 = R.style.igds_emphasized_title_panorama;
        c34965Fap.A02 = 4;
        c34965Fap.A05 = new C34626FNj(0, AbstractC167017dG.A0F(requireContext), 0, 0, 0, 0);
        Context requireContext2 = requireContext();
        Em0 em0 = new Em0(c71603Jf, this, AbstractC167007dF.A09(requireContext2, R.attr.igds_color_controls));
        String A0p = AbstractC166997dE.A0p(requireContext2, 2131971408);
        int i2 = 2131971406;
        if (AbstractC455527p.A01(AbstractC166987dD.A0r(interfaceC09390do))) {
            i2 = 2131974165;
        }
        String string = requireContext2.getString(i2);
        StringBuilder sb = new StringBuilder(string);
        String A0B = AnonymousClass001.A0B(string);
        C14360o3.A07(A0B);
        if (!AbstractC001900j.A0a(A0B, A0p, false)) {
            if (AbstractC001900j.A0a(A0B, AbstractC31172DnG.A16(C1Q2.A02(), A0p), false)) {
                A0p = AbstractC31172DnG.A16(C1Q2.A02(), A0p);
            } else {
                sb.append(A0p);
            }
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(sb.toString());
        AnonymousClass773.A04(A0H, em0, A0p);
        C34965Fap c34965Fap2 = new C34965Fap(A0H);
        c34965Fap2.A03 = R.style.igds_body_1;
        c34965Fap2.A02 = 4;
        c34965Fap2.A05 = new C34626FNj(requireContext2.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), AbstractC167017dG.A03(requireContext2), AbstractC166997dE.A04(requireContext2, R.dimen.abc_dropdownitem_icon_width), requireContext2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material), AbstractC166997dE.A04(requireContext2, R.dimen.abc_dropdownitem_icon_width), AbstractC166997dE.A04(requireContext2, R.dimen.abc_dropdownitem_icon_width));
        setItems(AbstractC16960so.A1Q(c34940FaQ, c34965Fap, c34965Fap2));
        C0f9.A09(1762349585, A02);
    }
}
