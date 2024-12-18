package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33340EoZ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33340EoZ[] A01;
    public static final EnumC33340EoZ A02;
    public static final EnumC33340EoZ A03;
    public static final EnumC33340EoZ A04;

    static {
        EnumC33340EoZ enumC33340EoZ = new EnumC33340EoZ("FAILED", 0);
        A03 = enumC33340EoZ;
        EnumC33340EoZ enumC33340EoZ2 = new EnumC33340EoZ(MessageAvailabilityResponseId$Companion.AVAILABLE, 1);
        A02 = enumC33340EoZ2;
        EnumC33340EoZ enumC33340EoZ3 = new EnumC33340EoZ("UNAVAILABLE", 2);
        A04 = enumC33340EoZ3;
        EnumC33340EoZ[] enumC33340EoZArr = {enumC33340EoZ, enumC33340EoZ2, enumC33340EoZ3};
        A01 = enumC33340EoZArr;
        A00 = AbstractC12190kN.A00(enumC33340EoZArr);
    }

    public static EnumC33340EoZ valueOf(String str) {
        return (EnumC33340EoZ) Enum.valueOf(EnumC33340EoZ.class, str);
    }

    public static EnumC33340EoZ[] values() {
        return (EnumC33340EoZ[]) A01.clone();
    }

    public EnumC33340EoZ(String str, int i) {
    }
}
