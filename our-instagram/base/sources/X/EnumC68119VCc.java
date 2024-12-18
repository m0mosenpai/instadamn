package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68119VCc {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68119VCc[] A01;
    public static final EnumC68119VCc A02;
    public static final EnumC68119VCc A03;

    static {
        EnumC68119VCc enumC68119VCc = new EnumC68119VCc("CARDS", 0);
        A02 = enumC68119VCc;
        EnumC68119VCc enumC68119VCc2 = new EnumC68119VCc("PAYPAL_OTC", 1);
        A03 = enumC68119VCc2;
        EnumC68119VCc[] enumC68119VCcArr = {enumC68119VCc, enumC68119VCc2, new EnumC68119VCc("PAYPAL_BA", 2)};
        A01 = enumC68119VCcArr;
        A00 = AbstractC12190kN.A00(enumC68119VCcArr);
    }

    public static EnumC68119VCc valueOf(String str) {
        return (EnumC68119VCc) Enum.valueOf(EnumC68119VCc.class, str);
    }

    public static EnumC68119VCc[] values() {
        return (EnumC68119VCc[]) A01.clone();
    }

    public EnumC68119VCc(String str, int i) {
    }
}
