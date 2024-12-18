package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.73S, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C73S {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C73S[] A02;
    public static final C73S A03;
    public static final C73S A04;
    public static final C73S A05;
    public static final C73S A06;
    public static final C73S A07;
    public static final C73S A08;
    public static final C73S A09;
    public static final C73S A0A;
    public static final C73S A0B;
    public static final C73S A0C;
    public static final C73S A0D;
    public static final C73S A0E;
    public static final C73S A0F;
    public static final C73S A0G;
    public static final C73S A0H;
    public static final C73S A0I;
    public static final C73S A0J;
    public static final C73S A0K;
    public static final C73S A0L;
    public static final C73S A0M;
    public static final C73S A0N;
    public final int A00;

    static {
        C73S c73s = new C73S("FOLLOW", 0, 0);
        A0B = c73s;
        C73S c73s2 = new C73S("EDIT_PROFILE", 1, 0);
        A09 = c73s2;
        C73S c73s3 = new C73S("AI_MESSAGE", 2, 0);
        A03 = c73s3;
        C73S c73s4 = new C73S("MESSAGE", 3, 1);
        A0E = c73s4;
        C73S c73s5 = new C73S("SHARE_PROFILE", 4, 1);
        A0I = c73s5;
        C73S c73s6 = new C73S("SHOP", 5, 2);
        A0J = c73s6;
        C73S c73s7 = new C73S("SUBSCRIBE", 6, 2);
        A0K = c73s7;
        C73S c73s8 = new C73S("DONATE", 7, 3);
        A08 = c73s8;
        C73S c73s9 = new C73S("CONTACT", 8, 4);
        A06 = c73s9;
        C73S c73s10 = new C73S("CALL", 9, 4);
        A05 = c73s10;
        C73S c73s11 = new C73S("TEXT", 10, 4);
        A0M = c73s11;
        C73S c73s12 = new C73S("INSTAGRAM_AUDIO_CALL", 11, 4);
        A0C = c73s12;
        C73S c73s13 = new C73S(PaymentDetailChangeTypes$Companion.EMAIL, 12, 4);
        A0A = c73s13;
        C73S c73s14 = new C73S("WHATSAPP", 13, 4);
        A0N = c73s14;
        C73S c73s15 = new C73S("ORDER_NOW", 14, 5);
        A0F = c73s15;
        C73S c73s16 = new C73S("RESERVE", 15, 5);
        A0H = c73s16;
        C73S c73s17 = new C73S("LEARN_MORE", 16, 5);
        A0D = c73s17;
        C73S c73s18 = new C73S("BOOK", 17, 5);
        A04 = c73s18;
        C73S c73s19 = new C73S("DISCOVER_PEOPLE", 18, 6);
        A07 = c73s19;
        C73S c73s20 = new C73S("SUGGESTED_FOR_YOU", 19, 6);
        A0L = c73s20;
        C73S c73s21 = new C73S("OTHER", 20, 9);
        A0G = c73s21;
        C73S[] c73sArr = {c73s, c73s2, c73s3, c73s4, c73s5, c73s6, c73s7, c73s8, c73s9, c73s10, c73s11, c73s12, c73s13, c73s14, c73s15, c73s16, c73s17, c73s18, c73s19, c73s20, c73s21};
        A02 = c73sArr;
        A01 = AbstractC12190kN.A00(c73sArr);
    }

    public static C73S valueOf(String str) {
        return (C73S) Enum.valueOf(C73S.class, str);
    }

    public static C73S[] values() {
        return (C73S[]) A02.clone();
    }

    public C73S(String str, int i, int i2) {
        this.A00 = i2;
    }
}
