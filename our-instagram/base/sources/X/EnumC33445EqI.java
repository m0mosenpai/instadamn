package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EqI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33445EqI {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33445EqI[] A02;
    public static final EnumC33445EqI A03;
    public static final EnumC33445EqI A04;
    public static final EnumC33445EqI A05;
    public static final EnumC33445EqI A06;
    public static final EnumC33445EqI A07;
    public final String A00;

    static {
        EnumC33445EqI enumC33445EqI = new EnumC33445EqI("PHONE", 0, "phone");
        A06 = enumC33445EqI;
        EnumC33445EqI enumC33445EqI2 = new EnumC33445EqI(PaymentDetailChangeTypes$Companion.EMAIL, 1, "email");
        A03 = enumC33445EqI2;
        EnumC33445EqI enumC33445EqI3 = new EnumC33445EqI("SAC", 2, "account_linking");
        A07 = enumC33445EqI3;
        EnumC33445EqI enumC33445EqI4 = new EnumC33445EqI();
        A04 = enumC33445EqI4;
        EnumC33445EqI enumC33445EqI5 = new EnumC33445EqI(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4, NetInfoModule.CONNECTION_TYPE_NONE);
        A05 = enumC33445EqI5;
        EnumC33445EqI[] enumC33445EqIArr = {enumC33445EqI, enumC33445EqI2, enumC33445EqI3, enumC33445EqI4, enumC33445EqI5};
        A02 = enumC33445EqIArr;
        A01 = AbstractC12190kN.A00(enumC33445EqIArr);
    }

    public static EnumC33445EqI valueOf(String str) {
        return (EnumC33445EqI) Enum.valueOf(EnumC33445EqI.class, str);
    }

    public static EnumC33445EqI[] values() {
        return (EnumC33445EqI[]) A02.clone();
    }

    public EnumC33445EqI(String str, int i, String str2) {
        this.A00 = str2;
    }

    public EnumC33445EqI() {
        this.A00 = "facebook";
    }
}
