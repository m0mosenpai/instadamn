package X;

import android.animation.ValueAnimator;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.BoN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26564BoN extends AbstractC51572Yf {
    public final Context A00;
    public final C120985dq A01;
    public final InterfaceC31137Dmc A02;
    public final C37644Ghd A03;
    public final UserSession A04;
    public final boolean A05;
    public final boolean A06;

    public C26564BoN(Context context, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc, boolean z, boolean z2) {
        AbstractC167007dF.A1G(userSession, 1, interfaceC31137Dmc);
        this.A04 = userSession;
        this.A00 = context;
        this.A01 = c120985dq;
        this.A03 = c37644Ghd;
        this.A02 = interfaceC31137Dmc;
        this.A06 = z;
        this.A05 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r28.A05 == false) goto L6;
     */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r29) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26564BoN.A0Y(X.3bS):X.2Vc");
    }

    public static final void A03(C2XI c2xi, C77123cy c77123cy, long j) {
        AbstractC25233BEq.A1C(c77123cy);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        AbstractC25231BEo.A0w(new BFF(c2xi, 28), ofFloat, c77123cy);
    }
}
