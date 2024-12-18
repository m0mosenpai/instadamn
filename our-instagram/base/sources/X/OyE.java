package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OyE implements C8HJ {
    public final C1815383g A00;
    public final InterfaceC1810081c A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public OyE(AbstractC59962oe abstractC59962oe, UserSession userSession, C22985ABk c22985ABk, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 2);
        C43210J8h c43210J8h = new C43210J8h(35, enumC142806cg, userSession, abstractC59962oe);
        C57541PgF A01 = C57541PgF.A01(abstractC59962oe, 36);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C57541PgF.A00(A01, enumC09460dv, 40);
        this.A08 = AbstractC25225BEi.A0a(C57541PgF.A01(A00, 41), c43210J8h, C57532Pg6.A00(null, A00, 21), AbstractC25225BEi.A1D(C50957MfQ.class));
        C57532Pg6 A002 = C57532Pg6.A00(abstractC59962oe, userSession, 15);
        InterfaceC09390do A003 = C57541PgF.A00(C57541PgF.A01(abstractC59962oe, 42), enumC09460dv, 43);
        this.A02 = AbstractC25225BEi.A0a(C57541PgF.A01(A003, 44), A002, C57532Pg6.A00(null, A003, 22), AbstractC25225BEi.A1D(C1810981l.class));
        C57532Pg6 A004 = C57532Pg6.A00(abstractC59962oe, userSession, 16);
        InterfaceC09390do A005 = C57541PgF.A00(C57541PgF.A01(abstractC59962oe, 30), enumC09460dv, 31);
        this.A04 = AbstractC25225BEi.A0a(C57541PgF.A01(A005, 32), A004, C57532Pg6.A00(null, A005, 17), AbstractC25225BEi.A1D(AnonymousClass825.class));
        InterfaceC09390do A006 = C57541PgF.A00(C57541PgF.A01(abstractC59962oe, 33), enumC09460dv, 34);
        C0YZ A1D = AbstractC25225BEi.A1D(AnonymousClass858.class);
        this.A06 = AbstractC25225BEi.A0a(C57541PgF.A01(A006, 35), C57532Pg6.A00(A006, abstractC59962oe, 19), C57532Pg6.A00(null, A006, 18), A1D);
        C43210J8h c43210J8h2 = new C43210J8h(34, this, userSession, abstractC59962oe);
        InterfaceC09390do A007 = C57541PgF.A00(C57541PgF.A01(abstractC59962oe, 37), enumC09460dv, 38);
        this.A07 = AbstractC25225BEi.A0a(C57541PgF.A01(A007, 39), c43210J8h2, C57532Pg6.A00(null, A007, 20), AbstractC25225BEi.A1D(AnonymousClass860.class));
        this.A00 = c22985ABk.A01;
        C1809981b c1809981b = new C1809981b();
        EnumC1810181d enumC1810181d = EnumC1810181d.A0V;
        EnumC1810181d enumC1810181d2 = EnumC1810181d.A08;
        c1809981b.A83(enumC1810181d, enumC1810181d2, C53894NsQ.class);
        EnumC1810181d enumC1810181d3 = EnumC1810181d.A11;
        c1809981b.A83(enumC1810181d3, enumC1810181d2, C53894NsQ.class);
        c1809981b.A83(enumC1810181d, enumC1810181d3, C53895NsR.class);
        c1809981b.A83(enumC1810181d2, enumC1810181d3, C53895NsR.class);
        c1809981b.A83(enumC1810181d3, enumC1810181d, C53896NsS.class);
        c1809981b.A83(enumC1810181d2, enumC1810181d, C53896NsS.class);
        this.A01 = c1809981b;
        this.A05 = AbstractC09440dt.A01(new C43210J8h(33, this, userSession, abstractC59962oe));
        this.A03 = AbstractC09440dt.A01(new C43210J8h(32, this, userSession, abstractC59962oe));
        ((C1810981l) this.A02.getValue()).A0F(C22P.A4V, C81S.A00);
        A00(this);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A008 = C07Y.A00(viewLifecycleOwner);
        C57169PZn c57169PZn = new C57169PZn(viewLifecycleOwner, c07s, abstractC59962oe, this, null, 34);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, c57169PZn, A008);
        AbstractC23641Du.A05(anonymousClass191, new C57166PZk(c07s, this, A0K, null, 47), C07Y.A00(A0K));
        if (c22985ABk.A00()) {
            A01();
        }
        ((C8FG) this.A05.getValue()).A0G(c22985ABk.A04);
    }

    @Override // X.C8HJ
    public final void DA5(C88X c88x, Map map) {
        C50957MfQ c50957MfQ = (C50957MfQ) this.A08.getValue();
        CameraAREffect A00 = c88x.A00();
        if (A00 != null) {
            C22C c22c = c50957MfQ.A01;
            String str = A00.A0K;
            c22c.A13(EnumC114925Hg.LIVE, EnumC50631MWs.A0E, str, null, A00.A0B, map, null, 1, 2, A00.CcN(), false);
        }
    }

    @Override // X.C8HJ
    public final void DA7(C88X c88x) {
    }

    @Override // X.C8HJ
    public final void DA9(C88X c88x) {
    }

    @Override // X.C8HJ
    public final void Dl0(boolean z) {
    }

    @Override // X.C8HJ
    public final void EkQ() {
    }

    public static final void A00(OyE oyE) {
        C1820485o c1820485o = (C1820485o) oyE.A03.getValue();
        c1820485o.A0F.A01(c1820485o.A0G, C191228dL.class);
        c1820485o.A0E.A08(c1820485o.A0D);
        AbstractC166997dE.A1Y(((AnonymousClass860) oyE.A07.getValue()).A0e, true);
        InterfaceC09390do interfaceC09390do = oyE.A05;
        ((C8FG) interfaceC09390do.getValue()).A05 = oyE;
        C8FP c8fp = ((C8FG) interfaceC09390do.getValue()).A0O;
        if (c8fp != null) {
            c8fp.Ea0(oyE);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A01() {
        C50957MfQ c50957MfQ = (C50957MfQ) this.A08.getValue();
        EnumC1810181d enumC1810181d = EnumC1810181d.A08;
        C05A c05a = c50957MfQ.A06;
        c05a.Egh(new MUG((CameraAREffect) ((MUG) c05a.getValue()).A00, enumC1810181d, true));
        InterfaceC58088PpD interfaceC58088PpD = c50957MfQ.A02;
        if (interfaceC58088PpD != null) {
            interfaceC58088PpD.CoC();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r6 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r12 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r7 = r12.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r7 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        r8 = r12.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r8 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r4.CjH(r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r12 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        if (r1 != null) goto L12;
     */
    @Override // X.C8HJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CuD(com.instagram.camera.effect.models.CameraAREffect r11, com.instagram.camera.effect.models.CameraAREffect r12) {
        /*
            r10 = this;
            X.0do r0 = r10.A08
            java.lang.Object r2 = r0.getValue()
            X.MfQ r2 = (X.C50957MfQ) r2
            X.05A r3 = r2.A06
            java.lang.Object r0 = r3.getValue()
            X.MUG r0 = (X.MUG) r0
            java.lang.Object r1 = r0.A00
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            boolean r0 = X.AbstractC50102Ry.A00(r12, r1)
            if (r0 != 0) goto L5f
            X.PpD r4 = r2.A02
            if (r4 == 0) goto L43
            boolean r9 = X.AbstractC167007dF.A1W(r12)
            java.lang.String r0 = ""
            if (r1 == 0) goto L2a
            java.lang.String r5 = r1.A0K
            if (r5 != 0) goto L2d
        L2a:
            r5 = r0
            if (r1 == 0) goto L31
        L2d:
            java.lang.String r6 = r1.A0J
            if (r6 != 0) goto L32
        L31:
            r6 = r0
        L32:
            if (r12 == 0) goto L38
            java.lang.String r7 = r12.A0K
            if (r7 != 0) goto L3b
        L38:
            r7 = r0
            if (r12 == 0) goto L3f
        L3b:
            java.lang.String r8 = r12.A0J
            if (r8 != 0) goto L40
        L3f:
            r8 = r0
        L40:
            r4.CjH(r5, r6, r7, r8, r9)
        L43:
            r2.A00 = r12
            java.lang.Object r0 = r3.getValue()
            X.MUG r0 = (X.MUG) r0
            boolean r2 = r0.A01
            java.lang.Object r0 = r3.getValue()
            X.MUG r0 = (X.MUG) r0
            java.lang.Object r1 = r0.A03
            X.81d r1 = (X.EnumC1810181d) r1
            X.MUG r0 = new X.MUG
            r0.<init>(r12, r1, r2)
            r3.Egh(r0)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OyE.CuD(com.instagram.camera.effect.models.CameraAREffect, com.instagram.camera.effect.models.CameraAREffect):void");
    }

    @Override // X.C8HJ
    public final void Cyc(String str) {
        ((C50957MfQ) this.A08.getValue()).A01.A1l(str);
    }
}
