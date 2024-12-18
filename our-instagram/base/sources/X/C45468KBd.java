package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.UUID;

/* renamed from: X.KBd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45468KBd extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "NewReleaseNotificationFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131971547);
        C3LO c3lo = new C3LO();
        c3lo.A01 = R.drawable.instagram_arrow_left_pano_outline_24;
        AbstractC31176DnK.A1C(LQ0.A01(this, 57), c3lo, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "new_release_notification_screen";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A01;
        C44506JmC c44506JmC = (C44506JmC) interfaceC09390do.getValue();
        c44506JmC.A00 = UUID.randomUUID();
        MBq.A01(c44506JmC, AbstractC141776au.A00(c44506JmC), 10);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.new_release_notification_recycler_view);
        C66362zD A0R = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new C45632KHv(new C47513Kyg(recyclerView, this)));
        AbstractC31177DnL.A17(this, recyclerView);
        recyclerView.setAdapter(A0R);
        JQ0.A11(this, new MC5(A0R, (InterfaceC23621Ds) null, 16, 42), ((C44506JmC) interfaceC09390do.getValue()).A09);
        View A0S = AbstractC166997dE.A0S(view, R.id.new_release_notification_refresh_spinner);
        LQ0.A02(A0S, 58, this);
        JQ0.A11(this, new MC5(A0S, (InterfaceC23621Ds) null, 17, 42), ((C44506JmC) interfaceC09390do.getValue()).A08);
        JQ0.A11(this, new MC5(this, null, 18), ((C44506JmC) interfaceC09390do.getValue()).A05);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C45468KBd() {
        C50162MDp c50162MDp = new C50162MDp(this, 31);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50162MDp(new C50162MDp(this, 28), 29));
        this.A01 = AbstractC25225BEi.A0a(new C50162MDp(A00, 30), c50162MDp, new MHV(11, (Object) null, A00), AbstractC25225BEi.A1D(C44506JmC.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(569593240);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.new_release_notification_fragment, viewGroup, false);
        C0f9.A09(-590499186, A02);
        return inflate;
    }
}
