package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Equ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33459Equ implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC33459Equ[] A01;
    public static final EnumC33459Equ A02;
    public final String A00;

    static {
        EnumC33459Equ enumC33459Equ = new EnumC33459Equ("ACTIVITY_FEED", 0, "activity_feed");
        EnumC33459Equ enumC33459Equ2 = new EnumC33459Equ("BLOKS", 1, "bloks");
        EnumC33459Equ enumC33459Equ3 = new EnumC33459Equ("CREATION", 2, "creation");
        EnumC33459Equ enumC33459Equ4 = new EnumC33459Equ("CREATION_EDIT_GUIDE", 3, "creation_edit_guide");
        A02 = enumC33459Equ4;
        EnumC33459Equ enumC33459Equ5 = new EnumC33459Equ("CREATION_GUIDE_CONSUMPTION_UPSELL", 4, "creation_guide_consumption_upsell");
        EnumC33459Equ enumC33459Equ6 = new EnumC33459Equ("CREATION_GUIDES_PROFILE_TAB", 5, "creation_guides_profile_tab");
        EnumC33459Equ enumC33459Equ7 = new EnumC33459Equ("CREATION_PROFILE_SHEET", 6, "creation_profile_sheet");
        EnumC33459Equ enumC33459Equ8 = new EnumC33459Equ("DEEPLINK", 7, "deeplink");
        EnumC33459Equ enumC33459Equ9 = new EnumC33459Equ("DIRECT", 8, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        EnumC33459Equ enumC33459Equ10 = new EnumC33459Equ("DRAFTS", 9, "drafts");
        EnumC33459Equ enumC33459Equ11 = new EnumC33459Equ("EXPLORE", 10, "explore");
        EnumC33459Equ enumC33459Equ12 = new EnumC33459Equ("EXPLORE_GRID", 11, "explore_grid");
        EnumC33459Equ enumC33459Equ13 = new EnumC33459Equ("FEED", 12, "feed");
        EnumC33459Equ enumC33459Equ14 = new EnumC33459Equ("GUIDES_FEED", 13, "guides_feed");
        EnumC33459Equ enumC33459Equ15 = new EnumC33459Equ("HOME", 14, "home");
        EnumC33459Equ enumC33459Equ16 = new EnumC33459Equ("LOCATION_DETAIL", 15, "location_detail");
        EnumC33459Equ enumC33459Equ17 = new EnumC33459Equ("MAP", 16, "map");
        EnumC33459Equ enumC33459Equ18 = new EnumC33459Equ("PRO_HOME", 17, "pro_home");
        EnumC33459Equ enumC33459Equ19 = new EnumC33459Equ("PRO_ONBOARDING_CHECKLIST", 18, "pro_onboarding_checklist");
        EnumC33459Equ enumC33459Equ20 = new EnumC33459Equ("PROFILE", 19, "profile");
        EnumC33459Equ enumC33459Equ21 = new EnumC33459Equ("PUSH_NOTIFICATION", 20, "push_notification");
        EnumC33459Equ enumC33459Equ22 = new EnumC33459Equ("QUICK_PROMOTION", 21, "quick_promotion");
        EnumC33459Equ enumC33459Equ23 = new EnumC33459Equ("SAVE_COLLECTION_DETAIL", 22, "save_collection_detail");
        EnumC33459Equ enumC33459Equ24 = new EnumC33459Equ("SAVE_HOME", 23, "save_home");
        EnumC33459Equ enumC33459Equ25 = new EnumC33459Equ("SHARE_PREVIEW", 24, "share_preview");
        EnumC33459Equ enumC33459Equ26 = new EnumC33459Equ("SHOP_RESOURCES", 25, "shop_resources");
        EnumC33459Equ enumC33459Equ27 = new EnumC33459Equ("SHOPPING_HOME", 26, "shopping_home");
        EnumC33459Equ[] enumC33459EquArr = new EnumC33459Equ[30];
        System.arraycopy(new EnumC33459Equ[]{new EnumC33459Equ("STORY", 27, "story"), new EnumC33459Equ("SUGGESTED_GUIDES", 28, "suggested_guides"), new EnumC33459Equ("WEB", 29, "web")}, AbstractC31175DnJ.A1b(new EnumC33459Equ[]{enumC33459Equ, enumC33459Equ2, enumC33459Equ3, enumC33459Equ4, enumC33459Equ5, enumC33459Equ6, enumC33459Equ7, enumC33459Equ8, enumC33459Equ9, enumC33459Equ10, enumC33459Equ11, enumC33459Equ12, enumC33459Equ13, enumC33459Equ14, enumC33459Equ15, enumC33459Equ16, enumC33459Equ17, enumC33459Equ18, enumC33459Equ19, enumC33459Equ20, enumC33459Equ21, enumC33459Equ22, enumC33459Equ23, enumC33459Equ24, enumC33459Equ25, enumC33459Equ26, enumC33459Equ27}, enumC33459EquArr) ? 1 : 0, enumC33459EquArr, 27, 3);
        A01 = enumC33459EquArr;
    }

    public static EnumC33459Equ valueOf(String str) {
        return (EnumC33459Equ) Enum.valueOf(EnumC33459Equ.class, str);
    }

    public static EnumC33459Equ[] values() {
        return (EnumC33459Equ[]) A01.clone();
    }

    public EnumC33459Equ(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
