package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NKJ extends OX6 {
    public C47Z A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final AbstractC55082Oac A06;
    public final InterfaceC09390do A07;
    public final C05A A08;
    public final C0UO A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKJ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, AbstractC55082Oac abstractC55082Oac, boolean z) {
        super(abstractC55082Oac);
        AbstractC167007dF.A1G(userSession, 2, interfaceC11380iw);
        this.A06 = abstractC55082Oac;
        this.A05 = userSession;
        this.A0A = z;
        this.A04 = interfaceC11380iw;
        C008002u A1H = AbstractC25225BEi.A1H(new C51738MtL());
        this.A08 = A1H;
        this.A09 = A1H;
        this.A07 = C1XM.A00(C57525Pfz.A00(this, 44));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r0.A02() != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C65782Tu0 A00(X.NKJ r6, X.C51754Mtd r7, boolean r8) {
        /*
            X.Mtg r1 = r7.A06
            r3 = 0
            if (r1 == 0) goto L7a
            java.lang.Object r0 = r1.A01
        L7:
            r5 = 1
            if (r0 != 0) goto L10
            if (r1 == 0) goto L78
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L78
        L10:
            r4 = 1
        L11:
            X.GzR r0 = r7.A07
            if (r0 == 0) goto L1c
            boolean r0 = r0.A02()
            r2 = 1
            if (r0 == 0) goto L1d
        L1c:
            r2 = 0
        L1d:
            java.util.List r0 = r7.A0X
            java.lang.Integer r1 = X.AbstractC53943NtG.A00(r0)
            X.H2v r0 = r7.A08
            if (r0 != 0) goto L28
            r5 = 0
        L28:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L38
            r1 = 2131961929(0x7f132849, float:1.9560569E38)
        L2f:
            r0 = 2131955279(0x7f130e4f, float:1.954708E38)
        L32:
            X.Tu0 r3 = new X.Tu0
            r3.<init>(r1, r0)
        L37:
            return r3
        L38:
            if (r5 == 0) goto L3e
            r1 = 2131956756(0x7f131414, float:1.9550077E38)
            goto L2f
        L3e:
            if (r4 == 0) goto L44
            r1 = 2131963005(0x7f132c7d, float:1.9562751E38)
            goto L2f
        L44:
            if (r2 == 0) goto L4a
            r1 = 2131970047(0x7f1347ff, float:1.9577034E38)
            goto L2f
        L4a:
            boolean r0 = r7.A0h
            if (r0 == 0) goto L52
            r1 = 2131955281(0x7f130e51, float:1.9547085E38)
            goto L2f
        L52:
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L5a
            r1 = 2131955278(0x7f130e4e, float:1.9547079E38)
            goto L2f
        L5a:
            X.Mtf r0 = r7.A01
            if (r0 == 0) goto L37
            if (r8 != 0) goto L71
            X.0do r0 = r6.A07
            java.lang.Object r3 = X.AbstractC166987dD.A17(r0)
            X.6w2 r3 = (X.C153936w2) r3
            java.lang.String r2 = "user"
            java.lang.String r1 = "share_sheet"
            java.lang.String r0 = "tap_audience"
            X.C153936w2.A05(r3, r2, r1, r0)
        L71:
            r1 = 2131956063(0x7f13115f, float:1.9548671E38)
            r0 = 2131955280(0x7f130e50, float:1.9547083E38)
            goto L32
        L78:
            r4 = 0
            goto L11
        L7a:
            r0 = r3
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKJ.A00(X.NKJ, X.Mtd, boolean):X.Tu0");
    }

    public static final void A01(NKJ nkj, EnumC76383bi enumC76383bi, C47Z c47z) {
        String fanClubId;
        FanClubInfoDict B4O = AbstractC31171DnF.A0T(nkj.A05, C17060sy.A01).B4O();
        String str = null;
        if (B4O != null && (fanClubId = B4O.getFanClubId()) != null && enumC76383bi == EnumC76383bi.A07) {
            str = fanClubId;
        }
        c47z.A2q = str;
    }
}
