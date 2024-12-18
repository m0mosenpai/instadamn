package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.animation.Interpolator;

/* renamed from: X.Cye, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29464Cye implements InterfaceC30959DjG {
    public final EnumC72394Xcg A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29464Cye) {
                C29464Cye c29464Cye = (C29464Cye) obj;
                if (this.A00 != c29464Cye.A00 || this.A01 != c29464Cye.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A00);
        Integer num = this.A01;
        return A0G + AbstractC25230BEn.A0C(num, AbstractC27722CKp.A00(num));
    }

    public C29464Cye(EnumC72394Xcg enumC72394Xcg, Integer num) {
        AbstractC167017dG.A1P(enumC72394Xcg, num);
        this.A00 = enumC72394Xcg;
        this.A01 = num;
    }

    @Override // X.InterfaceC30959DjG
    public final /* bridge */ /* synthetic */ Object EKN(Context context, InterfaceC30923Dia interfaceC30923Dia) {
        int i;
        boolean A1a = AbstractC167017dG.A1a(context, interfaceC30923Dia);
        switch (this.A01.intValue()) {
            case 1:
                i = 20;
                break;
            case 2:
                i = 24;
                break;
            case 3:
                i = 32;
                break;
            case 4:
                i = 48;
                break;
            case 5:
                i = 60;
                break;
            case 6:
                i = 72;
                break;
            default:
                i = 16;
                break;
        }
        int applyDimension = (int) TypedValue.applyDimension(A1a ? 1 : 0, i, AbstractC167007dF.A0K(context));
        Interpolator interpolator = U5F.A09;
        return new CVN(new U5F(context, 2.0f, AbstractC28379Cfi.A01(this.A00, interfaceC30923Dia), applyDimension), i);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CdsSpinnerVariant(color=");
        A1C.append(this.A00);
        A1C.append(", size=");
        return AbstractC25236BEt.A0Y(AbstractC27722CKp.A00(this.A01), A1C);
    }
}
