package X;

/* renamed from: X.LSz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48150LSz implements InterfaceC48192Ji {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C48150LSz(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        int i;
        C60488R0o c60488R0o;
        C60487R0n A0E;
        C60486R0m A0E2;
        if (anonymousClass436 != null && (c60488R0o = (C60488R0o) anonymousClass436.Bos()) != null && (A0E = c60488R0o.A0E()) != null && (A0E2 = A0E.A0E()) != null) {
            i = A0E2.getCoercedIntField(3, "seconds_until_notification");
        } else {
            i = 0;
        }
        AbstractC43592JPx.A19((int) Math.ceil(C36J.A00(C36G.A03, C36H.A04(C36G.A09, i))), this.A00);
    }
}
