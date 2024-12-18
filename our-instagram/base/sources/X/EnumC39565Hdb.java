package X;

import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39565Hdb {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39565Hdb[] A03;
    public static final EnumC39565Hdb A04;
    public static final EnumC39565Hdb A05;
    public static final EnumC39565Hdb A06;
    public final String A00;

    static {
        EnumC39565Hdb enumC39565Hdb = new EnumC39565Hdb("POSTS", 0, "posts");
        A06 = enumC39565Hdb;
        EnumC39565Hdb enumC39565Hdb2 = new EnumC39565Hdb("ACCOUNTS", 1, "accounts");
        A04 = enumC39565Hdb2;
        EnumC39565Hdb enumC39565Hdb3 = new EnumC39565Hdb("LOCATIONS", 2, "locations");
        A05 = enumC39565Hdb3;
        EnumC39565Hdb[] enumC39565HdbArr = {enumC39565Hdb, enumC39565Hdb2, enumC39565Hdb3, new EnumC39565Hdb("PRODUCTS", 3, "products")};
        A03 = enumC39565HdbArr;
        A02 = AbstractC12190kN.A00(enumC39565HdbArr);
        A01 = AbstractC166987dD.A1G();
        for (EnumC39565Hdb enumC39565Hdb4 : values()) {
            A01.put(enumC39565Hdb4.A00, enumC39565Hdb4);
        }
    }

    public static EnumC39565Hdb valueOf(String str) {
        return (EnumC39565Hdb) Enum.valueOf(EnumC39565Hdb.class, str);
    }

    public static EnumC39565Hdb[] values() {
        return (EnumC39565Hdb[]) A03.clone();
    }

    public EnumC39565Hdb(String str, int i, String str2) {
        this.A00 = str2;
    }
}
