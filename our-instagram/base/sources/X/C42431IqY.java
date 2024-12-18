package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.IqY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42431IqY implements JPU {
    public final InterfaceC16820sZ A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final InterfaceC60092or A03;
    public final ExploreTopicCluster A04;
    public final String A05;

    @Override // X.JIF
    public final void AJJ(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC65252xN interfaceC65252xN, C3FQ c3fq) {
        C14360o3.A0B(interfaceC65252xN, 2);
        Context context = c3fq.getContext();
        C14360o3.A07(context);
        viewOnTouchListenerC60632pm.A06(interfaceC65252xN, c3fq, C3HB.A00(context));
    }

    @Override // X.JIF
    public final void D8R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
    }

    @Override // X.JPU
    public final void Dm1() {
    }

    @Override // X.JIF
    public final void EMG() {
    }

    @Override // X.JIF
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.Ehq(this.A03);
        interfaceC56362iU.setTitle(this.A04.A0A);
        String A0p = AbstractC166997dE.A0p(this.A01, 2131968544);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_sliders_pano_outline_24;
        A0B.A0M = A0p;
        AbstractC31176DnK.A1B(ViewOnClickListenerC42032Ik1.A00(this, 17), A0B, interfaceC56362iU);
    }

    @Override // X.JIF
    public final void onDestroyView() {
    }

    @Override // X.JIF
    public final void onPause() {
    }

    @Override // X.JIF
    public final void onResume() {
    }

    @Override // X.JIF
    public final void AJK(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, XAp xAp) {
        viewOnTouchListenerC60632pm.A04(C56352iT.A0t.A03(this.A02).A0P, new C42139Iln(0), C3HB.A00(this.A01));
    }

    @Override // X.JIF
    public final String Arb() {
        return this.A05;
    }

    @Override // X.JPU
    public final float C9q() {
        return 0.0f;
    }

    public C42431IqY(Context context, FragmentActivity fragmentActivity, InterfaceC60092or interfaceC60092or, ExploreTopicCluster exploreTopicCluster, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = context;
        this.A02 = fragmentActivity;
        this.A04 = exploreTopicCluster;
        this.A03 = interfaceC60092or;
        this.A00 = interfaceC16820sZ;
        this.A05 = AbstractC166997dE.A0p(context, 2131962000);
    }
}
