package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC168517fl {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC168517fl[] A01;
    public static final EnumC168517fl A02;
    public static final EnumC168517fl A03;
    public static final EnumC168517fl A04;

    static {
        EnumC168517fl enumC168517fl = new EnumC168517fl("APPROVED", 0);
        A02 = enumC168517fl;
        EnumC168517fl enumC168517fl2 = new EnumC168517fl("RESTRICT_SENSITIVITY_SCREEN", 1);
        A04 = enumC168517fl2;
        EnumC168517fl enumC168517fl3 = new EnumC168517fl("RESTRICT_PENDING_CONTENT", 2);
        A03 = enumC168517fl3;
        EnumC168517fl[] enumC168517flArr = {enumC168517fl, enumC168517fl2, enumC168517fl3};
        A01 = enumC168517flArr;
        A00 = AbstractC12190kN.A00(enumC168517flArr);
    }

    public static EnumC168517fl valueOf(String str) {
        return (EnumC168517fl) Enum.valueOf(EnumC168517fl.class, str);
    }

    public static EnumC168517fl[] values() {
        return (EnumC168517fl[]) A01.clone();
    }

    public EnumC168517fl(String str, int i) {
    }
}
