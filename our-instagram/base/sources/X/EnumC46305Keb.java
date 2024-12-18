package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Keb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46305Keb implements MPU {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46305Keb[] A03;
    public static final EnumC46305Keb A04;
    public static final EnumC46305Keb A05;
    public final Integer A00;
    public final String A01;

    static {
        Integer num = C05F.A00;
        EnumC46305Keb enumC46305Keb = new EnumC46305Keb(num, "RECOVERY_CODE", "rc", 0);
        A05 = enumC46305Keb;
        EnumC46305Keb enumC46305Keb2 = new EnumC46305Keb(num, "LOCKBOX_SECRET", "ls", 1);
        A04 = enumC46305Keb2;
        EnumC46305Keb[] enumC46305KebArr = {enumC46305Keb, enumC46305Keb2};
        A03 = enumC46305KebArr;
        A02 = AbstractC12190kN.A00(enumC46305KebArr);
    }

    public static EnumC46305Keb valueOf(String str) {
        return (EnumC46305Keb) Enum.valueOf(EnumC46305Keb.class, str);
    }

    public static EnumC46305Keb[] values() {
        return (EnumC46305Keb[]) A03.clone();
    }

    @Override // X.MPU
    public final Integer AfB() {
        return this.A00;
    }

    @Override // X.MPU
    public final String getId() {
        return this.A01;
    }

    public EnumC46305Keb(Integer num, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = num;
    }
}
