package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3e7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC77813e7 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC77813e7[] A01;
    public static final EnumC77813e7 A02;
    public static final EnumC77813e7 A03;
    public static final EnumC77813e7 A04;
    public static final EnumC77813e7 A05;
    public static final EnumC77813e7 A06;

    static {
        EnumC77813e7 enumC77813e7 = new EnumC77813e7("ContentPreviewNuxForExclusiveFanClubMedia", 0);
        A02 = enumC77813e7;
        EnumC77813e7 enumC77813e72 = new EnumC77813e7("PinReelsToGridNux", 1);
        A05 = enumC77813e72;
        EnumC77813e7 enumC77813e73 = new EnumC77813e7("PinToGridNux", 2);
        A06 = enumC77813e73;
        EnumC77813e7 enumC77813e74 = new EnumC77813e7("CropPhotoNux", 3);
        A03 = enumC77813e74;
        EnumC77813e7 enumC77813e75 = new EnumC77813e7("NoNux", 4);
        A04 = enumC77813e75;
        EnumC77813e7[] enumC77813e7Arr = {enumC77813e7, enumC77813e72, enumC77813e73, enumC77813e74, enumC77813e75};
        A01 = enumC77813e7Arr;
        A00 = AbstractC12190kN.A00(enumC77813e7Arr);
    }

    public static EnumC77813e7 valueOf(String str) {
        return (EnumC77813e7) Enum.valueOf(EnumC77813e7.class, str);
    }

    public static EnumC77813e7[] values() {
        return (EnumC77813e7[]) A01.clone();
    }

    public EnumC77813e7(String str, int i) {
    }
}
