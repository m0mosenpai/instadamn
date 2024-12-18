package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.ErE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33479ErE implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC33479ErE[] A01;
    public static final EnumC33479ErE A02;
    public static final EnumC33479ErE A03;
    public static final EnumC33479ErE A04;
    public final String A00;

    static {
        EnumC33479ErE enumC33479ErE = new EnumC33479ErE("SETTINGS", 0, "settings");
        EnumC33479ErE enumC33479ErE2 = new EnumC33479ErE("NOTIFICATION", 1, "notification");
        EnumC33479ErE enumC33479ErE3 = new EnumC33479ErE("QP", 2, "qp");
        EnumC33479ErE enumC33479ErE4 = new EnumC33479ErE("PRO_HOME", 3, "pro_home");
        EnumC33479ErE enumC33479ErE5 = new EnumC33479ErE("PROFILE", 4, "profile");
        EnumC33479ErE enumC33479ErE6 = new EnumC33479ErE(PaymentDetailChangeTypes$Companion.EMAIL, 5, "email");
        EnumC33479ErE enumC33479ErE7 = new EnumC33479ErE("POST_LIVE", 6, "post_live");
        A03 = enumC33479ErE7;
        EnumC33479ErE enumC33479ErE8 = new EnumC33479ErE("PRE_LIVE", 7, "pre_live");
        EnumC33479ErE enumC33479ErE9 = new EnumC33479ErE("LIVE", 8, "live");
        EnumC33479ErE enumC33479ErE10 = new EnumC33479ErE("LIVE_AUDIENCE", 9, "live_audience");
        EnumC33479ErE enumC33479ErE11 = new EnumC33479ErE("LIVE_SCHEDULE_AUDIENCE", 10, "live_schedule_audience");
        EnumC33479ErE enumC33479ErE12 = new EnumC33479ErE("MONETIZATION_INBOX", 11, "monetization_inbox");
        EnumC33479ErE enumC33479ErE13 = new EnumC33479ErE("MONETIZATION_INBOX_INVITE_NOTIFICATION", 12, "monetization_inbox_invite_notification");
        EnumC33479ErE enumC33479ErE14 = new EnumC33479ErE("BADGES_ESTIMATED_EARNINGS", 13, "badges_estimated_earnings");
        A02 = enumC33479ErE14;
        EnumC33479ErE enumC33479ErE15 = new EnumC33479ErE("BADGES_SUPPORTERS_LIST", 14, "badges_supporters_list");
        EnumC33479ErE enumC33479ErE16 = new EnumC33479ErE("STICKER_TRAY", 15, "sticker_tray");
        A04 = enumC33479ErE16;
        EnumC33479ErE enumC33479ErE17 = new EnumC33479ErE("STORY_INSIGHTS", 16, "story_insights");
        EnumC33479ErE enumC33479ErE18 = new EnumC33479ErE("SUPPORT_INBOX", 17, "support_inbox");
        EnumC33479ErE enumC33479ErE19 = new EnumC33479ErE("MONETIZATION_ELIGIBILITY_SCREEN", 18, "monetization_eligibility_screen");
        EnumC33479ErE enumC33479ErE20 = new EnumC33479ErE("PAYOUT_HUB", 19, "payout_hub");
        EnumC33479ErE enumC33479ErE21 = new EnumC33479ErE("QPSTORY", 20, "qpstory");
        EnumC33479ErE enumC33479ErE22 = new EnumC33479ErE("NATIVE_PROMO_DIALOG", 21, "native_promo_dialog");
        EnumC33479ErE enumC33479ErE23 = new EnumC33479ErE("BSC_PRO_DASH", 22, "bsc_pro_dash");
        EnumC33479ErE enumC33479ErE24 = new EnumC33479ErE("FAN_REFERRAL_DM", 23, "fan_referral_dm");
        EnumC33479ErE enumC33479ErE25 = new EnumC33479ErE("OCT_MONETIZATION_TOOLS", 24, "oct_monetization_tools");
        EnumC33479ErE enumC33479ErE26 = new EnumC33479ErE("REEL_INSIGHTS", 25, "reel_insights");
        EnumC33479ErE enumC33479ErE27 = new EnumC33479ErE("REEL", 26, "reel");
        EnumC33479ErE[] enumC33479ErEArr = new EnumC33479ErE[30];
        System.arraycopy(new EnumC33479ErE[]{new EnumC33479ErE("ADVANCED_SETTINGS", 27, "advanced_settings"), new EnumC33479ErE("UNKNOWN", 28, "unknown"), new EnumC33479ErE("BPA_HOME", 29, "bpa_home")}, AbstractC31175DnJ.A1b(new EnumC33479ErE[]{enumC33479ErE, enumC33479ErE2, enumC33479ErE3, enumC33479ErE4, enumC33479ErE5, enumC33479ErE6, enumC33479ErE7, enumC33479ErE8, enumC33479ErE9, enumC33479ErE10, enumC33479ErE11, enumC33479ErE12, enumC33479ErE13, enumC33479ErE14, enumC33479ErE15, enumC33479ErE16, enumC33479ErE17, enumC33479ErE18, enumC33479ErE19, enumC33479ErE20, enumC33479ErE21, enumC33479ErE22, enumC33479ErE23, enumC33479ErE24, enumC33479ErE25, enumC33479ErE26, enumC33479ErE27}, enumC33479ErEArr) ? 1 : 0, enumC33479ErEArr, 27, 3);
        A01 = enumC33479ErEArr;
    }

    public static EnumC33479ErE valueOf(String str) {
        return (EnumC33479ErE) Enum.valueOf(EnumC33479ErE.class, str);
    }

    public static EnumC33479ErE[] values() {
        return (EnumC33479ErE[]) A01.clone();
    }

    public EnumC33479ErE(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
