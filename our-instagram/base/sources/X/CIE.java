package X;

/* loaded from: classes5.dex */
public abstract class CIE {
    public static final C25984BeY A00(EnumC27380C6j enumC27380C6j, String str, String str2, String str3) {
        int ordinal = enumC27380C6j.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 1 && ordinal != 3) {
                    throw B4Z.A00();
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                return new C25984BeY(str, str2, str3);
            }
            if (str3 == null) {
                str3 = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return new C25984BeY(str, str3, str2);
        }
        if (str3 == null) {
            str3 = "";
        }
        return new C25984BeY(str, str3, null);
    }
}
