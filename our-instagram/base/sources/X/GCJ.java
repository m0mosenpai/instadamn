package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GCJ implements C5OV {
    public final Context A00;
    public final UserSession A01;
    public final boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
    
        if (r10 == 1) goto L26;
     */
    @Override // X.C5OV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E3b(X.C5OW r18) {
        /*
            r17 = this;
            r6 = r17
            android.content.Context r5 = r6.A00
            com.instagram.common.session.UserSession r4 = r6.A01
            r3 = 1
            X.K4d r2 = new X.K4d
            r2.<init>(r5, r4)
            X.1U5 r0 = new X.1U5
            r0.<init>(r5)
            X.1UI r1 = r0.A00()
            java.lang.String r0 = "fdid_oe_exposure_time"
            X.1UM r9 = r1.A00(r0)
            X.1U5 r0 = new X.1U5
            r0.<init>(r5)
            X.1UI r1 = r0.A00()
            X.95F r0 = X.AK1.A00
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Date r12 = r0.getTime()
            X.C14360o3.A07(r12)
            java.lang.String r0 = "fdid_oe"
            X.1UM r10 = r1.A00(r0)
            X.EoC r1 = X.EnumC33317EoC.A05
            java.lang.String r8 = "ndx_fdid_holdout"
            r13 = 250(0xfa, float:3.5E-43)
            r11 = 2
            java.lang.String[] r7 = r1.A02
            java.util.Date r0 = r1.A01
            java.util.Date r1 = r1.A00
            r16 = 1
            java.lang.String r2 = r2.A00()
            boolean r0 = r12.before(r0)
            if (r0 != 0) goto Lfa
            boolean r0 = r12.after(r1)
            if (r0 != 0) goto Lfa
            X.0Tz r12 = X.C06090Tz.A06
            r0 = 36314657157286662(0x8103fd00000b06, double:3.028873641430875E-306)
            boolean r0 = X.C18U.A06(r12, r4, r0)
            if (r0 != 0) goto Lfa
            r1 = -1
            if (r2 == 0) goto Lfa
            java.lang.String r0 = X.AK1.A01(r8)
            int r0 = r10.getInt(r0, r1)
            if (r0 != r1) goto L78
            java.lang.String r0 = X.AnonymousClass001.A0R(r2, r8)
            int r0 = X.AbstractC31179DnN.A02(r10, r0, r8)
        L78:
            if (r0 < 0) goto Lfa
            int r0 = r0 / r13
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r10 = (int) r0
            if (r10 >= r11) goto Lfa
            if (r10 < 0) goto Lfa
            X.0kP r0 = X.AbstractC31177DnL.A0P(r4)
            X.0wW r1 = r0.A00()
            java.lang.String r0 = "fdid_offline_experiment_exposure"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            r0 = 155(0x9b, float:2.17E-43)
            X.1Mh r11 = X.AbstractC31171DnF.A0A(r1, r0)
            X.C14360o3.A0A(r11)
            r1 = r7[r10]
            java.lang.String r0 = "not_in_experiment"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Le9
            if (r9 == 0) goto Le9
            java.lang.String r12 = X.AK1.A00(r8)
            r0 = -1
            long r0 = r9.getLong(r12, r0)
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r0
            long r12 = X.AbstractC32113E9l.A00
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 < 0) goto Le9
            boolean r0 = X.AbstractC25226BEj.A1Z(r11)
            if (r0 == 0) goto Le9
            java.lang.String r0 = "exp_name"
            r11.A0R(r0, r8)
            r1 = r7[r10]
            java.lang.String r0 = "exp_group"
            r11.A0R(r0, r1)
            java.lang.String r0 = "family_device_id"
            r11.A0R(r0, r2)
            r11.Cht()
            X.1ZT r7 = r9.AR9()
            java.lang.String r2 = X.AK1.A00(r8)
            long r0 = java.lang.System.currentTimeMillis()
            r7.A08(r2, r0)
            r7.A0B()
        Le9:
            if (r10 != r3) goto Lfa
        Leb:
            r2 = 0
            if (r16 != 0) goto Lf9
            boolean r1 = r6.A02
            boolean r0 = X.C54P.A00(r5, r4)
            r0 = r0 ^ 1
            if (r1 != r0) goto Lf9
            r2 = 1
        Lf9:
            return r2
        Lfa:
            r16 = 0
            goto Leb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCJ.E3b(X.5OW):boolean");
    }

    public GCJ(UserSession userSession, Context context, boolean z) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = z;
    }
}
