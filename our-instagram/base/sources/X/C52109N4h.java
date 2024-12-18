package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.N4h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52109N4h extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "QuickSnapEducationFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C0fQ.A00(new ViewOnClickListenerC28666ClE(this, 17), view.findViewById(R.id.quick_snap_education_close_button));
        ImageView A08 = AbstractC31171DnF.A08(view, R.id.quick_snap_education_image);
        if (A08 != null) {
            Context context = A08.getContext();
            boolean A02 = AbstractC70443Ed.A02(AbstractC166987dD.A0r(this.A00));
            boolean A07 = C14640oc.A07();
            if (A02) {
                i = R.drawable.peek_nux_qsnuxfeedstatic;
                if (A07) {
                    i = R.drawable.peek_nux_qsnuxfeedstaticandroid;
                }
            } else {
                i = R.drawable.peek_nux_peekdirectstatic;
                if (A07) {
                    i = R.drawable.peek_nux_peeknuxstaticandroid;
                }
            }
            AbstractC166997dE.A19(context, A08, i);
        }
        TextView A0e = AbstractC166987dD.A0e(view, R.id.quick_snap_education_bullet_two);
        int i2 = 2131971348;
        if (AbstractC70443Ed.A03(AbstractC166987dD.A0r(this.A00))) {
            i2 = 2131971349;
        }
        A0e.setText(i2);
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.quick_snap_education_bullet_respectful);
        Context context2 = A0e2.getContext();
        String A0p = AbstractC166997dE.A0p(context2, 2131956546);
        SpannableStringBuilder A05 = AbstractC31175DnJ.A05(context2, 2131971346);
        AnonymousClass773.A05(A05, new C31753Dx6(A0e2, this, A0p, 2), A0p);
        AbstractC31176DnK.A1G(A0e2, A05);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(495491793);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_quick_snap_education, false);
        C0f9.A09(305936592, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1063532217);
        super.onResume();
        AbstractC145016gM.A03(requireActivity(), null, AbstractC166987dD.A0r(this.A00), false, false);
        C0f9.A09(773131232, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1652877537);
        super.onStop();
        AbstractC145016gM.A02(requireActivity(), this, AbstractC166987dD.A0r(this.A00), false, false);
        C0f9.A09(2146723591, A02);
    }
}
