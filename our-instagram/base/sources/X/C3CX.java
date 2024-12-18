package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3CX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CX implements InterfaceC60602pj {
    public View A00;
    public C140356Wo A01;
    public final Fragment A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final C61342qw A07;

    public C3CX(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C61342qw c61342qw) {
        C14360o3.A0B(c61342qw, 2);
        this.A02 = fragment;
        this.A07 = c61342qw;
        this.A03 = interfaceC11380iw;
        this.A04 = userSession;
        C9E5 c9e5 = new C9E5(this, 17);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E5(new C9E5(fragment, 18), 19));
        this.A06 = new C60842q8(new C9E5(A00, 20), c9e5, new C9F2(6, null, A00), new C0YZ(C3CY.class));
        this.A05 = AbstractC09440dt.A01(new C9E5(this, 16));
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
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
    public final void onDestroyView() {
        this.A00 = null;
        this.A01 = null;
        this.A07.F9f((C1I2) this.A05.getValue());
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
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
        C140356Wo c140356Wo;
        C14360o3.A0B(view, 0);
        UserSession userSession = this.A04;
        if (AbstractC70443Ed.A02(userSession)) {
            View requireViewById = view.requireViewById(R.id.main_feed_quick_snap_preview_stub);
            C14360o3.A07(requireViewById);
            View inflate = ((ViewStub) requireViewById).inflate();
            this.A00 = inflate;
            if (inflate != null) {
                c140356Wo = new C140356Wo(new ViewOnClickListenerC35529FmK(this), inflate, this.A03, userSession);
            } else {
                c140356Wo = null;
            }
            this.A01 = c140356Wo;
            Fragment fragment = this.A02;
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = fragment.getViewLifecycleOwner();
            C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
            C9DG c9dg = new C9DG(viewLifecycleOwner, c07s, this, null, 12);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dg, A00);
            if (AbstractC70443Ed.A02(userSession)) {
                ((C3CY) this.A06.getValue()).A04(true);
            }
            this.A07.EDY((C1I2) this.A05.getValue());
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 13377) {
            InterfaceC09390do interfaceC09390do = this.A06;
            ((C3CY) interfaceC09390do.getValue()).A01();
            ((C3CY) interfaceC09390do.getValue()).A02();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C140356Wo c140356Wo = this.A01;
        if (c140356Wo != null && c140356Wo.A01 && c140356Wo.A03.getVisibility() == 0) {
            c140356Wo.A05.A03(c140356Wo.A00);
        }
    }
}
