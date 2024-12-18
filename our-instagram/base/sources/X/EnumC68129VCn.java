package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68129VCn {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68129VCn[] A01;
    public static final EnumC68129VCn A02;
    public static final EnumC68129VCn A03;
    public static final EnumC68129VCn A04;

    static {
        EnumC68129VCn enumC68129VCn = new EnumC68129VCn("TIMER_STARTED", 0);
        A03 = enumC68129VCn;
        EnumC68129VCn enumC68129VCn2 = new EnumC68129VCn("EVENT_PUBLISHED", 1);
        A02 = enumC68129VCn2;
        EnumC68129VCn enumC68129VCn3 = new EnumC68129VCn("UNKNOWN_OR_UNSET", 2);
        A04 = enumC68129VCn3;
        EnumC68129VCn[] enumC68129VCnArr = {enumC68129VCn, enumC68129VCn2, enumC68129VCn3};
        A01 = enumC68129VCnArr;
        A00 = AbstractC12190kN.A00(enumC68129VCnArr);
    }

    public static EnumC68129VCn valueOf(String str) {
        return (EnumC68129VCn) Enum.valueOf(EnumC68129VCn.class, str);
    }

    public static EnumC68129VCn[] values() {
        return (EnumC68129VCn[]) A01.clone();
    }

    public EnumC68129VCn(String str, int i) {
    }
}
