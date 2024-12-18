package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53245Ngi {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53245Ngi[] A03;
    public static final EnumC53245Ngi A04;
    public static final EnumC53245Ngi A05;
    public static final EnumC53245Ngi A06;
    public static final EnumC53245Ngi A07;
    public static final EnumC53245Ngi A08;
    public static final EnumC53245Ngi A09;
    public static final EnumC53245Ngi A0A;
    public static final EnumC53245Ngi A0B;
    public static final EnumC53245Ngi A0C;
    public static final EnumC53245Ngi A0D;
    public static final EnumC53245Ngi A0E;
    public static final EnumC53245Ngi A0F;
    public static final EnumC53245Ngi A0G;
    public static final EnumC53245Ngi A0H;
    public final String A00;

    static {
        EnumC53245Ngi enumC53245Ngi = new EnumC53245Ngi("MULTI_USER_JOINED", 0, "multi_user_joined");
        A06 = enumC53245Ngi;
        EnumC53245Ngi enumC53245Ngi2 = new EnumC53245Ngi("SINGLE_USER_LEFT", 1, "single_user_left");
        A0B = enumC53245Ngi2;
        EnumC53245Ngi enumC53245Ngi3 = new EnumC53245Ngi("SOCIAL_CONTEXT", 2, "social_context");
        A0C = enumC53245Ngi3;
        EnumC53245Ngi enumC53245Ngi4 = new EnumC53245Ngi("USER_PAY_INCENTIVES", 3, "user_pay_incentives");
        A0F = enumC53245Ngi4;
        EnumC53245Ngi enumC53245Ngi5 = new EnumC53245Ngi("USER_PAY_RECOGNITION", 4, "user_pay_recognition");
        A0G = enumC53245Ngi5;
        EnumC53245Ngi enumC53245Ngi6 = new EnumC53245Ngi("SHOPPING_SOCIAL_CONTEXT", 5, "shopping_social_context");
        A09 = enumC53245Ngi6;
        EnumC53245Ngi enumC53245Ngi7 = new EnumC53245Ngi("SHOPPING_BRAND_INSIGHTS", 6, "shopping_brand_insights");
        A08 = enumC53245Ngi7;
        EnumC53245Ngi enumC53245Ngi8 = new EnumC53245Ngi("NOTIFICATION_UPSELL", 7, "notification_upsell");
        A07 = enumC53245Ngi8;
        EnumC53245Ngi enumC53245Ngi9 = new EnumC53245Ngi("FOLLOW_UPSELL", 8, "follow_upsell");
        A04 = enumC53245Ngi9;
        EnumC53245Ngi enumC53245Ngi10 = new EnumC53245Ngi("USER_FOLLOWED", 9, "user_followed");
        A0E = enumC53245Ngi10;
        EnumC53245Ngi enumC53245Ngi11 = new EnumC53245Ngi("VIEWER_LIST_DISCLAIMER", 10, "viewer_list_disclaimer");
        A0H = enumC53245Ngi11;
        EnumC53245Ngi enumC53245Ngi12 = new EnumC53245Ngi("LIVE_MODERATOR_UPSELL", 11, "live_moderator_upsell");
        A05 = enumC53245Ngi12;
        EnumC53245Ngi enumC53245Ngi13 = new EnumC53245Ngi("SHOPPING_SOCIAL_CONTEXT_DISCLAIMER", 12, "shopping_social_context_disclaimer");
        A0A = enumC53245Ngi13;
        EnumC53245Ngi enumC53245Ngi14 = new EnumC53245Ngi("UNKNOWN", 13, "unknown");
        A0D = enumC53245Ngi14;
        EnumC53245Ngi[] enumC53245NgiArr = {enumC53245Ngi, enumC53245Ngi2, enumC53245Ngi3, enumC53245Ngi4, enumC53245Ngi5, enumC53245Ngi6, enumC53245Ngi7, enumC53245Ngi8, enumC53245Ngi9, enumC53245Ngi10, enumC53245Ngi11, enumC53245Ngi12, enumC53245Ngi13, enumC53245Ngi14};
        A03 = enumC53245NgiArr;
        A02 = AbstractC12190kN.A00(enumC53245NgiArr);
        EnumC53245Ngi[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53245Ngi enumC53245Ngi15 : values) {
            A18.put(enumC53245Ngi15.A00, enumC53245Ngi15);
        }
        A01 = A18;
    }

    public static EnumC53245Ngi valueOf(String str) {
        return (EnumC53245Ngi) Enum.valueOf(EnumC53245Ngi.class, str);
    }

    public static EnumC53245Ngi[] values() {
        return (EnumC53245Ngi[]) A03.clone();
    }

    public EnumC53245Ngi(String str, int i, String str2) {
        this.A00 = str2;
    }
}
