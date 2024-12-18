package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69683Bc implements InterfaceC60602pj {
    public C3D3 A00;
    public final UserSession A01;
    public final C65192xH A02;
    public final C61342qw A03;

    public C69683Bc(UserSession userSession, C65192xH c65192xH, C61342qw c61342qw) {
        C14360o3.A0B(c61342qw, 3);
        this.A01 = userSession;
        this.A02 = c65192xH;
        this.A03 = c61342qw;
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
    public final void onCreate() {
        if (C18U.A06(C06090Tz.A05, this.A01, 2342154337771323897L)) {
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            C3D3 c3d3 = new C3D3(c006802i, AbstractC60942qI.A00.getModuleName());
            this.A00 = c3d3;
            this.A02.mViewLifecycleListener = c3d3;
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C3D3 c3d3 = this.A00;
        if (c3d3 != null) {
            this.A03.EDY(c3d3);
        }
    }
}
