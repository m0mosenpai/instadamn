package X;

/* renamed from: X.62C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62C implements C62D {
    public long A00;
    public AbstractC118405Xc A01;
    public AbstractC118405Xc A02;
    public AbstractC118405Xc A03;
    public Object A04;
    public Object A05;
    public final AbstractC118405Xc A06;
    public final InterfaceC118485Xk A07;
    public final C62F A08;

    @Override // X.C62D
    public final Object CEW(long j) {
        if (!CUo(j)) {
            AbstractC118405Xc CEY = this.A08.CEY(this.A02, this.A03, this.A06, j);
            int A01 = CEY.A01();
            for (int i = 0; i < A01; i++) {
                if (!(!Float.isNaN(CEY.A00(i)))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("AnimationVector cannot contain a NaN. ");
                    sb.append(CEY);
                    sb.append(". Animation: ");
                    sb.append(this);
                    sb.append(", playTimeNanos: ");
                    sb.append(j);
                    throw new IllegalStateException(sb.toString());
                }
            }
            return ((C118475Xj) this.A07).A00.invoke(CEY);
        }
        return this.A05;
    }

    @Override // X.C62D
    public final AbstractC118405Xc CEl(long j) {
        if (!CUo(j)) {
            return this.A08.CEj(this.A02, this.A03, this.A06, j);
        }
        AbstractC118405Xc abstractC118405Xc = this.A01;
        if (abstractC118405Xc != null) {
            return abstractC118405Xc;
        }
        AbstractC118405Xc B2E = this.A08.B2E(this.A02, this.A03, this.A06);
        this.A01 = B2E;
        return B2E;
    }

    @Override // X.C62D
    public final long Azo() {
        long j = this.A00;
        if (j < 0) {
            long Azq = this.A08.Azq(this.A02, this.A03, this.A06);
            this.A00 = Azq;
            return Azq;
        }
        return j;
    }

    @Override // X.C62D
    public final Object C5Z() {
        return this.A05;
    }

    @Override // X.C62D
    public final InterfaceC118485Xk CBw() {
        return this.A07;
    }

    @Override // X.C62D
    public final boolean CWV() {
        return this.A08.CWV();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TargetBasedAnimation: ");
        sb.append(this.A04);
        sb.append(" -> ");
        sb.append(this.A05);
        sb.append(",initial velocity: ");
        sb.append(this.A06);
        sb.append(", duration: ");
        sb.append(Azo() / 1000000);
        sb.append(" ms,animationSpec: ");
        sb.append(this.A08);
        return sb.toString();
    }

    public C62C(C5Y6 c5y6, AbstractC118405Xc abstractC118405Xc, InterfaceC118485Xk interfaceC118485Xk, Object obj, Object obj2) {
        AbstractC118405Xc A01;
        this.A08 = c5y6.FDZ(interfaceC118485Xk);
        this.A07 = interfaceC118485Xk;
        this.A05 = obj2;
        this.A04 = obj;
        this.A02 = (AbstractC118405Xc) ((C118475Xj) interfaceC118485Xk).A01.invoke(obj);
        this.A03 = (AbstractC118405Xc) ((C118475Xj) this.A07).A01.invoke(obj2);
        if (abstractC118405Xc != null) {
            A01 = AbstractC137336Kc.A00(abstractC118405Xc);
        } else {
            A01 = AbstractC137336Kc.A01((AbstractC118405Xc) ((C118475Xj) this.A07).A01.invoke(obj));
        }
        this.A06 = A01;
        this.A00 = -1L;
    }

    @Override // X.C62D
    public final /* synthetic */ boolean CUo(long j) {
        if (j < Azo()) {
            return false;
        }
        return true;
    }
}
