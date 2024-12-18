package X;

/* renamed from: X.Box, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26600Box extends AbstractC77583di {
    public final C93F A00;
    public final C51722Yv A01;
    public final CharSequence A02;

    public C26600Box(C51722Yv c51722Yv, C93F c93f, CharSequence charSequence) {
        C14360o3.A0B(charSequence, 1);
        this.A02 = charSequence;
        this.A00 = c93f;
        this.A01 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        C93F c93f = (C93F) AbstractC77183d4.A00(c77993eR, C29896DGk.A00(c77993eR, this, 6), new Object[]{this.A00});
        long A01 = c77993eR.A01();
        CharSequence charSequence = this.A02;
        AbstractC167007dF.A1D(charSequence, 1, c93f);
        return new C78053eX(this.A01, new C2YM(new C29036CrP(c93f, charSequence), new C2YP(AbstractC25227BEk.A0d(C28974CqP.A00, 10, true), null, DKF.A00, A01)));
    }
}
