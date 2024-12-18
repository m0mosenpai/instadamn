package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5Kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC115415Kb {
    public static final C115425Kc A05;
    public static final /* synthetic */ EnumEntries A06;
    public static final /* synthetic */ EnumC115415Kb[] A07;
    public static final EnumC115415Kb A08;
    public static final EnumC115415Kb A09;
    public static final EnumC115415Kb A0A;
    public static final EnumC115415Kb A0B;
    public static final EnumC115415Kb A0C;
    public static final EnumC115415Kb A0D;
    public static final EnumC115415Kb A0E;
    public static final EnumC115415Kb A0F;
    public static final EnumC115415Kb A0G;
    public static final EnumC115415Kb A0H;
    public static final EnumC115415Kb A0I;
    public static final EnumC115415Kb A0J;
    public static final EnumC115415Kb A0K;
    public static final EnumC115415Kb A0L;
    public static final EnumC115415Kb A0M;
    public static final EnumC115415Kb A0N;
    public static final EnumC115415Kb A0O;
    public static final EnumC115415Kb A0P;
    public static final EnumC115415Kb A0Q;
    public static final EnumC115415Kb A0R;
    public static final EnumC115415Kb A0S;
    public static final EnumC115415Kb A0T;
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public static EnumC115415Kb valueOf(String str) {
        return (EnumC115415Kb) Enum.valueOf(EnumC115415Kb.class, str);
    }

    public static EnumC115415Kb[] values() {
        return (EnumC115415Kb[]) A07.clone();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.5Kc] */
    static {
        Integer num = C05F.A01;
        EnumC115415Kb enumC115415Kb = new EnumC115415Kb(num, "INCOMPLETE_ERROR", 0, false, true, true);
        A0D = enumC115415Kb;
        Integer num2 = C05F.A0C;
        EnumC115415Kb enumC115415Kb2 = new EnumC115415Kb(num2, "REPEAT_ERROR", 1, false, true, true);
        A0L = enumC115415Kb2;
        EnumC115415Kb enumC115415Kb3 = new EnumC115415Kb(num2, "RETRY_LATER_ERROR", 2, false, false, true);
        A0M = enumC115415Kb3;
        EnumC115415Kb enumC115415Kb4 = new EnumC115415Kb(num2, "BASIC_IO_ERROR", 3, false, true, true);
        A0A = enumC115415Kb4;
        EnumC115415Kb enumC115415Kb5 = new EnumC115415Kb(num2, "TIMEOUT_ERROR", 4, false, true, true);
        A0N = enumC115415Kb5;
        EnumC115415Kb enumC115415Kb6 = new EnumC115415Kb(num2, "INVALID_REPLY_NETWORK_ERROR", 5, false, true, true);
        A0E = enumC115415Kb6;
        EnumC115415Kb enumC115415Kb7 = new EnumC115415Kb(num2, "QUESTIONABLE_NETWORK_ERROR", 6, true, true, true);
        A0K = enumC115415Kb7;
        EnumC115415Kb enumC115415Kb8 = new EnumC115415Kb(num2, "ZERO_NETWORK_ERROR", 7, false, false, true);
        A0T = enumC115415Kb8;
        Integer num3 = C05F.A00;
        EnumC115415Kb enumC115415Kb9 = new EnumC115415Kb(num3, "AIRPLANE_MODE_ERROR", 8, false, false, true);
        A08 = enumC115415Kb9;
        EnumC115415Kb enumC115415Kb10 = new EnumC115415Kb(num3, "UNEXPECTED_ERROR", 9, false, false, true);
        A0P = enumC115415Kb10;
        EnumC115415Kb enumC115415Kb11 = new EnumC115415Kb(num3, "CANCELLATION_ERROR", 10, false, false, true);
        A0C = enumC115415Kb11;
        EnumC115415Kb enumC115415Kb12 = new EnumC115415Kb(num2, "TRANSIENT_SERVER_ERROR", 11, false, true, true);
        A0O = enumC115415Kb12;
        EnumC115415Kb enumC115415Kb13 = new EnumC115415Kb(num3, "BLOCKING_SERVER_ERROR", 12, false, false, true);
        A0B = enumC115415Kb13;
        EnumC115415Kb enumC115415Kb14 = new EnumC115415Kb(num3, "MAY_RETRY_CLIENT_ERROR", 13, false, false, true);
        A0F = enumC115415Kb14;
        EnumC115415Kb enumC115415Kb15 = new EnumC115415Kb(num, "MAY_RETRY_CLIENT_ERROR_V2", 14, false, false, true);
        A0G = enumC115415Kb15;
        EnumC115415Kb enumC115415Kb16 = new EnumC115415Kb(num3, "VIDEO_RENDER_ERROR", 15, false, false, true);
        A0R = enumC115415Kb16;
        EnumC115415Kb enumC115415Kb17 = new EnumC115415Kb(num, "VIDEO_RENDER_ERROR_V2", 16, false, false, true);
        A0S = enumC115415Kb17;
        EnumC115415Kb enumC115415Kb18 = new EnumC115415Kb(num3, "MISSING_FILE_ERROR", 17, false, false, false);
        A0H = enumC115415Kb18;
        EnumC115415Kb enumC115415Kb19 = new EnumC115415Kb(num, "MISSING_FILE_ERROR_V2", 18, false, false, true);
        A0I = enumC115415Kb19;
        EnumC115415Kb enumC115415Kb20 = new EnumC115415Kb(num3, "BAD_VIDEO_FILE", 19, false, false, false);
        A09 = enumC115415Kb20;
        EnumC115415Kb enumC115415Kb21 = new EnumC115415Kb(num3, "PERMANENT_CLIENT_ERROR", 20, false, false, false);
        A0J = enumC115415Kb21;
        EnumC115415Kb enumC115415Kb22 = new EnumC115415Kb(num3, "VALIDATION_ERROR", 21, false, false, false);
        A0Q = enumC115415Kb22;
        EnumC115415Kb[] enumC115415KbArr = {enumC115415Kb, enumC115415Kb2, enumC115415Kb3, enumC115415Kb4, enumC115415Kb5, enumC115415Kb6, enumC115415Kb7, enumC115415Kb8, enumC115415Kb9, enumC115415Kb10, enumC115415Kb11, enumC115415Kb12, enumC115415Kb13, enumC115415Kb14, enumC115415Kb15, enumC115415Kb16, enumC115415Kb17, enumC115415Kb18, enumC115415Kb19, enumC115415Kb20, enumC115415Kb21, enumC115415Kb22};
        A07 = enumC115415KbArr;
        A06 = AbstractC12190kN.A00(enumC115415KbArr);
        A05 = new Object();
    }

    public EnumC115415Kb(Integer num, String str, int i, boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A03 = z2;
        this.A00 = num;
        this.A04 = z3;
        this.A01 = num != C05F.A00;
    }
}
