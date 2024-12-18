package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IqZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42432IqZ implements InterfaceC64322vr {
    public final InterfaceC64322vr A00;
    public final C64352vu A01;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC64322vr
    public final void Dwd(C11520jB c11520jB, C38321qM c38321qM, int i, int i2, int i3) {
        this.A00.Dwd(null, c38321qM, i, i2, i3);
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
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC64322vr
    public final void Cij(C38321qM c38321qM, C38321qM c38321qM2, C38321qM c38321qM3, int i, int i2, int i3) {
        this.A00.Cij(c38321qM, c38321qM2, c38321qM3, i, i2, i3);
    }

    @Override // X.InterfaceC64322vr
    public final void DNd(C38321qM c38321qM) {
        this.A00.DNd(c38321qM);
    }

    @Override // X.InterfaceC64322vr
    public final void DNv(C38321qM c38321qM, int i) {
        this.A00.DNv(c38321qM, i);
    }

    @Override // X.InterfaceC64322vr
    public final void DNy(View view, C38321qM c38321qM, double d) {
        this.A00.DNy(view, c38321qM, d);
    }

    @Override // X.InterfaceC64322vr
    public final void Dwc(C38321qM c38321qM) {
        this.A00.Dwc(c38321qM);
    }

    public C42432IqZ(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ) {
        C64352vu c64352vu = new C64352vu(new C42535IsE(userSession, interfaceC60442pS));
        this.A01 = c64352vu;
        this.A00 = new C64362vv(userSession, c64352vu, interfaceC60442pS, interfaceC65282xQ);
    }
}
