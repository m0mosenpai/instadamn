package X;

/* loaded from: classes10.dex */
public abstract class R9e extends RBV {
    public final RBV A00;

    public final RBV A0S(RBV rbv) {
        if (this instanceof R9c) {
            return new R9c(rbv, ((R9c) this).A00);
        }
        if (this instanceof R9d) {
            throw AbstractC166987dD.A14("Should never try to reset delegate");
        }
        R9b r9b = (R9b) this;
        if (rbv == ((R9e) r9b).A00) {
            return r9b;
        }
        return new R9b(rbv, r9b.A00);
    }

    public R9e(RBV rbv) {
        super(rbv);
        this.A00 = rbv;
    }
}
