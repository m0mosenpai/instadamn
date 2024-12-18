package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eoo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33355Eoo {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33355Eoo[] A01;
    public static final EnumC33355Eoo A02;
    public static final EnumC33355Eoo A03;
    public static final EnumC33355Eoo A04;
    public static final EnumC33355Eoo A05;
    public static final EnumC33355Eoo A06;

    static {
        EnumC33355Eoo enumC33355Eoo = new EnumC33355Eoo("SUCCESS", 0);
        A06 = enumC33355Eoo;
        EnumC33355Eoo enumC33355Eoo2 = new EnumC33355Eoo("INITIAL_LOAD", 1);
        A02 = enumC33355Eoo2;
        EnumC33355Eoo enumC33355Eoo3 = new EnumC33355Eoo("PAGINATION_LOAD", 2);
        A04 = enumC33355Eoo3;
        EnumC33355Eoo enumC33355Eoo4 = new EnumC33355Eoo("INITIAL_LOAD_FAILED", 3);
        A03 = enumC33355Eoo4;
        EnumC33355Eoo enumC33355Eoo5 = new EnumC33355Eoo("PAGINATION_LOAD_FAILED", 4);
        A05 = enumC33355Eoo5;
        EnumC33355Eoo[] enumC33355EooArr = {enumC33355Eoo, enumC33355Eoo2, enumC33355Eoo3, enumC33355Eoo4, enumC33355Eoo5};
        A01 = enumC33355EooArr;
        A00 = AbstractC12190kN.A00(enumC33355EooArr);
    }

    public static EnumC33355Eoo valueOf(String str) {
        return (EnumC33355Eoo) Enum.valueOf(EnumC33355Eoo.class, str);
    }

    public static EnumC33355Eoo[] values() {
        return (EnumC33355Eoo[]) A01.clone();
    }

    public EnumC33355Eoo(String str, int i) {
    }
}
