package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eow, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33363Eow {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33363Eow[] A01;
    public static final EnumC33363Eow A02;
    public static final EnumC33363Eow A03;
    public static final EnumC33363Eow A04;
    public static final EnumC33363Eow A05;
    public static final EnumC33363Eow A06;
    public static final EnumC33363Eow A07;

    static {
        EnumC33363Eow enumC33363Eow = new EnumC33363Eow("PROFILE_CREATION", 0);
        A06 = enumC33363Eow;
        EnumC33363Eow enumC33363Eow2 = new EnumC33363Eow("GUIDE_ADD_ITEMS", 1);
        A03 = enumC33363Eow2;
        EnumC33363Eow enumC33363Eow3 = new EnumC33363Eow("GUIDE_CHOOSE_COVER", 2);
        A04 = enumC33363Eow3;
        EnumC33363Eow enumC33363Eow4 = new EnumC33363Eow("GUIDE_EDIT_ITEM", 3);
        A05 = enumC33363Eow4;
        EnumC33363Eow enumC33363Eow5 = new EnumC33363Eow("SAVE_COLLECTION", 4);
        A07 = enumC33363Eow5;
        EnumC33363Eow enumC33363Eow6 = new EnumC33363Eow("COLLECTION_CHOOSE_COVER", 5);
        A02 = enumC33363Eow6;
        EnumC33363Eow[] enumC33363EowArr = {enumC33363Eow, enumC33363Eow2, enumC33363Eow3, enumC33363Eow4, enumC33363Eow5, enumC33363Eow6, new EnumC33363Eow("COLLECTION_PRODUCT_CHOOSE_PHOTO", 6)};
        A01 = enumC33363EowArr;
        A00 = AbstractC12190kN.A00(enumC33363EowArr);
    }

    public static EnumC33363Eow valueOf(String str) {
        return (EnumC33363Eow) Enum.valueOf(EnumC33363Eow.class, str);
    }

    public static EnumC33363Eow[] values() {
        return (EnumC33363Eow[]) A01.clone();
    }

    public EnumC33363Eow(String str, int i) {
    }
}
