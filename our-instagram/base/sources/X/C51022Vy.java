package X;

/* renamed from: X.2Vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51022Vy {
    public Object A00;
    public final Object A01;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diff{previous=");
        sb.append(this.A01);
        sb.append(", next=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public C51022Vy(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }
}
