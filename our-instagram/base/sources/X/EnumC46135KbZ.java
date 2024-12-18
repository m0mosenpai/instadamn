package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KbZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46135KbZ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46135KbZ[] A01;
    public static final EnumC46135KbZ A02;
    public static final EnumC46135KbZ A03;

    static {
        EnumC46135KbZ enumC46135KbZ = new EnumC46135KbZ("ELIGIBLE_FOR_PAYOUT", 0);
        A02 = enumC46135KbZ;
        EnumC46135KbZ enumC46135KbZ2 = new EnumC46135KbZ("INELIGIBLE_FOR_PAYOUT", 1);
        A03 = enumC46135KbZ2;
        EnumC46135KbZ[] enumC46135KbZArr = {enumC46135KbZ, enumC46135KbZ2};
        A01 = enumC46135KbZArr;
        A00 = AbstractC12190kN.A00(enumC46135KbZArr);
    }

    public static EnumC46135KbZ valueOf(String str) {
        return (EnumC46135KbZ) Enum.valueOf(EnumC46135KbZ.class, str);
    }

    public static EnumC46135KbZ[] values() {
        return (EnumC46135KbZ[]) A01.clone();
    }

    public EnumC46135KbZ(String str, int i) {
    }
}
