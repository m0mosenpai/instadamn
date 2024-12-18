package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kch, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46205Kch {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46205Kch[] A03;
    public static final EnumC46205Kch A04;
    public static final EnumC46205Kch A05;
    public static final EnumC46205Kch A06;
    public static final EnumC46205Kch A07;
    public static final EnumC46205Kch A08;
    public static final EnumC46205Kch A09;
    public static final EnumC46205Kch A0A;
    public static final EnumC46205Kch A0B;
    public static final EnumC46205Kch A0C;
    public static final EnumC46205Kch A0D;
    public static final EnumC46205Kch A0E;
    public static final EnumC46205Kch A0F;
    public static final EnumC46205Kch A0G;
    public final int A00;

    static {
        EnumC46205Kch enumC46205Kch = new EnumC46205Kch("UNKNOWN", 0, 0);
        A0F = enumC46205Kch;
        EnumC46205Kch enumC46205Kch2 = new EnumC46205Kch("COMPOSER_BLOCK_UNREACHABLE_USER", 1, 1);
        A05 = enumC46205Kch2;
        EnumC46205Kch enumC46205Kch3 = new EnumC46205Kch("GROUP_THREAD_WITH_NON_ADDRESSABLE_PARTICIPANT", 2, 2);
        A08 = enumC46205Kch3;
        EnumC46205Kch enumC46205Kch4 = new EnumC46205Kch("CANONICAL_THREAD_WITH_NON_ADDRESSABLE_USER", 3, 3);
        A04 = enumC46205Kch4;
        EnumC46205Kch enumC46205Kch5 = new EnumC46205Kch("MESSAGE_REQUEST", 4, 4);
        A09 = enumC46205Kch5;
        EnumC46205Kch enumC46205Kch6 = new EnumC46205Kch("DISAPPEARING_MESSAGE_PROMOTION", 5, 5);
        A06 = enumC46205Kch6;
        EnumC46205Kch enumC46205Kch7 = new EnumC46205Kch("DISAPPEARING_MESSAGE_SCREENSHOT_PROMOTION", 6, 6);
        A07 = enumC46205Kch7;
        EnumC46205Kch enumC46205Kch8 = new EnumC46205Kch("RESTRICT_COMPOSER", 7, 7);
        A0E = enumC46205Kch8;
        EnumC46205Kch enumC46205Kch9 = new EnumC46205Kch("QUICK_PROMOTION_TOP_BANNER", 8, 8);
        A0D = enumC46205Kch9;
        EnumC46205Kch enumC46205Kch10 = new EnumC46205Kch("PROACTIVE_WARNINGS", 9, 9);
        A0C = enumC46205Kch10;
        EnumC46205Kch enumC46205Kch11 = new EnumC46205Kch("MESSAGE_REQUEST_GROUP_INVITE", 10, 10);
        A0A = enumC46205Kch11;
        EnumC46205Kch enumC46205Kch12 = new EnumC46205Kch("UNSEND_NUX_BANNER", 11, 11);
        A0G = enumC46205Kch12;
        EnumC46205Kch enumC46205Kch13 = new EnumC46205Kch("ODN_CONTROL_RECEIVED", 12, 12);
        A0B = enumC46205Kch13;
        EnumC46205Kch[] enumC46205KchArr = {enumC46205Kch, enumC46205Kch2, enumC46205Kch3, enumC46205Kch4, enumC46205Kch5, enumC46205Kch6, enumC46205Kch7, enumC46205Kch8, enumC46205Kch9, enumC46205Kch10, enumC46205Kch11, enumC46205Kch12, enumC46205Kch13, new EnumC46205Kch("ODN_CONTROL_SENT", 13, 13)};
        A03 = enumC46205KchArr;
        A02 = AbstractC12190kN.A00(enumC46205KchArr);
        EnumC46205Kch[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC46205Kch enumC46205Kch14 : values) {
            AbstractC25227BEk.A1O(enumC46205Kch14, A18, enumC46205Kch14.A00);
        }
        A01 = AbstractC09990gB.A0J(A18, MKO.A00);
    }

    public static EnumC46205Kch valueOf(String str) {
        return (EnumC46205Kch) Enum.valueOf(EnumC46205Kch.class, str);
    }

    public static EnumC46205Kch[] values() {
        return (EnumC46205Kch[]) A03.clone();
    }

    public EnumC46205Kch(String str, int i, int i2) {
        this.A00 = i2;
    }
}
