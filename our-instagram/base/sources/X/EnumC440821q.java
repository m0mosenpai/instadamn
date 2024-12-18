package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.21q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC440821q {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC440821q[] A01;
    public static final EnumC440821q A02;
    public static final EnumC440821q A03;
    public static final EnumC440821q A04;
    public static final EnumC440821q A05;
    public static final EnumC440821q A06;

    static {
        EnumC440821q enumC440821q = new EnumC440821q("UNDEFINED", 0);
        A06 = enumC440821q;
        EnumC440821q enumC440821q2 = new EnumC440821q("ULTRA_LOW_LATENCY", 1);
        A05 = enumC440821q2;
        EnumC440821q enumC440821q3 = new EnumC440821q("LOW_LATENCY", 2);
        A02 = enumC440821q3;
        EnumC440821q enumC440821q4 = new EnumC440821q("LOW_LATENCY_HUDDLE", 3);
        A03 = enumC440821q4;
        EnumC440821q enumC440821q5 = new EnumC440821q("REGULAR_LATENCY", 4);
        A04 = enumC440821q5;
        EnumC440821q[] enumC440821qArr = {enumC440821q, enumC440821q2, enumC440821q3, enumC440821q4, enumC440821q5};
        A01 = enumC440821qArr;
        A00 = AbstractC12190kN.A00(enumC440821qArr);
    }

    public static EnumC440821q valueOf(String str) {
        return (EnumC440821q) Enum.valueOf(EnumC440821q.class, str);
    }

    public static EnumC440821q[] values() {
        return (EnumC440821q[]) A01.clone();
    }

    public EnumC440821q(String str, int i) {
    }
}
