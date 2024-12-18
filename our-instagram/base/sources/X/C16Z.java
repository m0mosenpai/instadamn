package X;

import kotlin.Deprecated;

/* renamed from: X.16Z, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C16Z {
    @Deprecated(message = "We should always be sending account type as an int, use parseFromValue ")
    public static final EnumC222416a A01(String str) {
        if (str != null && str.length() != 0) {
            for (EnumC222416a enumC222416a : EnumC222416a.values()) {
                if (C14360o3.A0K(enumC222416a.A01, str)) {
                    return enumC222416a;
                }
            }
            throw new IllegalArgumentException(AnonymousClass001.A0R("Unsupported UserAccountType, logName: ", str));
        }
        return null;
    }

    public static final EnumC222416a A00(int i) {
        for (EnumC222416a enumC222416a : EnumC222416a.values()) {
            if (enumC222416a.A00 == i) {
                return enumC222416a;
            }
        }
        throw new IllegalArgumentException("Unsupported UserAccountType");
    }
}
