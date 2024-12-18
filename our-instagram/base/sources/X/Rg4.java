package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class Rg4 {
    public static final /* synthetic */ Rg4[] A01;
    public static final Rg4 A02;
    public static final Rg4 A03;
    public final int A00;

    static {
        Integer num = C05F.A00;
        EnumC61170RgW[] enumC61170RgWArr = EnumC61170RgW.A01;
        Rg4 A00 = A00(num, "DOUBLE", 0);
        Rg4 A002 = A00(num, "FLOAT", 1);
        Rg4 A003 = A00(num, "INT64", 2);
        Rg4 A004 = A00(num, "UINT64", 3);
        Rg4 A005 = A00(num, "INT32", 4);
        Rg4 A006 = A00(num, "FIXED64", 5);
        Rg4 A007 = A00(num, "FIXED32", 6);
        Rg4 A008 = A00(num, "BOOL", 7);
        Rg4 A009 = A00(num, "STRING", 8);
        Rg4 A0010 = A00(num, "MESSAGE", 9);
        Rg4 A0011 = A00(num, "BYTES", 10);
        Rg4 A0012 = A00(num, "UINT32", 11);
        Rg4 A0013 = A00(num, "ENUM", 12);
        Rg4 A0014 = A00(num, "SFIXED32", 13);
        Rg4 A0015 = A00(num, "SFIXED64", 14);
        Rg4 A0016 = A00(num, "SINT32", 15);
        Rg4 A0017 = A00(num, "SINT64", 16);
        Rg4 A0018 = A00(num, "GROUP", 17);
        Integer num2 = C05F.A01;
        Rg4 A0019 = A00(num2, "DOUBLE_LIST", 18);
        Rg4 A0020 = A00(num2, "FLOAT_LIST", 19);
        Rg4 A0021 = A00(num2, "INT64_LIST", 20);
        Rg4 A0022 = A00(num2, "UINT64_LIST", 21);
        Rg4 A0023 = A00(num2, "INT32_LIST", 22);
        Rg4 A0024 = A00(num2, "FIXED64_LIST", 23);
        Rg4 A0025 = A00(num2, "FIXED32_LIST", 24);
        Rg4 A0026 = A00(num2, "BOOL_LIST", 25);
        Rg4 A0027 = A00(num2, "STRING_LIST", 26);
        Rg4 A0028 = A00(num2, "MESSAGE_LIST", 27);
        Rg4 A0029 = A00(num2, "BYTES_LIST", 28);
        Rg4 A0030 = A00(num2, "UINT32_LIST", 29);
        Rg4 A0031 = A00(num2, "ENUM_LIST", 30);
        Rg4 A0032 = A00(num2, "SFIXED32_LIST", 31);
        Rg4 A0033 = A00(num2, "SFIXED64_LIST", 32);
        Rg4 A0034 = A00(num2, "SINT32_LIST", 33);
        Rg4 A0035 = A00(num2, "SINT64_LIST", 34);
        Integer num3 = C05F.A0C;
        Rg4 A0036 = A00(num3, "DOUBLE_LIST_PACKED", 35);
        A02 = A0036;
        Rg4 A0037 = A00(num3, "FLOAT_LIST_PACKED", 36);
        Rg4 A0038 = A00(num3, "INT64_LIST_PACKED", 37);
        Rg4 A0039 = A00(num3, "UINT64_LIST_PACKED", 38);
        Rg4 A0040 = A00(num3, "INT32_LIST_PACKED", 39);
        Rg4 A0041 = A00(num3, "FIXED64_LIST_PACKED", 40);
        Rg4 A0042 = A00(num3, "FIXED32_LIST_PACKED", 41);
        Rg4 A0043 = A00(num3, "BOOL_LIST_PACKED", 42);
        Rg4 A0044 = A00(num3, "UINT32_LIST_PACKED", 43);
        Rg4 A0045 = A00(num3, "ENUM_LIST_PACKED", 44);
        Rg4 A0046 = A00(num3, "SFIXED32_LIST_PACKED", 45);
        Rg4 A0047 = A00(num3, "SFIXED64_LIST_PACKED", 46);
        Rg4 A0048 = A00(num3, "SINT32_LIST_PACKED", 47);
        Rg4 A0049 = A00(num3, "SINT64_LIST_PACKED", 48);
        A03 = A0049;
        Rg4 A0050 = A00(num2, "GROUP_LIST", 49);
        Rg4 A0051 = A00(C05F.A0N, "MAP", 50);
        Rg4[] rg4Arr = new Rg4[51];
        System.arraycopy(new Rg4[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, 0, rg4Arr, 0, 27);
        System.arraycopy(new Rg4[]{A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051}, 0, rg4Arr, 27, 24);
        A01 = rg4Arr;
        for (int i = 0; i < values().length; i++) {
        }
    }

    public static Rg4 A00(Integer num, String str, int i) {
        return new Rg4(num, str, i, i);
    }

    public static Rg4[] values() {
        return (Rg4[]) A01.clone();
    }

    public Rg4(Integer num, String str, int i, int i2) {
        this.A00 = i2;
        AbstractC62231S3c abstractC62231S3c = AbstractC62231S3c.$redex_init_class;
        num.intValue();
    }
}
