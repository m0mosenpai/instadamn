package X;

/* renamed from: X.4mO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104024mO {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A05 = false;
    public boolean A04 = false;

    public final String A00() {
        String str;
        StringBuilder sb;
        String str2;
        String str3 = this.A02;
        if (!"ignore".equals(str3) && !"approve".equals(str3)) {
            if (!"block".equals(str3) && !"unblock".equals(str3)) {
                boolean equals = AbstractC111324zv.A00(3011).equals(str3);
                str = this.A03;
                if (equals) {
                    sb = new StringBuilder();
                    str2 = "remove-";
                } else {
                    sb = new StringBuilder();
                    str2 = "follow-";
                }
            } else {
                str = this.A03;
                sb = new StringBuilder();
                str2 = "block-";
            }
        } else {
            str = this.A03;
            sb = new StringBuilder();
            str2 = "request-";
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }
}
