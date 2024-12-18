package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Dop, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31267Dop {
    public boolean A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final C19270xB A03;

    public C31267Dop(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = AbstractC31171DnF.A0D("AiAgentEligibilityRepository");
        this.A02 = AbstractC09440dt.A01(new C37050GUg(this, 25));
    }

    public final void A01(FragmentActivity fragmentActivity, InterfaceC30993Djs interfaceC30993Djs) {
        if (!this.A00) {
            this.A00 = true;
            C50169MDw c50169MDw = new C50169MDw(27, this, interfaceC30993Djs);
            HashMap A0r = AbstractC167017dG.A0r(AbstractC43591JPw.A00(185), new C66237U5h(new C30172DRc(41, interfaceC30993Djs, c50169MDw, this)));
            C62862tP A0O = AbstractC31172DnG.A0O(fragmentActivity, this.A03, this.A01);
            C69618VsL c69618VsL = new C69618VsL("com.bloks.www.messenger.aibot.waitlist_signup_controller");
            c69618VsL.A03 = A0r;
            c69618VsL.A00 = new C66237U5h(new MM0(c50169MDw, 0));
            c69618VsL.A00(fragmentActivity, A0O);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r7 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        return X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r7 != 3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A00() {
        /*
            r10 = this;
            com.instagram.common.session.UserSession r9 = r10.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36600843715547168(0x82084600251020, double:3.2098591732555926E-306)
            long r0 = X.C18U.A01(r2, r9, r0)
            int r7 = (int) r0
            r0 = 3
            if (r7 >= r0) goto L3c
            X.0do r8 = r10.A02
            java.lang.Object r0 = r8.getValue()
            X.FF9 r0 = (X.FF9) r0
            X.0xq r1 = r0.A00
            java.lang.String r0 = "notification_receive_time_ms"
            r3 = 0
            long r5 = r1.getLong(r0, r3)
            r0 = 36600843715874850(0x820846002a1022, double:3.20985917346282E-306)
            long r1 = X.C18U.A01(r2, r9, r0)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L3f
            long r5 = r5 + r1
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3f
        L39:
            java.lang.Integer r0 = X.C05F.A0N
            return r0
        L3c:
            if (r7 == r0) goto L39
            goto L5d
        L3f:
            r0 = 1
            if (r7 != r0) goto L5a
            java.lang.Object r0 = r8.getValue()
            X.FF9 r0 = (X.FF9) r0
            X.0xq r2 = r0.A00
            r0 = 1056(0x420, float:1.48E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L60
            java.lang.Integer r0 = X.C05F.A01
            return r0
        L5a:
            r0 = 2
            if (r7 == r0) goto L60
        L5d:
            java.lang.Integer r0 = X.C05F.A00
            return r0
        L60:
            java.lang.Integer r0 = X.C05F.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31267Dop.A00():java.lang.Integer");
    }
}
