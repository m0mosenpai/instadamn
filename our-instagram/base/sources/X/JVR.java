package X;

import android.content.Context;

/* loaded from: classes8.dex */
public final class JVR {
    public final Context A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    private final InterfaceC09390do A00(int i) {
        return AbstractC09440dt.A00(EnumC09460dv.A02, new C57249PbX(i, 29, this));
    }

    public final String A01(long j, boolean z, boolean z2) {
        InterfaceC09390do interfaceC09390do;
        Context context = this.A00;
        String A01 = AbstractC162607Px.A01(context, j);
        if (z) {
            if (this.A0I) {
                return AbstractC167007dF.A0f(context, A01, 2131960501);
            }
            if (!this.A0J) {
                interfaceC09390do = this.A0D;
                return AbstractC25225BEi.A15(interfaceC09390do);
            }
            return null;
        }
        if (!z2 || this.A0I) {
            return A01;
        }
        if (!this.A0J) {
            interfaceC09390do = this.A0C;
            return AbstractC25225BEi.A15(interfaceC09390do);
        }
        return null;
    }

    public JVR(Context context, boolean z, boolean z2, boolean z3) {
        this.A00 = context;
        this.A0I = z;
        this.A0H = z2;
        this.A0J = z3;
        this.A0G = A00(z ? 2131960814 : 2131960828);
        this.A03 = A00(z ? 2131958748 : 2131958747);
        this.A0E = A00(z ? 2131960810 : 2131960827);
        this.A01 = A00(z ? 2131958745 : 2131958744);
        this.A0B = A00(z ? 2131959942 : 2131959943);
        this.A0A = A00(z ? 2131959941 : 2131959940);
        this.A0F = A00(2131960813);
        this.A02 = A00(2131958746);
        this.A07 = A00(2131959548);
        this.A05 = A00(2131959534);
        this.A08 = A00(2131959549);
        this.A06 = A00(2131959535);
        this.A0D = A00(2131960564);
        this.A0C = A00(2131960563);
        this.A09 = A00(2131960812);
        this.A04 = A00(2131960809);
    }

    public final String A02(Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        InterfaceC09390do interfaceC09390do;
        int intValue = num.intValue();
        if (z) {
            if (intValue != 0) {
                if (intValue == 3) {
                    if (z2) {
                        interfaceC09390do = this.A0A;
                    } else {
                        interfaceC09390do = this.A01;
                    }
                } else {
                    return str;
                }
            } else if (z3 && this.A0I) {
                if (z4 && !this.A0H) {
                    interfaceC09390do = this.A05;
                } else {
                    interfaceC09390do = this.A02;
                }
            } else if (z4) {
                interfaceC09390do = this.A06;
            } else {
                interfaceC09390do = this.A03;
            }
        } else if (intValue != 0) {
            if (intValue != 3) {
                return str;
            }
            if (z2) {
                interfaceC09390do = this.A0B;
            } else {
                interfaceC09390do = this.A0E;
            }
        } else if (z3 && this.A0I) {
            if (z4 && !this.A0H) {
                interfaceC09390do = this.A07;
            } else {
                interfaceC09390do = this.A0F;
            }
        } else if (z4) {
            interfaceC09390do = this.A08;
        } else {
            interfaceC09390do = this.A0G;
        }
        return AbstractC25225BEi.A15(interfaceC09390do);
    }
}
