package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C7a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27397C7a {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC27397C7a[] A03;
    public static final EnumC27397C7a A04;
    public static final EnumC27397C7a A05;
    public static final EnumC27397C7a A06;
    public static final EnumC27397C7a A07;
    public static final EnumC27397C7a A08;
    public final String A00;

    static {
        EnumC27397C7a enumC27397C7a = new EnumC27397C7a("FACEBOOK", 0, "facebook");
        A04 = enumC27397C7a;
        EnumC27397C7a enumC27397C7a2 = new EnumC27397C7a("HORIZON", 1, "horizon");
        A05 = enumC27397C7a2;
        EnumC27397C7a enumC27397C7a3 = new EnumC27397C7a("LIKE", 2, "like");
        A06 = enumC27397C7a3;
        EnumC27397C7a enumC27397C7a4 = new EnumC27397C7a("META", 3, "meta");
        A07 = enumC27397C7a4;
        EnumC27397C7a enumC27397C7a5 = new EnumC27397C7a("THREADS", 4, "threads");
        A08 = enumC27397C7a5;
        EnumC27397C7a[] enumC27397C7aArr = {enumC27397C7a, enumC27397C7a2, enumC27397C7a3, enumC27397C7a4, enumC27397C7a5, new EnumC27397C7a("VERIFIED_ACCOUNT", 5, "verified_account")};
        A03 = enumC27397C7aArr;
        C020508b A00 = AbstractC12190kN.A00(enumC27397C7aArr);
        A02 = A00;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A00, 10)));
        for (Object obj : A00) {
            A18.put(((EnumC27397C7a) obj).A00, obj);
        }
        A01 = A18;
    }

    public static EnumC27397C7a valueOf(String str) {
        return (EnumC27397C7a) Enum.valueOf(EnumC27397C7a.class, str);
    }

    public static EnumC27397C7a[] values() {
        return (EnumC27397C7a[]) A03.clone();
    }

    public EnumC27397C7a(String str, int i, String str2) {
        this.A00 = str2;
    }
}
