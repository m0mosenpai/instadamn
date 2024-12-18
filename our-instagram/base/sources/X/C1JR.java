package X;

/* renamed from: X.1JR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JR {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final InterfaceC19630xq A05;

    public final String A00() {
        String str = this.A01;
        if (str == null) {
            String C2s = this.A05.C2s("IG-U-IG-DIRECT-REGION-HINT");
            this.A01 = C2s;
            return C2s;
        }
        return str;
    }

    public final String A01() {
        String str = this.A02;
        if (str == null) {
            String C2s = this.A05.C2s("IG-U-DS-USER-ID");
            this.A02 = C2s;
            return C2s;
        }
        return str;
    }

    public final String A02() {
        String str = this.A00;
        if (str == null) {
            String C2s = this.A05.C2s("IG-U-RUR");
            this.A00 = C2s;
            return C2s;
        }
        return str;
    }

    public final String A03() {
        String str = this.A03;
        if (str == null) {
            String C2s = this.A05.C2s("IG-U-SHBID");
            this.A03 = C2s;
            return C2s;
        }
        return str;
    }

    public final String A04() {
        String str = this.A04;
        if (str == null) {
            String C2s = this.A05.C2s("IG-U-SHBTS");
            this.A04 = C2s;
            return C2s;
        }
        return str;
    }

    public final void A05() {
        InterfaceC19610xo ARD = this.A05.ARD();
        ARD.AHW();
        ARD.apply();
        this.A01 = "";
        this.A03 = "";
        this.A04 = "";
        this.A02 = "";
        this.A00 = "";
    }

    public C1JR(InterfaceC19630xq interfaceC19630xq) {
        this.A05 = interfaceC19630xq;
    }

    public final void A06(String str) {
        if (!str.equals(A00())) {
            this.A01 = str;
            InterfaceC19610xo ARD = this.A05.ARD();
            ARD.E7K("IG-U-IG-DIRECT-REGION-HINT", this.A01);
            ARD.apply();
        }
    }

    public final void A07(String str) {
        if (!str.equals(A01())) {
            this.A02 = str;
            InterfaceC19610xo ARD = this.A05.ARD();
            ARD.E7K("IG-U-DS-USER-ID", this.A02);
            ARD.apply();
        }
    }

    public final void A08(String str) {
        if (!str.equals(A03())) {
            this.A03 = str;
            InterfaceC19610xo ARD = this.A05.ARD();
            ARD.E7K("IG-U-SHBID", this.A03);
            ARD.apply();
        }
    }

    public final void A09(String str) {
        if (!str.equals(A04())) {
            this.A04 = str;
            InterfaceC19610xo ARD = this.A05.ARD();
            ARD.E7K("IG-U-SHBTS", this.A04);
            ARD.apply();
        }
    }
}
