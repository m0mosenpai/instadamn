package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;

/* renamed from: X.Cyg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29466Cyg implements InterfaceC30959DjG {
    public final EnumC72394Xcg A00;
    public final CV6 A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;

    @Override // X.InterfaceC30959DjG
    public final /* bridge */ /* synthetic */ Object EKN(Context context, InterfaceC30923Dia interfaceC30923Dia) {
        float f;
        float AKz;
        AbstractC27451C9t c3b;
        AbstractC27450C9s abstractC27450C9s;
        Integer num;
        String str;
        boolean A1R = AbstractC167007dF.A1R(0, context, interfaceC30923Dia);
        Integer num2 = this.A03;
        Integer num3 = C05F.A00;
        boolean A1X = AbstractC167007dF.A1X(num2, num3);
        Integer num4 = this.A02;
        int A00 = CZB.A00(num4);
        if (A00 <= 60) {
            f = 2.0f;
        } else {
            f = 6.0f;
            if (A00 <= 100) {
                f = 4.0f;
            }
        }
        boolean z = this.A04;
        int A002 = CZB.A00(num4);
        if (z) {
            A002 += (int) f;
        }
        if (A1X) {
            AKz = AbstractC166987dD.A02(A002);
        } else {
            Integer num5 = C05F.A1F;
            if (AbstractC28379Cfi.A02(interfaceC30923Dia).AVw(num5)) {
                switch (num4.intValue()) {
                    case 0:
                    case 1:
                        num5 = C05F.A0F;
                        break;
                    case 2:
                    case 3:
                        num5 = C05F.A0E;
                        break;
                    case 4:
                    case 5:
                        num5 = C05F.A0D;
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        num5 = C05F.A0G;
                        break;
                    default:
                        throw B4Z.A00();
                }
            }
            AKz = AbstractC28379Cfi.A02(interfaceC30923Dia).AKz(num5);
        }
        if (num2 == num3) {
            c3b = C3C.A00;
        } else {
            c3b = new C3B(AKz);
        }
        int A01 = AbstractC28379Cfi.A01(EnumC72394Xcg.A0R, interfaceC30923Dia);
        if (z) {
            abstractC27450C9s = new C39(A01, f);
        } else {
            abstractC27450C9s = C3A.A00;
        }
        EnumC72394Xcg enumC72394Xcg = this.A00;
        if (enumC72394Xcg != null) {
            num = Integer.valueOf(AbstractC28379Cfi.A01(enumC72394Xcg, interfaceC30923Dia));
        } else {
            num = null;
        }
        if (num2 == num3) {
            str = "Actor";
        } else {
            str = "Non Actor";
        }
        String A0R = AnonymousClass001.A0R("CdsProfilePhotoVariant - ", str);
        int i = ((int) (((f + 0.5f) * AbstractC167007dF.A0K(context).density) + 0.5f)) - 1;
        int i2 = (int) ((AbstractC167007dF.A0K(context).density * 0.5f) + 0.5f);
        if (!z) {
            i = i2;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        int intValue = num2.intValue();
        if (intValue != 0) {
            if (intValue == A1R) {
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius((int) ((AKz * AbstractC167007dF.A0K(context).density) + 0.5f));
            } else {
                throw B4Z.A00();
            }
        } else {
            gradientDrawable.setShape(A1R ? 1 : 0);
        }
        gradientDrawable.setStroke(i, AbstractC28379Cfi.A01(EnumC72394Xcg.A1H, interfaceC30923Dia));
        return new CWF(gradientDrawable, this.A01, abstractC27450C9s, c3b, num, A0R, A002);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29466Cyg) {
                C29466Cyg c29466Cyg = (C29466Cyg) obj;
                if (this.A03 != c29466Cyg.A03 || this.A00 != c29466Cyg.A00 || this.A02 != c29466Cyg.A02 || this.A04 != c29466Cyg.A04 || !C14360o3.A0K(this.A01, c29466Cyg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A03.intValue();
        if (1 != intValue) {
            str = "ACTOR";
        } else {
            str = "NON_ACTOR";
        }
        int A0F = (AbstractC25228BEl.A0F(str, intValue) + AbstractC167017dG.A0M(this.A00)) * 31;
        Integer num = this.A02;
        return AbstractC167007dF.A0D(this.A04, AbstractC167017dG.A0L(num, CZB.A01(num), A0F)) + AbstractC166997dE.A0I(this.A01);
    }

    public C29466Cyg(EnumC72394Xcg enumC72394Xcg, CV6 cv6, Integer num, Integer num2, boolean z) {
        AbstractC167017dG.A1Q(num, num2);
        this.A03 = num;
        this.A00 = enumC72394Xcg;
        this.A02 = num2;
        this.A04 = z;
        this.A01 = cv6;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CdsProfilePhotoVariant(photoStyle=");
        if (1 - this.A03.intValue() != 0) {
            str = "ACTOR";
        } else {
            str = "NON_ACTOR";
        }
        A1C.append(str);
        A1C.append(", backgroundColor=");
        A1C.append(this.A00);
        A1C.append(AbstractC58317Pt9.A00(436));
        A1C.append(CZB.A01(this.A02));
        A1C.append(", hasBorder=");
        A1C.append(this.A04);
        A1C.append(", badgeAddOn=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
