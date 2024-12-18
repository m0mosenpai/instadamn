package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Hd5 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ Hd5[] A01;
    public static final Hd5 A02;
    public static final Hd5 A03;

    static {
        Hd5 hd5 = new Hd5("SAVE", 0);
        A02 = hd5;
        Hd5 hd52 = new Hd5("SHARE", 1);
        A03 = hd52;
        Hd5[] hd5Arr = {hd5, hd52, new Hd5("OPTIONS", 2)};
        A01 = hd5Arr;
        A00 = AbstractC12190kN.A00(hd5Arr);
    }

    public static Hd5 valueOf(String str) {
        return (Hd5) Enum.valueOf(Hd5.class, str);
    }

    public static Hd5[] values() {
        return (Hd5[]) A01.clone();
    }

    public Hd5(String str, int i) {
    }
}
