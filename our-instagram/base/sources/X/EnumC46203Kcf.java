package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46203Kcf {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46203Kcf[] A02;
    public static final EnumC46203Kcf A03;
    public static final EnumC46203Kcf A04;
    public static final EnumC46203Kcf A05;
    public static final EnumC46203Kcf A06;
    public static final EnumC46203Kcf A07;
    public static final EnumC46203Kcf A08;
    public static final EnumC46203Kcf A09;
    public final java.util.Set A00;

    static {
        EnumC46162Kc0 enumC46162Kc0 = EnumC46162Kc0.A03;
        EnumC46162Kc0 enumC46162Kc02 = EnumC46162Kc0.A04;
        EnumC46162Kc0 enumC46162Kc03 = EnumC46162Kc0.A02;
        EnumC46162Kc0 enumC46162Kc04 = EnumC46162Kc0.A05;
        A09 = new EnumC46203Kcf("STORY", AbstractC16830sb.A07(enumC46162Kc0, enumC46162Kc02, enumC46162Kc03, enumC46162Kc04), 0);
        A08 = new EnumC46203Kcf("REEL", AbstractC16830sb.A07(enumC46162Kc02, enumC46162Kc03, enumC46162Kc04), 1);
        A06 = new EnumC46203Kcf("POST", AbstractC16830sb.A07(enumC46162Kc02, enumC46162Kc04), 2);
        A07 = new EnumC46203Kcf("PROFILE", AbstractC43592JPx.A16(enumC46162Kc02), 3);
        A04 = new EnumC46203Kcf("LOCATION", AbstractC43592JPx.A16(enumC46162Kc02), 4);
        A03 = new EnumC46203Kcf("AR_EFFECT", AbstractC43592JPx.A16(enumC46162Kc02), 5);
        EnumC46203Kcf enumC46203Kcf = new EnumC46203Kcf("NOTE", AbstractC43592JPx.A16(enumC46162Kc0), 6);
        A05 = enumC46203Kcf;
        EnumC46203Kcf[] enumC46203KcfArr = {A09, A08, A06, A07, A04, A03, enumC46203Kcf};
        A02 = enumC46203KcfArr;
        A01 = AbstractC12190kN.A00(enumC46203KcfArr);
    }

    public static EnumC46203Kcf valueOf(String str) {
        return (EnumC46203Kcf) Enum.valueOf(EnumC46203Kcf.class, str);
    }

    public static EnumC46203Kcf[] values() {
        return (EnumC46203Kcf[]) A02.clone();
    }

    public EnumC46203Kcf(String str, java.util.Set set, int i) {
        this.A00 = set;
    }
}
