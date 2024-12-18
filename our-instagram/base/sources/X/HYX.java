package X;

/* loaded from: classes7.dex */
public final class HYX extends AbstractC65924TwV {
    public C69794Vvd A00;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Vvd, java.lang.Object] */
    public HYX() {
        super(2);
        this.A00 = new Object();
    }

    @Override // X.AbstractC65924TwV
    public final boolean equals(Object obj) {
        if (obj instanceof HYX) {
            return C14360o3.A0K(this.A00, ((HYX) obj).A00);
        }
        return false;
    }

    @Override // X.AbstractC65924TwV
    public final int hashCode() {
        return this.A00.hashCode();
    }
}
