package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7G {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7G[] A01;
    public static final C7G A02;
    public static final C7G A03;
    public static final C7G A04;
    public static final C7G A05;
    public static final C7G A06;
    public static final C7G A07;
    public static final C7G A08;
    public static final C7G A09;
    public static final C7G A0A;
    public static final C7G A0B;
    public static final C7G A0C;
    public static final C7G A0D;
    public static final C7G A0E;
    public static final C7G A0F;
    public static final C7G A0G;
    public static final C7G A0H;

    static {
        C7G c7g = new C7G("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A0G = c7g;
        C7G c7g2 = new C7G("ANIMATE", 1);
        A02 = c7g2;
        C7G c7g3 = new C7G("BACKDROP", 2);
        A03 = c7g3;
        C7G c7g4 = new C7G("EDIT", 3);
        A04 = c7g4;
        C7G c7g5 = new C7G("EDIT_FLASH", 4);
        A05 = c7g5;
        C7G c7g6 = new C7G("FEELS", 5);
        A06 = c7g6;
        C7G c7g7 = new C7G("FLASH", 6);
        A07 = c7g7;
        C7G c7g8 = new C7G("FLASH_TO_BASE", 7);
        A08 = c7g8;
        C7G c7g9 = new C7G("IMAGINE", 8);
        A09 = c7g9;
        C7G c7g10 = new C7G("MEMU", 9);
        A0A = c7g10;
        C7G c7g11 = new C7G("REIMAGINE", 10);
        A0C = c7g11;
        C7G c7g12 = new C7G("RESTYLE", 11);
        A0D = c7g12;
        C7G c7g13 = new C7G("SAM", 12);
        A0E = c7g13;
        C7G c7g14 = new C7G("STICKERS", 13);
        A0F = c7g14;
        C7G c7g15 = new C7G("VIDEO", 14);
        A0H = c7g15;
        C7G c7g16 = new C7G("MEMU_AND_IMAGINE", 15);
        A0B = c7g16;
        C7G[] c7gArr = {c7g, c7g2, c7g3, c7g4, c7g5, c7g6, c7g7, c7g8, c7g9, c7g10, c7g11, c7g12, c7g13, c7g14, c7g15, c7g16};
        A01 = c7gArr;
        A00 = AbstractC12190kN.A00(c7gArr);
    }

    public static C7G valueOf(String str) {
        return (C7G) Enum.valueOf(C7G.class, str);
    }

    public static C7G[] values() {
        return (C7G[]) A01.clone();
    }

    public C7G(String str, int i) {
    }
}
