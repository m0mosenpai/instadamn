package X;

/* renamed from: X.1Dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23611Dp extends C1Dq implements C0s3 {
    public final int arity;

    @Override // X.C0s3
    public int getArity() {
        return this.arity;
    }

    @Override // X.C1Dr
    public String toString() {
        if (this.completion == null) {
            String A00 = C15420px.A00(this);
            C14360o3.A07(A00);
            return A00;
        }
        return super.toString();
    }

    public AbstractC23611Dp(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.arity = i;
    }
}
