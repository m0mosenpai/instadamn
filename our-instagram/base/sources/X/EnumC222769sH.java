package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222769sH {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222769sH[] A01;
    public static final EnumC222769sH A02;
    public static final EnumC222769sH A03;
    public static final EnumC222769sH A04;
    public static final EnumC222769sH A05;
    public static final EnumC222769sH A06;
    public static final EnumC222769sH A07;
    public static final EnumC222769sH A08;

    static {
        EnumC222769sH enumC222769sH = new EnumC222769sH("ON_ACTIVITY_CREATED", 0);
        A02 = enumC222769sH;
        EnumC222769sH enumC222769sH2 = new EnumC222769sH("ON_LOAD_EXTERNAL_URL", 1);
        A05 = enumC222769sH2;
        EnumC222769sH enumC222769sH3 = new EnumC222769sH("ON_PAUSE", 2);
        A08 = enumC222769sH3;
        EnumC222769sH enumC222769sH4 = new EnumC222769sH("ON_DOM_LOADED", 3);
        A03 = enumC222769sH4;
        EnumC222769sH enumC222769sH5 = new EnumC222769sH("ON_PAGE_INTERACTIVE", 4);
        A07 = enumC222769sH5;
        EnumC222769sH enumC222769sH6 = new EnumC222769sH("ON_PAGE_FINISHED", 5);
        A06 = enumC222769sH6;
        EnumC222769sH enumC222769sH7 = new EnumC222769sH("ON_LARGEST_CONTENTFUL_PAINT", 6);
        A04 = enumC222769sH7;
        EnumC222769sH[] enumC222769sHArr = {enumC222769sH, enumC222769sH2, enumC222769sH3, enumC222769sH4, enumC222769sH5, enumC222769sH6, enumC222769sH7, new EnumC222769sH("ON_BROWSER_CLOSE", 7)};
        A01 = enumC222769sHArr;
        A00 = AbstractC12190kN.A00(enumC222769sHArr);
    }

    public static EnumC222769sH valueOf(String str) {
        return (EnumC222769sH) Enum.valueOf(EnumC222769sH.class, str);
    }

    public static EnumC222769sH[] values() {
        return (EnumC222769sH[]) A01.clone();
    }

    public EnumC222769sH(String str, int i) {
    }
}
