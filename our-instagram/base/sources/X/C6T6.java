package X;

/* renamed from: X.6T6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6T6 extends C0T6 {
    public final C206209Bd A00;
    public final XVS A01;
    public final String A02;
    public final String A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtraDataInfo(hideMediaReason=");
        sb.append(this.A03);
        sb.append(", accountType=");
        sb.append(this.A02);
        sb.append(", afiLoggingInfo=");
        sb.append(this.A01);
        sb.append(", iabLoggingInfo=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C6T6(C206209Bd c206209Bd, XVS xvs, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = xvs;
        this.A00 = c206209Bd;
    }
}
