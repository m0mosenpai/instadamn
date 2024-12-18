package X;

/* loaded from: classes5.dex */
public final class CAW {
    public float A00;
    public int A01;
    public int A02;
    public String A03;
    public String A04;
    public boolean A05;

    public final String toString() {
        String A0R;
        String A0C = AnonymousClass001.A0C(this.A03, ':');
        int i = this.A02;
        StringBuilder A1C = AbstractC166987dD.A1C();
        switch (i) {
            case 900:
                A1C.append(A0C);
                A1C.append(this.A01);
                break;
            case 901:
            case 905:
                A1C.append(A0C);
                A1C.append(this.A00);
                break;
            case 902:
                A1C.append(A0C);
                A0R = AnonymousClass001.A0R("#", AnonymousClass001.A0R("00000000", Integer.toHexString(this.A01)).substring(r2.length() - 8));
                A1C.append(A0R);
                break;
            case 903:
                A1C.append(A0C);
                A0R = this.A04;
                A1C.append(A0R);
                break;
            case 904:
                A1C.append(A0C);
                A1C.append(Boolean.valueOf(this.A05));
                break;
            default:
                A1C.append(A0C);
                A0R = "????";
                A1C.append(A0R);
                break;
        }
        return A1C.toString();
    }
}
