package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.BXh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC25697BXh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC25697BXh[] A01;
    public static final EnumC25697BXh A02;
    public static final EnumC25697BXh A03;
    public static final EnumC25697BXh A04;
    public static final EnumC25697BXh A05;
    public static final EnumC25697BXh A06;

    static {
        EnumC25697BXh enumC25697BXh = new EnumC25697BXh("DONE", 0);
        A02 = enumC25697BXh;
        EnumC25697BXh enumC25697BXh2 = new EnumC25697BXh("GO", 1);
        A03 = enumC25697BXh2;
        EnumC25697BXh enumC25697BXh3 = new EnumC25697BXh("NEXT", 2);
        A04 = enumC25697BXh3;
        EnumC25697BXh enumC25697BXh4 = new EnumC25697BXh("SEARCH", 3);
        A05 = enumC25697BXh4;
        EnumC25697BXh enumC25697BXh5 = new EnumC25697BXh("SEND", 4);
        A06 = enumC25697BXh5;
        EnumC25697BXh[] enumC25697BXhArr = {enumC25697BXh, enumC25697BXh2, enumC25697BXh3, enumC25697BXh4, enumC25697BXh5};
        A01 = enumC25697BXhArr;
        A00 = AbstractC12190kN.A00(enumC25697BXhArr);
    }

    public static EnumC25697BXh valueOf(String str) {
        return (EnumC25697BXh) Enum.valueOf(EnumC25697BXh.class, str);
    }

    public static EnumC25697BXh[] values() {
        return (EnumC25697BXh[]) A01.clone();
    }

    public EnumC25697BXh(String str, int i) {
    }
}
