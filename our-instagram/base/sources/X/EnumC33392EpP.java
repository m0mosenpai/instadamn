package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33392EpP {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33392EpP[] A02;
    public static final EnumC33392EpP A03;
    public static final EnumC33392EpP A04;
    public static final EnumC33392EpP A05;
    public static final EnumC33392EpP A06;
    public final EnumC33485ErK A00;

    static {
        EnumC33392EpP enumC33392EpP = new EnumC33392EpP(EnumC33485ErK.NULLSTATE, "NULLSTATE", 0);
        A04 = enumC33392EpP;
        EnumC33392EpP enumC33392EpP2 = new EnumC33392EpP(EnumC33485ErK.PERSISTENT_ENTRY, "PERSISTENT_ENTRY", 1);
        A05 = enumC33392EpP2;
        EnumC33392EpP enumC33392EpP3 = new EnumC33392EpP(EnumC33485ErK.SERVER, "SERVER", 2);
        A06 = enumC33392EpP3;
        EnumC33392EpP enumC33392EpP4 = new EnumC33392EpP(EnumC33485ErK.IG_SHOPPING_PDP_POSTCLICK, "IG_SHOPPING_PDP_POSTCLICK", 3);
        A03 = enumC33392EpP4;
        EnumC33392EpP[] enumC33392EpPArr = {enumC33392EpP, enumC33392EpP2, enumC33392EpP3, enumC33392EpP4};
        A02 = enumC33392EpPArr;
        A01 = AbstractC12190kN.A00(enumC33392EpPArr);
    }

    public static EnumC33392EpP valueOf(String str) {
        return (EnumC33392EpP) Enum.valueOf(EnumC33392EpP.class, str);
    }

    public static EnumC33392EpP[] values() {
        return (EnumC33392EpP[]) A02.clone();
    }

    public EnumC33392EpP(EnumC33485ErK enumC33485ErK, String str, int i) {
        this.A00 = enumC33485ErK;
    }
}
