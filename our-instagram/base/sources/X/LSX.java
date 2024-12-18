package X;

/* loaded from: classes8.dex */
public final class LSX implements C0L3 {
    public final /* synthetic */ C1T6 A00;

    public LSX(C1T6 c1t6) {
        this.A00 = c1t6;
    }

    @Override // X.C0L3
    public final void Cwx() {
        C1T6 c1t6 = this.A00;
        if (true != c1t6.A02.getAndSet(true)) {
            C1T6.A02(c1t6);
        }
    }

    @Override // X.C0L3
    public final void Cx1() {
        C1T6 c1t6 = this.A00;
        if (false != c1t6.A02.getAndSet(false)) {
            C1T6.A01(c1t6);
        }
    }
}
