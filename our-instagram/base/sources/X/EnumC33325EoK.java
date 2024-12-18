package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33325EoK {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33325EoK[] A01;
    public static final EnumC33325EoK A02;

    static {
        EnumC33325EoK enumC33325EoK = new EnumC33325EoK("ACTIVITY_FEED", 0);
        A02 = enumC33325EoK;
        EnumC33325EoK[] enumC33325EoKArr = {enumC33325EoK, new EnumC33325EoK("SETTINGS", 1)};
        A01 = enumC33325EoKArr;
        A00 = AbstractC12190kN.A00(enumC33325EoKArr);
    }

    public static EnumC33325EoK valueOf(String str) {
        return (EnumC33325EoK) Enum.valueOf(EnumC33325EoK.class, str);
    }

    public static EnumC33325EoK[] values() {
        return (EnumC33325EoK[]) A01.clone();
    }

    public EnumC33325EoK(String str, int i) {
    }
}
