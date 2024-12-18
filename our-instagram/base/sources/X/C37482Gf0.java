package X;

/* renamed from: X.Gf0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37482Gf0 implements InterfaceC101974iC {
    public final int A00;
    public final Object A01;

    public C37482Gf0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC101974iC
    public final void DZa(int i, int i2) {
        int i3 = this.A00;
        Object obj = this.A01;
        if (i3 != 0) {
            C37447GeR c37447GeR = (C37447GeR) obj;
            c37447GeR.A01 = i2;
            C37447GeR.A01(c37447GeR, c37447GeR.A00);
        } else {
            C42953Iz5 c42953Iz5 = (C42953Iz5) obj;
            c42953Iz5.A01 = i2;
            C42953Iz5.A01(c42953Iz5, c42953Iz5.A00);
        }
    }
}
