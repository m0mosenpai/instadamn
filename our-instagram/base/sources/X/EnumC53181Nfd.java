package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53181Nfd {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53181Nfd[] A01;
    public static final EnumC53181Nfd A02;
    public static final EnumC53181Nfd A03;
    public static final EnumC53181Nfd A04;
    public static final EnumC53181Nfd A05;
    public static final EnumC53181Nfd A06;
    public static final EnumC53181Nfd A07;
    public static final EnumC53181Nfd A08;

    static {
        EnumC53181Nfd enumC53181Nfd = new EnumC53181Nfd("CONNECTING", 0);
        A03 = enumC53181Nfd;
        EnumC53181Nfd enumC53181Nfd2 = new EnumC53181Nfd("AMBIENT", 1);
        A02 = enumC53181Nfd2;
        EnumC53181Nfd enumC53181Nfd3 = new EnumC53181Nfd("LISTENING", 2);
        A06 = enumC53181Nfd3;
        EnumC53181Nfd enumC53181Nfd4 = new EnumC53181Nfd("THINKING", 3);
        A08 = enumC53181Nfd4;
        EnumC53181Nfd enumC53181Nfd5 = new EnumC53181Nfd("RESPONDING", 4);
        A07 = enumC53181Nfd5;
        EnumC53181Nfd enumC53181Nfd6 = new EnumC53181Nfd("ENDED", 5);
        A04 = enumC53181Nfd6;
        EnumC53181Nfd enumC53181Nfd7 = new EnumC53181Nfd("FAILED", 6);
        A05 = enumC53181Nfd7;
        EnumC53181Nfd[] enumC53181NfdArr = {enumC53181Nfd, enumC53181Nfd2, enumC53181Nfd3, enumC53181Nfd4, enumC53181Nfd5, enumC53181Nfd6, enumC53181Nfd7};
        A01 = enumC53181NfdArr;
        A00 = AbstractC12190kN.A00(enumC53181NfdArr);
    }

    public static EnumC53181Nfd valueOf(String str) {
        return (EnumC53181Nfd) Enum.valueOf(EnumC53181Nfd.class, str);
    }

    public static EnumC53181Nfd[] values() {
        return (EnumC53181Nfd[]) A01.clone();
    }

    public EnumC53181Nfd(String str, int i) {
    }
}
