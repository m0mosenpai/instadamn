package X;

/* renamed from: X.BnL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26500BnL extends AbstractC51572Yf {
    public final InterfaceC31157Dn1 A00;
    public final InterfaceC31158Dn2 A01;
    public final CharSequence A02;
    public final CharSequence A03;
    public final InterfaceC16820sZ A04;
    public final C51722Yv A05;
    public final C27882CQt A06;
    public final String A07;
    public final String A08;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Integer num;
        String AXy;
        String AXy2;
        C14360o3.A0B(c76223bS, 0);
        CharSequence charSequence = this.A02;
        CharSequence charSequence2 = this.A03;
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        boolean z = true;
        if (interfaceC16820sZ == null) {
            z = false;
        }
        String str = this.A08;
        if (str == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            InterfaceC31158Dn2 interfaceC31158Dn2 = this.A01;
            if (interfaceC31158Dn2 != null && (AXy2 = interfaceC31158Dn2.AXy()) != null) {
                A1C.append(AXy2);
            }
            if (charSequence != null) {
                A1C.append(charSequence.toString());
            }
            if (charSequence2 != null) {
                A1C.append(charSequence2.toString());
            }
            InterfaceC31157Dn1 interfaceC31157Dn1 = this.A00;
            if (interfaceC31157Dn1 != null && (AXy = interfaceC31157Dn1.AXy()) != null) {
                A1C.append(AXy);
            }
            str = AbstractC166987dD.A19(A1C);
        }
        InterfaceC16820sZ interfaceC16820sZ2 = null;
        InterfaceC31158Dn2 interfaceC31158Dn22 = this.A01;
        InterfaceC31157Dn1 interfaceC31157Dn12 = this.A00;
        if (interfaceC31158Dn22 != null && (interfaceC31158Dn22 instanceof C29456CyW) && (charSequence == null ? charSequence2 != null : charSequence2 == null)) {
            num = C05F.A01;
        } else {
            num = null;
        }
        C29465Cyf c29465Cyf = new C29465Cyf(this.A06, interfaceC31158Dn22, interfaceC31157Dn12, num);
        if (z) {
            interfaceC16820sZ2 = interfaceC16820sZ;
        }
        String str2 = this.A07;
        C51722Yv c51722Yv = this.A05;
        if (c51722Yv == null) {
            c51722Yv = C51722Yv.A02;
        }
        return new C26580Bod(c51722Yv, c29465Cyf, charSequence, charSequence2, str, str2, interfaceC16820sZ2);
    }

    public C26500BnL(C51722Yv c51722Yv, InterfaceC31157Dn1 interfaceC31157Dn1, InterfaceC31158Dn2 interfaceC31158Dn2, C27882CQt c27882CQt, CharSequence charSequence, CharSequence charSequence2, String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = charSequence;
        this.A03 = charSequence2;
        this.A01 = interfaceC31158Dn2;
        this.A06 = c27882CQt;
        this.A00 = interfaceC31157Dn1;
        this.A04 = interfaceC16820sZ;
        this.A08 = str;
        this.A07 = str2;
        this.A05 = c51722Yv;
    }
}
