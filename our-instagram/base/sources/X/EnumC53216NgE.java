package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53216NgE {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53216NgE[] A02;
    public static final EnumC53216NgE A03;
    public static final EnumC53216NgE A04;
    public static final EnumC53216NgE A05;
    public final String A00;

    static {
        EnumC53216NgE enumC53216NgE = new EnumC53216NgE("POST_COMMIT", 0, "post_commit");
        A04 = enumC53216NgE;
        EnumC53216NgE enumC53216NgE2 = new EnumC53216NgE("CONFIRMATION", 1, "confirmation");
        A03 = enumC53216NgE2;
        EnumC53216NgE enumC53216NgE3 = new EnumC53216NgE("STORAGE_REFUSED_ERROR", 2, "storage_refused_error");
        A05 = enumC53216NgE3;
        EnumC53216NgE[] enumC53216NgEArr = {enumC53216NgE, enumC53216NgE2, enumC53216NgE3};
        A02 = enumC53216NgEArr;
        A01 = AbstractC12190kN.A00(enumC53216NgEArr);
    }

    public static EnumC53216NgE valueOf(String str) {
        return (EnumC53216NgE) Enum.valueOf(EnumC53216NgE.class, str);
    }

    public static EnumC53216NgE[] values() {
        return (EnumC53216NgE[]) A02.clone();
    }

    public EnumC53216NgE(String str, int i, String str2) {
        this.A00 = str2;
    }
}
