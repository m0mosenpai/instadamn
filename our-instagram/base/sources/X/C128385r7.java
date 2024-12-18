package X;

/* renamed from: X.5r7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128385r7 extends C58J implements InterfaceC1130758u, C5DZ, InterfaceC128395r8 {
    public static final C138036Nf A02 = new Object();
    public InterfaceC138006Nc A00;
    public boolean A01;

    @Override // X.InterfaceC128395r8
    public final Object AEE(InterfaceC1131459c interfaceC1131459c, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ) {
        Object A00 = AnonymousClass194.A00(interfaceC23621Ds, new C9DQ(this, interfaceC1131459c, interfaceC16820sZ, new C9FP(1, interfaceC16820sZ, this, interfaceC1131459c), null, 0));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }

    @Override // X.C5DZ
    public final void DYp(InterfaceC1131459c interfaceC1131459c) {
        this.A01 = true;
    }

    @Override // X.C5DZ
    public final /* synthetic */ void Def(long j) {
    }

    public static final C114205Dh A00(C128385r7 c128385r7, InterfaceC1131459c interfaceC1131459c, InterfaceC16820sZ interfaceC16820sZ) {
        C114205Dh c114205Dh;
        if (!c128385r7.A08 || !c128385r7.A01) {
            return null;
        }
        C59U A03 = AbstractC114335Dx.A03(c128385r7);
        if (!interfaceC1131459c.CQ7() || (c114205Dh = (C114205Dh) interfaceC16820sZ.invoke()) == null) {
            return null;
        }
        C114205Dh Chk = A03.Chk(interfaceC1131459c, false);
        return c114205Dh.A03(AbstractC119395aw.A00(Chk.A01, Chk.A03));
    }

    @Override // X.InterfaceC1130758u
    public final Object CAp() {
        return A02;
    }
}
