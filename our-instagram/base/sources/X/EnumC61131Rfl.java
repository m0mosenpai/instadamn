package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61131Rfl {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61131Rfl[] A01;
    public static final EnumC61131Rfl A02;
    public static final EnumC61131Rfl A03;
    public static final EnumC61131Rfl A04;
    public static final EnumC61131Rfl A05;
    public static final EnumC61131Rfl A06;

    public static EnumC61131Rfl valueOf(String str) {
        return (EnumC61131Rfl) Enum.valueOf(EnumC61131Rfl.class, str);
    }

    public static EnumC61131Rfl[] values() {
        return (EnumC61131Rfl[]) A01.clone();
    }

    static {
        EnumC61131Rfl enumC61131Rfl = new EnumC61131Rfl("LINEAR", 0);
        A05 = enumC61131Rfl;
        EnumC61131Rfl enumC61131Rfl2 = new EnumC61131Rfl("EASE_IN", 1);
        A02 = enumC61131Rfl2;
        EnumC61131Rfl enumC61131Rfl3 = new EnumC61131Rfl("EASE_OUT", 2);
        A04 = enumC61131Rfl3;
        EnumC61131Rfl enumC61131Rfl4 = new EnumC61131Rfl("EASE_IN_EASE_OUT", 3);
        A03 = enumC61131Rfl4;
        EnumC61131Rfl enumC61131Rfl5 = new EnumC61131Rfl("SPRING", 4);
        A06 = enumC61131Rfl5;
        EnumC61131Rfl[] enumC61131RflArr = {enumC61131Rfl, enumC61131Rfl2, enumC61131Rfl3, enumC61131Rfl4, enumC61131Rfl5};
        A01 = enumC61131RflArr;
        A00 = AbstractC12190kN.A00(enumC61131RflArr);
    }

    public EnumC61131Rfl(String str, int i) {
    }
}
