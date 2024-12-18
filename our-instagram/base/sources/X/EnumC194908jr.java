package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8jr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC194908jr {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC194908jr[] A02;
    public static final EnumC194908jr A03;
    public static final EnumC194908jr A04;
    public static final EnumC194908jr A05;
    public static final EnumC194908jr A06;
    public static final EnumC194908jr A07;
    public static final EnumC194908jr A08;
    public static final EnumC194908jr A09;
    public static final EnumC194908jr A0A;
    public static final EnumC194908jr A0B;
    public static final EnumC194908jr A0C;
    public static final EnumC194908jr A0D;
    public static final EnumC194908jr A0E;
    public static final EnumC194908jr A0F;
    public final String A00;

    static {
        EnumC194908jr enumC194908jr = new EnumC194908jr("CLASSIC", 0, "word_reveal");
        A04 = enumC194908jr;
        EnumC194908jr enumC194908jr2 = new EnumC194908jr("TYPEWRITER", 1, "thick_cursor");
        A0D = enumC194908jr2;
        EnumC194908jr enumC194908jr3 = new EnumC194908jr("ROTATING", 2, "character_wobble");
        A0A = enumC194908jr3;
        EnumC194908jr enumC194908jr4 = new EnumC194908jr("STRONG", 3, "vertical_bounce");
        A0C = enumC194908jr4;
        EnumC194908jr enumC194908jr5 = new EnumC194908jr("ELEGANT", 4, "reveal");
        A05 = enumC194908jr5;
        EnumC194908jr enumC194908jr6 = new EnumC194908jr("STRETCH_SHRINK", 5, "stretch_shrink");
        A0B = enumC194908jr6;
        EnumC194908jr enumC194908jr7 = new EnumC194908jr("LITERATURE", 6, "thin_cursor");
        A08 = enumC194908jr7;
        EnumC194908jr enumC194908jr8 = new EnumC194908jr("BOUNCE_IN", 7, "bounce_in");
        A03 = enumC194908jr8;
        EnumC194908jr enumC194908jr9 = new EnumC194908jr("FLASHING", 8, "flashing");
        A06 = enumC194908jr9;
        EnumC194908jr enumC194908jr10 = new EnumC194908jr("TYPEWRITER_NO_CURSOR", 9, "no_cursor");
        A0E = enumC194908jr10;
        EnumC194908jr enumC194908jr11 = new EnumC194908jr("TYPEWRITER_NO_CURSOR_V2", 10, "typewriter_no_cursor_v2");
        A0F = enumC194908jr11;
        EnumC194908jr enumC194908jr12 = new EnumC194908jr("POP", 11, "pop");
        A09 = enumC194908jr12;
        EnumC194908jr enumC194908jr13 = new EnumC194908jr("JUMP", 12, "jump");
        A07 = enumC194908jr13;
        EnumC194908jr[] enumC194908jrArr = {enumC194908jr, enumC194908jr2, enumC194908jr3, enumC194908jr4, enumC194908jr5, enumC194908jr6, enumC194908jr7, enumC194908jr8, enumC194908jr9, enumC194908jr10, enumC194908jr11, enumC194908jr12, enumC194908jr13};
        A02 = enumC194908jrArr;
        A01 = AbstractC12190kN.A00(enumC194908jrArr);
    }

    public static EnumC194908jr valueOf(String str) {
        return (EnumC194908jr) Enum.valueOf(EnumC194908jr.class, str);
    }

    public static EnumC194908jr[] values() {
        return (EnumC194908jr[]) A02.clone();
    }

    public EnumC194908jr(String str, int i, String str2) {
        this.A00 = str2;
    }
}
