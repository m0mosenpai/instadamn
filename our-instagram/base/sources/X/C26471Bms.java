package X;

/* renamed from: X.Bms, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26471Bms extends AbstractC51572Yf {
    public final int A00;
    public final C93E A01;
    public final C93G A02;
    public final AbstractC27453C9v A03;
    public final C51722Yv A04;
    public final InterfaceC31156Dn0 A05;
    public final CharSequence A06;

    public C26471Bms(C51722Yv c51722Yv, C93E c93e, C93G c93g, InterfaceC31156Dn0 interfaceC31156Dn0, AbstractC27453C9v abstractC27453C9v, CharSequence charSequence, int i) {
        AbstractC167007dF.A1G(charSequence, 1, c93e);
        this.A06 = charSequence;
        this.A05 = interfaceC31156Dn0;
        this.A03 = abstractC27453C9v;
        this.A00 = i;
        this.A01 = c93e;
        this.A02 = c93g;
        this.A04 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        Object A02 = AbstractC28337CeP.A02(c76223bS, this.A05);
        return new C26600Box(this.A04, (C93F) DH2.A00(c76223bS, A02, this, new Object[]{Integer.valueOf(this.A00), this.A01, this.A03, this.A02, A02}, 9), this.A06);
    }
}
