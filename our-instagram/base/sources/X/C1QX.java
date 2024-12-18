package X;

import java.util.Map;

/* renamed from: X.1QX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QX {
    public C59602o3 A02;
    public C4J0 A05;
    public String A0A;
    public String A0B;
    public Map A0D;
    public C1Ef A03 = C1Ef.Undefined;
    public EnumC23341Bw A04 = EnumC23341Bw.Undefined;
    public Integer A07 = C05F.A00;
    public Boolean A06 = null;
    public String A08 = null;
    public String A09 = null;
    public long A00 = -1;
    public long A01 = -1;
    public String A0C = "undefined";

    public final C1QY A00() {
        Integer num;
        Integer num2;
        long j = this.A00;
        if (j != -1 && (num2 = this.A07) != C05F.A0Y && num2 != C05F.A0j) {
            throw new IllegalStateException("Setting cache timeout when cache policy is not UseCacheIfTimeout has no effect");
        }
        if (j == -1 && ((num = this.A07) == C05F.A0Y || num == C05F.A0j)) {
            this.A00 = 4000L;
            j = 4000;
        }
        String str = this.A0A;
        if (str == null) {
            EnumC23341Bw enumC23341Bw = this.A04;
            if (enumC23341Bw != EnumC23341Bw.Undefined) {
                str = enumC23341Bw.name();
            } else {
                str = "HttpRequest";
            }
            this.A0A = str;
        }
        C1Ef c1Ef = this.A03;
        EnumC23341Bw enumC23341Bw2 = this.A04;
        Integer num3 = this.A07;
        Boolean bool = this.A06;
        String str2 = this.A08;
        String str3 = this.A09;
        long j2 = this.A01;
        return new C1QY(this.A02, c1Ef, enumC23341Bw2, this.A05, bool, num3, str2, str3, this.A0C, str, this.A0D, j, j2);
    }
}
