package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46211Kcn {
    public static final EnumC46211Kcn[] A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC46211Kcn[] A04;
    public static final EnumC46211Kcn A05;
    public static final EnumC46211Kcn A06;
    public static final EnumC46211Kcn A07;
    public static final EnumC46211Kcn A08;
    public static final EnumC46211Kcn A09;
    public static final EnumC46211Kcn A0A;
    public static final EnumC46211Kcn A0B;
    public static final EnumC46211Kcn A0C;
    public static final EnumC46211Kcn A0D;
    public static final EnumC46211Kcn A0E;
    public static final EnumC46211Kcn A0F;
    public static final EnumC46211Kcn A0G;
    public final Number A00;
    public final String A01;

    static {
        EnumC46211Kcn enumC46211Kcn = new EnumC46211Kcn(0, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, "SAP_VESTA_ERROR_CODE_NONE", 0);
        A0A = enumC46211Kcn;
        EnumC46211Kcn enumC46211Kcn2 = new EnumC46211Kcn(1, "INTERNAL", "SAP_VESTA_ERROR_CODE_INTERNAL", 1);
        A07 = enumC46211Kcn2;
        EnumC46211Kcn enumC46211Kcn3 = new EnumC46211Kcn(2, "ITEM_NOT_FOUND", "SAP_VESTA_ERROR_CODE_ITEM_NOT_FOUND", 2);
        A08 = enumC46211Kcn3;
        EnumC46211Kcn enumC46211Kcn4 = new EnumC46211Kcn(3, "LOGIN_REQUEST_RATE_LIMIT", "SAP_VESTA_ERROR_CODE_LOGIN_REQUEST_RATE_LIMIT", 3);
        A09 = enumC46211Kcn4;
        EnumC46211Kcn enumC46211Kcn5 = new EnumC46211Kcn(4, "NOT_AUTHORIZED", "SAP_VESTA_ERROR_CODE_NOT_AUTHORIZED", 4);
        A0B = enumC46211Kcn5;
        EnumC46211Kcn enumC46211Kcn6 = new EnumC46211Kcn(5, "INCORRECT_PASSWORD", "SAP_VESTA_ERROR_CODE_WRONG_PASSWORD", 5);
        A06 = enumC46211Kcn6;
        EnumC46211Kcn enumC46211Kcn7 = new EnumC46211Kcn(6, "FORBIDDEN", "SAP_VESTA_ERROR_CODE_FORBIDDEN", 6);
        A05 = enumC46211Kcn7;
        EnumC46211Kcn enumC46211Kcn8 = new EnumC46211Kcn(7, "POST_LOGIN_FAILURE_RETRYABLE", "SAP_VESTA_ERROR_CODE_POST_LOGIN_FAILURE_RETRYABLE", 7);
        A0E = enumC46211Kcn8;
        EnumC46211Kcn enumC46211Kcn9 = new EnumC46211Kcn(8, "POST_LOGIN_FAILURE_NOT_RETRYABLE", "SAP_VESTA_ERROR_CODE_POST_LOGIN_FAILURE_NONRETRYABLE", 8);
        A0D = enumC46211Kcn9;
        EnumC46211Kcn enumC46211Kcn10 = new EnumC46211Kcn(9, "PIN_NORMALIZATION_FAILED", "SAP_VESTA_ERROR_CODE_PIN_NORMALIZATION_FAILED", 9);
        A0C = enumC46211Kcn10;
        EnumC46211Kcn enumC46211Kcn11 = new EnumC46211Kcn(10, "SECURITY_QUESTION_NORMALIZATION_FAILED", "SAP_VESTA_ERROR_CODE_SECURITY_QUESTION_NORMALIZATION_FAILED", 10);
        A0F = enumC46211Kcn11;
        EnumC46211Kcn enumC46211Kcn12 = new EnumC46211Kcn(11, "UNKNOWN", "UNKNOWN", 11);
        A0G = enumC46211Kcn12;
        EnumC46211Kcn[] enumC46211KcnArr = {enumC46211Kcn, enumC46211Kcn2, enumC46211Kcn3, enumC46211Kcn4, enumC46211Kcn5, enumC46211Kcn6, enumC46211Kcn7, enumC46211Kcn8, enumC46211Kcn9, enumC46211Kcn10, enumC46211Kcn11, enumC46211Kcn12};
        A04 = enumC46211KcnArr;
        A03 = AbstractC12190kN.A00(enumC46211KcnArr);
        A02 = values();
    }

    public static EnumC46211Kcn valueOf(String str) {
        return (EnumC46211Kcn) Enum.valueOf(EnumC46211Kcn.class, str);
    }

    public static EnumC46211Kcn[] values() {
        return (EnumC46211Kcn[]) A04.clone();
    }

    public EnumC46211Kcn(Number number, String str, String str2, int i) {
        this.A00 = number;
        this.A01 = str2;
    }
}
