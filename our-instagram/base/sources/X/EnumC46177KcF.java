package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46177KcF {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46177KcF[] A01;
    public static final EnumC46177KcF A02;
    public static final EnumC46177KcF A03;
    public static final EnumC46177KcF A04;
    public static final EnumC46177KcF A05;
    public static final EnumC46177KcF A06;
    public static final EnumC46177KcF A07;
    public static final EnumC46177KcF A08;

    static {
        EnumC46177KcF enumC46177KcF = new EnumC46177KcF("DEVICE_ID", 0);
        A02 = enumC46177KcF;
        EnumC46177KcF enumC46177KcF2 = new EnumC46177KcF("MAC_ADDRESS", 1);
        A03 = enumC46177KcF2;
        EnumC46177KcF enumC46177KcF3 = new EnumC46177KcF(PaymentDetailChangeTypes$Companion.PHONE_NUMBER, 2);
        A04 = enumC46177KcF3;
        EnumC46177KcF enumC46177KcF4 = new EnumC46177KcF("SESSION_TOKEN", 3);
        A05 = enumC46177KcF4;
        EnumC46177KcF enumC46177KcF5 = new EnumC46177KcF("USER_ID", 4);
        A08 = enumC46177KcF5;
        EnumC46177KcF enumC46177KcF6 = new EnumC46177KcF("USERNAME", 5);
        A06 = enumC46177KcF6;
        EnumC46177KcF enumC46177KcF7 = new EnumC46177KcF("USER_EMAIL", 6);
        A07 = enumC46177KcF7;
        EnumC46177KcF[] enumC46177KcFArr = {enumC46177KcF, enumC46177KcF2, enumC46177KcF3, enumC46177KcF4, enumC46177KcF5, enumC46177KcF6, enumC46177KcF7, new EnumC46177KcF("USER_PHONE", 7)};
        A01 = enumC46177KcFArr;
        A00 = AbstractC12190kN.A00(enumC46177KcFArr);
    }

    public static EnumC46177KcF valueOf(String str) {
        return (EnumC46177KcF) Enum.valueOf(EnumC46177KcF.class, str);
    }

    public static EnumC46177KcF[] values() {
        return (EnumC46177KcF[]) A01.clone();
    }

    public EnumC46177KcF(String str, int i) {
    }
}
