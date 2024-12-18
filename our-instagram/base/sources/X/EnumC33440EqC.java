package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EqC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33440EqC {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33440EqC[] A03;
    public static final EnumC33440EqC A04;
    public static final EnumC33440EqC A05;
    public static final EnumC33440EqC A06;
    public final String A00;

    static {
        EnumC33440EqC enumC33440EqC = new EnumC33440EqC("STORIES_VIEWER_TOP_PARTICIPANTS_BOTTOMSHEET", 0, "stories_viewer_top_participants_bottomsheet");
        A06 = enumC33440EqC;
        EnumC33440EqC enumC33440EqC2 = new EnumC33440EqC("DIRECT_THREAD", 1, "direct_thread");
        A04 = enumC33440EqC2;
        EnumC33440EqC enumC33440EqC3 = new EnumC33440EqC("NOTIFICATION", 2, "notification");
        A05 = enumC33440EqC3;
        EnumC33440EqC[] enumC33440EqCArr = {enumC33440EqC, enumC33440EqC2, enumC33440EqC3};
        A03 = enumC33440EqCArr;
        A02 = AbstractC12190kN.A00(enumC33440EqCArr);
        EnumC33440EqC[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33440EqC enumC33440EqC4 : values) {
            A18.put(enumC33440EqC4.A00, enumC33440EqC4);
        }
        A01 = A18;
    }

    public static EnumC33440EqC valueOf(String str) {
        return (EnumC33440EqC) Enum.valueOf(EnumC33440EqC.class, str);
    }

    public static EnumC33440EqC[] values() {
        return (EnumC33440EqC[]) A03.clone();
    }

    public EnumC33440EqC(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
