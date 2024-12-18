package X;

import com.facebook.common.dextricks.DexStore;

/* loaded from: classes12.dex */
public final class YA7 implements InterfaceC58193Pqz {
    public final String A00;
    public final OMZ A01;
    public final YOn A02;
    public final Y0F A04;
    public volatile int A05 = 1;
    public final C54504O6h A03 = new C54504O6h(this, null);

    @Override // X.InterfaceC58193Pqz
    public final Y0y[] ArL() {
        return null;
    }

    @Override // X.InterfaceC58193Pqz
    public final Y0y[] BUn() {
        return null;
    }

    @Override // X.InterfaceC58193Pqz
    public final int BbD(String str) {
        return -1;
    }

    @Override // X.InterfaceC58193Pqz
    public final String BeE() {
        String str;
        Y0F y0f = this.A04;
        if (y0f != null && (str = y0f.A05) != null) {
            return str;
        }
        return "error";
    }

    @Override // X.InterfaceC58193Pqz
    public final long Byv() {
        Y0F y0f = this.A04;
        if (y0f != null) {
            return y0f.A00;
        }
        return -1L;
    }

    @Override // X.InterfaceC58193Pqz
    public final String CEq() {
        String str;
        Y0F y0f = this.A04;
        if (y0f != null && (str = y0f.A03) != null) {
            Integer num = y0f.A02;
            if (num != null) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append(str);
                return AbstractC167017dG.A0n(num, ":", A1C);
            }
            return str;
        }
        return "error";
    }

    @Override // X.InterfaceC58193Pqz
    public final void EI1(String str, String str2) {
        YOn yOn = this.A02;
        String A0u = AnonymousClass001.A0u("PARAM ACCESS ERROR - ", str2, ": ", "min_bitrate");
        int i = this.A05;
        this.A05 = Math.min(i * 10, DexStore.MS_IN_NS);
        yOn.ECY(this, A0u, i);
    }

    @Override // X.InterfaceC58193Pqz
    public final C54504O6h EK7(C72772Xmp c72772Xmp) {
        YOn yOn = this.A02;
        String str = this.A00;
        int i = this.A05;
        this.A05 = Math.min(i * 10, DexStore.MS_IN_NS);
        yOn.ECY(this, str, i);
        return this.A03;
    }

    @Override // X.InterfaceC58193Pqz
    public final String getName() {
        String str;
        Y0F y0f = this.A04;
        if (y0f != null && (str = y0f.A04) != null) {
            return str;
        }
        return "error";
    }

    public YA7(OMZ omz, YOn yOn, Y0F y0f, String str) {
        this.A01 = omz;
        this.A04 = y0f;
        this.A00 = str;
        this.A02 = yOn;
    }

    @Override // X.InterfaceC58193Pqz
    public final OMZ BkV() {
        return this.A01;
    }
}
