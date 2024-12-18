package X;

/* renamed from: X.1U2, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1U2 {
    public static final EnumC27091Ti A00(String str) {
        for (EnumC27091Ti enumC27091Ti : EnumC27091Ti.values()) {
            if (C14360o3.A0K(enumC27091Ti.A00, str)) {
                return enumC27091Ti;
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("Invalid module name: ", str));
    }
}
