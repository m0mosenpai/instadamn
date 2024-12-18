package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.ENx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32371ENx extends C53Z implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "InauthenticActivityFragment";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "inauthentic_activity";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 12 && i2 == -1) {
            AbstractC25227BEk.A1B(this);
            C9GR.A07(getContext(), 2131955011);
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131964393);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-573060630);
        super.onCreate(bundle);
        C0f9.A09(1710970849, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1582808076);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.challenge_inauthentic_activity_layout);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.inauthentic_activity_paragraph);
        String string = getString(2131956545);
        Em1 em1 = new Em1(Integer.valueOf(AbstractC53242c7.A0F(requireContext(), R.attr.igds_color_link)), this, 6);
        SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, string, 2131964394);
        AnonymousClass773.A05(A08, em1, string);
        AbstractC25227BEk.A11(A0T);
        A0T.setText(A08);
        C64P c64p = (C64P) A0A.requireViewById(R.id.inauthentic_activity_bottom_buttons);
        c64p.setPrimaryAction(AbstractC166997dE.A0N(this).getString(2131955011), ViewOnClickListenerC35679FpE.A00(this, 2));
        c64p.setSecondaryAction(getString(2131965713), ViewOnClickListenerC35679FpE.A00(this, 3));
        C0f9.A09(153059521, A02);
        return A0A;
    }
}
