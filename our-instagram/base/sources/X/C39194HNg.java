package X;

/* renamed from: X.HNg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39194HNg extends C17T implements InterfaceC43554JLo {
    public InterfaceC43584JMs A00;
    public InterfaceC43576JMk A01;
    public JKT A02;
    public C38321qM A03;

    @Override // X.InterfaceC43554JLo
    public final InterfaceC43584JMs AZH() {
        InterfaceC43584JMs interfaceC43584JMs = this.A00;
        if (interfaceC43584JMs == null) {
            return (InterfaceC43584JMs) A05(-1366492984, C39178HMg.class);
        }
        return interfaceC43584JMs;
    }

    @Override // X.InterfaceC43554JLo
    public final JKT AgI() {
        JKT jkt = this.A02;
        if (jkt == null) {
            return (JKT) A05(958158610, HSc.class);
        }
        return jkt;
    }

    @Override // X.InterfaceC43554JLo
    public final C38321qM BQN() {
        return this.A03;
    }

    @Override // X.InterfaceC43554JLo
    public final InterfaceC43576JMk BWY() {
        InterfaceC43576JMk interfaceC43576JMk = this.A01;
        if (interfaceC43576JMk == null) {
            return (InterfaceC43576JMk) A05(-1601227723, HRJ.class);
        }
        return interfaceC43576JMk;
    }

    @Override // X.InterfaceC43554JLo
    public final Integer CBl() {
        return getOptionalIntValueByHashCode(3575610);
    }

    @Override // X.InterfaceC43554JLo
    public final InterfaceC43554JLo E8q(C1DY c1dy) {
        InterfaceC43584JMs AZH = AZH();
        InterfaceC43576JMk interfaceC43576JMk = null;
        if (AZH != null) {
            AZH.E8g(c1dy);
        } else {
            AZH = null;
        }
        this.A00 = AZH;
        JKT AgI = AgI();
        if (AgI != null) {
            AgI.E9m(c1dy);
        } else {
            AgI = null;
        }
        this.A02 = AgI;
        this.A03 = AbstractC37304Gc5.A0D(c1dy, this, 103772132);
        InterfaceC43576JMk BWY = BWY();
        if (BWY != null) {
            BWY.E9Q(c1dy);
            interfaceC43576JMk = BWY;
        }
        this.A01 = interfaceC43576JMk;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // X.InterfaceC43554JLo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C38695H2g Ery(X.C1DY r8) {
        /*
            r7 = this;
            X.JMs r0 = r7.AZH()
            r3 = 0
            if (r0 == 0) goto L4b
            X.Gep r2 = r0.Eqa(r8)
        Lb:
            X.JKT r0 = r7.AgI()
            if (r0 == 0) goto L49
            X.H4y r4 = r0.Ez7(r8)
        L15:
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r1 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r0 = 103772132(0x62f6fe4, float:3.2996046E-35)
            com.facebook.pando.TreeJNI r1 = r7.A05(r0, r1)
            com.instagram.feed.media.ImmutablePandoMediaDict r1 = (com.instagram.feed.media.ImmutablePandoMediaDict) r1
            if (r1 == 0) goto L47
            X.1rC r0 = X.C38321qM.A0h
            X.1qM r0 = X.C38801rC.A00(r8, r1)
            if (r0 == 0) goto L47
            X.17M r5 = r8.A00(r0)
            X.1qM r5 = (X.C38321qM) r5
        L30:
            X.JMk r0 = r7.BWY()
            if (r0 == 0) goto L3a
            X.H4O r3 = r0.ExF(r8)
        L3a:
            r0 = 3575610(0x368f3a, float:5.010497E-39)
            java.lang.Integer r6 = r7.getOptionalIntValueByHashCode(r0)
            X.H2g r1 = new X.H2g
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L47:
            r5 = r3
            goto L30
        L49:
            r4 = r3
            goto L15
        L4b:
            r2 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39194HNg.Ery(X.1DY):X.H2g");
    }
}
