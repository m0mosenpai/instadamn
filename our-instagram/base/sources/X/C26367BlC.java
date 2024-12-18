package X;

/* renamed from: X.BlC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26367BlC extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final InterfaceC30847DhM A01;
    public final boolean A02;

    public C26367BlC(C51722Yv c51722Yv, InterfaceC30847DhM interfaceC30847DhM, boolean z) {
        C14360o3.A0B(interfaceC30847DhM, 3);
        this.A00 = c51722Yv;
        this.A02 = z;
        this.A01 = interfaceC30847DhM;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        float f;
        C88 c88;
        C88 c882;
        C14360o3.A0B(c76223bS, 0);
        long A02 = AbstractC28406CgC.A02(c76223bS, C05F.A0a);
        InterfaceC30847DhM interfaceC30847DhM = this.A01;
        C29517CzV c29517CzV = C29517CzV.A00;
        if (C14360o3.A0K(interfaceC30847DhM, c29517CzV)) {
            f = 0.2f;
        } else if (C14360o3.A0K(interfaceC30847DhM, C29519CzX.A00)) {
            f = 0.8f;
        } else if (C14360o3.A0K(interfaceC30847DhM, C29518CzW.A00)) {
            f = 1.0f;
        } else {
            throw B4Z.A00();
        }
        if (C14360o3.A0K(interfaceC30847DhM, c29517CzV)) {
            c88 = C88.A0m;
        } else if (C14360o3.A0K(interfaceC30847DhM, C29519CzX.A00)) {
            c88 = C88.A0J;
        } else if (C14360o3.A0K(interfaceC30847DhM, C29518CzW.A00)) {
            c88 = C88.A0r;
        } else {
            throw B4Z.A00();
        }
        if (C14360o3.A0K(interfaceC30847DhM, c29517CzV)) {
            c882 = C88.A0I;
        } else {
            if (!C14360o3.A0K(interfaceC30847DhM, C29519CzX.A00) && !C14360o3.A0K(interfaceC30847DhM, C29518CzW.A00)) {
                throw B4Z.A00();
            }
            c882 = C88.A0H;
        }
        C51722Yv c51722Yv = this.A00;
        C9CV A0o = AbstractC25225BEi.A0o(C05F.A0N, true, 4);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        C51722Yv A00 = C9CU.A00(AbstractC25225BEi.A0h(c51722Yv, A0o), C05F.A06, 0, AbstractC25229BEm.A0F());
        int A002 = AbstractC28406CgC.A00(c76223bS, c88);
        Integer num = C05F.A00;
        C51722Yv A003 = C9CV.A00(A00, num, AbstractC25225BEi.A0i(A002), 4);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        if (!this.A02) {
            A12.A00(new C26592Bop(new CVU(AbstractC171007jr.A00(AbstractC25234BEr.A0L(null, num, 0, A02), f), Integer.valueOf(AbstractC28406CgC.A00(A12, c882)))));
        }
        return AbstractC76963ci.A0G(A12, c76223bS, A003);
    }
}
