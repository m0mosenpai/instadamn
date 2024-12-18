package X;

/* renamed from: X.HyK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40538HyK {
    public static final EnumC39614HeO A00(String str) {
        for (EnumC39614HeO enumC39614HeO : EnumC39614HeO.values()) {
            if (C14360o3.A0K(enumC39614HeO.A00, str)) {
                return enumC39614HeO;
            }
        }
        throw new RuntimeException("no matching ContentInspirationType for input string");
    }
}
