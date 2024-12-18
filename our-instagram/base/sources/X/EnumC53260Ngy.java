package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53260Ngy {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53260Ngy[] A03;
    public static final EnumC53260Ngy A04;
    public static final EnumC53260Ngy A05;
    public static final EnumC53260Ngy A06;
    public static final EnumC53260Ngy A07;
    public static final EnumC53260Ngy A08;
    public static final EnumC53260Ngy A09;
    public static final EnumC53260Ngy A0A;
    public static final EnumC53260Ngy A0B;
    public static final EnumC53260Ngy A0C;
    public static final EnumC53260Ngy A0D;
    public static final EnumC53260Ngy A0E;
    public final EnumC53231NgT A00;
    public final OTY A01;

    static {
        EnumC53231NgT enumC53231NgT = EnumC53231NgT.A03;
        OTY oty = OTY.A03;
        EnumC53260Ngy enumC53260Ngy = new EnumC53260Ngy(enumC53231NgT, oty, "EVENT_STICKER", 0);
        A06 = enumC53260Ngy;
        EnumC53231NgT enumC53231NgT2 = EnumC53231NgT.A04;
        EnumC53260Ngy enumC53260Ngy2 = new EnumC53260Ngy(enumC53231NgT2, oty, "EVENT_ON_PROFILE", 1);
        A05 = enumC53260Ngy2;
        EnumC53260Ngy enumC53260Ngy3 = new EnumC53260Ngy(enumC53231NgT2, oty, "EVENT_BOTTOM_SHEET", 2);
        A04 = enumC53260Ngy3;
        EnumC53260Ngy enumC53260Ngy4 = new EnumC53260Ngy(enumC53231NgT, oty, "FEED_POST_RE_SHARE_STICKER", 3);
        A08 = enumC53260Ngy4;
        EnumC53231NgT enumC53231NgT3 = EnumC53231NgT.A05;
        EnumC53260Ngy enumC53260Ngy5 = new EnumC53260Ngy(enumC53231NgT3, oty, "FEED_UAS_PILL", 4);
        A09 = enumC53260Ngy5;
        EnumC53260Ngy enumC53260Ngy6 = new EnumC53260Ngy(enumC53231NgT2, oty, "FEED_CTA_BAR_STATIC", 5);
        A07 = enumC53260Ngy6;
        EnumC53260Ngy enumC53260Ngy7 = new EnumC53260Ngy(enumC53231NgT, oty, "IAB_FOOTER", 6);
        A0A = enumC53260Ngy7;
        EnumC53260Ngy enumC53260Ngy8 = new EnumC53260Ngy(enumC53231NgT3, oty, "REELS_ATTRIBUTE_PILL", 7);
        A0E = enumC53260Ngy8;
        EnumC53260Ngy enumC53260Ngy9 = new EnumC53260Ngy(EnumC53231NgT.A06, oty, "LINK_STICKER", 8);
        A0B = enumC53260Ngy9;
        EnumC53260Ngy enumC53260Ngy10 = new EnumC53260Ngy(EnumC53231NgT.A07, OTY.A02, "ONE_LINE_CTA", 9);
        A0C = enumC53260Ngy10;
        EnumC53260Ngy enumC53260Ngy11 = new EnumC53260Ngy(enumC53231NgT3, oty, "PROFILE_BANNER", 10);
        A0D = enumC53260Ngy11;
        EnumC53260Ngy[] enumC53260NgyArr = {enumC53260Ngy, enumC53260Ngy2, enumC53260Ngy3, enumC53260Ngy4, enumC53260Ngy5, enumC53260Ngy6, enumC53260Ngy7, enumC53260Ngy8, enumC53260Ngy9, enumC53260Ngy10, enumC53260Ngy11};
        A03 = enumC53260NgyArr;
        A02 = AbstractC12190kN.A00(enumC53260NgyArr);
    }

    public static EnumC53260Ngy valueOf(String str) {
        return (EnumC53260Ngy) Enum.valueOf(EnumC53260Ngy.class, str);
    }

    public static EnumC53260Ngy[] values() {
        return (EnumC53260Ngy[]) A03.clone();
    }

    public EnumC53260Ngy(EnumC53231NgT enumC53231NgT, OTY oty, String str, int i) {
        this.A00 = enumC53231NgT;
        this.A01 = oty;
    }
}
