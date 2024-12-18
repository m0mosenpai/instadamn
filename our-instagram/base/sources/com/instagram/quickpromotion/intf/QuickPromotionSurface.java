package com.instagram.quickpromotion.intf;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C55042g4;
import X.EnumC55032g3;
import X.EnumC55052g5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class QuickPromotionSurface {
    public static final Map A02;
    public static final Map A03;
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ QuickPromotionSurface[] A05;
    public static final QuickPromotionSurface A06;
    public static final QuickPromotionSurface A07;
    public static final QuickPromotionSurface A08;
    public static final QuickPromotionSurface A09;
    public static final QuickPromotionSurface A0A;
    public static final QuickPromotionSurface A0B;
    public static final QuickPromotionSurface A0C;
    public static final QuickPromotionSurface A0D;
    public static final QuickPromotionSurface A0E;
    public static final QuickPromotionSurface A0F;
    public static final QuickPromotionSurface A0G;
    public static final QuickPromotionSurface A0H;
    public static final QuickPromotionSurface A0I;
    public static final QuickPromotionSurface A0J;
    public final int A00;
    public final EnumC55052g5 A01;

    static {
        EnumC55032g3 enumC55032g3 = EnumC55032g3.A03;
        C55042g4.A00(enumC55032g3);
        A0C = new QuickPromotionSurface(EnumC55052g5.A04, "MEGAPHONE", 0, 4715);
        EnumC55032g3 enumC55032g32 = EnumC55032g3.A04;
        C55042g4.A00(enumC55032g32);
        A0H = new QuickPromotionSurface(EnumC55052g5.A0E, "TOOLTIP", 1, 5858);
        C55042g4.A00(enumC55032g3);
        A0A = new QuickPromotionSurface(EnumC55052g5.A08, "INTERSTITIAL", 2, 5734);
        C55042g4.A00(enumC55032g32);
        A0G = new QuickPromotionSurface(EnumC55052g5.A0D, "STORIES_TRAY", 3, 6319);
        C55042g4.A00(enumC55032g32);
        A0D = new QuickPromotionSurface(EnumC55052g5.A0A, "MESSAGE_FOOTER", 4, 8034);
        C55042g4.A00(enumC55032g32);
        A09 = new QuickPromotionSurface(EnumC55052g5.A07, "FLOATING_BANNER", 5, 8972);
        C55042g4.A00(enumC55032g32);
        A0F = new QuickPromotionSurface(EnumC55052g5.A0C, "RTC_PEEK", 6, 9643);
        C55042g4.A00(enumC55032g32);
        A0I = new QuickPromotionSurface(EnumC55052g5.A06, "TWO_BY_TWO_TILE", 7, 9775);
        C55042g4.A00(enumC55032g3);
        A0E = new QuickPromotionSurface(EnumC55052g5.A0B, "REELS_MIDCARD", 8, 10671);
        C55042g4.A00(enumC55032g32);
        A08 = new QuickPromotionSurface(EnumC55052g5.A05, "BOTTOMSHEET", 9, 11383);
        C55042g4.A00(enumC55032g32);
        A0B = new QuickPromotionSurface(EnumC55052g5.A09, "LOGIN_INTERSTITIAL", 10, 11483);
        C55042g4.A00(enumC55032g3);
        A07 = new QuickPromotionSurface(EnumC55052g5.A02, "BARCELONA_MEGAPHONE", 11, 11451);
        C55042g4.A00(enumC55032g32);
        A06 = new QuickPromotionSurface(EnumC55052g5.A03, "BARCELONA_INTERSTITIAL", 12, 12175);
        C55042g4.A00(enumC55032g32);
        QuickPromotionSurface quickPromotionSurface = new QuickPromotionSurface(EnumC55052g5.A0F, "UNKNOWN", 13, 0);
        A0J = quickPromotionSurface;
        QuickPromotionSurface[] quickPromotionSurfaceArr = {A0C, A0H, A0A, A0G, A0D, A09, A0F, A0I, A0E, A08, A0B, A07, A06, quickPromotionSurface};
        A05 = quickPromotionSurfaceArr;
        A04 = AbstractC12190kN.A00(quickPromotionSurfaceArr);
        QuickPromotionSurface[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (QuickPromotionSurface quickPromotionSurface2 : values) {
            linkedHashMap.put(Integer.valueOf(quickPromotionSurface2.A00), quickPromotionSurface2);
        }
        A02 = linkedHashMap;
        QuickPromotionSurface[] values2 = values();
        int A0L2 = AbstractC16850sd.A0L(values2.length);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (QuickPromotionSurface quickPromotionSurface3 : values2) {
            linkedHashMap2.put(quickPromotionSurface3.A01, quickPromotionSurface3);
        }
        A03 = linkedHashMap2;
    }

    public static QuickPromotionSurface valueOf(String str) {
        return (QuickPromotionSurface) Enum.valueOf(QuickPromotionSurface.class, str);
    }

    public static QuickPromotionSurface[] values() {
        return (QuickPromotionSurface[]) A05.clone();
    }

    public QuickPromotionSurface(EnumC55052g5 enumC55052g5, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = enumC55052g5;
    }
}
