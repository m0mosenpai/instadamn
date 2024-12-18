package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G33 implements InterfaceC37156GYt {
    public C31335Dq0 A00;
    public final Context A01;
    public final UserSession A02;
    public final E70 A03;
    public final EnumC31337Dq2 A04;

    public G33(Context context, UserSession userSession, E70 e70, EnumC31337Dq2 enumC31337Dq2) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = e70;
        this.A04 = enumC31337Dq2;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        if (r0.A0D == false) goto L44;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0010. Please report as an issue. */
    @Override // X.InterfaceC37156GYt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getItems() {
        /*
            r7 = this;
            X.E70 r4 = r7.A03
            int r1 = r4.A09
            java.lang.String r6 = "headerItem"
            r0 = 29
            if (r1 != r0) goto Laa
            X.Dq2 r2 = r7.A04
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto La5;
                case 1: goto L68;
                case 2: goto L8a;
                case 3: goto L9b;
                case 4: goto La0;
                default: goto L13;
            }
        L13:
            r0 = 2131959034(0x7f131cfa, float:1.9554697E38)
        L16:
            X.Dq0 r3 = X.C31335Dq0.A00(r0)
        L1a:
            r7.A00 = r3
            com.instagram.common.session.UserSession r5 = r7.A02
            boolean r0 = X.AbstractC34097F2z.A00(r5, r4, r2)
            if (r0 == 0) goto L52
            X.Dq0 r1 = r7.A00
            if (r1 == 0) goto Led
            android.content.Context r3 = r7.A01
            r0 = 2131959063(0x7f131d17, float:1.9554756E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A0G = r0
            X.E6i r0 = X.C35252Fgl.A01(r5, r4)
            boolean r0 = X.AbstractC35172FfP.A03(r5, r0, r2)
            if (r0 != 0) goto L60
            X.Dq2 r0 = X.EnumC31337Dq2.A02
            if (r2 == r0) goto L60
            X.Dq2 r0 = X.EnumC31337Dq2.A03
            if (r2 == r0) goto L60
            X.Dq0 r1 = r7.A00
            if (r1 == 0) goto Led
            r0 = 2130970313(0x7f0406c9, float:1.7549333E38)
        L4c:
            int r0 = X.AbstractC167007dF.A09(r3, r0)
            r1.A00 = r0
        L52:
            X.Dq0 r1 = r7.A00
            if (r1 == 0) goto Led
            X.FGX r0 = new X.FGX
            r0.<init>(r1)
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
            return r0
        L60:
            X.Dq0 r1 = r7.A00
            if (r1 == 0) goto Led
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            goto L4c
        L68:
            r0 = 2131959041(0x7f131d01, float:1.9554711E38)
            X.Dq0 r3 = X.C31335Dq0.A00(r0)
            X.Dq2 r1 = X.EnumC31337Dq2.A02
            r3.A0C = r1
            com.instagram.common.session.UserSession r0 = r7.A02
            boolean r0 = X.AbstractC34097F2z.A00(r0, r4, r1)
            if (r0 == 0) goto L86
            android.content.Context r1 = r7.A01
            r0 = 2131959056(0x7f131d10, float:1.9554742E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0H = r0
        L86:
            r0 = 2131440306(0x7f0b32b2, float:1.8502592E38)
            goto L98
        L8a:
            r0 = 2131959048(0x7f131d08, float:1.9554725E38)
            X.Dq0 r3 = X.C31335Dq0.A00(r0)
            X.Dq2 r0 = X.EnumC31337Dq2.A03
            r3.A0C = r0
            r0 = 2131440305(0x7f0b32b1, float:1.850259E38)
        L98:
            r3.A01 = r0
            goto L1a
        L9b:
            r0 = 2131959037(0x7f131cfd, float:1.9554703E38)
            goto L16
        La0:
            r0 = 2131959036(0x7f131cfc, float:1.9554701E38)
            goto L16
        La5:
            r0 = 2131959062(0x7f131d16, float:1.9554754E38)
            goto L16
        Laa:
            com.instagram.common.session.UserSession r3 = r7.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326807619778683(0x810f0a0000387b, double:3.0365576428368147E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Le5
            X.E9f r0 = r4.A07()
            if (r0 == 0) goto Lc4
            boolean r0 = r0.A0D
            r1 = 1
            if (r0 != 0) goto Lc5
        Lc4:
            r1 = 0
        Lc5:
            X.0do r0 = r4.A0a
            java.util.List r0 = X.AbstractC31171DnF.A0n(r0)
            int r2 = r0.size()
            if (r1 != 0) goto Ld3
            int r2 = r2 + 1
        Ld3:
            android.content.Context r1 = r7.A01
            r0 = 2131959857(0x7f132031, float:1.9556366E38)
            java.lang.String r1 = X.AbstractC31177DnL.A0a(r1, r2, r0)
            X.Dq0 r0 = new X.Dq0
            r0.<init>(r1)
        Le1:
            r7.A00 = r0
            goto L52
        Le5:
            r0 = 2131959856(0x7f132030, float:1.9556364E38)
            X.Dq0 r0 = X.C31335Dq0.A00(r0)
            goto Le1
        Led:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G33.getItems():java.util.List");
    }
}
