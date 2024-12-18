package X;

/* renamed from: X.4oN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105074oN extends AbstractC105084oO implements C0s3 {
    public final int A00;

    @Override // X.C0s3
    public final int getArity() {
        return this.A00;
    }

    @Override // X.C1Dr
    public final String toString() {
        if (this.completion == null) {
            String A00 = C15420px.A00(this);
            C14360o3.A07(A00);
            return A00;
        }
        return super.toString();
    }

    public AbstractC105074oN(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A00 = i;
    }
}
