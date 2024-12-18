package X;

/* renamed from: X.358, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass358 implements InterfaceC43071ya {
    public final long A00;

    public void A00(Object obj, long j, Object obj2) {
        String str;
        C38321qM BQN;
        C38321qM BQN2;
        AnonymousClass357 anonymousClass357 = (AnonymousClass357) this;
        C79233gU c79233gU = (C79233gU) obj2;
        C14360o3.A0B(c79233gU, 1);
        C84923qg c84923qg = c79233gU.A01;
        if (!c84923qg.A02() && c84923qg.A06 == EnumC84933qh.A09) {
            java.util.Set set = anonymousClass357.A02;
            if (!set.contains(c84923qg.A0G) && (str = c84923qg.A0G) != null && str.length() != 0) {
                set.add(str);
                anonymousClass357.A00.A02(c84923qg, c79233gU.A02);
                C5FP c5fp = c84923qg.A0X;
                if (c5fp != null && (BQN = c5fp.BQN()) != null && BQN.A5P() && (BQN2 = c5fp.BQN()) != null) {
                    new C27941CTa(anonymousClass357.A01).A00(BQN2);
                }
            }
        }
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        if (interfaceC57162jr.CFq(c59062n7) == C05F.A0C) {
            long B0m = interfaceC57162jr.B0m(c59062n7);
            if (B0m >= this.A00) {
                A00(c59062n7.A03, B0m, c59062n7.A04);
            }
        }
    }

    public AnonymousClass358(long j) {
        this.A00 = j;
    }
}
