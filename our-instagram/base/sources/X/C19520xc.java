package X;

/* renamed from: X.0xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19520xc extends AbstractC09720ep {
    public long A00;
    public C09710eo A01 = new C09710eo();
    public InterfaceC09730eq A02;
    public String A03;

    @Override // X.AbstractC09720ep
    public final AbstractC09720ep A00(Object obj, String str) {
        this.A01.A00(str, String.valueOf(obj));
        return this;
    }

    @Override // X.AbstractC09720ep
    public final AbstractC09720ep A01(String str, int i) {
        this.A01.A00(str, Integer.toString(i));
        return this;
    }

    @Override // X.AbstractC09720ep
    public final void A02() {
        InterfaceC09730eq interfaceC09730eq = this.A02;
        long j = this.A00;
        interfaceC09730eq.AWF(this.A01, this.A03, j);
    }
}
