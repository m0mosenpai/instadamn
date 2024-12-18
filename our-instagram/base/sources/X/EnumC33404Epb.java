package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33404Epb {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33404Epb[] A03;
    public static final EnumC33404Epb A04;
    public static final EnumC33404Epb A05;
    public static final EnumC33404Epb A06;
    public static final EnumC33404Epb A07;
    public static final EnumC33404Epb A08;
    public static final EnumC33404Epb A09;
    public static final EnumC33404Epb A0A;
    public final String A00;

    static {
        EnumC33404Epb enumC33404Epb = new EnumC33404Epb("PASSWORD", 0, "Password");
        A09 = enumC33404Epb;
        EnumC33404Epb enumC33404Epb2 = new EnumC33404Epb("NONCE", 1, "Nonce");
        A07 = enumC33404Epb2;
        EnumC33404Epb enumC33404Epb3 = new EnumC33404Epb("LOCALAUTH", 2, "LocalAuth");
        A06 = enumC33404Epb3;
        EnumC33404Epb enumC33404Epb4 = new EnumC33404Epb("IG_SSO", 3, "IG_SSO");
        A05 = enumC33404Epb4;
        EnumC33404Epb enumC33404Epb5 = new EnumC33404Epb("FB_SSO", 4, "FB_SSO");
        A04 = enumC33404Epb5;
        EnumC33404Epb enumC33404Epb6 = new EnumC33404Epb("OPENID", 5, "OpenID");
        A08 = enumC33404Epb6;
        EnumC33404Epb enumC33404Epb7 = new EnumC33404Epb("UNKNOWN", 6, "Unknown");
        A0A = enumC33404Epb7;
        EnumC33404Epb[] enumC33404EpbArr = {enumC33404Epb, enumC33404Epb2, enumC33404Epb3, enumC33404Epb4, enumC33404Epb5, enumC33404Epb6, enumC33404Epb7};
        A03 = enumC33404EpbArr;
        A02 = AbstractC12190kN.A00(enumC33404EpbArr);
        EnumC33404Epb[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33404Epb enumC33404Epb8 : values) {
            A18.put(enumC33404Epb8.A00, enumC33404Epb8);
        }
        A01 = A18;
    }

    public static EnumC33404Epb valueOf(String str) {
        return (EnumC33404Epb) Enum.valueOf(EnumC33404Epb.class, str);
    }

    public static EnumC33404Epb[] values() {
        return (EnumC33404Epb[]) A03.clone();
    }

    public EnumC33404Epb(String str, int i, String str2) {
        this.A00 = str2;
    }
}
