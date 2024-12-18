package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0lq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC13040lq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC13040lq[] A01;
    public static final EnumC13040lq A02;
    public static final EnumC13040lq A03;
    public static final EnumC13040lq A04;
    public static final EnumC13040lq A05;

    public static EnumC13040lq valueOf(String str) {
        return (EnumC13040lq) Enum.valueOf(EnumC13040lq.class, str);
    }

    public static EnumC13040lq[] values() {
        return (EnumC13040lq[]) A01.clone();
    }

    static {
        EnumC13040lq enumC13040lq = new EnumC13040lq("STARTED", 0);
        A04 = enumC13040lq;
        EnumC13040lq enumC13040lq2 = new EnumC13040lq("STOPPED", 1);
        A05 = enumC13040lq2;
        EnumC13040lq enumC13040lq3 = new EnumC13040lq("ENDED", 2);
        A03 = enumC13040lq3;
        EnumC13040lq enumC13040lq4 = new EnumC13040lq("DESTROYED", 3);
        A02 = enumC13040lq4;
        EnumC13040lq[] enumC13040lqArr = {enumC13040lq, enumC13040lq2, enumC13040lq3, enumC13040lq4};
        A01 = enumC13040lqArr;
        A00 = AbstractC12190kN.A00(enumC13040lqArr);
    }

    public EnumC13040lq(String str, int i) {
    }
}
