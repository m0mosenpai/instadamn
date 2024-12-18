package X;

/* renamed from: X.EUj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32533EUj extends C1P1 {
    public final AbstractC10360h2 A00;

    public static void A00(AbstractC10360h2 abstractC10360h2, AbstractC59962oe abstractC59962oe, C1ON c1on, int i) {
        c1on.A00 = new C33127EjW(abstractC10360h2, abstractC59962oe, i);
        abstractC59962oe.schedule(c1on);
    }

    public AbstractC32533EUj(AbstractC10360h2 abstractC10360h2) {
        this.A00 = abstractC10360h2;
    }

    @Override // X.C1P1
    public void onFinish() {
        int A03 = C0f9.A03(-2062767338);
        C11T.A03(new GMX(this));
        C0f9.A0A(677389035, A03);
    }

    @Override // X.C1P1
    public void onStart() {
        int A03 = C0f9.A03(-1381249589);
        C11T.A03(new GMW(this));
        C0f9.A0A(1210469192, A03);
    }
}
