package X;

/* loaded from: classes12.dex */
public abstract class YA6 implements InterfaceC58193Pqz {
    public final int A00;
    public final long A01;
    public final OMZ A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final YOn A06;

    public YA6(OMZ omz, YOn yOn, Y0F y0f) {
        int intValue;
        Integer num = y0f.A02;
        if (num != null) {
            if (num.intValue() == 1) {
                Integer num2 = y0f.A01;
                this.A00 = (num2 == null || (intValue = num2.intValue()) <= 0) ? 10 : intValue;
                String str = y0f.A05;
                if (str != null) {
                    this.A05 = str;
                } else {
                    this.A05 = "unknown";
                }
                String str2 = y0f.A04;
                if (str2 != null) {
                    this.A04 = str2;
                } else {
                    this.A04 = "unknown";
                }
                this.A02 = omz;
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append(y0f.A03);
                this.A03 = AbstractC167017dG.A0n(num, ":", A1C);
                this.A01 = y0f.A00;
                this.A06 = yOn;
                return;
            }
            throw new Exception("Unsupported config version");
        }
        throw new Exception("Bad config");
    }

    @Override // X.InterfaceC58193Pqz
    public final void EI1(String str, String str2) {
        this.A06.ECY(this, AnonymousClass001.A0u("PARAM ACCESS ERROR - ", str2, ": ", "min_bitrate"), this.A00);
    }

    @Override // X.InterfaceC58193Pqz
    public final String BeE() {
        return this.A05;
    }

    @Override // X.InterfaceC58193Pqz
    public final OMZ BkV() {
        return this.A02;
    }

    @Override // X.InterfaceC58193Pqz
    public final long Byv() {
        return this.A01;
    }

    @Override // X.InterfaceC58193Pqz
    public final String CEq() {
        return this.A03;
    }

    @Override // X.InterfaceC58193Pqz
    public final String getName() {
        return this.A04;
    }
}
