package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cwk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29351Cwk implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r10 != null) goto L17;
     */
    @Override // X.GYB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CJ8(android.net.Uri r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r2 = 0
            r1 = r16
            X.C14360o3.A0B(r1, r2)
            java.lang.String r0 = "thread_id"
            java.lang.String r8 = r1.getQueryParameter(r0)
            r13 = 0
            r4 = 1
            if (r8 == 0) goto L80
            int r0 = r8.length()
            if (r0 == 0) goto L80
            com.instagram.common.session.UserSession r7 = r15.A01
            X.2DS r0 = X.C2JD.A00(r7)
            X.2DU r0 = (X.C2DU) r0
            X.3kb r5 = r0.A0N(r8)
            if (r5 == 0) goto L80
            X.L5i r0 = X.LEP.A02
            X.KZA r0 = r0.A00(r7, r8)
            X.0UO r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            boolean r0 = X.MU9.A01(r1, r4)
            r9 = 0
            if (r0 == 0) goto L84
            X.MU9 r1 = (X.MU9) r1
            if (r1 == 0) goto L84
            java.lang.Object r3 = r1.A01
            X.MsW r3 = (X.C51701MsW) r3
            if (r3 == 0) goto L45
            java.lang.String r10 = r3.A05
            if (r10 != 0) goto L47
        L45:
            java.lang.String r10 = r7.userId
        L47:
            boolean r0 = r5.CVQ()
            if (r0 != 0) goto L81
            java.util.List r0 = r5.BSH()
            java.lang.String r11 = X.AbstractC28415CgL.A01(r10, r0, r4)
            java.util.List r0 = r5.BSH()
            java.lang.String r12 = X.AbstractC28415CgL.A01(r10, r0, r2)
        L5d:
            androidx.fragment.app.FragmentActivity r6 = r15.A00
            if (r3 != 0) goto L62
            r13 = 1
        L62:
            X.1Ai r4 = X.AbstractC23021Ah.A00(r7)
            r0 = 761(0x2f9, float:1.066E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.String r2 = X.AnonymousClass001.A0R(r0, r8)
            r0 = 1
            boolean r14 = X.C23031Ai.A07(r4, r2, r0)
            if (r3 == 0) goto L7a
            java.lang.String r9 = r3.A04
        L7a:
            r5.CVQ()
            X.AbstractC28415CgL.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L80:
            return
        L81:
            r11 = r9
            r12 = r9
            goto L5d
        L84:
            r3 = r9
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29351Cwk.CJ8(android.net.Uri, android.os.Bundle):void");
    }

    public C29351Cwk(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
