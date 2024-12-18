package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kca, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46198Kca {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46198Kca[] A02;
    public static final EnumC46198Kca A03;
    public static final EnumC46198Kca A04;
    public static final EnumC46198Kca A05;
    public static final EnumC46198Kca A06;
    public static final EnumC46198Kca A07;
    public final String A00;

    static {
        EnumC46198Kca enumC46198Kca = new EnumC46198Kca("Gift", 0, "appreciation_gift");
        A06 = enumC46198Kca;
        EnumC46198Kca enumC46198Kca2 = new EnumC46198Kca("Send", 1, "appreciation_gift_send");
        A07 = enumC46198Kca2;
        EnumC46198Kca enumC46198Kca3 = new EnumC46198Kca("Animation", 2, "appreciation_gift_animation");
        A03 = enumC46198Kca3;
        EnumC46198Kca enumC46198Kca4 = new EnumC46198Kca("BuyAndSend", 3, "appreciation_buy_and_send");
        A04 = enumC46198Kca4;
        EnumC46198Kca enumC46198Kca5 = new EnumC46198Kca("FullScreenEducation", 4, "appreciation_full_screen_education");
        A05 = enumC46198Kca5;
        EnumC46198Kca[] enumC46198KcaArr = {enumC46198Kca, enumC46198Kca2, enumC46198Kca3, enumC46198Kca4, enumC46198Kca5, new EnumC46198Kca("Prefetch", 5, "appreciation_prefetch")};
        A02 = enumC46198KcaArr;
        A01 = AbstractC12190kN.A00(enumC46198KcaArr);
    }

    public static EnumC46198Kca valueOf(String str) {
        return (EnumC46198Kca) Enum.valueOf(EnumC46198Kca.class, str);
    }

    public static EnumC46198Kca[] values() {
        return (EnumC46198Kca[]) A02.clone();
    }

    public EnumC46198Kca(String str, int i, String str2) {
        this.A00 = str2;
    }
}
