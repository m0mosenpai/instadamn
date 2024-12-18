package X;

/* renamed from: X.LdP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48526LdP implements InterfaceC25601Mq {
    public final int A00;
    public final Object A01;

    public C48526LdP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        if (this.A00 != 0) {
            AbstractC24481Hr abstractC24481Hr = (AbstractC24481Hr) obj;
            C14360o3.A0B(abstractC24481Hr, 0);
            if (abstractC24481Hr.A0B()) {
                C47282Kut c47282Kut = (C47282Kut) this.A01;
                C1OL c1ol = new C1OL();
                c1ol.A00();
                c47282Kut.A00.A08(c1ol);
            } else {
                boolean A0D = abstractC24481Hr.A0D();
                C47282Kut c47282Kut2 = (C47282Kut) this.A01;
                if (A0D) {
                    Exception A06 = abstractC24481Hr.A06();
                    if (A06 != null) {
                        c47282Kut2.A00.A09(A06);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    Object A07 = abstractC24481Hr.A07();
                    if (A07 != null) {
                        c47282Kut2.A00.A0A(A07);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            return C0eB.A00;
        }
        ((LEZ) this.A01).A01.countDown();
        return null;
    }
}
