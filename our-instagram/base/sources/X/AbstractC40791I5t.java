package X;

/* renamed from: X.I5t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40791I5t {
    public static final EnumC39642HiX A00(EnumC39642HiX enumC39642HiX, String str) {
        if (enumC39642HiX == null) {
            enumC39642HiX = EnumC39642HiX.DEEPLINK;
        }
        for (EnumC39642HiX enumC39642HiX2 : EnumC39642HiX.values()) {
            if (C14360o3.A0K(enumC39642HiX2.A00, str)) {
                return enumC39642HiX2;
            }
        }
        return enumC39642HiX;
    }
}
