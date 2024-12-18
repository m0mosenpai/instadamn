package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46182KcK {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46182KcK[] A01;
    public static final EnumC46182KcK A02;
    public static final EnumC46182KcK A03;
    public static final EnumC46182KcK A04;
    public static final EnumC46182KcK A05;
    public static final EnumC46182KcK A06;
    public static final EnumC46182KcK A07;
    public static final EnumC46182KcK A08;
    public static final EnumC46182KcK A09;

    static {
        EnumC46182KcK enumC46182KcK = new EnumC46182KcK("INITIATOR", 0);
        A04 = enumC46182KcK;
        EnumC46182KcK enumC46182KcK2 = new EnumC46182KcK("DETAILS", 1);
        A02 = enumC46182KcK2;
        EnumC46182KcK enumC46182KcK3 = new EnumC46182KcK("RANKING", 2);
        A07 = enumC46182KcK3;
        EnumC46182KcK enumC46182KcK4 = new EnumC46182KcK("FIRST", 3);
        A03 = enumC46182KcK4;
        EnumC46182KcK enumC46182KcK5 = new EnumC46182KcK("VIEWER_COUNT", 4);
        A09 = enumC46182KcK5;
        EnumC46182KcK enumC46182KcK6 = new EnumC46182KcK("MODEL_OUTPUT", 5);
        A05 = enumC46182KcK6;
        EnumC46182KcK enumC46182KcK7 = new EnumC46182KcK("SUB_EVENTS", 6);
        A08 = enumC46182KcK7;
        EnumC46182KcK enumC46182KcK8 = new EnumC46182KcK("PROFILE_PIC", 7);
        A06 = enumC46182KcK8;
        EnumC46182KcK[] enumC46182KcKArr = {enumC46182KcK, enumC46182KcK2, enumC46182KcK3, enumC46182KcK4, enumC46182KcK5, enumC46182KcK6, enumC46182KcK7, enumC46182KcK8};
        A01 = enumC46182KcKArr;
        A00 = AbstractC12190kN.A00(enumC46182KcKArr);
    }

    public static EnumC46182KcK valueOf(String str) {
        return (EnumC46182KcK) Enum.valueOf(EnumC46182KcK.class, str);
    }

    public static EnumC46182KcK[] values() {
        return (EnumC46182KcK[]) A01.clone();
    }

    public EnumC46182KcK(String str, int i) {
    }
}
