package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ng2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53204Ng2 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53204Ng2[] A02;
    public static final EnumC53204Ng2 A03;
    public static final EnumC53204Ng2 A04;
    public final String A00;

    static {
        EnumC53204Ng2 enumC53204Ng2 = new EnumC53204Ng2("HOST_INVITE", 0, "host_invite");
        A04 = enumC53204Ng2;
        EnumC53204Ng2 enumC53204Ng22 = new EnumC53204Ng2("GUEST_REQUEST", 1, "guest_request");
        A03 = enumC53204Ng22;
        EnumC53204Ng2[] enumC53204Ng2Arr = {enumC53204Ng2, enumC53204Ng22};
        A02 = enumC53204Ng2Arr;
        A01 = AbstractC12190kN.A00(enumC53204Ng2Arr);
    }

    public static EnumC53204Ng2 valueOf(String str) {
        return (EnumC53204Ng2) Enum.valueOf(EnumC53204Ng2.class, str);
    }

    public static EnumC53204Ng2[] values() {
        return (EnumC53204Ng2[]) A02.clone();
    }

    public EnumC53204Ng2(String str, int i, String str2) {
        this.A00 = str2;
    }
}
