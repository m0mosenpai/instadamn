package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.DtP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31539DtP implements InterfaceC60602pj, InterfaceC37213GaO {
    public E70 A00;
    public final InterfaceC41501vz A01;
    public final UserSession A02;
    public final InterfaceC37197Ga8 A03;
    public final C64842wi A04;
    public final InterfaceC42271xH A05;

    public C31539DtP(UserSession userSession, InterfaceC37197Ga8 interfaceC37197Ga8, C64842wi c64842wi) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = interfaceC37197Ga8;
        this.A04 = c64842wi;
        this.A05 = C31728DwZ.A00(this, 8);
        this.A01 = C31650DvG.A00(this, 31);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC37213GaO
    public final /* synthetic */ void DqW() {
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
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC37213GaO
    public final void Dgt() {
        if (this.A03.isResumed()) {
            AbstractC25651Mw.A00(this.A02).A01(this.A01, C48032Iq.class);
        }
    }

    @Override // X.InterfaceC37213GaO
    public final void Dgu() {
        if (this.A03.isResumed()) {
            AbstractC25651Mw.A00(this.A02).A02(this.A01, C48032Iq.class);
        }
    }

    @Override // X.InterfaceC37213GaO
    public final void DqX() {
        InterfaceC37197Ga8 interfaceC37197Ga8 = this.A03;
        if (interfaceC37197Ga8.isResumed()) {
            AbstractC25651Mw.A00(this.A02).A01(this.A01, C48032Iq.class);
        }
        interfaceC37197Ga8.Ch3();
    }

    @Override // X.InterfaceC37213GaO
    public final void DqY() {
        this.A03.APy();
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        AbstractC25651Mw.A00(this.A02).A02(this.A05, C121285eR.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        AbstractC25651Mw.A00(this.A02).A01(this.A05, C121285eR.class);
    }
}
