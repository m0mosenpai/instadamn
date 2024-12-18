package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CC implements InterfaceC60602pj, C3CD {
    public C3MT A00;
    public final UserSession A01;
    public final C60662pp A02;
    public final InterfaceC09390do A03 = C1XM.A00(new C9E5(this, 8));
    public final C65192xH A04;

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

    @Override // X.C3CD
    public final C38321qM BQN() {
        return this.A02.A06();
    }

    @Override // X.InterfaceC60162oy
    public final Integer BRW() {
        return C05F.A00;
    }

    @Override // X.InterfaceC60162oy
    public final String BkH() {
        C38321qM A06 = this.A02.A06();
        if (A06 != null) {
            return A06.A0C.getLoggingInfoToken();
        }
        return null;
    }

    @Override // X.C3CD
    public final boolean CcS() {
        return C18U.A06(C06090Tz.A05, this.A01, 36331033867601030L);
    }

    @Override // X.C3CD
    public final void DlF(C38321qM c38321qM, String str) {
        String A00 = AbstractC111324zv.A00(412);
        C60662pp c60662pp = this.A02;
        if (c60662pp.A0H != null) {
            C75113Zb BRZ = this.A04.BRZ(c38321qM);
            C685736u c685736u = c60662pp.A0H;
            if (c685736u != null) {
                c685736u.BRw().DlG(c38321qM, BRZ, A00, BRZ.getPosition());
            }
        }
    }

    @Override // X.InterfaceC60162oy
    public final String getMediaId() {
        C38321qM A02;
        C65192xH c65192xH = this.A04;
        int A022 = c65192xH.A02(-1);
        if (A022 >= 0 && (A02 = C3XH.A02(c65192xH.A03(A022).A05)) != null) {
            return A02.getId();
        }
        return null;
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        InterfaceC09390do interfaceC09390do = this.A03;
        ((C3MJ) interfaceC09390do.getValue()).A06(this.A00);
        ((C3MJ) interfaceC09390do.getValue()).A04();
        this.A00 = null;
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        InterfaceC09390do interfaceC09390do = this.A03;
        ((C3MJ) interfaceC09390do.getValue()).A03();
        interfaceC09390do.getValue();
        this.A00 = C3MJ.A00(new C3MP(this.A02, this.A01, AbstractC60942qI.A00, this));
        C3MJ c3mj = (C3MJ) interfaceC09390do.getValue();
        C3MT c3mt = this.A00;
        if (c3mt != null) {
            c3mj.A05(c3mt);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C3CC(UserSession userSession, C65192xH c65192xH, C60662pp c60662pp) {
        this.A02 = c60662pp;
        this.A01 = userSession;
        this.A04 = c65192xH;
    }
}
