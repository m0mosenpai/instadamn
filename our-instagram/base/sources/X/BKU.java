package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class BKU extends AbstractC116895Qv implements InterfaceC60602pj, JIH, C38Y {
    public C120985dq A00;
    public C120985dq A01;
    public boolean A02;
    public boolean A03;
    public final QuickPerformanceLogger A04;
    public final String A05;
    public final UserSession A06;
    public final C37624GhJ A07;

    public BKU(QuickPerformanceLogger quickPerformanceLogger, UserSession userSession, C37624GhJ c37624GhJ, String str) {
        C14360o3.A0B(str, 4);
        this.A06 = userSession;
        this.A07 = c37624GhJ;
        this.A04 = quickPerformanceLogger;
        this.A05 = str;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        EnumC129395t1 enumC129395t1;
        C14360o3.A0B(c37818GkY, 0);
        boolean A03 = C1LE.A03(this.A06);
        if (this.A02) {
            C120985dq c120985dq = this.A00;
            if (c120985dq != null) {
                enumC129395t1 = c120985dq.A01;
            } else {
                enumC129395t1 = null;
            }
            if (enumC129395t1 == EnumC129395t1.A08) {
                if (!A03 || c37818GkY.A0C) {
                    this.A04.markerPoint(31790981, "CLIPS_FETCH_END");
                }
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        QuickPerformanceLogger quickPerformanceLogger;
        int i;
        EnumC129395t1 enumC129395t1;
        short s;
        C14360o3.A0B(num, 0);
        if (this.A03) {
            if (this.A02 && num != C05F.A00) {
                quickPerformanceLogger = this.A04;
                i = 31790981;
                s = 4;
            } else {
                if (num != C05F.A00) {
                    return;
                }
                C37624GhJ c37624GhJ = this.A07;
                C120985dq A02 = c37624GhJ.A02();
                if (this.A00 == null && c37624GhJ.A01() == 0) {
                    this.A00 = A02;
                    return;
                }
                if (C14360o3.A0K(A02, this.A00)) {
                    return;
                }
                this.A00 = A02;
                if (this.A02) {
                    return;
                }
                quickPerformanceLogger = this.A04;
                i = 31790981;
                quickPerformanceLogger.markerStart(31790981);
                this.A02 = true;
                quickPerformanceLogger.markerAnnotate(31790981, "navigation_source", this.A05);
                C120985dq c120985dq = this.A00;
                if (c120985dq != null) {
                    enumC129395t1 = c120985dq.A01;
                } else {
                    enumC129395t1 = null;
                }
                if (enumC129395t1 == EnumC129395t1.A08) {
                    quickPerformanceLogger.markerAnnotate(31790981, "wait_for_api_response", true);
                }
                quickPerformanceLogger.markerAnnotate(31790981, "APP_STARTUP_TIME_BUCKET", C1CC.A00());
                if (!C14360o3.A0K(this.A01, this.A00) || !this.A02) {
                    return;
                } else {
                    s = 2;
                }
            }
            quickPerformanceLogger.markerEnd(i, s);
            this.A02 = false;
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        EnumC129395t1 enumC129395t1;
        C14360o3.A0B(c120985dq, 0);
        this.A01 = c120985dq;
        if (this.A02) {
            C120985dq c120985dq2 = this.A00;
            if (c120985dq2 != null) {
                enumC129395t1 = c120985dq2.A01;
            } else {
                enumC129395t1 = null;
            }
            if (enumC129395t1 == EnumC129395t1.A08 || C14360o3.A0K(c120985dq2, c120985dq)) {
                QuickPerformanceLogger quickPerformanceLogger = this.A04;
                quickPerformanceLogger.markerPoint(31790981, "VIDEO_PLAYED");
                if (this.A02) {
                    quickPerformanceLogger.markerEnd(31790981, (short) 2);
                    this.A02 = false;
                }
            }
        }
    }

    @Override // X.JIH
    public final void E1V() {
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
    public final void onPause() {
        this.A00 = null;
        this.A01 = null;
        if (this.A02) {
            this.A04.markerEnd(31790981, (short) 4);
            this.A02 = false;
        }
        this.A03 = false;
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        this.A03 = true;
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

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        EnumC129395t1 enumC129395t1;
        if (this.A02) {
            C120985dq c120985dq = this.A00;
            if (c120985dq != null) {
                enumC129395t1 = c120985dq.A01;
            } else {
                enumC129395t1 = null;
            }
            if (enumC129395t1 == EnumC129395t1.A08) {
                this.A04.markerEnd(31790981, (short) 208);
                this.A02 = false;
            }
        }
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
        EnumC129395t1 enumC129395t1;
        if (this.A02) {
            C120985dq c120985dq = this.A00;
            if (c120985dq != null) {
                enumC129395t1 = c120985dq.A01;
            } else {
                enumC129395t1 = null;
            }
            if (enumC129395t1 == EnumC129395t1.A08) {
                this.A04.markerPoint(31790981, "CLIPS_FETCH_START");
            }
        }
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }
}
