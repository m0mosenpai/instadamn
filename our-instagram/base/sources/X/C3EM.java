package X;

/* renamed from: X.3EM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EM {
    public int A00 = -1;
    public Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final InterfaceC16610sE A05;
    public final InterfaceC16610sE A06;
    public final /* synthetic */ C2QS A07;

    public C3EM(Object obj, Object obj2, Object obj3, InterfaceC16610sE interfaceC16610sE, InterfaceC16610sE interfaceC16610sE2, C2QS c2qs) {
        this.A07 = c2qs;
        this.A03 = obj;
        this.A06 = interfaceC16610sE;
        this.A05 = interfaceC16610sE2;
        this.A04 = obj2;
        this.A02 = obj3;
    }

    public final void A00() {
        C19D c19d;
        Object obj = this.A01;
        C2QS c2qs = this.A07;
        if (obj instanceof C13C) {
            ((C13C) obj).A06(null, c2qs.A04, this.A00);
        } else {
            if (!(obj instanceof C19D) || (c19d = (C19D) obj) == null) {
                return;
            }
            c19d.dispose();
        }
    }
}
