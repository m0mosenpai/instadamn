package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.3eE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77863eE implements InterfaceC51732Yw {
    public final Integer A00;
    public final Object A01;
    public final String A02;

    @Override // X.InterfaceC51732Yw
    public final void AC4(C50932Vp c50932Vp, C2XE c2xe) {
        C14360o3.A0B(c50932Vp, 1);
        int intValue = this.A00.intValue();
        Object obj = this.A01;
        switch (intValue) {
            case 0:
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.VisibleEvent, kotlin.Unit>");
                C15500q5.A06(obj, 1);
                C77783e3 c77783e3 = new C77783e3(this.A02, (InterfaceC16660sJ) obj);
                C76973cj A01 = C50932Vp.A01(c50932Vp);
                A01.A02 |= 8;
                A01.A0D = c77783e3;
                return;
            case 1:
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.InvisibleEvent, kotlin.Unit>");
                C15500q5.A06(obj, 1);
                C77783e3 c77783e32 = new C77783e3(this.A02, (InterfaceC16660sJ) obj);
                C76973cj A012 = C50932Vp.A01(c50932Vp);
                A012.A02 |= 64;
                A012.A0A = c77783e32;
                return;
            case 2:
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.FocusedVisibleEvent, kotlin.Unit>");
                C15500q5.A06(obj, 1);
                C77783e3 c77783e33 = new C77783e3(this.A02, (InterfaceC16660sJ) obj);
                C76973cj A013 = C50932Vp.A01(c50932Vp);
                A013.A02 |= 16;
                A013.A08 = c77783e33;
                return;
            case 3:
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.UnfocusedVisibleEvent, kotlin.Unit>");
                C15500q5.A06(obj, 1);
                C77783e3 c77783e34 = new C77783e3(this.A02, (InterfaceC16660sJ) obj);
                C76973cj A014 = C50932Vp.A01(c50932Vp);
                A014.A02 |= 128;
                A014.A0B = c77783e34;
                return;
            case 4:
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.FullImpressionVisibleEvent, kotlin.Unit>");
                C15500q5.A06(obj, 1);
                C77783e3 c77783e35 = new C77783e3(this.A02, (InterfaceC16660sJ) obj);
                C76973cj A015 = C50932Vp.A01(c50932Vp);
                A015.A02 |= 32;
                A015.A09 = c77783e35;
                return;
            case 5:
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Function1<com.facebook.litho.VisibilityChangedEvent, kotlin.Unit>");
                C15500q5.A06(obj, 1);
                C77783e3 c77783e36 = new C77783e3(this.A02, (InterfaceC16660sJ) obj);
                C76973cj A016 = C50932Vp.A01(c50932Vp);
                A016.A02 |= Constants.LOAD_RESULT_PGO_ATTEMPTED;
                A016.A0C = c77783e36;
                return;
            default:
                if (obj instanceof CV2) {
                    int i = ((CV2) obj).A00;
                    C50952Vr A02 = C50932Vp.A02(c50932Vp);
                    CV2 cv2 = new CV2(i);
                    A02.A0F |= 17179869184L;
                    A02.A0Y = cv2;
                    c50932Vp.A08 = true;
                    return;
                }
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77863eE) {
                C77863eE c77863eE = (C77863eE) obj;
                if (this.A00 != c77863eE.A00 || !C14360o3.A0K(this.A01, c77863eE.A01) || !C14360o3.A0K(this.A02, c77863eE.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.A00;
        int hashCode2 = (AbstractC46558Kix.A00(num).hashCode() + num.intValue()) * 31;
        Object obj = this.A01;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VisibilityStyleItem(field=");
        sb.append(AbstractC46558Kix.A00(this.A00));
        sb.append(AbstractC43591JPw.A00(15));
        sb.append(this.A01);
        sb.append(", tag=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C77863eE(Integer num, Object obj, String str) {
        this.A00 = num;
        this.A01 = obj;
        this.A02 = str;
    }
}
