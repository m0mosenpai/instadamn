package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.N5g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52132N5g extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "IgLiveSchedulingShareFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_live_scheduling_share";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C56342iS.A01(new Ok4(this, 62), AbstractC31176DnK.A0C(requireView(), R.id.action_bar_container)).A0X(C55819OqV.A00);
        IgdsButton A0W = AbstractC31173DnH.A0W(requireView(), R.id.primary_cta_button);
        A0W.setText(2131965511);
        Ok4.A00(A0W, 63, this);
        IgdsButton A0W2 = AbstractC31173DnH.A0W(requireView(), R.id.secondary_cta_button);
        A0W2.setText(2131968687);
        Ok4.A00(A0W2, 64, this);
        A0W2.setVisibility(0);
        ((IgdsHeadline) requireView().requireViewById(R.id.live_scheduling_share_headline)).setBody(2131965520);
        JQ0.A11(this, C57167PZl.A01(this, null, 28), ((C50928Mex) this.A02.getValue()).A01);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A02);
        PZD.A02(A0Z, AbstractC141776au.A00(A0Z), 26);
        return true;
    }

    public C52132N5g() {
        C57550PgO A01 = C57550PgO.A01(this, 18);
        InterfaceC09390do A00 = C57550PgO.A00(C57550PgO.A01(this, 15), EnumC09460dv.A02, 16);
        this.A02 = AbstractC25225BEi.A0a(C57550PgO.A01(A00, 17), A01, C57530Pg4.A00(null, A00, 28), AbstractC25225BEi.A1D(C50928Mex.class));
        this.A01 = AbstractC09440dt.A01(C57550PgO.A01(this, 14));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((C54771OIk) this.A01.getValue()).A02);
            C141796aw A00 = AbstractC141776au.A00(A0Z);
            PZD pzd = new PZD(A0Z, null, 24);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            AbstractC23641Du.A05(anonymousClass191, pzd, A00);
            AbstractC23641Du.A05(anonymousClass191, new PZD(A0Z, null, 25), AbstractC141776au.A00(A0Z));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1185025267);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.live_scheduling_share_fragment, false);
        C0f9.A09(1441860216, A02);
        return A0R;
    }
}
