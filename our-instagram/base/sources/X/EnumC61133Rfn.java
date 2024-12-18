package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61133Rfn {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61133Rfn[] A01;
    public static final EnumC61133Rfn A02;
    public static final EnumC61133Rfn A03;
    public static final EnumC61133Rfn A04;
    public static final EnumC61133Rfn A05;
    public static final EnumC61133Rfn A06;

    static {
        EnumC61133Rfn enumC61133Rfn = new EnumC61133Rfn("EFFECT_ID", 0);
        A04 = enumC61133Rfn;
        EnumC61133Rfn enumC61133Rfn2 = new EnumC61133Rfn("USERNAME", 1);
        A06 = enumC61133Rfn2;
        EnumC61133Rfn enumC61133Rfn3 = new EnumC61133Rfn("IG_URL", 2);
        A05 = enumC61133Rfn3;
        EnumC61133Rfn enumC61133Rfn4 = new EnumC61133Rfn("ALLOWED_DOMAIN_EXTERNAL_URL", 3);
        A02 = enumC61133Rfn4;
        EnumC61133Rfn enumC61133Rfn5 = new EnumC61133Rfn("BARCELONA_URL", 4);
        A03 = enumC61133Rfn5;
        EnumC61133Rfn[] enumC61133RfnArr = {enumC61133Rfn, enumC61133Rfn2, enumC61133Rfn3, enumC61133Rfn4, enumC61133Rfn5};
        A01 = enumC61133RfnArr;
        A00 = AbstractC12190kN.A00(enumC61133RfnArr);
    }

    public static EnumC61133Rfn valueOf(String str) {
        return (EnumC61133Rfn) Enum.valueOf(EnumC61133Rfn.class, str);
    }

    public static EnumC61133Rfn[] values() {
        return (EnumC61133Rfn[]) A01.clone();
    }

    public EnumC61133Rfn(String str, int i) {
    }
}
