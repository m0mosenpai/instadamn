package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53228NgQ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53228NgQ[] A02;
    public static final EnumC53228NgQ A03;
    public static final EnumC53228NgQ A04;
    public static final EnumC53228NgQ A05;
    public static final EnumC53228NgQ A06;
    public static final EnumC53228NgQ A07;
    public final float A00;

    static {
        EnumC53228NgQ enumC53228NgQ = new EnumC53228NgQ("HIDDEN", 0, 0.0f);
        A06 = enumC53228NgQ;
        EnumC53228NgQ enumC53228NgQ2 = new EnumC53228NgQ("PEEK", 1, 0.244f);
        A07 = enumC53228NgQ2;
        EnumC53228NgQ enumC53228NgQ3 = new EnumC53228NgQ("DEFAULT", 2, 0.4105f);
        A03 = enumC53228NgQ3;
        EnumC53228NgQ enumC53228NgQ4 = new EnumC53228NgQ("HALF", 3, 0.5358f);
        A05 = enumC53228NgQ4;
        EnumC53228NgQ enumC53228NgQ5 = new EnumC53228NgQ("FULL", 4, 0.919f);
        A04 = enumC53228NgQ5;
        EnumC53228NgQ[] enumC53228NgQArr = {enumC53228NgQ, enumC53228NgQ2, enumC53228NgQ3, enumC53228NgQ4, enumC53228NgQ5};
        A02 = enumC53228NgQArr;
        A01 = AbstractC12190kN.A00(enumC53228NgQArr);
    }

    public static EnumC53228NgQ valueOf(String str) {
        return (EnumC53228NgQ) Enum.valueOf(EnumC53228NgQ.class, str);
    }

    public static EnumC53228NgQ[] values() {
        return (EnumC53228NgQ[]) A02.clone();
    }

    public EnumC53228NgQ(String str, int i, float f) {
        this.A00 = f;
    }
}
