package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39562HdY {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39562HdY[] A02;
    public static final EnumC39562HdY A03;
    public static final EnumC39562HdY A04;
    public static final EnumC39562HdY A05;
    public final String A00;

    static {
        EnumC39562HdY enumC39562HdY = new EnumC39562HdY("FEED", 0, "FEED");
        A03 = enumC39562HdY;
        EnumC39562HdY enumC39562HdY2 = new EnumC39562HdY("STORIES", 1, "STORIES");
        A05 = enumC39562HdY2;
        EnumC39562HdY enumC39562HdY3 = new EnumC39562HdY("REELS", 2, "REELS");
        A04 = enumC39562HdY3;
        EnumC39562HdY[] enumC39562HdYArr = {enumC39562HdY, enumC39562HdY2, enumC39562HdY3};
        A02 = enumC39562HdYArr;
        A01 = AbstractC12190kN.A00(enumC39562HdYArr);
    }

    public static EnumC39562HdY valueOf(String str) {
        return (EnumC39562HdY) Enum.valueOf(EnumC39562HdY.class, str);
    }

    public static EnumC39562HdY[] values() {
        return (EnumC39562HdY[]) A02.clone();
    }

    public EnumC39562HdY(String str, int i, String str2) {
        this.A00 = str2;
    }
}
