package X;

/* renamed from: X.3pJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84263pJ {
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;

    public C84263pJ(String str, String str2, String str3, long j, long j2, long j3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
    }

    public final String A00() {
        String A0S = AnonymousClass001.A0S("nid=", this.A04, ';');
        StringBuilder sb = new StringBuilder();
        sb.append(A0S);
        sb.append("nc=");
        sb.append(this.A02);
        sb.append(';');
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("fc=");
        sb2.append(this.A01);
        sb2.append(';');
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append("bc=");
        sb3.append(this.A00);
        sb3.append(';');
        return sb3.toString();
    }
}
