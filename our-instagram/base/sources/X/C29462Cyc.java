package X;

import android.content.Context;

/* renamed from: X.Cyc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29462Cyc implements InterfaceC30959DjG {
    public final Integer A00;

    public C29462Cyc(Integer num) {
        C14360o3.A0B(num, 1);
        this.A00 = num;
    }

    @Override // X.InterfaceC30959DjG
    public final /* bridge */ /* synthetic */ Object EKN(Context context, InterfaceC30923Dia interfaceC30923Dia) {
        Integer num;
        int i;
        boolean A1R = AbstractC167007dF.A1R(0, context, interfaceC30923Dia);
        Integer num2 = C05F.A00;
        EnumC72394Xcg enumC72394Xcg = EnumC72394Xcg.A0R;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            if (intValue != A1R) {
                if (intValue == 2) {
                    num = C05F.A0Y;
                } else {
                    throw B4Z.A00();
                }
            } else {
                num = C05F.A0N;
            }
        } else {
            num = C05F.A01;
        }
        C29466Cyg c29466Cyg = new C29466Cyg(enumC72394Xcg, null, num2, num, A1R);
        int i2 = 20;
        if (intValue != 0) {
            i = 40;
            if (intValue != A1R) {
                i = 48;
            }
        } else {
            i2 = 12;
            i = 28;
        }
        return new C28001CVy(c29466Cyg, i2, i2, i);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29462Cyc) && this.A00 == ((C29462Cyc) obj).A00);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "DP40";
                break;
            case 2:
                str = "DP48";
                break;
            default:
                str = "DP28";
                break;
        }
        return AbstractC25228BEl.A0F(str, intValue) + 1231;
    }

    public final String toString() {
        String str;
        switch (this.A00.intValue()) {
            case 1:
                str = "DP40";
                break;
            case 2:
                str = "DP48";
                break;
            default:
                str = "DP28";
                break;
        }
        return AnonymousClass001.A0m("CdsStackedPhotoVariant(photoSize=", str, ", isOffsetDiagonally=", ')', true);
    }
}
