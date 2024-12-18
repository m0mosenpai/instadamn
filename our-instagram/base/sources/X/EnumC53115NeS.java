package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53115NeS {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53115NeS[] A01;
    public static final EnumC53115NeS A02;
    public static final EnumC53115NeS A03;

    static {
        EnumC53115NeS enumC53115NeS = new EnumC53115NeS("HIDDEN", 0);
        A03 = enumC53115NeS;
        EnumC53115NeS enumC53115NeS2 = new EnumC53115NeS("EXPANDED", 1);
        A02 = enumC53115NeS2;
        EnumC53115NeS[] enumC53115NeSArr = {enumC53115NeS, enumC53115NeS2};
        A01 = enumC53115NeSArr;
        A00 = AbstractC12190kN.A00(enumC53115NeSArr);
    }

    public static EnumC53115NeS valueOf(String str) {
        return (EnumC53115NeS) Enum.valueOf(EnumC53115NeS.class, str);
    }

    public static EnumC53115NeS[] values() {
        return (EnumC53115NeS[]) A01.clone();
    }

    public EnumC53115NeS(String str, int i) {
    }
}
