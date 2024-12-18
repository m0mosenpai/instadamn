package X;

/* renamed from: X.Bc6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25851Bc6 extends AbstractC52922bZ {
    public String A00;
    public final C27268C1l A01;
    public final C38321qM A02;
    public final String A03;
    public final InterfaceC19390xP A04;
    public final InterfaceC06180Ui A05;
    public final C05A A06;
    public final C0UO A07;
    public final HYF A08;

    public final void A00(BBA bba) {
        C141796aw A00;
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        if (bba instanceof C23817AgS) {
            A00 = AbstractC141776au.A00(this);
            interfaceC23621Ds = null;
            i = 21;
        } else if (bba instanceof C23815AgQ) {
            A00 = AbstractC141776au.A00(this);
            interfaceC23621Ds = null;
            i = 20;
        } else {
            if (bba instanceof C23816AgR) {
                C27268C1l c27268C1l = this.A01;
                C05A c05a = c27268C1l.A02;
                do {
                } while (!c05a.AIi(c05a.getValue(), c27268C1l.A00.next()));
                return;
            }
            throw B4Z.A00();
        }
        AbstractC166987dD.A1Z(new C25024B5f(this, interfaceC23621Ds, i), A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (r7 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        r6 = r9.getValue();
        r0 = (X.C38688GzT) r6;
        r3 = (X.EnumC27404C7h) r0.A00;
        r2 = (X.AbstractC27827COq) r0.A03;
        r1 = (X.InterfaceC30809Dgk) r0.A01;
        X.C14360o3.A0B(r3, 0);
        X.AbstractC167007dF.A1E(r2, 2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        if (r9.AIi(r6, new X.C38688GzT(r7, r2, r3, r1)) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        r2 = X.AbstractC141776au.A00(r11);
        r0 = new X.C25024B5f(r11, null, 18);
        r3 = X.AnonymousClass191.A00;
        X.AbstractC23641Du.A03(r4, r3, r0, r2);
        X.AbstractC23641Du.A03(r4, r3, new X.C25024B5f(r11, null, 19), X.AbstractC141776au.A00(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25851Bc6(X.C27268C1l r12, X.HYF r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            r11.<init>()
            r11.A01 = r12
            r11.A08 = r13
            r11.A03 = r15
            r5 = 0
            r8 = 0
            java.lang.Integer r4 = X.C05F.A00
            X.057 r0 = X.C10M.A00(r4, r8, r8)
            r11.A05 = r0
            r11.A04 = r0
            if (r15 == 0) goto Lc0
            com.instagram.common.session.UserSession r0 = r13.A01
            X.1qM r0 = X.AbstractC25229BEm.A0h(r0, r15)
        L1d:
            r11.A02 = r0
            X.0UO r0 = r12.A03
            java.lang.Object r0 = r0.getValue()
            X.3bi r0 = (X.EnumC76383bi) r0
            int r1 = X.AbstractC25227BEk.A05(r0, r8)
            r0 = 1
            if (r1 != r0) goto Lbc
            X.C7h r7 = X.EnumC27404C7h.A06
        L30:
            X.0UO r0 = r12.A04
            java.lang.Object r6 = r0.getValue()
            X.COq r6 = (X.AbstractC27827COq) r6
            X.1qM r3 = r11.A02
            r0 = 0
            if (r3 == 0) goto Lb9
            com.instagram.user.model.User r1 = X.AbstractC25226BEj.A14(r3)
            if (r1 == 0) goto Lb9
            java.lang.String r2 = X.AbstractC25236BEt.A0X(r3)
            com.instagram.user.model.User r1 = X.AbstractC25226BEj.A14(r3)
            if (r1 == 0) goto L53
            X.17P r0 = r1.A03
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bhu()
        L53:
            X.CuQ r1 = new X.CuQ
            r1.<init>(r0, r2)
        L58:
            X.Dgk r1 = (X.InterfaceC30809Dgk) r1
            r10 = 2
            X.GzT r0 = new X.GzT
            r0.<init>(r6, r7, r1)
            X.02u r9 = X.AbstractC25225BEi.A1H(r0)
            r11.A06 = r9
            X.059 r0 = X.AbstractC208910l.A02(r9)
            r11.A07 = r0
            java.lang.String r0 = ""
            r11.A00 = r0
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeFile(r14)
            if (r7 == 0) goto L9a
        L76:
            java.lang.Object r6 = r9.getValue()
            r0 = r6
            X.GzT r0 = (X.C38688GzT) r0
            java.lang.Object r3 = r0.A00
            X.C7h r3 = (X.EnumC27404C7h) r3
            java.lang.Object r2 = r0.A03
            X.COq r2 = (X.AbstractC27827COq) r2
            java.lang.Object r1 = r0.A01
            X.Dgk r1 = (X.InterfaceC30809Dgk) r1
            X.C14360o3.A0B(r3, r8)
            X.AbstractC167007dF.A1E(r2, r10, r1)
            X.GzT r0 = new X.GzT
            r0.<init>(r7, r2, r3, r1)
            boolean r0 = r9.AIi(r6, r0)
            if (r0 == 0) goto L76
        L9a:
            X.6aw r2 = X.AbstractC141776au.A00(r11)
            r1 = 18
            X.B5f r0 = new X.B5f
            r0.<init>(r11, r5, r1)
            X.191 r3 = X.AnonymousClass191.A00
            X.AbstractC23641Du.A03(r4, r3, r0, r2)
            X.6aw r2 = X.AbstractC141776au.A00(r11)
            r1 = 19
            X.B5f r0 = new X.B5f
            r0.<init>(r11, r5, r1)
            X.AbstractC23641Du.A03(r4, r3, r0, r2)
            return
        Lb9:
            X.CuR r1 = X.C29222CuR.A00
            goto L58
        Lbc:
            X.C7h r7 = X.EnumC27404C7h.A07
            goto L30
        Lc0:
            r0 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25851Bc6.<init>(X.C1l, X.HYF, java.lang.String, java.lang.String):void");
    }
}
