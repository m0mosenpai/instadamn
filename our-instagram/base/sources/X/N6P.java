package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.Date;

/* loaded from: classes9.dex */
public final class N6P extends AbstractC59962oe implements InterfaceC60072op, InterfaceC171217kD {
    public static final String __redex_internal_original_name = "IgLiveSchedulingCreationFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_live_scheduling_creation";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C56342iS.A01(new Ok4(this, 54), AbstractC31176DnK.A0C(requireView(), R.id.action_bar_container)).A0X(C55818OqU.A00);
        TextView textView = (TextView) AbstractC166997dE.A0S(requireView(), R.id.title_edit_text);
        View A07 = AbstractC50523MSb.A07(requireView(), R.id.start_time_row);
        TextView textView2 = (TextView) AbstractC166997dE.A0S(A07, R.id.label);
        View A0S = AbstractC166997dE.A0S(A07, R.id.metadata);
        View A0S2 = AbstractC166997dE.A0S(A07, R.id.icon);
        View A072 = AbstractC50523MSb.A07(requireView(), R.id.audience_row);
        TextView A0N = AbstractC167007dF.A0N(A072, R.id.label);
        View A0S3 = AbstractC166997dE.A0S(A072, R.id.metadata);
        View A0S4 = AbstractC166997dE.A0S(A072, R.id.icon);
        View A0S5 = AbstractC166997dE.A0S(requireView(), R.id.primary_cta_button);
        View A0S6 = AbstractC166997dE.A0S(requireView(), R.id.profile_unit_disclaimer_textview);
        View A073 = AbstractC50523MSb.A07(requireView(), R.id.cancel_row);
        textView2.setText(2131965530);
        A0N.setText(2131965501);
        InterfaceC09390do interfaceC09390do = this.A02;
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((C51010MgH) interfaceC09390do.getValue()).A00, new BGX(textView, A07, textView2, this, A0S2, A072, A0S4, A0S3, A0S6, A073, A0S5, A0S, 1), 35);
        JQ0.A11(this, new PZN(A07, this, null, 14), ((C51010MgH) interfaceC09390do.getValue()).A0A);
        C55346Oi6.A01(textView, this, 29);
        Ok4.A00(A07, 55, this);
        Ok4.A00(A0S2, 56, this);
        Ok4.A00(A072, 57, this);
        Ok4.A00(A0S4, 58, this);
        Ok4.A00(A0S5, 52, this);
        Ok4.A00(A073, 53, this);
    }

    @Override // X.InterfaceC171217kD
    public final void Cxk(C3PO c3po) {
        ((C51010MgH) this.A02.getValue()).A0F.Egh(c3po);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C51010MgH c51010MgH = (C51010MgH) this.A02.getValue();
        if (c51010MgH.A05 == null && !AbstractC13670mt.A0B((CharSequence) c51010MgH.A0E.getValue()) && C51010MgH.A00((Date) c51010MgH.A0D.getValue())) {
            PZD.A02(c51010MgH, AbstractC141776au.A00(c51010MgH), 17);
            return true;
        }
        return false;
    }

    public N6P() {
        C57550PgO A01 = C57550PgO.A01(this, 7);
        InterfaceC09390do A00 = C57550PgO.A00(C57550PgO.A01(this, 4), EnumC09460dv.A02, 5);
        this.A02 = AbstractC25225BEi.A0a(C57550PgO.A01(A00, 6), A01, C57530Pg4.A00(null, A00, 26), AbstractC25225BEi.A1D(C51010MgH.class));
        this.A00 = AbstractC09440dt.A01(C57550PgO.A01(this, 3));
        this.A01 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(3870246);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.live_scheduling_composer_layout, false);
        C0f9.A09(-1223848429, A02);
        return A0R;
    }
}
