package X;

/* loaded from: classes8.dex */
public abstract class LCK {
    public static final EnumC46257Kdp A00(Integer num) {
        if (num != null) {
            long intValue = num.intValue();
            for (EnumC46257Kdp enumC46257Kdp : EnumC46257Kdp.values()) {
                Long valueOf = Long.valueOf(enumC46257Kdp.A00);
                if (valueOf != null && valueOf.longValue() == intValue) {
                    return enumC46257Kdp;
                }
            }
        }
        return null;
    }

    public static final String A01(C2EC c2ec) {
        String str;
        String str2;
        if (c2ec != null) {
            if (c2ec.CVQ()) {
                str = "group";
            } else {
                str = "one_to_one";
            }
            if (c2ec.CX1()) {
                str2 = ":xac";
            } else {
                str2 = "";
            }
            return AnonymousClass001.A0R(str, str2);
        }
        return null;
    }
}
