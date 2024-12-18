package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eos, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33359Eos {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33359Eos[] A01;
    public static final EnumC33359Eos A02;
    public static final EnumC33359Eos A03;
    public static final EnumC33359Eos A04;
    public static final EnumC33359Eos A05;
    public static final EnumC33359Eos A06;

    static {
        EnumC33359Eos enumC33359Eos = new EnumC33359Eos("NO_SPLIT", 0);
        A04 = enumC33359Eos;
        EnumC33359Eos enumC33359Eos2 = new EnumC33359Eos("MULTI_SPLIT_TWO_BUTTON", 1);
        A03 = enumC33359Eos2;
        EnumC33359Eos enumC33359Eos3 = new EnumC33359Eos("MULTI_SPLIT_SINGLE_BUTTON", 2);
        A02 = enumC33359Eos3;
        EnumC33359Eos enumC33359Eos4 = new EnumC33359Eos("NO_SPLIT_NON_STICKY_FOOTER", 3);
        A06 = enumC33359Eos4;
        EnumC33359Eos enumC33359Eos5 = new EnumC33359Eos("NO_SPLIT_HINT_TEXT", 4);
        A05 = enumC33359Eos5;
        EnumC33359Eos[] enumC33359EosArr = {enumC33359Eos, enumC33359Eos2, enumC33359Eos3, enumC33359Eos4, enumC33359Eos5};
        A01 = enumC33359EosArr;
        A00 = AbstractC12190kN.A00(enumC33359EosArr);
    }

    public static EnumC33359Eos valueOf(String str) {
        return (EnumC33359Eos) Enum.valueOf(EnumC33359Eos.class, str);
    }

    public static EnumC33359Eos[] values() {
        return (EnumC33359Eos[]) A01.clone();
    }

    public EnumC33359Eos(String str, int i) {
    }
}
