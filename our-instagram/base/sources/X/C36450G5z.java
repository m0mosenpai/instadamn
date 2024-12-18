package X;

import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.G5z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36450G5z implements GZ1 {
    public final int A00;
    public final Object A01;

    public C36450G5z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // X.GZ1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L82;
                case 1: goto L56;
                default: goto L5;
            }
        L5:
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            java.lang.Object r2 = r10.A00()
            X.75f r2 = (X.C1574875f) r2
            java.lang.Object r1 = r9.A01
            X.66r r1 = (X.C1346766r) r1
            r7 = 0
            if (r2 == 0) goto L54
            int r0 = r2.mStatusCode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L1c:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            if (r2 == 0) goto L4b
            java.lang.String r4 = r2.getErrorMessage()
            com.instagram.realtimeclient.DirectApiError r0 = r2.A03
            if (r0 == 0) goto L4c
            java.lang.String r5 = r0.errorType
        L2c:
            com.instagram.realtimeclient.DirectApiError r0 = r2.A03
            if (r0 == 0) goto L50
            java.lang.String r6 = r0.errorTitle
        L32:
            com.instagram.realtimeclient.DirectApiError r0 = r2.A03
            if (r0 == 0) goto L38
            java.lang.String r7 = r0.errorDescription
        L38:
            boolean r8 = r10 instanceof X.C115115Ig
            X.E5d r2 = new X.E5d
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.Lcn r0 = new X.Lcn
            r0.<init>(r2)
            r1.A02(r0)
            r1.A00()
        L4a:
            return
        L4b:
            r4 = r7
        L4c:
            r5 = r7
            if (r2 == 0) goto L50
            goto L2c
        L50:
            r6 = r7
            if (r2 == 0) goto L38
            goto L32
        L54:
            r0 = r7
            goto L1c
        L56:
            java.lang.Object r3 = r9.A01
            X.FLd r3 = (X.C34569FLd) r3
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = r3.A02
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "onAddUserChatRequestsClick_network_error"
            X.C9GR.A0D(r1, r0)
            X.Gs5 r1 = r2.mListAdapter
            X.1vS r0 = r3.A00
            com.instagram.user.model.User r2 = r3.A01
            java.util.HashMap r1 = r1.A0C
            java.lang.String r0 = r0.A0j
            java.lang.Object r0 = r1.get(r0)
            X.Gs7 r0 = (X.C38264Gs7) r0
            if (r0 == 0) goto L4a
            X.GnW r1 = r0.A0k
            java.util.Set r0 = r1.A0a
            r0.remove(r2)
            r1.A07()
            return
        L82:
            java.lang.Object r1 = r9.A01
            X.EJt r1 = (X.C32282EJt) r1
            r0 = 0
            r1.A05 = r0
            X.C32282EJt.A00(r1)
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L4a
            android.content.Context r2 = r1.requireContext()
            com.instagram.common.session.UserSession r1 = r1.A00
            boolean r0 = r10 instanceof X.C115115Ig
            X.AbstractC46744Km1.A00(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36450G5z.onFail(X.5If):void");
    }

    @Override // X.GZ1
    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                C32282EJt c32282EJt = (C32282EJt) this.A01;
                c32282EJt.A05 = false;
                C32282EJt.A00(c32282EJt);
                C25671My A00 = AbstractC25651Mw.A00(c32282EJt.A00);
                java.util.Set set = c32282EJt.A0C;
                A00.E4s(new C36088FwO(set));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    User A15 = AbstractC25226BEj.A15(it);
                    C35003Fba c35003Fba = c32282EJt.A02;
                    c35003Fba.getClass();
                    c35003Fba.A00(A15);
                }
                set.clear();
                c32282EJt.A09 = true;
                AbstractC31177DnL.A12(c32282EJt);
                return;
            case 1:
                C34569FLd c34569FLd = (C34569FLd) this.A01;
                C38262Gs5 c38262Gs5 = c34569FLd.A02.mListAdapter;
                C41181vS c41181vS = c34569FLd.A00;
                User user = c34569FLd.A01;
                C38264Gs7 c38264Gs7 = (C38264Gs7) c38262Gs5.A0C.get(c41181vS.A0j);
                if (c38264Gs7 == null) {
                    return;
                }
                C37986GnW c37986GnW = c38264Gs7.A0k;
                C41181vS c41181vS2 = c37986GnW.A03;
                c41181vS2.getClass();
                C35003Fba c35003Fba2 = c41181vS2.A04;
                if (c35003Fba2 == null) {
                    return;
                }
                c35003Fba2.A00(user);
                c37986GnW.A0a.remove(user);
                c37986GnW.A07();
                return;
            default:
                C1346766r c1346766r = (C1346766r) this.A01;
                c1346766r.A02(new C132955zK(AbstractC166997dE.A0b()));
                c1346766r.A00();
                return;
        }
    }
}
