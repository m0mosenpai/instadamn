package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kba, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46136Kba {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46136Kba[] A01;
    public static final EnumC46136Kba A02;
    public static final EnumC46136Kba A03;

    static {
        EnumC46136Kba enumC46136Kba = new EnumC46136Kba("TRENDING", 0);
        A03 = enumC46136Kba;
        EnumC46136Kba enumC46136Kba2 = new EnumC46136Kba("SAVED", 1);
        A02 = enumC46136Kba2;
        EnumC46136Kba[] enumC46136KbaArr = {enumC46136Kba, enumC46136Kba2};
        A01 = enumC46136KbaArr;
        A00 = AbstractC12190kN.A00(enumC46136KbaArr);
    }

    public static EnumC46136Kba valueOf(String str) {
        return (EnumC46136Kba) Enum.valueOf(EnumC46136Kba.class, str);
    }

    public static EnumC46136Kba[] values() {
        return (EnumC46136Kba[]) A01.clone();
    }

    public EnumC46136Kba(String str, int i) {
    }
}
