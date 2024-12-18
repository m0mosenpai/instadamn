package X;

/* renamed from: X.5kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124705kb {
    public final byte A00;
    public final int A01;
    public final long A02;
    public final Object A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Params{mType=");
        sb.append(this.A01);
        sb.append(", mId=");
        sb.append(this.A02);
        sb.append(", mFlags=");
        sb.append((int) this.A00);
        sb.append(", mValue=");
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }

    public C124705kb(Object obj, byte b, int i, long j) {
        this.A01 = i;
        this.A02 = j;
        this.A00 = b;
        this.A03 = obj;
    }
}
