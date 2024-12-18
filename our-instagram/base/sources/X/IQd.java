package X;

/* loaded from: classes7.dex */
public abstract class IQd {
    public static final EnumC39593He3 A01(String str) {
        C14360o3.A0B(str, 0);
        for (EnumC39593He3 enumC39593He3 : EnumC39593He3.values()) {
            if (C14360o3.A0K(enumC39593He3.A01, str)) {
                return enumC39593He3;
            }
        }
        return null;
    }

    public static EnumC39593He3 A00(InterfaceC88183wS interfaceC88183wS) {
        return A01(interfaceC88183wS.getId());
    }
}
