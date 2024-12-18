package X;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.XcD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72377XcD {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC72377XcD[] A03;
    public static final EnumC72377XcD A04;
    public static final EnumC72377XcD A05;
    public static final EnumC72377XcD A06;
    public static final EnumC72377XcD A07;
    public static final EnumC72377XcD A08;
    public static final EnumC72377XcD A09;
    public static final EnumC72377XcD A0A;
    public static final EnumC72377XcD A0B;
    public static final EnumC72377XcD A0C;
    public static final EnumC72377XcD A0D;
    public final String A00;

    static {
        Locale locale = Locale.ROOT;
        A0D = new EnumC72377XcD("UNDEFINED", 0, AbstractC31172DnG.A16(locale, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE"));
        A05 = new EnumC72377XcD("IG_DIRECT_IN_THREAD_SUGGESTION_SR_UPSELL", 1, AbstractC31172DnG.A16(locale, "IG_DIRECT_IN_THREAD_SUGGESTION_SR_UPSELL"));
        A06 = new EnumC72377XcD("IG_EXAMPLE", 2, AbstractC31172DnG.A16(locale, "IG_EXAMPLE"));
        A07 = new EnumC72377XcD("IG_IIC", 3, AbstractC31172DnG.A16(locale, "IG_IIC"));
        A09 = new EnumC72377XcD("IG_SCAM_ABOUT_THIS_ACCOUNT_THREAD_VIEW", 4, AbstractC31172DnG.A16(locale, "IG_SCAM_ABOUT_THIS_ACCOUNT_THREAD_VIEW"));
        A0A = new EnumC72377XcD("IG_SCAM_VICTIM_INITIATED_THREAD_VIEW", 5, AbstractC31172DnG.A16(locale, "IG_SCAM_VICTIM_INITIATED_THREAD_VIEW"));
        A04 = new EnumC72377XcD("IG_COMPROMISED_THREAD_VIEW", 6, AbstractC31172DnG.A16(locale, "IG_COMPROMISED_THREAD_VIEW"));
        A0C = new EnumC72377XcD("IG_UNVETTED_DEVICE", 7, AbstractC31172DnG.A16(locale, "IG_UNVETTED_DEVICE"));
        A0B = new EnumC72377XcD("IG_SEXUAL_HARASSMENT", 8, AbstractC31172DnG.A16(locale, "IG_SEXUAL_HARASSMENT"));
        A08 = new EnumC72377XcD("IG_LOCATION_WARNING_THREAD_VIEW", 9, AbstractC31172DnG.A16(locale, "IG_LOCATION_WARNING_THREAD_VIEW"));
        EnumC72377XcD[] enumC72377XcDArr = {A0D, A05, A06, A07, A09, A0A, A04, A0C, A0B, A08, new EnumC72377XcD("IG_SEXTORTION", 10, AbstractC31172DnG.A16(locale, "IG_SEXTORTION"))};
        A03 = enumC72377XcDArr;
        A02 = AbstractC12190kN.A00(enumC72377XcDArr);
        EnumC72377XcD[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC72377XcD enumC72377XcD : values) {
            A18.put(enumC72377XcD.A00, enumC72377XcD);
        }
        A01 = AbstractC09990gB.A0J(A18, YLH.A00);
    }

    public static EnumC72377XcD valueOf(String str) {
        return (EnumC72377XcD) Enum.valueOf(EnumC72377XcD.class, str);
    }

    public static EnumC72377XcD[] values() {
        return (EnumC72377XcD[]) A03.clone();
    }

    public EnumC72377XcD(String str, int i, String str2) {
        this.A00 = str2;
    }
}
