package X;

/* renamed from: X.Wel, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70665Wel implements XLM {
    public final int A00;
    public final VEO A01;
    public final String A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(X4V.A00);
    public final InterfaceC09390do A04;

    @Override // X.MOD
    public final int BAP() {
        return this.A00;
    }

    @Override // X.XLM
    public final C69219Vjm C37() {
        return (C69219Vjm) this.A04.getValue();
    }

    @Override // X.XLM
    public final VEO CBa() {
        return this.A01;
    }

    @Override // X.XLM
    public final String getId() {
        return this.A02;
    }

    public AbstractC70665Wel(AbstractC69220Vjn abstractC69220Vjn) {
        this.A01 = abstractC69220Vjn.A03;
        this.A02 = abstractC69220Vjn.A01;
        this.A00 = abstractC69220Vjn.A02;
        this.A04 = AbstractC09440dt.A01(new X32(abstractC69220Vjn, 36));
    }
}
