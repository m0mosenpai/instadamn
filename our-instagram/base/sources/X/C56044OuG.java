package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OuG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56044OuG implements InterfaceC60602pj {
    public String A00;
    public boolean A01;
    public AnonymousClass195 A02;
    public final AbstractC59962oe A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C138376Ot A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public C56044OuG(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C138376Ot c138376Ot) {
        C14360o3.A0B(userSession, 2);
        this.A03 = abstractC59962oe;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A06 = c138376Ot;
        C57550PgO A01 = C57550PgO.A01(this, 33);
        InterfaceC09390do A00 = C57550PgO.A00(C57550PgO.A01(abstractC59962oe, 30), EnumC09460dv.A02, 31);
        this.A08 = AbstractC25225BEi.A0a(C57550PgO.A01(A00, 32), A01, C57530Pg4.A00(null, A00, 34), AbstractC25225BEi.A1D(C51041Mgr.class));
        this.A07 = AbstractC09440dt.A01(C57550PgO.A01(this, 29));
        abstractC59962oe.registerLifecycleListener(this);
        A00();
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
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    private final void A00() {
        if (this.A02 == null) {
            this.A02 = AbstractC18560vj.A03(AbstractC25235BEs.A0S(this.A03), C57167PZl.A02(this, ((C51041Mgr) this.A08.getValue()).A0K, 30));
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
        this.A02 = MSY.A0r(this.A02);
        this.A01 = false;
        this.A06.A02(this.A03, true);
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
        A00();
    }
}
