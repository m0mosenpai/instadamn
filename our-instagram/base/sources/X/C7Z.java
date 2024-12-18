package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7Z {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C7Z[] A03;
    public static final C7Z A04;
    public static final C7Z A05;
    public static final C7Z A06;
    public static final C7Z A07;
    public final String A00;

    static {
        C7Z c7z = new C7Z("BLACK", 0, "black");
        A04 = c7z;
        C7Z c7z2 = new C7Z("GRADIENT_BLUE", 1, "gradient_blue");
        A05 = c7z2;
        C7Z c7z3 = new C7Z("HIGHLIGHT_BACKGROUND", 2, "highlight_background");
        A06 = c7z3;
        C7Z c7z4 = new C7Z("PRIMARY_ICON", 3, "primary_icon");
        A07 = c7z4;
        C7Z[] c7zArr = {c7z, c7z2, c7z3, c7z4, new C7Z("WHITE", 4, "white")};
        A03 = c7zArr;
        C020508b A00 = AbstractC12190kN.A00(c7zArr);
        A02 = A00;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A00, 10)));
        for (Object obj : A00) {
            A18.put(((C7Z) obj).A00, obj);
        }
        A01 = A18;
    }

    public static C7Z valueOf(String str) {
        return (C7Z) Enum.valueOf(C7Z.class, str);
    }

    public static C7Z[] values() {
        return (C7Z[]) A03.clone();
    }

    public C7Z(String str, int i, String str2) {
        this.A00 = str2;
    }
}
