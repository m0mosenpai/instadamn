package X;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Jfd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44174Jfd {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC44174Jfd[] A03;
    public static final EnumC44174Jfd A04;
    public static final EnumC44174Jfd A05;
    public static final EnumC44174Jfd A06;
    public static final EnumC44174Jfd A07;
    public static final EnumC44174Jfd A08;
    public final String A00;

    static {
        Locale locale = Locale.ROOT;
        A08 = new EnumC44174Jfd("UNDEFINED", 0, AbstractC31172DnG.A16(locale, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE"));
        A07 = new EnumC44174Jfd("MINOR_TO_ADULT_MEDIA_SHARE_EDUCATION", 1, "MINOR_TO_ADULT_MEDIA_SHARE_EDUCATION");
        A04 = new EnumC44174Jfd("IG_PREVENT_SEXTORTION_ENGAGEMENT", 2, AbstractC31172DnG.A16(locale, "IG_PREVENT_SEXTORTION_ENGAGEMENT"));
        A05 = new EnumC44174Jfd("IG_SAFETY_EDUCATION_NOTICE_COMPOSER_BLOCK", 3, AbstractC31172DnG.A16(locale, "IG_SAFETY_EDUCATION_NOTICE_COMPOSER_BLOCK"));
        A06 = new EnumC44174Jfd("IG_SAFETY_EDUCATION_NOTICE_PROMPT", 4, AbstractC31172DnG.A16(locale, "IG_SAFETY_EDUCATION_NOTICE_PROMPT"));
        EnumC44174Jfd[] enumC44174JfdArr = {A08, A07, A04, A05, A06, new EnumC44174Jfd("MINOR_TO_HIGH_RISK_ADULT_MEDIA_SHARE_EDUCATION", 5, AbstractC31172DnG.A16(locale, "MINOR_TO_HIGH_RISK_ADULT_MEDIA_SHARE_EDUCATION"))};
        A03 = enumC44174JfdArr;
        C020508b A00 = AbstractC12190kN.A00(enumC44174JfdArr);
        A02 = A00;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A00, 10)));
        for (Object obj : A00) {
            A18.put(((EnumC44174Jfd) obj).A00, obj);
        }
        A01 = AbstractC09990gB.A0J(A18, C44175Jfe.A00);
    }

    public static EnumC44174Jfd valueOf(String str) {
        return (EnumC44174Jfd) Enum.valueOf(EnumC44174Jfd.class, str);
    }

    public static EnumC44174Jfd[] values() {
        return (EnumC44174Jfd[]) A03.clone();
    }

    public EnumC44174Jfd(String str, int i, String str2) {
        this.A00 = str2;
    }
}
