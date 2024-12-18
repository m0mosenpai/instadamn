package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.Gjz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37784Gjz extends AbstractC37623GhI implements C38Y {
    public C5SW A00;
    public final Activity A01;
    public final UserSession A02;
    public final InterfaceC19630xq A03;
    public final C43064J2e A04;
    public final C37785Gk0 A05;
    public final C37785Gk0 A06;
    public final boolean A07;

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
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
        C14360o3.A0B(num, 0);
        if (num == C05F.A0C && !this.A07) {
            A00(this, this.A06, 2131955945, true);
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    public static final void A00(C37784Gjz c37784Gjz, InterfaceC43437JHb interfaceC43437JHb, int i, boolean z) {
        InterfaceC53792dI interfaceC53792dI;
        View C4r;
        ComponentCallbacks2 componentCallbacks2 = c37784Gjz.A01;
        if ((componentCallbacks2 instanceof InterfaceC53792dI) && (interfaceC53792dI = (InterfaceC53792dI) componentCallbacks2) != null && (C4r = interfaceC53792dI.C4r(C1QO.A09.toString())) != null) {
            AbstractC167007dF.A0J().postDelayed(new RunnableC37900Glx(C4r, new C149686oL(i), c37784Gjz, interfaceC43437JHb, z), 2000L);
        }
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        if (this.A07) {
            C37556GgC c37556GgC = super.A02;
            if (c37556GgC != null && i == C37546Gg2.A00(c37556GgC.A09) - 1) {
                A00(this, this.A04, 2131955935, false);
                return;
            }
            C5SW c5sw = this.A00;
            if (c5sw == null) {
                return;
            }
            c5sw.A08(true);
            return;
        }
        if (i <= i2 || i < 5 || System.currentTimeMillis() - this.A03.getLong("KEY_LAST_VIEWER_ENTRY", System.currentTimeMillis()) <= StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
            return;
        }
        A00(this, this.A05, 2131955945, true);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.J2e, java.lang.Object] */
    public C37784Gjz(Activity activity, UserSession userSession, boolean z) {
        AbstractC167017dG.A1P(userSession, activity);
        this.A02 = userSession;
        this.A01 = activity;
        this.A07 = z;
        InterfaceC19630xq A04 = C1AT.A01(userSession).A04(C1AV.A0p, getClass());
        this.A03 = A04;
        this.A06 = new C37785Gk0(userSession, A04, EnumC37795GkA.A05);
        this.A05 = new C37785Gk0(userSession, A04, EnumC37795GkA.A04);
        this.A04 = new Object();
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        super.onDestroyView();
        C37556GgC c37556GgC = super.A02;
        if (c37556GgC != null) {
            c37556GgC.A0H(this);
        }
    }
}
