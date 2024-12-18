package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.3CE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CE implements InterfaceC60602pj {
    public V8L A00;
    public final UserSession A01;
    public final C61342qw A02;
    public final C60662pp A03;

    public C3CE(UserSession userSession, C61342qw c61342qw, C60662pp c60662pp) {
        C14360o3.A0B(c61342qw, 3);
        this.A01 = userSession;
        this.A03 = c60662pp;
        this.A02 = c61342qw;
    }

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
    public final void onDestroyView() {
        C61342qw c61342qw = this.A02;
        C0eR c0eR = this.A03.mLifecycleRegistry;
        C14360o3.A07(c0eR);
        V8L v8l = this.A00;
        if (v8l != null) {
            c61342qw.F9f(v8l);
            c0eR.A0A(v8l);
            this.A00 = null;
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C60662pp c60662pp = this.A03;
        C56352iT A00 = C56342iS.A00(c60662pp.requireActivity());
        Activity rootActivity = c60662pp.getRootActivity();
        boolean Cen = c60662pp.Cen();
        C61342qw c61342qw = this.A02;
        C0eR c0eR = c60662pp.mLifecycleRegistry;
        C14360o3.A07(c0eR);
        ViewOnTouchListenerC60632pm A03 = c60662pp.A0A().A03();
        if (rootActivity != null && A00 != null && Cen) {
            View findViewById = rootActivity.findViewById(R.id.gradient_background);
            C14360o3.A07(findViewById);
            C57982lB.A0B.A04(rootActivity, new C71110Wo7(rootActivity, c0eR, A03, (IgView) findViewById, c61342qw, this, Cen), true);
        }
    }
}
