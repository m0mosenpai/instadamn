package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39544HdG {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39544HdG[] A01;
    public static final EnumC39544HdG A02;
    public static final EnumC39544HdG A03;
    public static final EnumC39544HdG A04;
    public static final EnumC39544HdG A05;

    static {
        EnumC39544HdG enumC39544HdG = new EnumC39544HdG("HIDDEN", 0);
        A03 = enumC39544HdG;
        EnumC39544HdG enumC39544HdG2 = new EnumC39544HdG("STARTED", 1);
        A05 = enumC39544HdG2;
        EnumC39544HdG enumC39544HdG3 = new EnumC39544HdG("PAUSED", 2);
        A04 = enumC39544HdG3;
        EnumC39544HdG enumC39544HdG4 = new EnumC39544HdG("DESTROYED", 3);
        A02 = enumC39544HdG4;
        EnumC39544HdG[] enumC39544HdGArr = {enumC39544HdG, enumC39544HdG2, enumC39544HdG3, enumC39544HdG4};
        A01 = enumC39544HdGArr;
        A00 = AbstractC12190kN.A00(enumC39544HdGArr);
    }

    public static EnumC39544HdG valueOf(String str) {
        return (EnumC39544HdG) Enum.valueOf(EnumC39544HdG.class, str);
    }

    public static EnumC39544HdG[] values() {
        return (EnumC39544HdG[]) A01.clone();
    }

    public EnumC39544HdG(String str, int i) {
    }
}
