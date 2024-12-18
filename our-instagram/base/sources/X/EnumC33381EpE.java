package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33381EpE {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33381EpE[] A03;
    public static final EnumC33381EpE A04;
    public static final EnumC33381EpE A05;
    public final String A00;

    static {
        EnumC33381EpE enumC33381EpE = new EnumC33381EpE("IFY", 0, "ify");
        A04 = enumC33381EpE;
        EnumC33381EpE enumC33381EpE2 = new EnumC33381EpE("MEMU", 1, "memu");
        A05 = enumC33381EpE2;
        EnumC33381EpE[] enumC33381EpEArr = {enumC33381EpE, enumC33381EpE2};
        A03 = enumC33381EpEArr;
        C020508b A00 = AbstractC12190kN.A00(enumC33381EpEArr);
        A02 = A00;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A00, 10)));
        for (Object obj : A00) {
            A18.put(((EnumC33381EpE) obj).A00, obj);
        }
        A01 = A18;
    }

    public static EnumC33381EpE valueOf(String str) {
        return (EnumC33381EpE) Enum.valueOf(EnumC33381EpE.class, str);
    }

    public static EnumC33381EpE[] values() {
        return (EnumC33381EpE[]) A03.clone();
    }

    public EnumC33381EpE(String str, int i, String str2) {
        this.A00 = str2;
    }
}
