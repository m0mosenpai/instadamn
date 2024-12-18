package X;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Jfa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44171Jfa {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC44171Jfa[] A03;
    public static final EnumC44171Jfa A04;
    public static final EnumC44171Jfa A05;
    public static final EnumC44171Jfa A06;
    public static final EnumC44171Jfa A07;
    public final String A00;

    static {
        Locale locale = Locale.ROOT;
        A07 = new EnumC44171Jfa("UNDEFINED", 0, AbstractC31172DnG.A16(locale, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE"));
        A05 = new EnumC44171Jfa("THREAD_LIST", 1, AbstractC31172DnG.A16(locale, "THREAD_LIST"));
        A06 = new EnumC44171Jfa("THREAD_VIEW", 2, AbstractC31172DnG.A16(locale, "THREAD_VIEW"));
        EnumC44171Jfa enumC44171Jfa = new EnumC44171Jfa("CANONICAL_THREAD_VIEW", 3, AbstractC31172DnG.A16(locale, "CANONICAL_THREAD_VIEW"));
        A04 = enumC44171Jfa;
        EnumC44171Jfa[] enumC44171JfaArr = {A07, A05, A06, enumC44171Jfa};
        A03 = enumC44171JfaArr;
        C020508b A00 = AbstractC12190kN.A00(enumC44171JfaArr);
        A02 = A00;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A00, 10)));
        for (Object obj : A00) {
            A18.put(((EnumC44171Jfa) obj).A00, obj);
        }
        A01 = AbstractC09990gB.A0J(A18, C44172Jfb.A00);
    }

    public static EnumC44171Jfa valueOf(String str) {
        return (EnumC44171Jfa) Enum.valueOf(EnumC44171Jfa.class, str);
    }

    public static EnumC44171Jfa[] values() {
        return (EnumC44171Jfa[]) A03.clone();
    }

    public EnumC44171Jfa(String str, int i, String str2) {
        this.A00 = str2;
    }
}
