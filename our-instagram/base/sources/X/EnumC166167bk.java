package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC166167bk {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC166167bk[] A01;
    public static final EnumC166167bk A02;
    public static final EnumC166167bk A03;
    public static final EnumC166167bk A04;

    static {
        EnumC166167bk enumC166167bk = new EnumC166167bk("SHOW_ORIGINAL", 0);
        A03 = enumC166167bk;
        EnumC166167bk enumC166167bk2 = new EnumC166167bk("LOADING", 1);
        A02 = enumC166167bk2;
        EnumC166167bk enumC166167bk3 = new EnumC166167bk("SHOW_TRANSLATION", 2);
        A04 = enumC166167bk3;
        EnumC166167bk[] enumC166167bkArr = {enumC166167bk, enumC166167bk2, enumC166167bk3};
        A01 = enumC166167bkArr;
        A00 = AbstractC12190kN.A00(enumC166167bkArr);
    }

    public static EnumC166167bk valueOf(String str) {
        return (EnumC166167bk) Enum.valueOf(EnumC166167bk.class, str);
    }

    public static EnumC166167bk[] values() {
        return (EnumC166167bk[]) A01.clone();
    }

    public EnumC166167bk(String str, int i) {
    }
}
