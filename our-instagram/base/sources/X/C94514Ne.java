package X;

/* renamed from: X.4Ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94514Ne {
    public Boolean A00;
    public Integer A01;
    public String A02 = "";
    public String A03;
    public boolean A04;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ QPTemplateParameter name: ");
        sb.append(this.A02);
        sb.append(", required: ");
        sb.append(this.A04);
        sb.append(", int_value: ");
        sb.append(this.A01);
        sb.append(", string_value: ");
        sb.append(this.A03);
        sb.append(", bool_value: ");
        sb.append(this.A00);
        sb.append(" }");
        return sb.toString();
    }
}
