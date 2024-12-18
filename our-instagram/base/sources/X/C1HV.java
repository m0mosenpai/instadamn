package X;

/* renamed from: X.1HV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HV implements C1HW {
    public C1HX A00;
    public final C23441Cg A01;
    public final AbstractC12990ll A02;

    @Override // X.C1HW
    public final synchronized void onCellIdentityChanged(C1HX c1hx) {
        this.A00 = c1hx;
    }

    @Override // X.C1HW
    public final synchronized void onCellSignalStrengthChanged(C1EQ c1eq) {
    }

    public C1HV(AbstractC12990ll abstractC12990ll) {
        this.A02 = abstractC12990ll;
        C23441Cg A00 = C1CY.A00();
        C14360o3.A07(A00);
        this.A01 = A00;
    }
}
