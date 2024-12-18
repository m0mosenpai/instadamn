package X;

/* renamed from: X.Bl4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26359Bl4 extends AbstractC51572Yf {
    public final O9S A00;
    public final C51722Yv A01;
    public final InterfaceC16820sZ A02;

    public C26359Bl4(C51722Yv c51722Yv, O9S o9s, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(o9s, 2);
        this.A01 = c51722Yv;
        this.A00 = o9s;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C77123cy A00 = AbstractC77063cs.A00(c76223bS, DEI.A00);
        C25431BMw c25431BMw = new C25431BMw(c76223bS.A05, new C51142Wk());
        c25431BMw.A0A((AbstractC50812Vc) this.A02.invoke());
        C51722Yv c51722Yv = this.A01;
        C9CV A0o = AbstractC25228BEl.A0o(C05F.A04, new C57751Pje(43, A00, this));
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        AbstractC77743dy.A00(c25431BMw, AbstractC25225BEi.A0h(c51722Yv, A0o));
        AbstractC77733dx.A00(c25431BMw.A01, C25431BMw.A02, 1);
        return c25431BMw.A00;
    }
}
