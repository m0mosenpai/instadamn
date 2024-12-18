package X;

/* loaded from: classes7.dex */
public abstract class I3J {
    public static final EnumC39617HeR A00(String str) {
        for (EnumC39617HeR enumC39617HeR : EnumC39617HeR.values()) {
            if (C14360o3.A0K(enumC39617HeR.A00, str)) {
                return enumC39617HeR;
            }
        }
        C0w9.A03("ProductSourceType", AnonymousClass001.A0R("Unexpected product source type: ", str));
        return EnumC39617HeR.A04;
    }
}
