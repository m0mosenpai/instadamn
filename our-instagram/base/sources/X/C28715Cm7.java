package X;

/* renamed from: X.Cm7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28715Cm7 implements C62F {
    public final long A00;
    public final C62F A01;

    @Override // X.C62F
    public final /* synthetic */ AbstractC118405Xc B2E(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        return CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3, Azq(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3));
    }

    @Override // X.C62F
    public final AbstractC118405Xc CEY(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, long j) {
        long j2 = this.A00;
        return j >= j2 ? this.A01.CEY(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3, j - j2) : abstractC118405Xc;
    }

    @Override // X.C62F
    public final AbstractC118405Xc CEj(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3, long j) {
        long j2 = this.A00;
        return j >= j2 ? this.A01.CEj(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3, j - j2) : abstractC118405Xc3;
    }

    @Override // X.C62F
    public final long Azq(AbstractC118405Xc abstractC118405Xc, AbstractC118405Xc abstractC118405Xc2, AbstractC118405Xc abstractC118405Xc3) {
        return this.A01.Azq(abstractC118405Xc, abstractC118405Xc2, abstractC118405Xc3) + this.A00;
    }

    @Override // X.C62F
    public final boolean CWV() {
        return this.A01.CWV();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C28715Cm7)) {
            return false;
        }
        C28715Cm7 c28715Cm7 = (C28715Cm7) obj;
        if (c28715Cm7.A00 != this.A00) {
            return false;
        }
        return AbstractC25231BEo.A1Z(c28715Cm7.A01, this.A01, false);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC25228BEl.A03(this.A00);
    }

    public C28715Cm7(C62F c62f, long j) {
        this.A01 = c62f;
        this.A00 = j;
    }
}
