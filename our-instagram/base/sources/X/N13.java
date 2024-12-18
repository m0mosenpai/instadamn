package X;

/* loaded from: classes9.dex */
public final class N13 extends AbstractC53637Nni {
    public final synchronized EnumC53367NjI A03() {
        return A00(this.A00);
    }

    public final synchronized EnumC53367NjI A04() {
        return A00(this.A01);
    }

    public static final EnumC53367NjI A00(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 5 && intValue != 4) {
                if (intValue == 3) {
                    return EnumC53367NjI.MODERATE;
                }
                if (intValue == 2) {
                    return EnumC53367NjI.SEVERE;
                }
                if (intValue == 1) {
                    return EnumC53367NjI.CRITICAL;
                }
                if (intValue == 0) {
                    return EnumC53367NjI.UNKNOWN;
                }
                return null;
            }
            return EnumC53367NjI.NORMAL;
        }
        return null;
    }
}
