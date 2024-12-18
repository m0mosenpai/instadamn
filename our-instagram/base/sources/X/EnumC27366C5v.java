package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C5v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27366C5v {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27366C5v[] A01;
    public static final EnumC27366C5v A02;
    public static final EnumC27366C5v A03;

    static {
        EnumC27366C5v enumC27366C5v = new EnumC27366C5v(ServerW3CShippingAddressConstants.DEFAULT, 0);
        A02 = enumC27366C5v;
        EnumC27366C5v enumC27366C5v2 = new EnumC27366C5v("Mini", 1);
        A03 = enumC27366C5v2;
        EnumC27366C5v[] enumC27366C5vArr = {enumC27366C5v, enumC27366C5v2};
        A01 = enumC27366C5vArr;
        A00 = AbstractC12190kN.A00(enumC27366C5vArr);
    }

    public static EnumC27366C5v valueOf(String str) {
        return (EnumC27366C5v) Enum.valueOf(EnumC27366C5v.class, str);
    }

    public static EnumC27366C5v[] values() {
        return (EnumC27366C5v[]) A01.clone();
    }

    public EnumC27366C5v(String str, int i) {
    }
}
