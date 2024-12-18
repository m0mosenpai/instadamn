package X;

/* renamed from: X.Bkg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26335Bkg extends AbstractC51572Yf {
    public final Integer A00;
    public final InterfaceC16820sZ A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean z;
        C14360o3.A0B(c76223bS, 0);
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    z = AbstractC72723Nt.A00(AbstractC77363dM.A00(c76223bS));
                } else {
                    throw B4Z.A00();
                }
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return new C212059aa((AbstractC50812Vc) this.A01.invoke(), AbstractC25230BEn.A1b(InterfaceC30923Dia.class, AbstractC77183d4.A00(c76223bS, new C50168MDv(49, c76223bS, z), AbstractC25228BEl.A1b(z))), null);
    }

    public C26335Bkg(Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = num;
        this.A01 = interfaceC16820sZ;
    }
}
