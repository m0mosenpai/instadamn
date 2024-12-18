package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7lh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC172127lh {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC172127lh[] A02;
    public static final EnumC172127lh A03;
    public static final EnumC172127lh A04;
    public static final EnumC172127lh A05;
    public final boolean A00;

    static {
        EnumC172127lh enumC172127lh = new EnumC172127lh("GRANTED", 0, true);
        A05 = enumC172127lh;
        EnumC172127lh enumC172127lh2 = new EnumC172127lh("DENIED", 1, false);
        A03 = enumC172127lh2;
        EnumC172127lh enumC172127lh3 = new EnumC172127lh("DENIED_DONT_ASK_AGAIN", 2, false);
        A04 = enumC172127lh3;
        EnumC172127lh[] enumC172127lhArr = {enumC172127lh, enumC172127lh2, enumC172127lh3};
        A02 = enumC172127lhArr;
        A01 = AbstractC12190kN.A00(enumC172127lhArr);
    }

    public static EnumC172127lh valueOf(String str) {
        return (EnumC172127lh) Enum.valueOf(EnumC172127lh.class, str);
    }

    public static EnumC172127lh[] values() {
        return (EnumC172127lh[]) A02.clone();
    }

    public EnumC172127lh(String str, int i, boolean z) {
        this.A00 = z;
    }
}
