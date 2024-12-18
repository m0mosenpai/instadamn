package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68123VCh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68123VCh[] A01;
    public static final EnumC68123VCh A02;
    public static final EnumC68123VCh A03;

    static {
        EnumC68123VCh enumC68123VCh = new EnumC68123VCh("STRAIGHT_TO_TARGET", 0);
        A03 = enumC68123VCh;
        EnumC68123VCh enumC68123VCh2 = new EnumC68123VCh("SCROLL_THROUGH_DIGITS", 1);
        A02 = enumC68123VCh2;
        EnumC68123VCh[] enumC68123VChArr = {enumC68123VCh, enumC68123VCh2};
        A01 = enumC68123VChArr;
        A00 = AbstractC12190kN.A00(enumC68123VChArr);
    }

    public static EnumC68123VCh valueOf(String str) {
        return (EnumC68123VCh) Enum.valueOf(EnumC68123VCh.class, str);
    }

    public static EnumC68123VCh[] values() {
        return (EnumC68123VCh[]) A01.clone();
    }

    public EnumC68123VCh(String str, int i) {
    }
}
