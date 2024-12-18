package X;

/* renamed from: X.50g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1114250g extends AbstractC1114350h {
    public final C48532Kv A00;

    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && getClass() == o.getClass()) {
            return this.A00.equals(((C1114250g) o).A00);
        }
        return false;
    }

    public final int hashCode() {
        return 846803280 + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failure {mOutputData=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public C1114250g(C48532Kv outputData) {
        this.A00 = outputData;
    }

    public C1114250g() {
        this(C48532Kv.A01);
    }
}
