package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39549HdL {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39549HdL[] A01;
    public static final EnumC39549HdL A02;
    public static final EnumC39549HdL A03;
    public static final EnumC39549HdL A04;
    public static final EnumC39549HdL A05;
    public static final EnumC39549HdL A06;

    static {
        EnumC39549HdL enumC39549HdL = new EnumC39549HdL("PRO_DASHBOARD_ENTRYPOINT", 0);
        A04 = enumC39549HdL;
        EnumC39549HdL enumC39549HdL2 = new EnumC39549HdL("REELS_VIEWER_ENTRYPOINT", 1);
        A05 = enumC39549HdL2;
        EnumC39549HdL enumC39549HdL3 = new EnumC39549HdL("AUDIO_PAGE", 2);
        A02 = enumC39549HdL3;
        EnumC39549HdL enumC39549HdL4 = new EnumC39549HdL("CREATOR_INSPIRATION_HUB_AUDIO_TAB", 3);
        A03 = enumC39549HdL4;
        EnumC39549HdL enumC39549HdL5 = new EnumC39549HdL("SAVED_AUDIO_PAGE", 4);
        A06 = enumC39549HdL5;
        EnumC39549HdL[] enumC39549HdLArr = {enumC39549HdL, enumC39549HdL2, enumC39549HdL3, enumC39549HdL4, enumC39549HdL5};
        A01 = enumC39549HdLArr;
        A00 = AbstractC12190kN.A00(enumC39549HdLArr);
    }

    public static EnumC39549HdL valueOf(String str) {
        return (EnumC39549HdL) Enum.valueOf(EnumC39549HdL.class, str);
    }

    public static EnumC39549HdL[] values() {
        return (EnumC39549HdL[]) A01.clone();
    }

    public EnumC39549HdL(String str, int i) {
    }
}
