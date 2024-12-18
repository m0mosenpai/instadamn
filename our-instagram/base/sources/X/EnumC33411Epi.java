package X;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33411Epi {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33411Epi[] A03;
    public static final EnumC33411Epi A04 = new EnumC33411Epi("INDEFINITE", 0, 2131959472, -1);
    public static final EnumC33411Epi A05;
    public static final EnumC33411Epi A06;
    public static final EnumC33411Epi A07;
    public static final EnumC33411Epi A08;
    public final int A00;
    public final int A01;

    public static EnumC33411Epi valueOf(String str) {
        return (EnumC33411Epi) Enum.valueOf(EnumC33411Epi.class, str);
    }

    public static EnumC33411Epi[] values() {
        return (EnumC33411Epi[]) A03.clone();
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A05 = new EnumC33411Epi("ONE_DAY", 1, 2131959465, (int) timeUnit.toSeconds(1L));
        A07 = new EnumC33411Epi("ONE_WEEK", 2, 2131959464, (int) timeUnit.toSeconds(7L));
        A06 = new EnumC33411Epi("ONE_MONTH", 3, 2131959463, (int) timeUnit.toSeconds(29L));
        EnumC33411Epi enumC33411Epi = new EnumC33411Epi("THREE_MONTHS", 4, 2131959466, (int) timeUnit.toSeconds(90L));
        A08 = enumC33411Epi;
        EnumC33411Epi[] enumC33411EpiArr = {A04, A05, A07, A06, enumC33411Epi};
        A03 = enumC33411EpiArr;
        A02 = AbstractC12190kN.A00(enumC33411EpiArr);
    }

    public EnumC33411Epi(String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }
}
