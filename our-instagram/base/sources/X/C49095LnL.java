package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LnL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49095LnL implements InterfaceC165207a9 {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final C7EC A02;
    public final C163867Va A03;
    public final InterfaceC08830cm A04;
    public final InterfaceC08830cm A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public C49095LnL(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C163867Va c163867Va, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        AbstractC25234BEr.A0j(2, interfaceC11380iw, abstractC59962oe, c163867Va, interfaceC08830cm);
        this.A01 = userSession;
        this.A00 = abstractC59962oe;
        this.A03 = c163867Va;
        this.A04 = interfaceC08830cm;
        this.A05 = interfaceC08830cm2;
        this.A02 = new C7EC(interfaceC11380iw, userSession);
        this.A07 = C50249MHe.A01(this, 27);
        this.A06 = C50249MHe.A00(this, 26);
    }

    @Override // X.InterfaceC165207a9
    public final void ElF(C160787Im c160787Im, EnumC46202Kce enumC46202Kce) {
        AbstractC59962oe abstractC59962oe = this.A00;
        if (abstractC59962oe.isAdded() && abstractC59962oe.getContext() != null) {
            C25531Mh A0H = AbstractC31172DnG.A0H((C7F3) this.A06.getValue());
            if (AbstractC25226BEj.A1Z(A0H)) {
                A0H.A0Z(8);
                A0H.A0X(0);
                A0H.A0R("selected_item", AbstractC111324zv.A00(4647));
                A0H.Cht();
            }
            this.A03.A01(((LFu) this.A07.getValue()).A01(c160787Im, enumC46202Kce));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x020f, code lost:
    
        if (r0 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9, 36314249135393273L) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cd  */
    @Override // X.InterfaceC165207a9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ElE(X.InterfaceC129525tH r52, X.EnumC46202Kce r53, com.instagram.model.direct.messageid.MessageIdentifier r54) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49095LnL.ElE(X.5tH, X.Kce, com.instagram.model.direct.messageid.MessageIdentifier):void");
    }
}
