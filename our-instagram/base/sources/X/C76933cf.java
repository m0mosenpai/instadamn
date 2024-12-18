package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.3cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76933cf implements InterfaceC51732Yw {
    public final C2XE A00;
    public final EnumC76913cd A01;
    public final String A02;

    public C76933cf(C2XE c2xe, EnumC76913cd enumC76913cd, String str) {
        C14360o3.A0B(c2xe, 1);
        C14360o3.A0B(enumC76913cd, 3);
        this.A00 = c2xe;
        this.A02 = str;
        this.A01 = enumC76913cd;
    }

    @Override // X.InterfaceC51732Yw
    public final void AC4(C50932Vp c50932Vp, C2XE c2xe) {
        C14360o3.A0B(c50932Vp, 1);
        String str = this.A02;
        String A08 = this.A00.A08();
        C76973cj A01 = C50932Vp.A01(c50932Vp);
        A01.A02 |= 512;
        A01.A0F = str;
        A01.A0G = A08;
        EnumC76913cd enumC76913cd = this.A01;
        C76973cj A012 = C50932Vp.A01(c50932Vp);
        A012.A02 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        A012.A0E = enumC76913cd;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76933cf) {
                C76933cf c76933cf = (C76933cf) obj;
                if (!C14360o3.A0K(this.A00, c76933cf.A00) || !C14360o3.A0K(this.A02, c76933cf.A02) || this.A01 != c76933cf.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A02;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionKeyStyleItem(context=");
        sb.append(this.A00);
        sb.append(", transitionKey=");
        sb.append(this.A02);
        sb.append(", transitionKeyType=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
