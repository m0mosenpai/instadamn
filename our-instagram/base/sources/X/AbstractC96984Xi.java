package X;

/* renamed from: X.4Xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC96984Xi extends AbstractC96994Xj {
    public final C4XW A00;

    @Override // X.C4XW
    public final C4W2 BRA() {
        return this.A00.BRA();
    }

    public AbstractC96984Xi(C4XW c4xw) {
        this.A00 = c4xw;
    }

    @Override // X.AbstractC96994Xj, X.C4XV
    public final void A0C(C2BC c2bc) {
        super.A0C(c2bc);
        if (this instanceof C97004Xl) {
            C97004Xl c97004Xl = (C97004Xl) this;
            if (!c97004Xl.A07) {
                c97004Xl.A03 = true;
                c97004Xl.A0F(((AbstractC96984Xi) c97004Xl).A00, null);
                return;
            }
            return;
        }
        A0F(this.A00, null);
    }
}
