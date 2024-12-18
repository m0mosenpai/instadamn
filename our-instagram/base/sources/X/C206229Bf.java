package X;

/* renamed from: X.9Bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206229Bf extends C0T6 implements BD1 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C206229Bf(C66702zn c66702zn, C103464lM c103464lM, C38047Goa c38047Goa, int i) {
        C14360o3.A0B(c103464lM, 2);
        C14360o3.A0B(c38047Goa, 3);
        C14360o3.A0B(c66702zn, 4);
        this.A01 = i;
        this.A03 = c103464lM;
        this.A04 = c38047Goa;
        this.A02 = c66702zn;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.BD1
    public final void E5U(Integer num) {
        String str;
        InterfaceC16820sZ interfaceC16820sZ;
        InterfaceC16820sZ c9f4;
        InterfaceC16820sZ interfaceC16820sZ2;
        C3A0 c3a0;
        int i = this.A00;
        C14360o3.A0B(num, 0);
        switch (i) {
            case 0:
                C66702zn c66702zn = (C66702zn) this.A02;
                C103464lM c103464lM = (C103464lM) this.A03;
                C14360o3.A0B(c103464lM, 1);
                if (!c66702zn.A02) {
                    return;
                }
                AbstractC65902yS abstractC65902yS = c66702zn.A00;
                str = c103464lM.A06;
                C14360o3.A07(str);
                interfaceC16820sZ = B7Q.A00;
                c9f4 = new C9F4(2, c103464lM, c66702zn);
                interfaceC16820sZ2 = B7R.A00;
                abstractC65902yS.A07(str, interfaceC16820sZ, c9f4, interfaceC16820sZ2);
                return;
            case 1:
                ((InterfaceC65652y1) this.A02).E5V((C38321qM) this.A03, (C75113Zb) this.A04, num, this.A01);
                return;
            default:
                C65872yP c65872yP = (C65872yP) this.A02;
                int i2 = this.A01;
                C4dV c4dV = (C4dV) this.A03;
                C119835bh c119835bh = (C119835bh) this.A04;
                C14360o3.A0B(c4dV, 1);
                C14360o3.A0B(c119835bh, 2);
                if (i2 != 0) {
                    if (i2 == 2 && (abstractC65902yS = (AbstractC65902yS) c65872yP.A06.getValue()) != null) {
                        str = c4dV.A03.A09;
                        if (str == null) {
                            str = "";
                        }
                        interfaceC16820sZ = B7U.A00;
                        c9f4 = new J7S(c4dV, 35);
                        interfaceC16820sZ2 = B7V.A00;
                        abstractC65902yS.A07(str, interfaceC16820sZ, c9f4, interfaceC16820sZ2);
                        return;
                    }
                    return;
                }
                if (!c65872yP.A07 || (c3a0 = c65872yP.A00) == null) {
                    return;
                }
                String str2 = c4dV.A06;
                c3a0.A03(str2, new C9BW(c4dV, c119835bh), str2);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.BD1
    public final void clear() {
        String str;
        switch (this.A00) {
            case 0:
                C66702zn c66702zn = (C66702zn) this.A02;
                C103464lM c103464lM = (C103464lM) this.A03;
                C14360o3.A0B(c103464lM, 1);
                if (!c66702zn.A02) {
                    return;
                }
                AbstractC65902yS abstractC65902yS = c66702zn.A00;
                str = c103464lM.A06;
                C14360o3.A07(str);
                abstractC65902yS.A02.A03(str);
                return;
            case 1:
                ((InterfaceC65652y1) this.A02).AHY((C38321qM) this.A03, (C75113Zb) this.A04, this.A01);
                return;
            default:
                C65872yP c65872yP = (C65872yP) this.A02;
                int i = this.A01;
                C4dV c4dV = (C4dV) this.A03;
                C14360o3.A0B(c4dV, 1);
                if (i != 0) {
                    if (i == 2 && (abstractC65902yS = (AbstractC65902yS) c65872yP.A06.getValue()) != null) {
                        str = c4dV.A03.A09;
                        if (str == null) {
                            str = "";
                        }
                        abstractC65902yS.A02.A03(str);
                        return;
                    }
                    return;
                }
                C3A0 c3a0 = c65872yP.A00;
                if (c3a0 == null) {
                    return;
                }
                String str2 = c4dV.A06;
                C14360o3.A0B(str2, 0);
                ((C3A1) c3a0).A00.AGQ();
                ((C3A1) c3a0).A01.remove(str2);
                return;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof C206229Bf) {
            C206229Bf c206229Bf = (C206229Bf) obj;
            if (c206229Bf.A00 != i || this.A01 != c206229Bf.A01 || !C14360o3.A0K(this.A03, c206229Bf.A03) || !C14360o3.A0K(this.A04, c206229Bf.A04) || !C14360o3.A0K(this.A02, c206229Bf.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A02.hashCode();
    }

    public C206229Bf(C65872yP c65872yP, C4dV c4dV, C119835bh c119835bh, int i) {
        C14360o3.A0B(c4dV, 2);
        C14360o3.A0B(c119835bh, 3);
        C14360o3.A0B(c65872yP, 4);
        this.A01 = i;
        this.A03 = c4dV;
        this.A04 = c119835bh;
        this.A02 = c65872yP;
    }

    public C206229Bf(C38321qM c38321qM, InterfaceC65652y1 interfaceC65652y1, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 2);
        C14360o3.A0B(c75113Zb, 3);
        C14360o3.A0B(interfaceC65652y1, 4);
        this.A01 = i;
        this.A03 = c38321qM;
        this.A04 = c75113Zb;
        this.A02 = interfaceC65652y1;
    }
}
