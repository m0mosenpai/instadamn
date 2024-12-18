package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61130Rfk {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61130Rfk[] A01;
    public static final EnumC61130Rfk A02;
    public static final EnumC61130Rfk A03;
    public static final EnumC61130Rfk A04;
    public static final EnumC61130Rfk A05;
    public static final EnumC61130Rfk A06;

    static {
        EnumC61130Rfk enumC61130Rfk = new EnumC61130Rfk("APP_SET", 0);
        A02 = enumC61130Rfk;
        EnumC61130Rfk enumC61130Rfk2 = new EnumC61130Rfk("FBPERMISSION", 1);
        A03 = enumC61130Rfk2;
        EnumC61130Rfk enumC61130Rfk3 = new EnumC61130Rfk("SAME_APP", 2);
        A05 = enumC61130Rfk3;
        EnumC61130Rfk enumC61130Rfk4 = new EnumC61130Rfk("SAME_KEY", 3);
        A06 = enumC61130Rfk4;
        EnumC61130Rfk enumC61130Rfk5 = new EnumC61130Rfk("PUBLIC", 4);
        A04 = enumC61130Rfk5;
        EnumC61130Rfk[] enumC61130RfkArr = {enumC61130Rfk, enumC61130Rfk2, enumC61130Rfk3, enumC61130Rfk4, enumC61130Rfk5, new EnumC61130Rfk("ALL_FAMILY", 5)};
        A01 = enumC61130RfkArr;
        A00 = AbstractC12190kN.A00(enumC61130RfkArr);
    }

    public static EnumC61130Rfk valueOf(String str) {
        return (EnumC61130Rfk) Enum.valueOf(EnumC61130Rfk.class, str);
    }

    public static EnumC61130Rfk[] values() {
        return (EnumC61130Rfk[]) A01.clone();
    }

    public EnumC61130Rfk(String str, int i) {
    }
}
