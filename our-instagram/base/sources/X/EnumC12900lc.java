package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC12900lc {
    public static EnumC12900lc A00;
    public static final C12890lb A01;
    public static final InterfaceC09390do A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC12900lc[] A04;
    public static final EnumC12900lc A05;
    public static final EnumC12900lc A06;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.0lb] */
    static {
        EnumC12900lc enumC12900lc = new EnumC12900lc("DEBUG", 0);
        A05 = enumC12900lc;
        EnumC12900lc enumC12900lc2 = new EnumC12900lc("RELEASE", 1);
        A06 = enumC12900lc2;
        EnumC12900lc[] enumC12900lcArr = {enumC12900lc, enumC12900lc2};
        A04 = enumC12900lcArr;
        A03 = AbstractC12190kN.A00(enumC12900lcArr);
        A01 = new Object();
        A02 = AbstractC09440dt.A01(C0OA.A00);
    }

    public static EnumC12900lc valueOf(String str) {
        return (EnumC12900lc) Enum.valueOf(EnumC12900lc.class, str);
    }

    public static EnumC12900lc[] values() {
        return (EnumC12900lc[]) A04.clone();
    }

    public EnumC12900lc(String str, int i) {
    }
}
