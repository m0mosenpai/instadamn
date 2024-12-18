package X;

/* renamed from: X.FCk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34342FCk {
    public static final EnumC33395EpS A00(String str) {
        C14360o3.A0B(str, 0);
        for (EnumC33395EpS enumC33395EpS : EnumC33395EpS.values()) {
            if (str.equalsIgnoreCase(enumC33395EpS.A00)) {
                return enumC33395EpS;
            }
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A0g("Prefill source '", str, "' not supported."));
    }
}
