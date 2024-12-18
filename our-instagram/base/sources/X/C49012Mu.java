package X;

/* renamed from: X.2Mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49012Mu implements InterfaceC49022Mv {
    public final C2MX A00;
    public final C2LC A01;

    public C49012Mu(C2MX c2mx, C2LC c2lc) {
        C14360o3.A0B(c2mx, 1);
        C14360o3.A0B(c2lc, 2);
        this.A00 = c2mx;
        this.A01 = c2lc;
    }

    @Override // X.InterfaceC49022Mv
    public final void Eor(C1113750b c1113750b, int i) {
        this.A01.ATa(new RunnableC115055Ia(this.A00, c1113750b, i, false));
    }
}
