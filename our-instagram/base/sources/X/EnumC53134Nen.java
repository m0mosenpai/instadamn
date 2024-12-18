package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nen, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53134Nen {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53134Nen[] A01;
    public static final EnumC53134Nen A02;
    public static final EnumC53134Nen A03;
    public static final EnumC53134Nen A04;

    static {
        EnumC53134Nen enumC53134Nen = new EnumC53134Nen("HOW_IT_WORKS", 0);
        A04 = enumC53134Nen;
        EnumC53134Nen enumC53134Nen2 = new EnumC53134Nen("AUDIENCE_CONTROL_SELECTOR_V1", 1);
        A02 = enumC53134Nen2;
        EnumC53134Nen enumC53134Nen3 = new EnumC53134Nen("CLOSE_FRIENDS_LIST", 2);
        A03 = enumC53134Nen3;
        EnumC53134Nen[] enumC53134NenArr = {enumC53134Nen, enumC53134Nen2, enumC53134Nen3};
        A01 = enumC53134NenArr;
        A00 = AbstractC12190kN.A00(enumC53134NenArr);
    }

    public static EnumC53134Nen valueOf(String str) {
        return (EnumC53134Nen) Enum.valueOf(EnumC53134Nen.class, str);
    }

    public static EnumC53134Nen[] values() {
        return (EnumC53134Nen[]) A01.clone();
    }

    public EnumC53134Nen(String str, int i) {
    }
}
