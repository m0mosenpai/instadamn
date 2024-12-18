package X;

/* renamed from: X.Nt9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53936Nt9 {
    public static final EnumC53357Nj8 A00(C51674Ms5 c51674Ms5) {
        Integer num = c51674Ms5.A02;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0 && intValue != 2 && intValue != 3) {
                if (intValue != 1) {
                    if (intValue == 4) {
                        return EnumC53357Nj8.XAR;
                    }
                } else {
                    return EnumC53357Nj8.CCP_FOR_UNLINKED;
                }
            } else {
                return EnumC53357Nj8.CCP;
            }
        }
        return EnumC53357Nj8.NONE;
    }
}
