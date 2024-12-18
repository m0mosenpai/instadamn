package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Jd1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC44014Jd1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC44014Jd1[] A01;
    public static final EnumC44014Jd1 A02;
    public static final EnumC44014Jd1 A03;
    public static final EnumC44014Jd1 A04;
    public static final EnumC44014Jd1 A05;
    public static final EnumC44014Jd1 A06;

    static {
        EnumC44014Jd1 enumC44014Jd1 = new EnumC44014Jd1("NOT_ENABLED", 0);
        A04 = enumC44014Jd1;
        EnumC44014Jd1 enumC44014Jd12 = new EnumC44014Jd1("NOT_STARTED", 1);
        A05 = enumC44014Jd12;
        EnumC44014Jd1 enumC44014Jd13 = new EnumC44014Jd1("IN_PROGRESS", 2);
        A03 = enumC44014Jd13;
        EnumC44014Jd1 enumC44014Jd14 = new EnumC44014Jd1("SUCCESS", 3);
        A06 = enumC44014Jd14;
        EnumC44014Jd1 enumC44014Jd15 = new EnumC44014Jd1("DISCARDED_MISMATCH", 4);
        A02 = enumC44014Jd15;
        EnumC44014Jd1[] enumC44014Jd1Arr = {enumC44014Jd1, enumC44014Jd12, enumC44014Jd13, enumC44014Jd14, enumC44014Jd15, new EnumC44014Jd1("DISCARDED_USED", 5)};
        A01 = enumC44014Jd1Arr;
        A00 = AbstractC12190kN.A00(enumC44014Jd1Arr);
    }

    public static EnumC44014Jd1 valueOf(String str) {
        return (EnumC44014Jd1) Enum.valueOf(EnumC44014Jd1.class, str);
    }

    public static EnumC44014Jd1[] values() {
        return (EnumC44014Jd1[]) A01.clone();
    }

    public EnumC44014Jd1(String str, int i) {
    }
}
