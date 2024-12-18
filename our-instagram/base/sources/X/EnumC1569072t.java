package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.72t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1569072t {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC1569072t[] A04;
    public static final EnumC1569072t A05;
    public static final EnumC1569072t A06;
    public static final EnumC1569072t A07;
    public static final EnumC1569072t A08;
    public static final EnumC1569072t A09;
    public static final EnumC1569072t A0A;
    public static final EnumC1569072t A0B;
    public static final EnumC1569072t A0C;
    public static final EnumC1569072t A0D;
    public static final EnumC1569072t A0E;
    public static final EnumC1569072t A0F;
    public static final EnumC1569072t A0G;
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    static {
        Integer num = C05F.A00;
        EnumC1569072t enumC1569072t = new EnumC1569072t(num, num, num, "LIVE", 0);
        A05 = enumC1569072t;
        Integer num2 = C05F.A01;
        Integer num3 = C05F.A0Y;
        EnumC1569072t enumC1569072t2 = new EnumC1569072t(num2, num2, num3, "UNSEEN_STORY", 1);
        A0F = enumC1569072t2;
        EnumC1569072t enumC1569072t3 = new EnumC1569072t(num2, num2, num2, "UNSEEN_STORY_WITH_NEW_BADGE", 2);
        A0G = enumC1569072t3;
        Integer num4 = C05F.A0C;
        EnumC1569072t enumC1569072t4 = new EnumC1569072t(num2, num4, num3, "UNSEEN_CLOSE_FRIENDS_STORY", 3);
        A0B = enumC1569072t4;
        EnumC1569072t enumC1569072t5 = new EnumC1569072t(num2, num4, num2, "UNSEEN_CLOSE_FRIENDS_STORY_WITH_NEW_BADGE", 4);
        A0C = enumC1569072t5;
        Integer num5 = C05F.A0N;
        EnumC1569072t enumC1569072t6 = new EnumC1569072t(num2, num5, num3, "UNSEEN_PRIDE_STORY", 5);
        A0D = enumC1569072t6;
        EnumC1569072t enumC1569072t7 = new EnumC1569072t(num2, num5, num2, "UNSEEN_PRIDE_STORY_WITH_NEW_BADGE", 6);
        A0E = enumC1569072t7;
        EnumC1569072t enumC1569072t8 = new EnumC1569072t(num2, num3, num3, "SEEN_STORY", 7);
        A09 = enumC1569072t8;
        EnumC1569072t enumC1569072t9 = new EnumC1569072t(num2, num3, num2, "SEEN_STORY_WITH_NEW_BADGE", 8);
        A0A = enumC1569072t9;
        Integer num6 = C05F.A0j;
        EnumC1569072t enumC1569072t10 = new EnumC1569072t(num2, num6, num3, "NO_REELS", 9);
        A06 = enumC1569072t10;
        EnumC1569072t enumC1569072t11 = new EnumC1569072t(num2, num6, num2, "NO_REELS_WITH_NEW_BADGE", 10);
        A07 = enumC1569072t11;
        EnumC1569072t enumC1569072t12 = new EnumC1569072t(num2, num6, num4, "NO_REELS_WITH_PROFILE_PIC_CREATION_NUDGE_OVERLAY", 11);
        A08 = enumC1569072t12;
        EnumC1569072t[] enumC1569072tArr = {enumC1569072t, enumC1569072t2, enumC1569072t3, enumC1569072t4, enumC1569072t5, enumC1569072t6, enumC1569072t7, enumC1569072t8, enumC1569072t9, enumC1569072t10, enumC1569072t11, enumC1569072t12, new EnumC1569072t(num2, num6, num5, "NO_REELS_WITH_PROFILE_PIC_CREATION_NUDGE_BADGE", 12)};
        A04 = enumC1569072tArr;
        A03 = AbstractC12190kN.A00(enumC1569072tArr);
    }

    public static EnumC1569072t valueOf(String str) {
        return (EnumC1569072t) Enum.valueOf(EnumC1569072t.class, str);
    }

    public static EnumC1569072t[] values() {
        return (EnumC1569072t[]) A04.clone();
    }

    public final float A00() {
        int intValue = this.A02.intValue();
        if (intValue != 1) {
            if (intValue != 0 && intValue != 2) {
                throw new RuntimeException();
            }
            return 0.625f;
        }
        return 1.0f;
    }

    public EnumC1569072t(Integer num, Integer num2, Integer num3, String str, int i) {
        this.A02 = num;
        this.A01 = num2;
        this.A00 = num3;
    }
}
