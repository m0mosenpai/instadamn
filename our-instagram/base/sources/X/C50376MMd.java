package X;

/* renamed from: X.MMd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50376MMd extends C19H {
    public final C2QS A00;
    public final /* synthetic */ AnonymousClass198 A01;

    public C50376MMd(AnonymousClass198 anonymousClass198, C2QS c2qs) {
        this.A01 = anonymousClass198;
        this.A00 = c2qs;
    }

    @Override // X.C19I
    public final void A05(Throwable th) {
        AnonymousClass198 anonymousClass198 = this.A01;
        Object A0C = anonymousClass198.A0C();
        if (!(A0C instanceof C1JW)) {
            A0C = AnonymousClass199.A00(A0C);
        }
        C2QS.A00(anonymousClass198, A0C, this.A00);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return C0eB.A00;
    }
}
