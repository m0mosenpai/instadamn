package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NhD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53275NhD {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53275NhD[] A04;
    public static final EnumC53275NhD A05;
    public static final EnumC53275NhD A06;
    public static final EnumC53275NhD A07;
    public static final EnumC53275NhD A08;
    public static final EnumC53275NhD A09;
    public static final EnumC53275NhD A0A;
    public static final EnumC53275NhD A0B;
    public static final EnumC53275NhD A0C;
    public static final EnumC53275NhD A0D;
    public static final EnumC53275NhD A0E;
    public static final EnumC53275NhD A0F;
    public static final EnumC53275NhD A0G;
    public static final EnumC53275NhD A0H;
    public static final EnumC53275NhD A0I;
    public static final EnumC53275NhD A0J;
    public static final EnumC53275NhD A0K;
    public static final EnumC53275NhD A0L;
    public static final EnumC53275NhD A0M;
    public static final EnumC53275NhD A0N;
    public static final EnumC53275NhD A0O;
    public static final EnumC53275NhD A0P;
    public final int A00;
    public final Integer A01;
    public final String A02;

    static {
        EnumC53275NhD enumC53275NhD = new EnumC53275NhD("SUCCESS", "", 0, -1, C05F.A0g);
        A0N = enumC53275NhD;
        Integer num = C05F.A0a;
        EnumC53275NhD enumC53275NhD2 = new EnumC53275NhD("UNKNOWN", "Unknown error", 1, 0, num);
        A0O = enumC53275NhD2;
        EnumC53275NhD enumC53275NhD3 = new EnumC53275NhD("PERMISSION_ERROR", "Permission error", 2, 1, num);
        A0G = enumC53275NhD3;
        EnumC53275NhD enumC53275NhD4 = new EnumC53275NhD("ACCOUNT_NOT_MATCH", "Accounts do not match", 3, 2, C05F.A0B);
        A06 = enumC53275NhD4;
        EnumC53275NhD enumC53275NhD5 = new EnumC53275NhD("INVALID_REQUEST", "Invalid request", 4, 3, C05F.A0K);
        A0C = enumC53275NhD5;
        EnumC53275NhD enumC53275NhD6 = new EnumC53275NhD(MessageAvailabilityResponseId$Companion.NOT_SUPPORTED, "Operation not supported", 5, 4, C05F.A0T);
        A0F = enumC53275NhD6;
        Integer num2 = C05F.A0H;
        EnumC53275NhD enumC53275NhD7 = new EnumC53275NhD("SEND_MESSAGE_OPERATION_FAILED", "Send message operation failed", 6, 5, num2);
        A0K = enumC53275NhD7;
        EnumC53275NhD enumC53275NhD8 = new EnumC53275NhD("APP_NOT_LOGGED_IN", "Instagram is not logged in", 7, 7, C05F.A0E);
        A07 = enumC53275NhD8;
        EnumC53275NhD enumC53275NhD9 = new EnumC53275NhD("STELLA_NOT_ENABLED", "Stella is not enabled", 8, 8, C05F.A0I);
        A0M = enumC53275NhD9;
        EnumC53275NhD enumC53275NhD10 = new EnumC53275NhD("IPC_SERVICE_NOT_BOUND", "Can not bind to service", 9, 9, C05F.A0P);
        A0D = enumC53275NhD10;
        EnumC53275NhD enumC53275NhD11 = new EnumC53275NhD("UNSUPPORTED_PROTOCOL_VERSION", "This protocol version is no longer supported", 10, 10, C05F.A0e);
        A0P = enumC53275NhD11;
        EnumC53275NhD enumC53275NhD12 = new EnumC53275NhD("ACCOUNT_NOT_LINKED", "Accounts are not linked", 11, 11, C05F.A0D);
        A05 = enumC53275NhD12;
        EnumC53275NhD enumC53275NhD13 = new EnumC53275NhD("REQUEST_JSON_PARSE_FAILED", "Request json parse failed", 12, 12, C05F.A0L);
        A0H = enumC53275NhD13;
        EnumC53275NhD enumC53275NhD14 = new EnumC53275NhD("REQUEST_SOURCE_MEDIA_ERROR", "Request source media error", 13, 13, C05F.A0V);
        A0I = enumC53275NhD14;
        EnumC53275NhD enumC53275NhD15 = new EnumC53275NhD("SHARING_MEDIA_FAILED", "Sharing media failed", 14, 14, num2);
        A0L = enumC53275NhD15;
        EnumC53275NhD enumC53275NhD16 = new EnumC53275NhD("IG_ACCOUNT_PRIVACY_STATUS_MISMATCH", "IG account privacy status changed", 15, 15, C05F.A0J);
        A0B = enumC53275NhD16;
        EnumC53275NhD enumC53275NhD17 = new EnumC53275NhD("DIRECT_NOT_INIT", "IG direct plugin is not initialized", 16, 16, C05F.A0f);
        A0A = enumC53275NhD17;
        EnumC53275NhD enumC53275NhD18 = new EnumC53275NhD("CLOSE_FRIENDS_UNAVAILABLE", "User does not have close friends story", 17, 17, C05F.A0h);
        A09 = enumC53275NhD18;
        EnumC53275NhD enumC53275NhD19 = new EnumC53275NhD("SEND_MESSAGE_LIMIT_EXCEED", "Send message operation failed due to message request limit", 18, 18, num2);
        A0J = enumC53275NhD19;
        EnumC53275NhD enumC53275NhD20 = new EnumC53275NhD("MISSING_AUDIO_CALLING_PERMISSION", "User does not have audio calling permission in instagram", 19, 19, C05F.A0i);
        A0E = enumC53275NhD20;
        EnumC53275NhD enumC53275NhD21 = new EnumC53275NhD("CALL_LIMIT_EXCEED", "Start call operation failed due to reachability invite limit", 20, 20, num2);
        A08 = enumC53275NhD21;
        EnumC53275NhD[] enumC53275NhDArr = {enumC53275NhD, enumC53275NhD2, enumC53275NhD3, enumC53275NhD4, enumC53275NhD5, enumC53275NhD6, enumC53275NhD7, enumC53275NhD8, enumC53275NhD9, enumC53275NhD10, enumC53275NhD11, enumC53275NhD12, enumC53275NhD13, enumC53275NhD14, enumC53275NhD15, enumC53275NhD16, enumC53275NhD17, enumC53275NhD18, enumC53275NhD19, enumC53275NhD20, enumC53275NhD21, new EnumC53275NhD("CALL_UNREACHABLE", "Start call operation failed due to reachability status issues", 21, 21, num2)};
        A04 = enumC53275NhDArr;
        A03 = AbstractC12190kN.A00(enumC53275NhDArr);
    }

    public static EnumC53275NhD valueOf(String str) {
        return (EnumC53275NhD) Enum.valueOf(EnumC53275NhD.class, str);
    }

    public static EnumC53275NhD[] values() {
        return (EnumC53275NhD[]) A04.clone();
    }

    public EnumC53275NhD(String str, String str2, int i, int i2, Integer num) {
        this.A00 = i2;
        this.A02 = str2;
        this.A01 = num;
    }
}
