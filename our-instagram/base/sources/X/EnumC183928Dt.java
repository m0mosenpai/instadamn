package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Dt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC183928Dt {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC183928Dt[] A03;
    public static final EnumC183928Dt A04;
    public static final EnumC183928Dt A05;
    public static final EnumC183928Dt A06;
    public static final EnumC183928Dt A07;
    public static final EnumC183928Dt A08;
    public static final EnumC183928Dt A09;
    public static final EnumC183928Dt A0A;
    public static final EnumC183928Dt A0B;
    public static final EnumC183928Dt A0C;
    public final int A00;

    static {
        EnumC183928Dt enumC183928Dt = new EnumC183928Dt(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A08 = enumC183928Dt;
        EnumC183928Dt enumC183928Dt2 = new EnumC183928Dt("WEB_URL", 1, 1);
        A0C = enumC183928Dt2;
        EnumC183928Dt enumC183928Dt3 = new EnumC183928Dt("IGTV", 2, 2);
        A06 = enumC183928Dt3;
        EnumC183928Dt enumC183928Dt4 = new EnumC183928Dt("BUSINESS_TRANSACTION", 3, 3);
        A05 = enumC183928Dt4;
        EnumC183928Dt enumC183928Dt5 = new EnumC183928Dt("AR_EFFECT", 4, 4);
        A04 = enumC183928Dt5;
        EnumC183928Dt enumC183928Dt6 = new EnumC183928Dt("PROFILE_SHOP", 5, 5);
        A09 = enumC183928Dt6;
        EnumC183928Dt enumC183928Dt7 = new EnumC183928Dt("SHOPPING_PRODUCT", 6, 7);
        A0A = enumC183928Dt7;
        EnumC183928Dt enumC183928Dt8 = new EnumC183928Dt("SHOPPING_PRODUCT_COLLECTION", 7, 8);
        A0B = enumC183928Dt8;
        EnumC183928Dt enumC183928Dt9 = new EnumC183928Dt("INSTAGRAM_SHOP", 8, 9);
        A07 = enumC183928Dt9;
        EnumC183928Dt[] enumC183928DtArr = {enumC183928Dt, enumC183928Dt2, enumC183928Dt3, enumC183928Dt4, enumC183928Dt5, enumC183928Dt6, enumC183928Dt7, enumC183928Dt8, enumC183928Dt9, new EnumC183928Dt("SHOPPING_MULTI_PRODUCT", 9, 10)};
        A03 = enumC183928DtArr;
        A02 = AbstractC12190kN.A00(enumC183928DtArr);
        EnumC183928Dt[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC183928Dt enumC183928Dt10 : values) {
            linkedHashMap.put(Integer.valueOf(enumC183928Dt10.A00), enumC183928Dt10);
        }
        A01 = linkedHashMap;
    }

    public static EnumC183928Dt valueOf(String str) {
        return (EnumC183928Dt) Enum.valueOf(EnumC183928Dt.class, str);
    }

    public static EnumC183928Dt[] values() {
        return (EnumC183928Dt[]) A03.clone();
    }

    public EnumC183928Dt(String str, int i, int i2) {
        this.A00 = i2;
    }
}
