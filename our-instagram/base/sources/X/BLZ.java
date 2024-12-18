package X;

import android.view.MotionEvent;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BLZ implements InterfaceC31061Dl3 {
    public InterfaceC16660sJ A00;
    public InterfaceC16660sJ A01;
    public InterfaceC16660sJ A02;
    public final UserSession A03;

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    @Override // X.InterfaceC31061Dl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DlJ(android.view.View r11, X.C120985dq r12, X.C37644Ghd r13, boolean r14, boolean r15) {
        /*
            r10 = this;
            r6 = r12
            r7 = r13
            X.AbstractC167017dG.A1N(r12, r13)
            X.Jxt r4 = new X.Jxt
            r5 = r11
            r8 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            if (r15 == 0) goto L26
            com.instagram.common.session.UserSession r3 = r10.A03
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320618574127849(0x810969002222e9, double:3.032643665445941E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L26
            X.0sJ r0 = r10.A00
        L20:
            if (r0 == 0) goto L25
            r0.invoke(r4)
        L25:
            return
        L26:
            X.0sJ r0 = r10.A01
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BLZ.DlJ(android.view.View, X.5dq, X.Ghd, boolean, boolean):void");
    }

    @Override // X.InterfaceC31061Dl3
    public final void DlN(MotionEvent motionEvent, C120985dq c120985dq, C37644Ghd c37644Ghd) {
        String id;
        C14360o3.A0B(c120985dq, 1);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            C38687GzS c38687GzS = new C38687GzS(motionEvent, id);
            InterfaceC16660sJ interfaceC16660sJ = this.A02;
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(c38687GzS);
            }
        }
    }

    public BLZ(UserSession userSession) {
        this.A03 = userSession;
    }

    @Override // X.InterfaceC31061Dl3
    public final void EXN(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31061Dl3
    public final void EXo(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31061Dl3
    public final void Eds(InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC16660sJ;
    }
}
