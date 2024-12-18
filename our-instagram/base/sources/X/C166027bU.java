package X;

/* renamed from: X.7bU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166027bU extends C4A7 {
    public InterfaceC38371qR A00;
    public final N2C A01;
    public final C05A A02;
    public final C0UO A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C166027bU(X.N2C r12, X.C26025BfE r13, com.instagram.common.session.UserSession r14, java.lang.String r15) {
        /*
            r11 = this;
            r0 = 1
            r7 = r14
            X.C14360o3.A0B(r14, r0)
            r0 = 2
            r8 = r15
            X.C14360o3.A0B(r15, r0)
            r1 = 3
            r5 = 0
            r0 = 722993640(0x2b1801e8, float:5.4003893E-13)
            X.19K r1 = X.C4A8.A01(r0, r1)
            java.lang.String r0 = "MediaSourceRepository"
            r6 = r11
            r11.<init>(r0, r1)
            r11.A01 = r12
            java.lang.String r3 = r13.A08
            java.lang.String r0 = r13.A09
            r4 = 0
            if (r0 == 0) goto Laa
            X.1qR r0 = X.AbstractC151266rU.A00(r14, r3, r0)
            if (r0 == 0) goto Laa
            X.1qM r2 = r0.BQN()
            r1 = 1
            if (r2 == 0) goto Laa
            boolean r0 = r2.A5M()
            if (r0 != r1) goto Laa
            X.1rF r0 = r2.A0C
            java.util.List r0 = r0.AmB()
            if (r0 == 0) goto Laa
            java.util.Iterator r2 = r0.iterator()
        L41:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1qM r0 = (X.C38321qM) r0
            java.lang.String r0 = r0.A2u()
            boolean r0 = X.C14360o3.A0K(r0, r15)
            if (r0 == 0) goto L41
        L58:
            X.1qM r1 = (X.C38321qM) r1
            if (r1 == 0) goto Laa
        L5c:
            r11.A00 = r1
            if (r1 == 0) goto L6a
            X.1qM r0 = r1.BQN()
            if (r0 == 0) goto L6a
            X.7bW r5 = X.AbstractC166037bV.A00(r14, r0)
        L6a:
            X.02u r0 = X.C10E.A00(r5)
            r11.A02 = r0
            X.059 r0 = X.AbstractC208910l.A02(r0)
            r11.A03 = r0
            X.1qR r0 = r11.A00
            if (r0 != 0) goto L9e
            if (r12 == 0) goto L82
            java.lang.String r1 = "fetch_with_media"
            r0 = 1
            r12.A0K(r1, r0)
        L82:
            X.N2C r0 = r11.A01
            r9 = 0
            if (r0 == 0) goto L8e
            X.3Av r0 = r0.A00
            if (r0 == 0) goto L8e
            r0.A08(r9)
        L8e:
            X.19L r2 = r11.A01
            r10 = 0
            X.9Db r5 = new X.9Db
            r5.<init>(r6, r7, r8, r9, r10)
            X.191 r1 = X.AnonymousClass191.A00
            java.lang.Integer r0 = X.C05F.A00
            X.AbstractC23641Du.A03(r0, r1, r5, r2)
        L9d:
            return
        L9e:
            if (r12 == 0) goto L9d
            X.3Av r0 = r12.A00
            if (r0 == 0) goto L9d
            r0.A02()
            return
        La8:
            r1 = r4
            goto L58
        Laa:
            X.1qR r1 = X.AbstractC151266rU.A00(r14, r3, r15)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166027bU.<init>(X.N2C, X.BfE, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public final void A00(InterfaceC16660sJ interfaceC16660sJ) {
        Object value = this.A03.getValue();
        if (value != null) {
            interfaceC16660sJ.invoke(value);
            return;
        }
        C19L c19l = super.A01;
        C9DH c9dh = new C9DH(interfaceC16660sJ, (InterfaceC23621Ds) null, this, 13);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dh, c19l);
    }

    public final void A01(InterfaceC16660sJ interfaceC16660sJ) {
        InterfaceC38371qR interfaceC38371qR = this.A00;
        if (interfaceC38371qR != null) {
            interfaceC16660sJ.invoke(interfaceC38371qR);
            return;
        }
        C19L c19l = super.A01;
        C9DH c9dh = new C9DH(interfaceC16660sJ, (InterfaceC23621Ds) null, this, 14);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dh, c19l);
    }
}
