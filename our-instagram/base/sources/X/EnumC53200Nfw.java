package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nfw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53200Nfw {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53200Nfw[] A02;
    public static final EnumC53200Nfw A03;
    public static final EnumC53200Nfw A04;
    public final int A00;

    public static EnumC53200Nfw valueOf(String str) {
        return (EnumC53200Nfw) Enum.valueOf(EnumC53200Nfw.class, str);
    }

    public static EnumC53200Nfw[] values() {
        return (EnumC53200Nfw[]) A02.clone();
    }

    static {
        EnumC53200Nfw enumC53200Nfw = new EnumC53200Nfw("SELECTED", 0, 2131973245);
        A04 = enumC53200Nfw;
        EnumC53200Nfw enumC53200Nfw2 = new EnumC53200Nfw("ARCHIVE", 1, 2131952387);
        A03 = enumC53200Nfw2;
        EnumC53200Nfw[] enumC53200NfwArr = {enumC53200Nfw, enumC53200Nfw2};
        A02 = enumC53200NfwArr;
        A01 = AbstractC12190kN.A00(enumC53200NfwArr);
    }

    public EnumC53200Nfw(String str, int i, int i2) {
        this.A00 = i2;
    }
}
