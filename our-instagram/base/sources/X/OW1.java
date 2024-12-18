package X;

import com.facebook.common.time.RealtimeSinceBootClock;

/* loaded from: classes9.dex */
public final class OW1 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public InterfaceC38901rP A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C84923qg A0B;

    public final C84923qg A00() {
        InterfaceC38901rP interfaceC38901rP;
        C84923qg c84923qg = this.A0B;
        if (c84923qg == null && (interfaceC38901rP = this.A04) != null) {
            C84923qg c84923qg2 = new C84923qg(interfaceC38901rP);
            this.A0B = c84923qg2;
            return c84923qg2;
        }
        return c84923qg;
    }

    public OW1() {
        this.A08 = false;
    }

    public OW1(C84923qg c84923qg, String str, String str2, int i, int i2, int i3, boolean z, boolean z2) {
        this.A08 = false;
        this.A03 = RealtimeSinceBootClock.A00.now();
        this.A0B = c84923qg;
        this.A04 = c84923qg.A0V;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = z;
        this.A09 = z2;
        this.A0A = false;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }
}
