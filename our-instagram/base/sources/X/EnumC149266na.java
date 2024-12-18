package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6na, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC149266na {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC149266na[] A03;
    public static final EnumC149266na A04;
    public static final EnumC149266na A05;
    public static final EnumC149266na A06;
    public static final EnumC149266na A07;
    public static final EnumC149266na A08;
    public static final EnumC149266na A09;
    public final int A00;
    public final boolean A01;

    static {
        EnumC149266na enumC149266na = new EnumC149266na("BROADCAST", 0, 0, false);
        A04 = enumC149266na;
        EnumC149266na enumC149266na2 = new EnumC149266na("STORY", 1, 1, false);
        A07 = enumC149266na2;
        EnumC149266na enumC149266na3 = new EnumC149266na("BROADCAST_ARCHIVE", 2, 2, false);
        A05 = enumC149266na3;
        EnumC149266na enumC149266na4 = new EnumC149266na("STORY_AD", 3, 3, false);
        A08 = enumC149266na4;
        EnumC149266na enumC149266na5 = new EnumC149266na("NETEGO", 4, 4, false);
        A06 = enumC149266na5;
        EnumC149266na enumC149266na6 = new EnumC149266na("STORY_INTERSTITIAL", 5, 5, false);
        A09 = enumC149266na6;
        EnumC149266na[] enumC149266naArr = {enumC149266na, enumC149266na2, enumC149266na3, enumC149266na4, enumC149266na5, enumC149266na6, new EnumC149266na("LITHO_STORY_AD", 6, 6, true)};
        A03 = enumC149266naArr;
        A02 = AbstractC12190kN.A00(enumC149266naArr);
    }

    public static EnumC149266na valueOf(String str) {
        return (EnumC149266na) Enum.valueOf(EnumC149266na.class, str);
    }

    public static EnumC149266na[] values() {
        return (EnumC149266na[]) A03.clone();
    }

    public EnumC149266na(String str, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A01 = z;
    }
}
