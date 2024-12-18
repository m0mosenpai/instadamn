package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NhB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53273NhB {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53273NhB[] A04;
    public static final EnumC53273NhB A07;
    public static final EnumC53273NhB A08;
    public static final EnumC53273NhB A09;
    public static final EnumC53273NhB A0A;
    public static final EnumC53273NhB A0B;
    public final String A00;
    public final String A01;
    public final String A02;
    public static final EnumC53273NhB A05 = new EnumC53273NhB(0, "CONTEXT_CARD", "lead_gen_full_page_context_card", "full_page_context_card_impression", null);
    public static final EnumC53273NhB A06 = new EnumC53273NhB(1, "CREATIVES", "lead_gen_creatives_context_card", "creatives_context_card_impression", null);
    public static final EnumC53273NhB A0C = new EnumC53273NhB(2, "THANK_YOU_SCREEN", "lead_gen_thank_you_screen", "consumer_thank_you_screen_impression", null);
    public static final EnumC53273NhB A0D = new EnumC53273NhB(3, "THANK_YOU_SCREEN_MULTI_SUBMIT", "lead_gen_thank_you_screen_with_multi_submit", "consumer_thank_you_screen_with_multi_submit_impression", null);

    static {
        String obj = EnumC53189Nfl.A08.toString();
        A08 = new EnumC53273NhB(4, "FORM_QUESTION_MULTIPLE_CHOICE", "lead_gen_multi_step_consumer_questions", "consumer_question_multi_step_page_impression", obj);
        A09 = new EnumC53273NhB(5, "FORM_QUESTION_SHORT_ANSWER", "lead_gen_multi_step_consumer_questions", "consumer_question_multi_step_page_impression", EnumC53189Nfl.A0A.toString());
        EnumC53273NhB enumC53273NhB = new EnumC53273NhB(6, "FORM_QUESTION_CUSTOMER_INFO", "lead_gen_multi_step_consumer_questions", "consumer_question_multi_step_page_impression", EnumC53189Nfl.A03.toString());
        A07 = enumC53273NhB;
        EnumC53273NhB enumC53273NhB2 = new EnumC53273NhB(7, "PRECLICK_STORIES_FIRST_QUESTION_MCQ", "lead_ads_stories_first_question", "lead_ads_first_question_impression", obj);
        A0B = enumC53273NhB2;
        EnumC53273NhB enumC53273NhB3 = new EnumC53273NhB(8, "PRECLICK_REELS_FIRST_QUESTION_MCQ", "lead_ads_reels_first_question", "lead_ads_first_question_impression", obj);
        A0A = enumC53273NhB3;
        EnumC53273NhB[] enumC53273NhBArr = {A05, A06, A0C, A0D, A08, A09, enumC53273NhB, enumC53273NhB2, enumC53273NhB3, new EnumC53273NhB(9, "UNKNOWN", "UNKNOWN", "UNKNOWN", null)};
        A04 = enumC53273NhBArr;
        A03 = AbstractC12190kN.A00(enumC53273NhBArr);
    }

    public static EnumC53273NhB valueOf(String str) {
        return (EnumC53273NhB) Enum.valueOf(EnumC53273NhB.class, str);
    }

    public static EnumC53273NhB[] values() {
        return (EnumC53273NhB[]) A04.clone();
    }

    public EnumC53273NhB(int i, String str, String str2, String str3, String str4) {
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }
}
