package X;

/* loaded from: classes9.dex */
public final class MVM extends AbstractC39700HjW {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MVM);
    }

    public final int hashCode() {
        return AbstractC53882NsE.A00(this.A00);
    }

    @Override // X.AbstractC39700HjW
    public final Integer A00() {
        return this.A00;
    }

    public MVM(Integer num) {
        this.A00 = num;
    }

    public MVM() {
        this(C05F.A01);
    }
}
