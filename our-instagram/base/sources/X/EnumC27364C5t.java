package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27364C5t {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27364C5t[] A01;
    public static final EnumC27364C5t A02;
    public static final EnumC27364C5t A03;

    static {
        EnumC27364C5t enumC27364C5t = new EnumC27364C5t("START", 0);
        A03 = enumC27364C5t;
        EnumC27364C5t enumC27364C5t2 = new EnumC27364C5t("END", 1);
        A02 = enumC27364C5t2;
        EnumC27364C5t[] enumC27364C5tArr = {enumC27364C5t, enumC27364C5t2};
        A01 = enumC27364C5tArr;
        A00 = AbstractC12190kN.A00(enumC27364C5tArr);
    }

    public static EnumC27364C5t valueOf(String str) {
        return (EnumC27364C5t) Enum.valueOf(EnumC27364C5t.class, str);
    }

    public static EnumC27364C5t[] values() {
        return (EnumC27364C5t[]) A01.clone();
    }

    public EnumC27364C5t(String str, int i) {
    }
}
