package X;

import android.content.Context;

/* renamed from: X.Cyr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29477Cyr implements InterfaceC31001Dk0 {
    public final int A00;
    public final C51722Yv A01;
    public final C87 A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final InterfaceC16820sZ A06;
    public final boolean A07;
    public final Integer A08;

    public C29477Cyr(C51722Yv c51722Yv, C87 c87, Integer num, Integer num2, Integer num3, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        AbstractC167007dF.A1H(c87, 1, num3);
        this.A02 = c87;
        this.A00 = i;
        this.A06 = interfaceC16820sZ;
        this.A05 = str;
        this.A03 = num;
        this.A04 = num2;
        this.A08 = num3;
        this.A01 = c51722Yv;
        this.A07 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29477Cyr) {
                C29477Cyr c29477Cyr = (C29477Cyr) obj;
                if (this.A02 != c29477Cyr.A02 || this.A00 != c29477Cyr.A00 || !C14360o3.A0K(this.A06, c29477Cyr.A06) || !C14360o3.A0K(this.A05, c29477Cyr.A05) || !C14360o3.A0K(this.A03, c29477Cyr.A03) || !C14360o3.A0K(this.A04, c29477Cyr.A04) || this.A08 != c29477Cyr.A08 || !C14360o3.A0K(this.A01, c29477Cyr.A01) || this.A07 != c29477Cyr.A07) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31001Dk0
    public final Integer CGf() {
        switch (this.A08.intValue()) {
            case 0:
                return C05F.A00;
            case 1:
                return C05F.A01;
            case 2:
                return C05F.A0N;
            case 3:
                return C05F.A0j;
            case 4:
                return C05F.A0C;
            case 5:
                return C05F.A0Y;
            default:
                return C05F.A0u;
        }
    }

    public final int hashCode() {
        int A0K = (((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0J(this.A06, (AbstractC166987dD.A0G(this.A02) + this.A00) * 31)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31;
        Integer num = this.A08;
        return AbstractC166987dD.A0K(this.A07, AbstractC166997dE.A0J(this.A01, AbstractC167017dG.A0L(num, CLA.A00(num), A0K)));
    }

    @Override // X.InterfaceC31001Dk0
    public final /* bridge */ /* synthetic */ Object CHc(Context context, InterfaceC30923Dia interfaceC30923Dia, InterfaceC30960DjH interfaceC30960DjH) {
        AbstractC167017dG.A1P(interfaceC30923Dia, interfaceC30960DjH);
        C87 c87 = this.A02;
        String str = this.A05;
        Integer num = this.A04;
        Integer num2 = this.A03;
        int i = this.A00;
        return new C26511BnW(this.A01, c87, null, num2, num, str, this.A06, i, this.A07);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAiFilledIconButtonTextInputAddOn(iconName=");
        A1C.append(this.A02);
        A1C.append(", cornerRadiusDp=");
        A1C.append(this.A00);
        A1C.append(", onClick=");
        A1C.append(this.A06);
        A1C.append(MSV.A00(66));
        A1C.append(this.A05);
        A1C.append(", buttonBackgroundColor=");
        A1C.append(this.A03);
        A1C.append(", iconTintColor=");
        A1C.append(this.A04);
        A1C.append(", visibilityRule=");
        A1C.append(CLA.A00(this.A08));
        A1C.append(", style=");
        A1C.append(this.A01);
        A1C.append(", isEnabled=");
        return AbstractC25236BEt.A0a(A1C, this.A07);
    }
}
