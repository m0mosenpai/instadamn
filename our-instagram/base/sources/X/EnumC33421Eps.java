package X;

import java.util.concurrent.TimeUnit;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eps, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33421Eps {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC33421Eps[] A04;
    public static final EnumC33421Eps A05;
    public static final EnumC33421Eps A06;
    public static final EnumC33421Eps A07;
    public static final EnumC33421Eps A08;
    public static final EnumC33421Eps A09;
    public static final EnumC33421Eps A0A;
    public static final EnumC33421Eps A0B;
    public final int A00;
    public final int A01;
    public final int A02;

    public static EnumC33421Eps valueOf(String str) {
        return (EnumC33421Eps) Enum.valueOf(EnumC33421Eps.class, str);
    }

    public static EnumC33421Eps[] values() {
        return (EnumC33421Eps[]) A04.clone();
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A07 = new EnumC33421Eps("ONE_DAY", 0, 2131954956, 1, (int) timeUnit.toSeconds(1L));
        A0B = new EnumC33421Eps("THREE_DAYS", 1, 2131954957, 3, (int) timeUnit.toSeconds(3L));
        A05 = new EnumC33421Eps("FIVE_DAYS", 2, 2131954958, 5, (int) timeUnit.toSeconds(5L));
        A0A = new EnumC33421Eps("SEVEN_DAYS", 3, 2131954960, 7, (int) timeUnit.toSeconds(7L));
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        A09 = new EnumC33421Eps("ONE_MIN", 4, 2131954955, 0, (int) timeUnit2.toSeconds(1L));
        A06 = new EnumC33421Eps("FIVE_MIN", 5, 2131954959, 0, (int) timeUnit2.toSeconds(5L));
        EnumC33421Eps enumC33421Eps = new EnumC33421Eps("ONE_HOUR", 6, 2131954954, 0, (int) TimeUnit.HOURS.toSeconds(1L));
        A08 = enumC33421Eps;
        EnumC33421Eps[] enumC33421EpsArr = {A07, A0B, A05, A0A, A09, A06, enumC33421Eps};
        A04 = enumC33421EpsArr;
        A03 = AbstractC12190kN.A00(enumC33421EpsArr);
    }

    public EnumC33421Eps(String str, int i, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
