package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.P0w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56361P0w implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C52472NJq A03;
    public final C23031Ai A04;
    public final C81X A05;
    public final AbstractC59962oe A06;
    public final boolean A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36322860544961220L) && C18U.A06(c06090Tz, userSession, 36322860545288905L)) {
            AbstractC59962oe abstractC59962oe = this.A06;
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 13), C07Y.A00(viewLifecycleOwner));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (X.C18U.A06(r6, r7, 36322937854634758L) != false) goto L6;
     */
    @Override // X.InterfaceC58169PqZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ANR() {
        /*
            r17 = this;
            r5 = r17
            X.2oe r8 = r5.A06
            android.content.Context r0 = r8.requireContext()
            com.instagram.common.ui.base.IgLinearLayout r4 = new com.instagram.common.ui.base.IgLinearLayout
            r4.<init>(r0)
            r11 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            r4.setOrientation(r11)
            X.AbstractC50522MSa.A0z(r4)
            com.instagram.common.session.UserSession r7 = r5.A02
            X.0Tz r6 = X.C06090Tz.A05
            r0 = 36322937854438147(0x810b8500032b03, double:3.0341103876531654E-306)
            boolean r0 = X.C18U.A06(r6, r7, r0)
            if (r0 != 0) goto L34
            r0 = 36322937854634758(0x810b8500062b06, double:3.034110387777503E-306)
            boolean r0 = X.C18U.A06(r6, r7, r0)
            r16 = 0
            if (r0 == 0) goto L36
        L34:
            r16 = 1
        L36:
            r0 = 36322860544961220(0x810b7300022ac4, double:3.0340614968286565E-306)
            boolean r15 = X.C18U.A06(r6, r7, r0)
            android.content.Context r14 = r8.requireContext()
            r9 = 0
            r13 = 2131954810(0x7f130c7a, float:1.954613E38)
            boolean r10 = r5.A07
            if (r10 == 0) goto Ld1
            r2 = 2131238990(0x7f08204e, float:1.8094274E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
        L52:
            r2 = 2131956023(0x7f131137, float:1.954859E38)
            java.lang.String r2 = r8.getString(r2)
            X.NFj r2 = X.OOy.A01(r14, r3, r2, r12, r13)
            r5.A00 = r2
            if (r15 == 0) goto L93
            boolean r12 = X.AbstractC75343a1.A06(r7)
            if (r12 == 0) goto Lcf
            X.1Ai r2 = r5.A04
            X.0xq r2 = r2.A01
            boolean r1 = X.C18U.A06(r6, r7, r0)
            java.lang.String r0 = "translate_captions_for_video"
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 == 0) goto Lcf
        L77:
            X.NFj r0 = r5.A00
            java.lang.String r2 = "closedCaptionsTranslationsSwitchCell"
            if (r0 == 0) goto Ld3
            r0.setChecked(r11)
            X.NFj r1 = r5.A00
            if (r1 == 0) goto Ld3
            r0 = 23
            X.C52369NFj.A02(r1, r5, r0)
            r1.setEnableSwitchView(r12)
            X.NFj r0 = r5.A00
            if (r0 == 0) goto Ld3
            r4.addView(r0)
        L93:
            if (r16 == 0) goto Lce
            android.content.Context r2 = r8.requireContext()
            r1 = 2131957013(0x7f131515, float:1.9550598E38)
            if (r10 == 0) goto La5
            r0 = 2131238990(0x7f08204e, float:1.8094274E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        La5:
            r0 = 2131957012(0x7f131514, float:1.9550596E38)
            java.lang.String r0 = r8.getString(r0)
            X.NFj r3 = X.OOy.A01(r2, r3, r0, r9, r1)
            X.1Ai r0 = r5.A04
            X.0xq r2 = r0.A01
            r0 = 36322937854700295(0x810b8500072b07, double:3.034110387818949E-306)
            boolean r1 = X.C18U.A06(r6, r7, r0)
            java.lang.String r0 = "translate_stickers"
            boolean r0 = r2.getBoolean(r0, r1)
            r3.setChecked(r0)
            r0 = 24
            X.C52369NFj.A02(r3, r5, r0)
            r4.addView(r3)
        Lce:
            return r4
        Lcf:
            r11 = 0
            goto L77
        Ld1:
            r12 = r9
            goto L52
        Ld3:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56361P0w.ANR():android.view.View");
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A05;
    }

    public C56361P0w(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C52472NJq c52472NJq, boolean z) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC11380iw);
        C14360o3.A0B(c52472NJq, 5);
        this.A06 = abstractC59962oe;
        this.A02 = userSession;
        this.A07 = z;
        this.A01 = interfaceC11380iw;
        this.A03 = c52472NJq;
        this.A04 = AbstractC23021Ah.A00(userSession);
        this.A05 = C81X.A2i;
    }
}
