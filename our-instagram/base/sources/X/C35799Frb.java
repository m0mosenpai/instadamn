package X;

/* renamed from: X.Frb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35799Frb implements InterfaceC48212Jk {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C35799Frb(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                ((C36286Fzd) this.A01).A02 = AbstractC31172DnG.A0s(this.A02);
                return;
            case 1:
                C36731GHa c36731GHa = ((C33226ElG) this.A01).A07;
                if (c36731GHa == null) {
                    return;
                }
                c36731GHa.A0D = !this.A02;
                return;
            default:
                C33223ElB c33223ElB = (C33223ElB) this.A01;
                C36731GHa c36731GHa2 = c33223ElB.A03;
                if (c36731GHa2 != null) {
                    c36731GHa2.A0D = !this.A02;
                }
                C33223ElB.A01(c33223ElB);
                return;
        }
    }
}
