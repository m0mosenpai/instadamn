package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46149Kbn {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46149Kbn[] A01;
    public static final EnumC46149Kbn A02;
    public static final EnumC46149Kbn A03;
    public static final EnumC46149Kbn A04;

    static {
        EnumC46149Kbn enumC46149Kbn = new EnumC46149Kbn("BOTTOM_SHEET", 0);
        A02 = enumC46149Kbn;
        EnumC46149Kbn enumC46149Kbn2 = new EnumC46149Kbn("FULLSCREEN_MODAL", 1);
        A04 = enumC46149Kbn2;
        EnumC46149Kbn enumC46149Kbn3 = new EnumC46149Kbn("DIALOG", 2);
        A03 = enumC46149Kbn3;
        EnumC46149Kbn[] enumC46149KbnArr = {enumC46149Kbn, enumC46149Kbn2, enumC46149Kbn3};
        A01 = enumC46149KbnArr;
        A00 = AbstractC12190kN.A00(enumC46149KbnArr);
    }

    public static EnumC46149Kbn valueOf(String str) {
        return (EnumC46149Kbn) Enum.valueOf(EnumC46149Kbn.class, str);
    }

    public static EnumC46149Kbn[] values() {
        return (EnumC46149Kbn[]) A01.clone();
    }

    public EnumC46149Kbn(String str, int i) {
    }
}
