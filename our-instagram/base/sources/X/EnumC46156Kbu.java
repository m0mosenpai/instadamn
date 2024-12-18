package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46156Kbu {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46156Kbu[] A01;
    public static final EnumC46156Kbu A02;
    public static final EnumC46156Kbu A03;
    public static final EnumC46156Kbu A04;
    public static final EnumC46156Kbu A05;

    static {
        EnumC46156Kbu enumC46156Kbu = new EnumC46156Kbu("GALLERY_TRENDING", 0);
        A04 = enumC46156Kbu;
        EnumC46156Kbu enumC46156Kbu2 = new EnumC46156Kbu("GALLERY_SAVED", 1);
        A03 = enumC46156Kbu2;
        EnumC46156Kbu enumC46156Kbu3 = new EnumC46156Kbu("STICKER_TRAY", 2);
        A05 = enumC46156Kbu3;
        EnumC46156Kbu enumC46156Kbu4 = new EnumC46156Kbu("DIRECT_STICKER_TRAY", 3);
        A02 = enumC46156Kbu4;
        EnumC46156Kbu[] enumC46156KbuArr = {enumC46156Kbu, enumC46156Kbu2, enumC46156Kbu3, enumC46156Kbu4};
        A01 = enumC46156KbuArr;
        A00 = AbstractC12190kN.A00(enumC46156KbuArr);
    }

    public static EnumC46156Kbu valueOf(String str) {
        return (EnumC46156Kbu) Enum.valueOf(EnumC46156Kbu.class, str);
    }

    public static EnumC46156Kbu[] values() {
        return (EnumC46156Kbu[]) A01.clone();
    }

    public EnumC46156Kbu(String str, int i) {
    }
}
