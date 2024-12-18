package X;

/* renamed from: X.Aa9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23436Aa9 implements InterfaceC175167qq {
    public final /* synthetic */ C8HN A00;

    public C23436Aa9(C8HN c8hn) {
        this.A00 = c8hn;
    }

    @Override // X.InterfaceC175167qq
    public final void DQv(int i) {
        C8HN c8hn = this.A00;
        AnonymousClass825 anonymousClass825 = c8hn.A09;
        boolean z = true;
        if (!AbstractC166987dD.A1a(anonymousClass825.A09.getValue()) && !(c8hn.A06.A08.A00 instanceof C81V)) {
            if (c8hn.A00 != AbstractC167007dF.A1P(i, 2) || c8hn.A01) {
                c8hn.A01 = false;
                if (i != 2) {
                    z = false;
                }
                c8hn.A00 = z;
                C8HN.A01(c8hn, z);
                return;
            }
            return;
        }
        c8hn.A01 = true;
        C174757qB c174757qB = c8hn.A04;
        if (c174757qB.A09() != 1 && c174757qB.A09() != 2) {
            return;
        }
        if (c174757qB.A09() == 1) {
            C8HN.A00(c8hn, 0);
        } else {
            if (c174757qB.A09() != 2) {
                return;
            }
            c8hn.A08.A00().CMi();
            AbstractC166997dE.A1Y(anonymousClass825.A0A, false);
        }
    }
}
