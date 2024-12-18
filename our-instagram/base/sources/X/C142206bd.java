package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142206bd implements InterfaceC60602pj {
    public boolean A00;
    public final C145826hf A01;
    public final InterfaceC1118853a A02;
    public final C62862tP A03;
    public final InterfaceC41501vz A04;
    public final UserSession A05;

    public C142206bd(C62862tP c62862tP, UserSession userSession, C145826hf c145826hf, InterfaceC1118853a interfaceC1118853a) {
        C14360o3.A0B(c62862tP, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c145826hf, 4);
        this.A03 = c62862tP;
        this.A05 = userSession;
        this.A02 = interfaceC1118853a;
        this.A01 = c145826hf;
        this.A04 = new C37340Gci(this);
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
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        this.A00 = false;
        AbstractC25651Mw.A00(this.A05).A01(this.A04, C42238InO.class);
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
    public final void onPause() {
        AbstractC25651Mw.A00(this.A05).A02(this.A04, C42238InO.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C62862tP c62862tP = this.A03;
        c62862tP.A01.put(R.id.story_bloks_sticker_controller, new C142766cc(this));
    }
}
