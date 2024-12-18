package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33332EoR {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33332EoR[] A01;
    public static final EnumC33332EoR A02;
    public static final EnumC33332EoR A03;
    public static final EnumC33332EoR A04;

    static {
        EnumC33332EoR enumC33332EoR = new EnumC33332EoR("STATUS_UNKNOWN", 0);
        A03 = enumC33332EoR;
        EnumC33332EoR enumC33332EoR2 = new EnumC33332EoR("STATUS_SUCCESS", 1);
        A02 = enumC33332EoR2;
        EnumC33332EoR enumC33332EoR3 = new EnumC33332EoR("STATUS_USER_SKIPPED_OR_ALREADY_LINKED", 2);
        A04 = enumC33332EoR3;
        EnumC33332EoR[] enumC33332EoRArr = {enumC33332EoR, enumC33332EoR2, enumC33332EoR3};
        A01 = enumC33332EoRArr;
        A00 = AbstractC12190kN.A00(enumC33332EoRArr);
    }

    public static EnumC33332EoR valueOf(String str) {
        return (EnumC33332EoR) Enum.valueOf(EnumC33332EoR.class, str);
    }

    public static EnumC33332EoR[] values() {
        return (EnumC33332EoR[]) A01.clone();
    }

    public EnumC33332EoR(String str, int i) {
    }
}
