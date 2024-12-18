package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53119NeW {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53119NeW[] A01;
    public static final EnumC53119NeW A02;
    public static final EnumC53119NeW A03;

    static {
        EnumC53119NeW enumC53119NeW = new EnumC53119NeW("PICK_COVER_PHOTO", 0);
        A02 = enumC53119NeW;
        EnumC53119NeW enumC53119NeW2 = new EnumC53119NeW("PICK_UPLOAD_VIDEO", 1);
        A03 = enumC53119NeW2;
        EnumC53119NeW[] enumC53119NeWArr = {enumC53119NeW, enumC53119NeW2};
        A01 = enumC53119NeWArr;
        A00 = AbstractC12190kN.A00(enumC53119NeWArr);
    }

    public static EnumC53119NeW valueOf(String str) {
        return (EnumC53119NeW) Enum.valueOf(EnumC53119NeW.class, str);
    }

    public static EnumC53119NeW[] values() {
        return (EnumC53119NeW[]) A01.clone();
    }

    public EnumC53119NeW(String str, int i) {
    }
}
