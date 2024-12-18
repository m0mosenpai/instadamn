package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69663Ba implements InterfaceC12870lZ, InterfaceC60602pj {
    public final UserSession A00;
    public final C69453Af A01;
    public final C60662pp A02;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        C218914p.A03(EnumC220415e.A02, this);
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
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public C69663Ba(UserSession userSession, C69453Af c69453Af, C60662pp c60662pp) {
        this.A02 = c60662pp;
        this.A00 = userSession;
        this.A01 = c69453Af;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-812433429);
        AbstractC09800fd.A01("MainFeedFragment.onAppBackgrounded", 949931882);
        try {
            C3FY c3fy = this.A02.A0B;
            if (c3fy != null) {
                boolean A0B = c3fy.A0B();
                int ordinal = c3fy.A02.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 1 && A0B) {
                        C3FY.A01(c3fy, C05F.A0Y);
                    }
                } else if ((!c3fy.A08.A0h.A04.isEmpty()) && A0B) {
                    C3FY.A00(c3fy, C05F.A0Y);
                }
            }
            UserSession userSession = this.A00;
            C3D5.A00(userSession).A06(C05F.A01);
            C1OS A00 = C1OR.A00(userSession);
            C1OS.A05(A00, "APP_BACKGROUNDED");
            C1OS.A04(A00, "APP_BACKGROUNDED");
            C71713Ju A002 = AbstractC71703Jt.A00(userSession);
            C71713Ju.A02(A002, "APP_BACKGROUNDED");
            C71713Ju.A01(A002, "APP_BACKGROUNDED");
            C61862rn.A03(C61852rm.A00(userSession), "APP_BACKGROUNDED");
            AbstractC09800fd.A00(1891259229);
            C0f9.A0A(407423339, A03);
        } catch (Throwable th) {
            AbstractC09800fd.A00(1429747445);
            C0f9.A0A(1992106197, A03);
            throw th;
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1522369095);
        AbstractC09800fd.A01("MainFeedFragment.onAppForegrounded", -457246737);
        try {
            C60662pp c60662pp = this.A02;
            C3FY c3fy = c60662pp.A0B;
            if (c3fy != null && c3fy.A02.ordinal() == 1 && c3fy.A0B()) {
                C3FY.A01(c3fy, C05F.A0j);
            }
            UserSession userSession = this.A00;
            C1OS A00 = C1OR.A00(userSession);
            C1OS.A05(A00, "APP_FOREGROUNDED");
            A00.A01 = C18U.A06(C06090Tz.A05, AbstractC25351Lp.A00(A00.A06).A00, 36323775373127273L);
            C71713Ju.A02(AbstractC71703Jt.A00(userSession), "APP_FOREGROUNDED");
            C61862rn.A03(C61852rm.A00(userSession), "APP_FOREGROUNDED");
            if (!this.A01.A09) {
                c60662pp.A0C();
            }
            AbstractC09800fd.A00(293470610);
            C0f9.A0A(847289866, A03);
        } catch (Throwable th) {
            AbstractC09800fd.A00(167241429);
            C0f9.A0A(-581598530, A03);
            throw th;
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C218914p.A06(this);
    }
}
