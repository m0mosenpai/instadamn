package X;

import android.content.Context;

/* renamed from: X.Cyd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29463Cyd implements InterfaceC30959DjG {
    public final Integer A00;

    public C29463Cyd(Integer num) {
        C14360o3.A0B(num, 1);
        this.A00 = num;
    }

    @Override // X.InterfaceC30959DjG
    public final /* bridge */ /* synthetic */ Object EKN(Context context, InterfaceC30923Dia interfaceC30923Dia) {
        EnumC72394Xcg enumC72394Xcg;
        boolean A1R = AbstractC167007dF.A1R(0, context, interfaceC30923Dia);
        EnumC72394Xcg enumC72394Xcg2 = EnumC72394Xcg.A1r;
        Integer num = C05F.A1I;
        int AKz = AbstractC28379Cfi.A02(interfaceC30923Dia).AKz(C05F.A0H);
        int A00 = (int) AbstractC28379Cfi.A00(interfaceC30923Dia, C05F.A0j);
        int A002 = (int) AbstractC28379Cfi.A00(interfaceC30923Dia, C05F.A0Y);
        C29474Cyo c29474Cyo = new C29474Cyo(enumC72394Xcg2, num);
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            if (intValue != A1R) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            enumC72394Xcg = EnumC72394Xcg.A0F;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        enumC72394Xcg = EnumC72394Xcg.A0D;
                    }
                } else {
                    enumC72394Xcg = EnumC72394Xcg.A0C;
                }
            } else {
                enumC72394Xcg = EnumC72394Xcg.A0G;
            }
        } else {
            enumC72394Xcg = EnumC72394Xcg.A0E;
        }
        int A01 = AbstractC28379Cfi.A01(enumC72394Xcg, interfaceC30923Dia);
        Integer valueOf = Integer.valueOf(A00);
        return new CWG(c29474Cyo, valueOf, valueOf, Integer.valueOf(A01), A002, A002, AKz);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29463Cyd) && this.A00 == ((C29463Cyd) obj).A00);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return AbstractC25230BEn.A0C(num, AbstractC54303NzN.A00(num));
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("CdsTextBadgeVariant(backgroundColor=", AbstractC54303NzN.A00(this.A00));
    }
}
