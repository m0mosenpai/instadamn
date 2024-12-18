package X;

/* renamed from: X.Vuo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69753Vuo {
    public final InterfaceC72024XFm A00;
    public final InterfaceC72013XFb A01;
    public final VEP A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69753Vuo) {
                C69753Vuo c69753Vuo = (C69753Vuo) obj;
                if (!C14360o3.A0K(this.A01, c69753Vuo.A01) || this.A02 != c69753Vuo.A02 || !C14360o3.A0K(this.A00, c69753Vuo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, this.A01.hashCode() * 31) + AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StringResourceWithTextStyle(stringResource=");
        sb.append(this.A01);
        sb.append(", textStyle=");
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(3350));
        return AbstractC167017dG.A0o(this.A00, sb);
    }

    public C69753Vuo(InterfaceC72024XFm interfaceC72024XFm, InterfaceC72013XFb interfaceC72013XFb, VEP vep) {
        AbstractC167017dG.A1P(interfaceC72013XFb, vep);
        this.A01 = interfaceC72013XFb;
        this.A02 = vep;
        this.A00 = interfaceC72024XFm;
    }
}
