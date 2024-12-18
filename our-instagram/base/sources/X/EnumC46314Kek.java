package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kek, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46314Kek implements InterfaceC31110Dls {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46314Kek[] A02;
    public static final EnumC46314Kek A03;
    public static final EnumC46314Kek A04;
    public static final EnumC46314Kek A05;
    public static final EnumC46314Kek A06;
    public static final EnumC46314Kek A07;
    public final String A00;

    static {
        EnumC46314Kek enumC46314Kek = new EnumC46314Kek("TRENDING", 0, "trending");
        A05 = enumC46314Kek;
        EnumC46314Kek enumC46314Kek2 = new EnumC46314Kek("POPULAR", 1, "popular_with_your_followers");
        A04 = enumC46314Kek2;
        EnumC46314Kek enumC46314Kek3 = new EnumC46314Kek("TRENDING_WITH_SIMILAR_ACCOUNTS", 2, "trending_with_similar_accounts");
        A06 = enumC46314Kek3;
        EnumC46314Kek enumC46314Kek4 = new EnumC46314Kek("ORIGINAL_AUDIO", 3, "original_audio");
        A03 = enumC46314Kek4;
        EnumC46314Kek enumC46314Kek5 = new EnumC46314Kek("UNKNOWN", 4, "unknown");
        A07 = enumC46314Kek5;
        EnumC46314Kek[] enumC46314KekArr = {enumC46314Kek, enumC46314Kek2, enumC46314Kek3, enumC46314Kek4, enumC46314Kek5};
        A02 = enumC46314KekArr;
        A01 = AbstractC12190kN.A00(enumC46314KekArr);
    }

    public static EnumC46314Kek valueOf(String str) {
        return (EnumC46314Kek) Enum.valueOf(EnumC46314Kek.class, str);
    }

    public static EnumC46314Kek[] values() {
        return (EnumC46314Kek[]) A02.clone();
    }

    @Override // X.InterfaceC31110Dls
    public final String BdD() {
        return this.A00;
    }

    public EnumC46314Kek(String str, int i, String str2) {
        this.A00 = str2;
    }
}
