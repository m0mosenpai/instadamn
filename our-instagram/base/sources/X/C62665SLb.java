package X;

/* renamed from: X.SLb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62665SLb {
    public final C11880jn A00;
    public final C11880jn A01;
    public final InterfaceC65348TiV A02;

    public final void A00(R29 r29) {
        Integer num;
        C19U c19u = r29.A00;
        if (c19u != null && c19u.A01 != null) {
            C11880jn c11880jn = this.A00;
            C19U A00 = c11880jn.A00();
            if (A00 != null) {
                C19U c19u2 = r29.A00;
                long j = c19u2.A00;
                long j2 = A00.A00;
                if (j >= j2) {
                    if (j == j2 && c19u2.A01.equals(A00.A01)) {
                        num = C05F.A0j;
                    } else {
                        num = C05F.A1F;
                    }
                }
            }
            C19U c19u3 = r29.A00;
            synchronized (c11880jn) {
                C14360o3.A0B(c19u3, 0);
                c11880jn.A00.A02(c19u3);
            }
            ((SP6) r29).A01 = C05F.A0u;
            this.A02.DxE(A00, r29.A00, C05F.A01, ((SP6) r29).A02);
            return;
        }
        num = C05F.A0Y;
        ((SP6) r29).A01 = num;
    }

    public C62665SLb(InterfaceC65348TiV interfaceC65348TiV, C11880jn c11880jn, C11880jn c11880jn2) {
        this.A00 = c11880jn;
        this.A01 = c11880jn2;
        this.A02 = interfaceC65348TiV;
    }
}
