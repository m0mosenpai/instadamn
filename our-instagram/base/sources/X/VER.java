package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VER {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ VER[] A04;
    public static final VER A05;
    public static final VER A06;
    public static final VER A07;
    public static final VER A08;
    public static final VER A09;
    public final long A00;
    public final Integer A01;
    public final Integer A02;

    static {
        Integer num = C05F.A00;
        VER ver = new VER(num, num, "WITHOUT_SCREENSHOT_NOTIFICATION", 0, 1L);
        A06 = ver;
        VER ver2 = new VER(num, num, "WITH_SCREENSHOT_NOTIFICATION", 1, 2L);
        A09 = ver2;
        Integer num2 = C05F.A01;
        VER ver3 = new VER(num2, num2, "AFTER_SEEN", 2, 2L);
        A05 = ver3;
        VER ver4 = new VER(num, num, "WITH_E2EE_ATTRIBUTION_FIRST_TIME", 3, 3L);
        A07 = ver4;
        Integer num3 = C05F.A0C;
        VER ver5 = new VER(num3, num3, "WITH_E2EE_ATTRIBUTION_UPGRADE", 4, 3L);
        A08 = ver5;
        VER[] verArr = {ver, ver2, ver3, ver4, ver5};
        A04 = verArr;
        A03 = AbstractC12190kN.A00(verArr);
    }

    public static VER valueOf(String str) {
        return (VER) Enum.valueOf(VER.class, str);
    }

    public static VER[] values() {
        return (VER[]) A04.clone();
    }

    public VER(Integer num, Integer num2, String str, int i, long j) {
        this.A00 = j;
        this.A01 = num;
        this.A02 = num2;
    }
}
