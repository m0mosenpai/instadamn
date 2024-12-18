package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GsO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38279GsO implements InterfaceC64322vr {
    public final UserSession A00;
    public final InterfaceC64322vr A01;
    public final C64352vu A02;
    public final InterfaceC60442pS A03;
    public final InterfaceC65282xQ A04;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.30a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2vt, java.lang.Object, X.IsD] */
    public C38279GsO(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = interfaceC60442pS;
        this.A04 = interfaceC65282xQ;
        ?? obj = new Object();
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36316980734726904L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36316980734792441L);
        if (A06 || A062) {
            obj.A00 = new C30Y(userSession, new Object(), new C37451GeV(userSession, false, false, A06, A062), interfaceC60442pS);
        }
        C64352vu c64352vu = new C64352vu(obj);
        this.A02 = c64352vu;
        this.A01 = new C64362vv(userSession, c64352vu, interfaceC60442pS, interfaceC65282xQ);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC64322vr
    public final void DNd(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A01.DNd(c38321qM);
    }

    @Override // X.InterfaceC64322vr
    public final void DNv(C38321qM c38321qM, int i) {
        C14360o3.A0B(c38321qM, 0);
        this.A01.DNv(c38321qM, i);
    }

    @Override // X.InterfaceC64322vr
    public final void DNy(View view, C38321qM c38321qM, double d) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.BRZ(c38321qM);
        this.A01.DNy(view, c38321qM, d);
    }

    @Override // X.InterfaceC64322vr
    public final void Dwc(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A01.Dwc(c38321qM);
    }

    @Override // X.InterfaceC64322vr
    public final void Dwd(C11520jB c11520jB, C38321qM c38321qM, int i, int i2, int i3) {
        this.A01.Dwd(null, c38321qM, i, i2, i3);
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
        this.A01.Cij(c38321qM, c38321qM2, c38321qM3, i, i2, i3);
    }
}
