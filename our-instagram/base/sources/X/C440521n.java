package X;

/* renamed from: X.21n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C440521n {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public int A07;
    public int A08;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0Q;
    public EnumC440821q A0J = EnumC440821q.A02;
    public EnumC440821q A0K = EnumC440821q.A06;
    public int A09 = -1;
    public int A0A = -1;
    public boolean A0P = false;

    public static EnumC440821q A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 107348:
                    if (str.equals("low")) {
                        return EnumC440821q.A02;
                    }
                    break;
                case 1086463900:
                    if (str.equals("regular")) {
                        return EnumC440821q.A04;
                    }
                    break;
                case 1453634625:
                    if (str.equals("ultra_low")) {
                        return EnumC440821q.A05;
                    }
                    break;
            }
        }
        return EnumC440821q.A06;
    }

    public final C441321v A01() {
        return new C441321v(this);
    }

    public final void A02(double d) {
        this.A00 = d;
    }

    public final void A03(double d) {
        this.A01 = d;
    }

    public final void A04(double d) {
        this.A02 = d;
    }

    public final void A05(double d) {
        this.A03 = d;
    }

    public final void A06(double d) {
        this.A04 = d;
    }

    public final void A07(double d) {
        this.A05 = d;
    }

    public final void A08(double d) {
        this.A06 = d;
    }

    public final void A09(int i) {
        this.A07 = i;
    }

    public final void A0A(int i) {
        this.A08 = i;
    }

    public final void A0B(int i) {
        this.A09 = i;
    }

    public final void A0C(int i) {
        this.A0A = i;
    }

    public final void A0D(int i) {
        this.A0B = i;
    }

    public final void A0E(int i) {
        this.A0C = i;
    }

    public final void A0F(int i) {
        this.A0D = i;
    }

    public final void A0G(int i) {
        this.A0E = i;
    }

    public final void A0H(int i) {
        this.A0F = i;
    }

    public final void A0I(int i) {
        this.A0G = i;
    }

    public final void A0J(int i) {
        this.A0H = i;
    }

    public final void A0K(int i) {
        this.A0I = i;
    }

    public final void A0L(String str) {
        this.A0L = str;
    }

    public final void A0O(boolean z) {
        this.A0M = z;
    }

    public final void A0P(boolean z) {
        this.A0N = z;
    }

    public final void A0Q(boolean z) {
        this.A0O = z;
    }

    public final void A0R(boolean z) {
        this.A0P = z;
    }

    public final void A0S(boolean z) {
        this.A0Q = z;
    }

    public final void A0M(String str) {
        this.A0J = A00(str);
    }

    public final void A0N(String str) {
        this.A0K = A00(str);
    }
}
