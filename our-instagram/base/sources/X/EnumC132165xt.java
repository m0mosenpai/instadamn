package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC132165xt {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC132165xt[] A01;
    public static final EnumC132165xt A02;
    public static final EnumC132165xt A03;

    static {
        EnumC132165xt enumC132165xt = new EnumC132165xt("POST", 0);
        A02 = enumC132165xt;
        EnumC132165xt enumC132165xt2 = new EnumC132165xt("TARGET_POST", 1);
        A03 = enumC132165xt2;
        EnumC132165xt[] enumC132165xtArr = {enumC132165xt, enumC132165xt2};
        A01 = enumC132165xtArr;
        A00 = AbstractC12190kN.A00(enumC132165xtArr);
    }

    public static EnumC132165xt valueOf(String str) {
        return (EnumC132165xt) Enum.valueOf(EnumC132165xt.class, str);
    }

    public static EnumC132165xt[] values() {
        return (EnumC132165xt[]) A01.clone();
    }

    public EnumC132165xt(String str, int i) {
    }
}
