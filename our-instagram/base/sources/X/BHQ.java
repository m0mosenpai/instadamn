package X;

/* loaded from: classes5.dex */
public final class BHQ implements InterfaceC118965aD {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public BHQ(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    @Override // X.InterfaceC118965aD
    public final void dispose() {
        if (this.A00 != 0) {
            C6OB c6ob = (C6OB) this.A02;
            C6N3 c6n3 = (C6N3) this.A03;
            c6ob.A00(c6n3.A02);
            c6n3.A01.remove(this.A01);
            return;
        }
        C6MK c6mk = (C6MK) this.A01;
        Object obj = this.A03;
        c6mk.remove(obj);
        ((C28712Cm4) this.A02).A02.A07(obj);
    }
}
