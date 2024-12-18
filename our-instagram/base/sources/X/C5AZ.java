package X;

/* renamed from: X.5AZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5AZ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C121665fI A05;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final AnonymousClass599 A0I;
    public Integer A06 = C05F.A0Y;
    public final C113385Aa A0J = new C113385Aa(this);
    public long A04 = C5AU.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public final InterfaceC16820sZ A0K = new C9EV(this, 27);

    public final void A00() {
        C113385Aa c113385Aa = this.A0J;
        if ((c113385Aa.A0A != null || c113385Aa.A0S.A0I.A0W.A04.BbJ() != null) && c113385Aa.A0K) {
            c113385Aa.A0K = false;
            c113385Aa.A0A = c113385Aa.A0S.A0I.A0W.A04.BbJ();
            AnonymousClass599 A0B = this.A0I.A0B();
            if (A0B != null) {
                A0B.A0a(false, true, true);
            }
        }
        C121665fI c121665fI = this.A05;
        if (c121665fI != null) {
            if (c121665fI.A06 == null) {
                AbstractC137606Lg A0V = c121665fI.A0J.A0I.A0W.A04.A0V();
                C14360o3.A0A(A0V);
                if (A0V.BbJ() == null) {
                    return;
                }
            }
            if (!c121665fI.A0C) {
                return;
            }
            c121665fI.A0C = false;
            AbstractC137606Lg A0V2 = c121665fI.A0J.A0I.A0W.A04.A0V();
            C14360o3.A0A(A0V2);
            c121665fI.A06 = A0V2.BbJ();
            AnonymousClass599 anonymousClass599 = this.A0I;
            boolean A00 = AbstractC119095aR.A00(anonymousClass599);
            AnonymousClass599 A0B2 = anonymousClass599.A0B();
            if (A00) {
                if (A0B2 == null) {
                    return;
                }
                A0B2.A0a(false, true, true);
            } else {
                if (A0B2 == null) {
                    return;
                }
                A0B2.A0Z(false, true, true);
            }
        }
    }

    public final void A01(int i) {
        AnonymousClass599 A0B;
        C5AZ c5az;
        int i2 = this.A00;
        this.A00 = i;
        boolean z = false;
        boolean z2 = false;
        if (i2 == 0) {
            z2 = true;
        }
        if (i == 0) {
            z = true;
        }
        if (z2 != z && (A0B = this.A0I.A0B()) != null && (c5az = A0B.A0U) != null) {
            int i3 = c5az.A00;
            int i4 = i3 + 1;
            if (i == 0) {
                i4 = i3 - 1;
            }
            c5az.A01(i4);
        }
    }

    public final void A02(int i) {
        AnonymousClass599 A0B;
        C5AZ c5az;
        int i2 = this.A01;
        this.A01 = i;
        boolean z = false;
        boolean z2 = false;
        if (i2 == 0) {
            z2 = true;
        }
        if (i == 0) {
            z = true;
        }
        if (z2 != z && (A0B = this.A0I.A0B()) != null && (c5az = A0B.A0U) != null) {
            int i3 = c5az.A01;
            int i4 = i3 + 1;
            if (i == 0) {
                i4 = i3 - 1;
            }
            c5az.A02(i4);
        }
    }

    public C5AZ(AnonymousClass599 anonymousClass599) {
        this.A0I = anonymousClass599;
    }
}
