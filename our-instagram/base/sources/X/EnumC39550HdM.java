package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39550HdM {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39550HdM[] A01;
    public static final EnumC39550HdM A02;
    public static final EnumC39550HdM A03;
    public static final EnumC39550HdM A04;
    public static final EnumC39550HdM A05;
    public static final EnumC39550HdM A06;
    public static final EnumC39550HdM A07;

    static {
        EnumC39550HdM enumC39550HdM = new EnumC39550HdM("REMIND_ME", 0);
        A05 = enumC39550HdM;
        EnumC39550HdM enumC39550HdM2 = new EnumC39550HdM("REMIND_ME_PENDING", 1);
        A06 = enumC39550HdM2;
        EnumC39550HdM enumC39550HdM3 = new EnumC39550HdM("VIEW_IN_UPCOMING_EVENTS", 2);
        A07 = enumC39550HdM3;
        EnumC39550HdM enumC39550HdM4 = new EnumC39550HdM("OFFSITE_LINK", 3);
        A03 = enumC39550HdM4;
        EnumC39550HdM enumC39550HdM5 = new EnumC39550HdM("PERSISTENT_OFFSITE_LINK", 4);
        A04 = enumC39550HdM5;
        EnumC39550HdM enumC39550HdM6 = new EnumC39550HdM("NO_CTA", 5);
        A02 = enumC39550HdM6;
        EnumC39550HdM[] enumC39550HdMArr = {enumC39550HdM, enumC39550HdM2, enumC39550HdM3, enumC39550HdM4, enumC39550HdM5, enumC39550HdM6};
        A01 = enumC39550HdMArr;
        A00 = AbstractC12190kN.A00(enumC39550HdMArr);
    }

    public static EnumC39550HdM valueOf(String str) {
        return (EnumC39550HdM) Enum.valueOf(EnumC39550HdM.class, str);
    }

    public static EnumC39550HdM[] values() {
        return (EnumC39550HdM[]) A01.clone();
    }

    public EnumC39550HdM(String str, int i) {
    }
}
