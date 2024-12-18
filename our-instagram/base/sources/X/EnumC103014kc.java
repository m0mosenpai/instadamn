package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC103014kc {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC103014kc[] A01;
    public static final EnumC103014kc A02;
    public static final EnumC103014kc A03;
    public static final EnumC103014kc A04;
    public static final EnumC103014kc A05;

    static {
        EnumC103014kc enumC103014kc = new EnumC103014kc("DEFAULT", 0);
        A03 = enumC103014kc;
        EnumC103014kc enumC103014kc2 = new EnumC103014kc("UNTRACKED", 1);
        A05 = enumC103014kc2;
        EnumC103014kc enumC103014kc3 = new EnumC103014kc("UNBOUND", 2);
        A04 = enumC103014kc3;
        EnumC103014kc enumC103014kc4 = new EnumC103014kc("CACHED_ONLY", 3);
        A02 = enumC103014kc4;
        EnumC103014kc[] enumC103014kcArr = {enumC103014kc, enumC103014kc2, enumC103014kc3, enumC103014kc4};
        A01 = enumC103014kcArr;
        A00 = AbstractC12190kN.A00(enumC103014kcArr);
    }

    public static EnumC103014kc valueOf(String str) {
        return (EnumC103014kc) Enum.valueOf(EnumC103014kc.class, str);
    }

    public static EnumC103014kc[] values() {
        return (EnumC103014kc[]) A01.clone();
    }

    public EnumC103014kc(String str, int i) {
    }
}
