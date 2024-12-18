package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC197858ow {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC197858ow[] A01;
    public static final EnumC197858ow A02;
    public static final EnumC197858ow A03;
    public static final EnumC197858ow A04;
    public static final EnumC197858ow A05;
    public static final EnumC197858ow A06;
    public static final EnumC197858ow A07;

    static {
        EnumC197858ow enumC197858ow = new EnumC197858ow("STORY", 0);
        A07 = enumC197858ow;
        EnumC197858ow enumC197858ow2 = new EnumC197858ow("FEED", 1);
        A03 = enumC197858ow2;
        EnumC197858ow enumC197858ow3 = new EnumC197858ow("REEL_CCP", 2);
        A05 = enumC197858ow3;
        EnumC197858ow enumC197858ow4 = new EnumC197858ow("REEL_XAR", 3);
        A06 = enumC197858ow4;
        EnumC197858ow enumC197858ow5 = new EnumC197858ow("CHANNEL", 4);
        A02 = enumC197858ow5;
        EnumC197858ow enumC197858ow6 = new EnumC197858ow("FEED_THREADS", 5);
        A04 = enumC197858ow6;
        EnumC197858ow[] enumC197858owArr = {enumC197858ow, enumC197858ow2, enumC197858ow3, enumC197858ow4, enumC197858ow5, enumC197858ow6};
        A01 = enumC197858owArr;
        A00 = AbstractC12190kN.A00(enumC197858owArr);
    }

    public static EnumC197858ow valueOf(String str) {
        return (EnumC197858ow) Enum.valueOf(EnumC197858ow.class, str);
    }

    public static EnumC197858ow[] values() {
        return (EnumC197858ow[]) A01.clone();
    }

    public EnumC197858ow(String str, int i) {
    }
}
