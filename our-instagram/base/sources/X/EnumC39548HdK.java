package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39548HdK {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39548HdK[] A01;
    public static final EnumC39548HdK A02;
    public static final EnumC39548HdK A03;
    public static final EnumC39548HdK A04;
    public static final EnumC39548HdK A05;
    public static final EnumC39548HdK A06;

    static {
        EnumC39548HdK enumC39548HdK = new EnumC39548HdK("ADD_ITEM", 0);
        A02 = enumC39548HdK;
        EnumC39548HdK enumC39548HdK2 = new EnumC39548HdK("QUANTITY_SET", 1);
        A04 = enumC39548HdK2;
        EnumC39548HdK enumC39548HdK3 = new EnumC39548HdK("REMOVE", 2);
        A05 = enumC39548HdK3;
        EnumC39548HdK enumC39548HdK4 = new EnumC39548HdK("MOVE_ITEM_TO_TOP", 3);
        A03 = enumC39548HdK4;
        EnumC39548HdK enumC39548HdK5 = new EnumC39548HdK("REPLACE_ITEM", 4);
        A06 = enumC39548HdK5;
        EnumC39548HdK[] enumC39548HdKArr = {enumC39548HdK, enumC39548HdK2, enumC39548HdK3, enumC39548HdK4, enumC39548HdK5};
        A01 = enumC39548HdKArr;
        A00 = AbstractC12190kN.A00(enumC39548HdKArr);
    }

    public static EnumC39548HdK valueOf(String str) {
        return (EnumC39548HdK) Enum.valueOf(EnumC39548HdK.class, str);
    }

    public static EnumC39548HdK[] values() {
        return (EnumC39548HdK[]) A01.clone();
    }

    public EnumC39548HdK(String str, int i) {
    }
}
