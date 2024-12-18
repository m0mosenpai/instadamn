package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC124825kn {
    public static final EnumC124825kn[] A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC124825kn[] A04;
    public static final EnumC124825kn A05;
    public static final EnumC124825kn A06;
    public static final EnumC124825kn A07;
    public static final EnumC124825kn A08;
    public static final EnumC124825kn A09;
    public final int A00;
    public final EnumC124805kl A01;

    static {
        EnumC124825kn enumC124825kn = new EnumC124825kn(EnumC124805kl.AHOCORASICK, "AHO_CORASICK", 0, 1);
        A05 = enumC124825kn;
        EnumC124825kn enumC124825kn2 = new EnumC124825kn(EnumC124805kl.FUZZYMATCH, "FUZZYMATCH", 1, 2);
        A07 = enumC124825kn2;
        EnumC124825kn enumC124825kn3 = new EnumC124825kn(EnumC124805kl.WORDS_GRAPH_MATCH, "WORDS_GRAPH_MATCH", 2, 4);
        A09 = enumC124825kn3;
        EnumC124825kn enumC124825kn4 = new EnumC124825kn(EnumC124805kl.LOGISTIC_REGRESSION, "LOGISTIC_REGRESSION", 3, 5);
        A08 = enumC124825kn4;
        EnumC124825kn enumC124825kn5 = new EnumC124825kn(EnumC124805kl.UNKNOWN, "DUMMY_STRATEGY", 4, 6);
        A06 = enumC124825kn5;
        EnumC124825kn[] enumC124825knArr = {enumC124825kn, enumC124825kn2, enumC124825kn3, enumC124825kn4, enumC124825kn5};
        A04 = enumC124825knArr;
        A03 = AbstractC12190kN.A00(enumC124825knArr);
        A02 = values();
    }

    public static EnumC124825kn valueOf(String str) {
        return (EnumC124825kn) Enum.valueOf(EnumC124825kn.class, str);
    }

    public static EnumC124825kn[] values() {
        return (EnumC124825kn[]) A04.clone();
    }

    public EnumC124825kn(EnumC124805kl enumC124805kl, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = enumC124805kl;
    }
}
