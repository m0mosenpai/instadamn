package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Gj7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC37732Gj7 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC37732Gj7[] A01;
    public static final EnumC37732Gj7 A02;
    public static final EnumC37732Gj7 A03;
    public static final EnumC37732Gj7 A04;
    public static final EnumC37732Gj7 A05;
    public static final EnumC37732Gj7 A06;

    static {
        EnumC37732Gj7 enumC37732Gj7 = new EnumC37732Gj7("CLOSED", 0);
        A03 = enumC37732Gj7;
        EnumC37732Gj7 enumC37732Gj72 = new EnumC37732Gj7("COLLAPSED", 1);
        A04 = enumC37732Gj72;
        EnumC37732Gj7 enumC37732Gj73 = new EnumC37732Gj7("ANCHORED", 2);
        A02 = enumC37732Gj73;
        EnumC37732Gj7 enumC37732Gj74 = new EnumC37732Gj7("EXPANDED", 3);
        A05 = enumC37732Gj74;
        EnumC37732Gj7 enumC37732Gj75 = new EnumC37732Gj7("IN_TRANSITION", 4);
        A06 = enumC37732Gj75;
        EnumC37732Gj7[] enumC37732Gj7Arr = {enumC37732Gj7, enumC37732Gj72, enumC37732Gj73, enumC37732Gj74, enumC37732Gj75};
        A01 = enumC37732Gj7Arr;
        A00 = AbstractC12190kN.A00(enumC37732Gj7Arr);
    }

    public static EnumC37732Gj7 valueOf(String str) {
        return (EnumC37732Gj7) Enum.valueOf(EnumC37732Gj7.class, str);
    }

    public static EnumC37732Gj7[] values() {
        return (EnumC37732Gj7[]) A01.clone();
    }

    public EnumC37732Gj7(String str, int i) {
    }
}
