package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OuD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56041OuD implements InterfaceC60602pj {
    public EnumC189218Zt A00;
    public final UserSession A01;
    public final InterfaceC58281PsZ A02;
    public final C87H A03;
    public final C89P A04;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        this.A02.Eav(new ViewOnClickListenerC55460OkF(this, 7));
    }

    public C56041OuD(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58281PsZ interfaceC58281PsZ, C5JK c5jk) {
        MSZ.A1O(userSession, c5jk);
        this.A01 = userSession;
        this.A02 = interfaceC58281PsZ;
        this.A00 = EnumC189218Zt.A06;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        C87H A0Z = MSZ.A0Z(new C52942bb(requireActivity), C87G.class);
        this.A03 = A0Z;
        AbstractC31180DnO.A1F(abstractC59962oe, A0Z.A0A, C57747Pja.A00(this, 25), 58);
        this.A04 = MSZ.A0X(new C89O(requireActivity, userSession), requireActivity);
    }
}
