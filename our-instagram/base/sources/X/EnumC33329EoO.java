package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33329EoO {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33329EoO[] A01;
    public static final EnumC33329EoO A02;
    public static final EnumC33329EoO A03;

    static {
        EnumC33329EoO enumC33329EoO = new EnumC33329EoO("FEED", 0);
        A03 = enumC33329EoO;
        EnumC33329EoO enumC33329EoO2 = new EnumC33329EoO("ACTIVITY_FEED", 1);
        A02 = enumC33329EoO2;
        EnumC33329EoO[] enumC33329EoOArr = {enumC33329EoO, enumC33329EoO2};
        A01 = enumC33329EoOArr;
        A00 = AbstractC12190kN.A00(enumC33329EoOArr);
    }

    public static EnumC33329EoO valueOf(String str) {
        return (EnumC33329EoO) Enum.valueOf(EnumC33329EoO.class, str);
    }

    public static EnumC33329EoO[] values() {
        return (EnumC33329EoO[]) A01.clone();
    }

    public EnumC33329EoO(String str, int i) {
    }
}
