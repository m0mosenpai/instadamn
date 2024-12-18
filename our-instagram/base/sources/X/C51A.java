package X;

/* renamed from: X.51A, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C51A extends AbstractC1114350h {
    public final C48532Kv A00;

    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && getClass() == o.getClass()) {
            return this.A00.equals(((C51A) o).A00);
        }
        return false;
    }

    public final int hashCode() {
        return (-1876823561) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Success {mOutputData=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public C51A(C48532Kv outputData) {
        this.A00 = outputData;
    }

    public C51A() {
        this(C48532Kv.A01);
    }
}
