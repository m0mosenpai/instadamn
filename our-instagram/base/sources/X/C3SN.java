package X;

/* renamed from: X.3SN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SN extends C0T6 {
    public static final C3SO Companion = new Object();
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OdinResult(result=");
        sb.append(this.A00);
        sb.append(", isSuccess=");
        sb.append(this.A02);
        sb.append(AbstractC43591JPw.A00(101));
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C3SN(Object obj, String str, boolean z) {
        this.A00 = obj;
        this.A02 = z;
        this.A01 = str;
    }
}
