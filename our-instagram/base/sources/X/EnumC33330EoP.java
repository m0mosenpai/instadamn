package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33330EoP {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33330EoP[] A01;
    public static final EnumC33330EoP A02;
    public static final EnumC33330EoP A03;

    static {
        EnumC33330EoP enumC33330EoP = new EnumC33330EoP("Social", 0);
        A03 = enumC33330EoP;
        EnumC33330EoP enumC33330EoP2 = new EnumC33330EoP("Broadcast", 1);
        A02 = enumC33330EoP2;
        EnumC33330EoP[] enumC33330EoPArr = {enumC33330EoP, enumC33330EoP2};
        A01 = enumC33330EoPArr;
        A00 = AbstractC12190kN.A00(enumC33330EoPArr);
    }

    public static EnumC33330EoP valueOf(String str) {
        return (EnumC33330EoP) Enum.valueOf(EnumC33330EoP.class, str);
    }

    public static EnumC33330EoP[] values() {
        return (EnumC33330EoP[]) A01.clone();
    }

    public EnumC33330EoP(String str, int i) {
    }
}
