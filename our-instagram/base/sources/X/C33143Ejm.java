package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.user.model.User;

/* renamed from: X.Ejm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33143Ejm extends ELn {
    public static final String __redex_internal_original_name = "ShareToFriendsStoryAudiencePickerFragmentV2";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        Boolean AkF;
        Integer num;
        C14360o3.A0B(c32069E6v, 0);
        Gt9 gt9 = (Gt9) this.A04.getValue();
        boolean z = A0B().A01;
        User user = c32069E6v.A02;
        if (!user.A2O() && (AkF = user.A03.AkF()) != null && AkF.booleanValue()) {
            C35167FfI c35167FfI = gt9.A00.A00;
            java.util.Set set = c35167FfI.A03;
            boolean z2 = !AbstractC31173DnH.A0L(set).contains(c32069E6v);
            if (z) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            c35167FfI.A05(c32069E6v, num, z2, z);
            C05A c05a = gt9.A02;
            do {
            } while (!c05a.AIi(c05a.getValue(), new H81(AbstractC31173DnH.A0L(set), AbstractC31173DnH.A0L(c35167FfI.A00))));
        }
    }

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "audience_selection";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57166PZk c57166PZk = new C57166PZk(c07s, this, viewLifecycleOwner, null, 18);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, c57166PZk, A00);
        AbstractC23641Du.A05(anonymousClass191, new C57166PZk(c07s, this, A0K, null, 17), C07Y.A00(A0K));
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A04);
        AbstractC23641Du.A05(anonymousClass191, new C43172J6r(A0Z, null, 3), AbstractC141776au.A00(A0Z));
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C33143Ejm() {
        C43205J8c c43205J8c = new C43205J8c(this, 26);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43205J8c(new C43205J8c(this, 23), 24));
        this.A04 = AbstractC25225BEi.A0a(new C43205J8c(A00, 25), c43205J8c, new C57252Pba(33, null, A00), AbstractC25225BEi.A1D(Gt9.class));
        this.A02 = AbstractC25225BEi.A0a(new C43205J8c(this, 21), GUQ.A00, new C57252Pba(32, null, this), AbstractC25225BEi.A1D(C86X.class));
        this.A03 = AbstractC60492pY.A02(this);
        this.A00 = C1XM.A00(new C43205J8c(this, 19));
        this.A01 = C1XM.A00(new C43205J8c(this, 20));
    }

    @Override // X.ELn, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1069010999);
        C14360o3.A0B(layoutInflater, 0);
        super.A00 = new EQ8(requireContext(), this, this, this, this, this, A0C(), true, true);
        A0A().A00 = new C34624FNh(requireContext(), null, null, 0, false);
        View inflate = layoutInflater.inflate(R.layout.layout_audience_picker_v2, viewGroup, false);
        C0f9.A09(-962201778, A02);
        return inflate;
    }
}
