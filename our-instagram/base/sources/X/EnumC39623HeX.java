package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HeX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39623HeX {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39623HeX[] A03;
    public static final EnumC39623HeX A04;
    public static final EnumC39623HeX A05;
    public static final EnumC39623HeX A06;
    public static final EnumC39623HeX A07;
    public final String A00;
    public final String A01;

    public final String A00(String str) {
        C14360o3.A0B(str, 0);
        return AnonymousClass001.A0R(this.A01, str);
    }

    static {
        EnumC39623HeX enumC39623HeX = new EnumC39623HeX("CART", "bag", "shopping_bag", 0);
        A04 = enumC39623HeX;
        EnumC39623HeX enumC39623HeX2 = new EnumC39623HeX("WISH_LIST", "wish_list", "wish_list", 1);
        A07 = enumC39623HeX2;
        EnumC39623HeX enumC39623HeX3 = new EnumC39623HeX("RECENTLY_VIEWED", "recently_viewed", "recently_viewed", 2);
        A06 = enumC39623HeX3;
        EnumC39623HeX enumC39623HeX4 = new EnumC39623HeX("LIKED", "liked", "liked", 3);
        A05 = enumC39623HeX4;
        EnumC39623HeX[] enumC39623HeXArr = {enumC39623HeX, enumC39623HeX2, enumC39623HeX3, enumC39623HeX4};
        A03 = enumC39623HeXArr;
        A02 = AbstractC12190kN.A00(enumC39623HeXArr);
    }

    public static EnumC39623HeX valueOf(String str) {
        return (EnumC39623HeX) Enum.valueOf(EnumC39623HeX.class, str);
    }

    public static EnumC39623HeX[] values() {
        return (EnumC39623HeX[]) A03.clone();
    }

    public EnumC39623HeX(String str, String str2, String str3, int i) {
        this.A01 = str2;
        this.A00 = str3;
    }
}
