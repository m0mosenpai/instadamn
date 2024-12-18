package X;

import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33413Epk {
    public static final Map A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC33413Epk[] A04;
    public static final EnumC33413Epk A05;
    public static final EnumC33413Epk A06;
    public static final EnumC33413Epk A07;
    public static final EnumC33413Epk A08;
    public static final EnumC33413Epk A09;
    public final Integer A00;
    public final Integer A01;

    static {
        Integer num = C05F.A00;
        EnumC33413Epk enumC33413Epk = new EnumC33413Epk(num, null, "SWIPE_FROM_BOTTOM", 0);
        A07 = enumC33413Epk;
        Integer num2 = C05F.A0C;
        EnumC33413Epk enumC33413Epk2 = new EnumC33413Epk(num2, null, "THREAD_DETAILS_TOGGLE", 1);
        A09 = enumC33413Epk2;
        Integer num3 = C05F.A01;
        EnumC33413Epk enumC33413Epk3 = new EnumC33413Epk(num3, num, "TAP_ON_CTA", 2);
        A08 = enumC33413Epk3;
        EnumC33413Epk enumC33413Epk4 = new EnumC33413Epk(num3, num3, "DISABLED_COMPOSER", 3);
        A06 = enumC33413Epk4;
        Integer num4 = C05F.A0N;
        EnumC33413Epk enumC33413Epk5 = new EnumC33413Epk(num4, num2, "AUTOMATED_TOGGLE", 4);
        A05 = enumC33413Epk5;
        EnumC33413Epk enumC33413Epk6 = new EnumC33413Epk(num3, num4, "CHANGE_TIMER_CTA", 5);
        EnumC33413Epk[] enumC33413EpkArr = {enumC33413Epk, enumC33413Epk2, enumC33413Epk3, enumC33413Epk4, enumC33413Epk5, enumC33413Epk6};
        A04 = enumC33413EpkArr;
        A03 = AbstractC12190kN.A00(enumC33413EpkArr);
        A02 = AbstractC06930Yk.A06(AbstractC166987dD.A1L(0, enumC33413Epk), AbstractC166987dD.A1L(1, enumC33413Epk2), AbstractC166987dD.A1L(2, enumC33413Epk3), AbstractC166987dD.A1L(4, enumC33413Epk4), AbstractC166987dD.A1L(3, enumC33413Epk5), AbstractC166987dD.A1L(5, enumC33413Epk6));
    }

    public static EnumC33413Epk valueOf(String str) {
        return (EnumC33413Epk) Enum.valueOf(EnumC33413Epk.class, str);
    }

    public static EnumC33413Epk[] values() {
        return (EnumC33413Epk[]) A04.clone();
    }

    public EnumC33413Epk(Integer num, Integer num2, String str, int i) {
        this.A00 = num;
        this.A01 = num2;
    }
}
