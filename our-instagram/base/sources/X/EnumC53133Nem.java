package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nem, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53133Nem {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53133Nem[] A01;
    public static final EnumC53133Nem A02;
    public static final EnumC53133Nem A03;
    public static final EnumC53133Nem A04;

    static {
        EnumC53133Nem enumC53133Nem = new EnumC53133Nem("CAPTURE_SESSION", 0);
        A02 = enumC53133Nem;
        EnumC53133Nem enumC53133Nem2 = new EnumC53133Nem("DIRECT_TO_SHARE", 1);
        A03 = enumC53133Nem2;
        EnumC53133Nem enumC53133Nem3 = new EnumC53133Nem("DRAFT_FROM_POST_CAP", 2);
        A04 = enumC53133Nem3;
        EnumC53133Nem[] enumC53133NemArr = {enumC53133Nem, enumC53133Nem2, enumC53133Nem3};
        A01 = enumC53133NemArr;
        A00 = AbstractC12190kN.A00(enumC53133NemArr);
    }

    public static EnumC53133Nem valueOf(String str) {
        return (EnumC53133Nem) Enum.valueOf(EnumC53133Nem.class, str);
    }

    public static EnumC53133Nem[] values() {
        return (EnumC53133Nem[]) A01.clone();
    }

    public EnumC53133Nem(String str, int i) {
    }
}
