package X;

/* renamed from: X.3fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78723fe {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final Object A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MeasureResult:[width ");
        sb.append(this.A01);
        sb.append(" height ");
        sb.append(this.A00);
        sb.append(" layoutData ");
        sb.append(this.A03);
        sb.append(" hadExceptions ");
        sb.append(this.A02);
        sb.append(']');
        return sb.toString();
    }

    public C78723fe(int i, int i2, Object obj) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = false;
    }

    public C78723fe() {
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = null;
        this.A02 = true;
    }
}
