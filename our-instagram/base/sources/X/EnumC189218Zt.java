package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC189218Zt {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC189218Zt[] A01;
    public static final EnumC189218Zt A02;
    public static final EnumC189218Zt A03;
    public static final EnumC189218Zt A04;
    public static final EnumC189218Zt A05;
    public static final EnumC189218Zt A06;

    static {
        EnumC189218Zt enumC189218Zt = new EnumC189218Zt("EMPTY", 0);
        A02 = enumC189218Zt;
        EnumC189218Zt enumC189218Zt2 = new EnumC189218Zt("PREPARING", 1);
        A06 = enumC189218Zt2;
        EnumC189218Zt enumC189218Zt3 = new EnumC189218Zt("PLAYING", 2);
        A05 = enumC189218Zt3;
        EnumC189218Zt enumC189218Zt4 = new EnumC189218Zt("PAUSED", 3);
        A04 = enumC189218Zt4;
        EnumC189218Zt enumC189218Zt5 = new EnumC189218Zt("LOADING", 4);
        A03 = enumC189218Zt5;
        EnumC189218Zt[] enumC189218ZtArr = {enumC189218Zt, enumC189218Zt2, enumC189218Zt3, enumC189218Zt4, enumC189218Zt5};
        A01 = enumC189218ZtArr;
        A00 = AbstractC12190kN.A00(enumC189218ZtArr);
    }

    public static EnumC189218Zt valueOf(String str) {
        return (EnumC189218Zt) Enum.valueOf(EnumC189218Zt.class, str);
    }

    public static EnumC189218Zt[] values() {
        return (EnumC189218Zt[]) A01.clone();
    }

    public EnumC189218Zt(String str, int i) {
    }
}
