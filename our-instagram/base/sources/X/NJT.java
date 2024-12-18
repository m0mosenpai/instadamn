package X;

import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

/* loaded from: classes9.dex */
public final class NJT extends P0O {
    public final C81X A00;
    public final AbstractC59962oe A01;
    public final C52480NJy A02;
    public final NKM A03;
    public final C56137Ovx A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJT(AbstractC59962oe abstractC59962oe, C52480NJy c52480NJy, InterfaceC58310Pt2 interfaceC58310Pt2, NKM nkm, C56137Ovx c56137Ovx) {
        super(abstractC59962oe, interfaceC58310Pt2, PublishScreenCategoryType.A04);
        AbstractC167007dF.A1G(abstractC59962oe, 1, interfaceC58310Pt2);
        this.A01 = abstractC59962oe;
        this.A03 = nkm;
        this.A02 = c52480NJy;
        this.A04 = c56137Ovx;
        this.A00 = C81X.A2i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r2 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0023, code lost:
    
        if (r2 != 1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C54638OBn A00(java.lang.Integer r7, java.lang.String r8) {
        /*
            r6 = this;
            X.2oe r4 = r6.A01
            android.content.Context r3 = r4.requireContext()
            int r2 = r7.intValue()
            r0 = 0
            r1 = 0
            if (r2 == r0) goto L7a
            r0 = 1
            if (r2 == r0) goto L6e
            r0 = 2
            if (r2 == r0) goto L53
            if (r8 == 0) goto L22
            X.Ovx r0 = r6.A04
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.A00(r8)
        L1e:
            r1 = r0
            r0 = 0
            if (r2 == r0) goto L9d
        L22:
            r0 = 1
            if (r2 == r0) goto L9d
        L25:
            r0 = 2
            r5 = 2131237950(0x7f081c3e, float:1.8092165E38)
            if (r2 == r0) goto L2e
            r5 = 2131237935(0x7f081c2f, float:1.8092135E38)
        L2e:
            boolean r0 = A02(r6, r7)
            r0 = r0 ^ 1
            X.OBn r4 = new X.OBn
            r4.<init>(r3)
            if (r0 == 0) goto L48
            com.instagram.common.ui.base.IgSimpleImageView r0 = r4.A01
            r2 = 1050253722(0x3e99999a, float:0.3)
            r0.setAlpha(r2)
            com.instagram.common.ui.base.IgTextView r0 = r4.A03
            r0.setAlpha(r2)
        L48:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r4.A01
            r0.setImageResource(r5)
            com.instagram.common.ui.base.IgTextView r0 = r4.A03
            r0.setText(r1)
            return r4
        L53:
            X.NJy r0 = r6.A02
            if (r0 == 0) goto L25
            X.0UO r0 = r0.A06
            if (r0 == 0) goto L25
            java.lang.Object r0 = r0.getValue()
            X.MUa r0 = (X.C50569MUa) r0
            if (r0 == 0) goto L25
            java.lang.Object r0 = r0.A02
            X.7oq r0 = (X.InterfaceC173987oq) r0
            if (r0 == 0) goto L25
            java.lang.String r1 = r0.getUsername()
            goto L25
        L6e:
            android.content.Context r1 = r4.requireContext()
            r0 = 2131955252(0x7f130e34, float:1.9547026E38)
            java.lang.String r0 = X.AbstractC167027dH.A0P(r1, r0)
            goto L1e
        L7a:
            X.NKM r0 = r6.A03
            if (r0 == 0) goto L88
            X.MrH r0 = r0.A08()
            if (r0 == 0) goto L88
            java.lang.String r0 = r0.A04
            if (r0 != 0) goto L1e
        L88:
            X.NJy r0 = r6.A02
            if (r0 == 0) goto L9d
            X.0UO r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.Msi r0 = (X.C51713Msi) r0
            if (r0 == 0) goto L9d
            X.5xZ r0 = r0.A00
            if (r0 == 0) goto L9d
            java.lang.String r0 = r0.A04
            goto L1e
        L9d:
            r5 = 2131238353(0x7f081dd1, float:1.8092982E38)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJT.A00(java.lang.Integer, java.lang.String):X.OBn");
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 28), C07Y.A00(viewLifecycleOwner));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (A03(r8, r1) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A01(X.NJT r8) {
        /*
            X.01L r3 = X.C0eM.A1I()
            java.lang.Integer r1 = X.C05F.A0C
            boolean r0 = A03(r8, r1)
            r2 = 0
            if (r0 == 0) goto L14
            X.OBn r0 = r8.A00(r1, r2)
            r3.add(r0)
        L14:
            java.lang.Integer r1 = X.C05F.A00
            boolean r0 = A03(r8, r1)
            if (r0 != 0) goto L24
            java.lang.Integer r1 = X.C05F.A01
            boolean r0 = A03(r8, r1)
            if (r0 == 0) goto L2b
        L24:
            X.OBn r0 = r8.A00(r1, r2)
            r3.add(r0)
        L2b:
            X.Ovx r0 = r8.A04
            if (r0 == 0) goto L51
            X.05A r0 = r0.A02
            java.lang.Iterable r0 = X.AbstractC31172DnG.A0w(r0)
            java.util.List r0 = X.AbstractC001800i.A0a(r0)
            java.util.Iterator r2 = r0.iterator()
        L3d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L51
            java.lang.String r1 = X.AbstractC166987dD.A1B(r2)
            java.lang.Integer r0 = X.C05F.A0N
            X.OBn r0 = r8.A00(r0, r1)
            r3.add(r0)
            goto L3d
        L51:
            X.01L r0 = X.C0eM.A1J(r3)
            int r8 = r0.size()
            java.util.ArrayList r7 = X.AbstractC166987dD.A1E()
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
            r4 = 0
        L63:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r3 = r6.next()
            int r2 = r4 + 1
            if (r4 >= 0) goto L79
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L79:
            X.OBn r3 = (X.C54638OBn) r3
            int r0 = r8 + (-1)
            com.instagram.common.ui.base.IgTextView r1 = r3.A02
            if (r4 != r0) goto L8d
            r0 = 8
            r1.setVisibility(r0)
        L86:
            android.view.View r0 = r3.A00
            r7.add(r0)
            r4 = r2
            goto L63
        L8d:
            r1.setVisibility(r5)
            goto L86
        L91:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJT.A01(X.NJT):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(X.NJT r5, java.lang.Integer r6) {
        /*
            int r1 = r6.intValue()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == r3) goto L26
            if (r1 == r4) goto L3b
            r0 = 2
            if (r1 == r0) goto L63
            r0 = 3
            if (r1 != r0) goto L79
            X.Ovx r0 = r5.A04
            if (r0 == 0) goto L25
            X.05A r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L25
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L77
        L25:
            return r3
        L26:
            X.NKM r1 = r5.A03
            if (r1 == 0) goto L54
            X.Ms5 r0 = X.OX6.A03(r1)
            if (r0 == 0) goto L32
            java.lang.Integer r2 = r0.A02
        L32:
            java.lang.Integer r0 = X.C05F.A00
            if (r2 != r0) goto L25
            X.Ngn r0 = r1.A09(r4)
            goto L51
        L3b:
            X.NKM r1 = r5.A03
            if (r1 == 0) goto L47
            X.Ms5 r0 = X.OX6.A03(r1)
            if (r0 == 0) goto L47
            java.lang.Integer r2 = r0.A02
        L47:
            java.lang.Integer r0 = X.C05F.A0Y
            if (r2 != r0) goto L25
            if (r1 == 0) goto L77
            X.Ngn r0 = r1.A09(r3)
        L51:
            if (r0 != 0) goto L25
            goto L77
        L54:
            X.NJy r0 = r5.A02
            if (r0 == 0) goto L25
            X.0UO r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L25
            boolean r0 = r0 instanceof X.NLN
            goto L75
        L63:
            X.NJy r0 = r5.A02
            if (r0 == 0) goto L25
            X.0UO r0 = r0.A06
            if (r0 == 0) goto L25
            java.lang.Object r0 = r0.getValue()
            X.MUa r0 = (X.C50569MUa) r0
            if (r0 == 0) goto L25
            boolean r0 = r0.A04
        L75:
            if (r0 != r4) goto L25
        L77:
            r3 = 1
            return r3
        L79:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJT.A02(X.NJT, java.lang.Integer):boolean");
    }

    public static final boolean A03(NJT njt, Integer num) {
        C52480NJy c52480NJy;
        C51713Msi c51713Msi;
        C51674Ms5 A03;
        C51674Ms5 A032;
        C0UO c0uo;
        C50569MUa c50569MUa;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        C56137Ovx c56137Ovx = njt.A04;
                        if (c56137Ovx == null || AbstractC001800i.A0a(AbstractC31172DnG.A0w(c56137Ovx.A02)).isEmpty()) {
                            return false;
                        }
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    C52480NJy c52480NJy2 = njt.A02;
                    if (c52480NJy2 == null || (c0uo = c52480NJy2.A06) == null || (c50569MUa = (C50569MUa) c0uo.getValue()) == null) {
                        return false;
                    }
                    OJY ojy = (OJY) c50569MUa.A03;
                    if (!AbstractC166997dE.A1Z(ojy.A00, true) || c50569MUa.A02 == null || ojy.A01 != C05F.A00) {
                        return false;
                    }
                }
            } else {
                NKM nkm = njt.A03;
                if (nkm == null || (A032 = OX6.A03(nkm)) == null || A032.A02 != C05F.A0Y || !A032.A05) {
                    return false;
                }
            }
        } else {
            NKM nkm2 = njt.A03;
            if ((nkm2 == null || (A03 = OX6.A03(nkm2)) == null || A03.A02 != C05F.A00 || !A03.A04) && ((c52480NJy = njt.A02) == null || (c51713Msi = (C51713Msi) c52480NJy.A05.getValue()) == null || !c51713Msi.A03)) {
                return false;
            }
        }
        return true;
    }
}
