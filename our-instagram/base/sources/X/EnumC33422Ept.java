package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ept, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33422Ept {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC33422Ept[] A04;
    public static final EnumC33422Ept A05;
    public static final EnumC33422Ept A06;
    public static final EnumC33422Ept A07;
    public static final EnumC33422Ept A08;
    public static final EnumC33422Ept A09;
    public static final EnumC33422Ept A0A;
    public static final EnumC33422Ept A0B;
    public long A00 = 0;
    public final String A01;
    public final String A02;

    static {
        EnumC33422Ept enumC33422Ept = new EnumC33422Ept("FOLLOW_USER_FLOW", "follow", "follow_button_profile", 0);
        A08 = enumC33422Ept;
        EnumC33422Ept enumC33422Ept2 = new EnumC33422Ept("UNFOLLOW_USER_FLOW", "unfollow", "unfollow_button_profile", 1);
        A0B = enumC33422Ept2;
        EnumC33422Ept enumC33422Ept3 = new EnumC33422Ept("EDIT_BIO_FLOW", "edit_bio", "edit_profile_bio_button_profile", 2);
        A05 = enumC33422Ept3;
        EnumC33422Ept enumC33422Ept4 = new EnumC33422Ept("PIN_POST_FLOW", "pin_post", "pin_post_button_profile", 3);
        A0A = enumC33422Ept4;
        EnumC33422Ept enumC33422Ept5 = new EnumC33422Ept("EDIT_NAME_FLOW", "edit_name", "edit_profile_name_button_profile", 4);
        A06 = enumC33422Ept5;
        EnumC33422Ept enumC33422Ept6 = new EnumC33422Ept("EDIT_PROFILE_PIC_FLOW", "edit_profile_picture", "edit_profile_picture_button_profile", 5);
        A07 = enumC33422Ept6;
        EnumC33422Ept enumC33422Ept7 = new EnumC33422Ept("LIST_FOLLOW_USER_FLOW", "list_follow", "list_follow_button_profile", 6);
        A09 = enumC33422Ept7;
        EnumC33422Ept[] enumC33422EptArr = {enumC33422Ept, enumC33422Ept2, enumC33422Ept3, enumC33422Ept4, enumC33422Ept5, enumC33422Ept6, enumC33422Ept7, new EnumC33422Ept("LIST_UNFOLLOW_USER_FLOW", "list_unfollow", "list_unfollow_button_profile", 7)};
        A04 = enumC33422EptArr;
        A03 = AbstractC12190kN.A00(enumC33422EptArr);
    }

    public EnumC33422Ept(String str, String str2, String str3, int i) {
        this.A01 = str2;
        this.A02 = str3;
    }

    public static EnumC33422Ept valueOf(String str) {
        return (EnumC33422Ept) Enum.valueOf(EnumC33422Ept.class, str);
    }

    public static EnumC33422Ept[] values() {
        return (EnumC33422Ept[]) A04.clone();
    }
}
