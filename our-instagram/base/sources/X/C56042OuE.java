package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.OuE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56042OuE implements InterfaceC60602pj {
    public final UserSession A00;
    public final ClipsCreationViewModel A01;
    public final C187418Sj A02;
    public final C187358Sd A03;
    public final C87H A04;
    public final InterfaceC58281PsZ A05;
    public volatile C115475Kh A06;
    public volatile Integer A07;
    public volatile Integer A08;
    public volatile Integer A09;

    public C56042OuE(UserSession userSession, InterfaceC58281PsZ interfaceC58281PsZ, ClipsCreationViewModel clipsCreationViewModel, C187418Sj c187418Sj, C187358Sd c187358Sd, C87H c87h) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A05 = interfaceC58281PsZ;
        this.A01 = clipsCreationViewModel;
        this.A03 = c187358Sd;
        this.A02 = c187418Sj;
        this.A04 = c87h;
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
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A05.Ecg(new ViewOnClickListenerC55460OkF(this, 9));
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }
}
