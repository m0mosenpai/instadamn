package X;

/* renamed from: X.XoS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72833XoS {
    public int A00 = -1;
    public EnumC72391XcR A01;
    public Y7W A02;
    public C72829XoL A03;
    public Integer A04;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.A01);
        sb.append("\n ecLevel: ");
        Integer num = this.A04;
        if (num != null) {
            str = AbstractC72926Xr7.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("\n version: ");
        sb.append(this.A02);
        sb.append("\n maskPattern: ");
        sb.append(this.A00);
        C72829XoL c72829XoL = this.A03;
        if (c72829XoL == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(c72829XoL);
        }
        return AbstractC166997dE.A0x(">>\n", sb);
    }
}
