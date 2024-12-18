package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;

/* renamed from: X.Jmr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44547Jmr extends AbstractC52922bZ {
    public AddChannelsRowChannelInfo A00;
    public final UserSession A01;
    public final KZH A02;
    public final C23031Ai A03;
    public final InterfaceC09390do A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;
    public final boolean A09;

    public static final C51760Mtj A00(C44547Jmr c44547Jmr) {
        return new C51760Mtj(new B5y(c44547Jmr, 33), new B5y(c44547Jmr, 34), 4);
    }

    public static final void A01(C44547Jmr c44547Jmr, boolean z) {
        Object k2c;
        AddChannelsRowChannelInfo addChannelsRowChannelInfo = c44547Jmr.A00;
        C05A c05a = c44547Jmr.A06;
        if (addChannelsRowChannelInfo != null) {
            C51760Mtj A00 = A00(c44547Jmr);
            int i = 1;
            if (z) {
                i = 0;
            }
            k2c = new C26189BiF(A00, addChannelsRowChannelInfo, i);
        } else {
            k2c = new K2C(A00(c44547Jmr));
        }
        c05a.Egh(k2c);
    }

    public final String A02() {
        AddChannelsRowChannelInfo addChannelsRowChannelInfo;
        if (C26189BiF.A00(this.A06.getValue(), 0) || (addChannelsRowChannelInfo = this.A00) == null) {
            return null;
        }
        return addChannelsRowChannelInfo.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r6 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.AbstractC59962oe r5, com.instagram.creation.channels.model.AddChannelsRowChannelInfo r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r4.A09
            if (r0 != 0) goto Lf
            r4.A00 = r6
            if (r7 == 0) goto Lb
            r0 = 1
            if (r6 != 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            A01(r4, r0)
        Lf:
            X.07S r3 = X.C07S.STARTED
            X.07X r2 = r5.getViewLifecycleOwner()
            X.2k6 r0 = X.C07Y.A00(r2)
            r6 = 0
            r7 = 49
            X.MCP r1 = new X.MCP
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.AbstractC166987dD.A1Z(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44547Jmr.A03(X.2oe, com.instagram.creation.channels.model.AddChannelsRowChannelInfo, boolean):void");
    }

    public C44547Jmr(UserSession userSession, KZH kzh, boolean z) {
        AbstractC167017dG.A1P(userSession, kzh);
        this.A01 = userSession;
        this.A02 = kzh;
        this.A09 = z;
        C008002u A1H = AbstractC25225BEi.A1H(new K2C(A00(this)));
        this.A06 = A1H;
        this.A08 = AbstractC208910l.A02(A1H);
        C008002u A00 = C10E.A00(C45755KNi.A00);
        this.A05 = A00;
        this.A07 = AbstractC208910l.A02(A00);
        this.A04 = AbstractC09440dt.A01(new B5y(this, 32));
        this.A03 = AbstractC23021Ah.A00(userSession);
    }
}
