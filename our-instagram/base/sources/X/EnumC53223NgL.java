package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53223NgL {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53223NgL[] A02;
    public static final EnumC53223NgL A03;
    public static final EnumC53223NgL A04;
    public static final EnumC53223NgL A05;
    public static final EnumC53223NgL A06;
    public final String A00;

    static {
        EnumC53223NgL enumC53223NgL = new EnumC53223NgL("CTD", 0, "click_to_direct");
        A04 = enumC53223NgL;
        EnumC53223NgL enumC53223NgL2 = new EnumC53223NgL("CTWA", 1, "click_to_whatsapp");
        A05 = enumC53223NgL2;
        EnumC53223NgL enumC53223NgL3 = new EnumC53223NgL("BOOK_APPOINTMENT", 2, "book_appointment");
        A03 = enumC53223NgL3;
        EnumC53223NgL enumC53223NgL4 = new EnumC53223NgL("SELL_PRODUCT", 3, "sell_product");
        A06 = enumC53223NgL4;
        EnumC53223NgL[] enumC53223NgLArr = {enumC53223NgL, enumC53223NgL2, enumC53223NgL3, enumC53223NgL4};
        A02 = enumC53223NgLArr;
        A01 = AbstractC12190kN.A00(enumC53223NgLArr);
    }

    public static EnumC53223NgL valueOf(String str) {
        return (EnumC53223NgL) Enum.valueOf(EnumC53223NgL.class, str);
    }

    public static EnumC53223NgL[] values() {
        return (EnumC53223NgL[]) A02.clone();
    }

    public EnumC53223NgL(String str, int i, String str2) {
        this.A00 = str2;
    }
}
