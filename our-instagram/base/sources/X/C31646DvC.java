package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DvC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31646DvC implements InterfaceC50462MPq {
    public final Activity A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final C31594DuM A03;

    @Override // X.InterfaceC50462MPq
    public final void Crw(C31446Drq c31446Drq, C3o9 c3o9, Integer num, Integer num2, String str, List list) {
        C14360o3.A0B(c3o9, 0);
        A00(c31446Drq, this, c3o9, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (X.C18U.A06(r5, r6, 36311560487174763L) != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C31446Drq r7, X.C31646DvC r8, X.C3o9 r9, java.lang.Integer r10) {
        /*
            android.app.Activity r4 = r8.A00
            com.instagram.common.session.UserSession r6 = r8.A02
            X.2oe r3 = r8.A01
            java.lang.String r0 = "inbox"
            X.1nl r2 = X.C36881nl.A01(r4, r3, r6, r0)
            r2.A09(r9)
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0G = r0
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36311560486191708(0x81012c0005025c, double:3.0269152941611327E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            if (r0 != 0) goto L30
            r0 = 36311560487174763(0x81012c0014026b, double:3.0269152947828206E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            r1 = 0
            if (r0 == 0) goto L31
        L30:
            r1 = 1
        L31:
            X.AbstractC31171DnF.A1P(r4)
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.modal.fragment.intf.ModalListener"
            X.C14360o3.A0C(r3, r0)
            r0 = r3
            X.2oQ r0 = (X.InterfaceC59832oQ) r0
            r2.A0z = r1
            r2.A00 = r3
            r2.A02 = r4
            r2.A0A = r0
            r0 = 1
            r2.A0s = r0
            r2.A05 = r3
            java.lang.String r0 = r7.A02
            r2.A0X = r0
            r2.A0F = r10
            r2.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31646DvC.A00(X.Drq, X.DvC, X.3o9, java.lang.Integer):void");
    }

    public C31646DvC(Activity activity, AbstractC59962oe abstractC59962oe, UserSession userSession, C31594DuM c31594DuM) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = abstractC59962oe;
        this.A03 = c31594DuM;
        abstractC59962oe.registerLifecycleListener(new C37341Gcj(1));
    }

    @Override // X.InterfaceC50462MPq
    public final void Cs0(C31446Drq c31446Drq, C3o9 c3o9, Integer num, String str, int i) {
        A00(c31446Drq, this, c3o9, num);
    }
}
