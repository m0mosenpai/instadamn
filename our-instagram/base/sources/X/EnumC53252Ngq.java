package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53252Ngq {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53252Ngq[] A03;
    public static final EnumC53252Ngq A04;
    public static final EnumC53252Ngq A05;
    public static final EnumC53252Ngq A06;
    public final String A00;
    public final String A01;

    static {
        EnumC53252Ngq enumC53252Ngq = new EnumC53252Ngq("TEMPLATE_LOADED", "media_kit_template_loaded", "Reset default template loaded dialog", 0);
        A06 = enumC53252Ngq;
        EnumC53252Ngq enumC53252Ngq2 = new EnumC53252Ngq("MEDIA_KIT_INTRO", "media_kit_intro_shown", "Reset Creator portfolio intro surface", 1);
        A04 = enumC53252Ngq2;
        EnumC53252Ngq enumC53252Ngq3 = new EnumC53252Ngq("READY_TO_SHARE", "media_kit_ready_to_share", "Reset change visibility educative sheet", 2);
        A05 = enumC53252Ngq3;
        EnumC53252Ngq[] enumC53252NgqArr = {enumC53252Ngq, enumC53252Ngq2, enumC53252Ngq3};
        A03 = enumC53252NgqArr;
        A02 = AbstractC12190kN.A00(enumC53252NgqArr);
    }

    public static EnumC53252Ngq valueOf(String str) {
        return (EnumC53252Ngq) Enum.valueOf(EnumC53252Ngq.class, str);
    }

    public static EnumC53252Ngq[] values() {
        return (EnumC53252Ngq[]) A03.clone();
    }

    public EnumC53252Ngq(String str, String str2, String str3, int i) {
        this.A00 = str2;
        this.A01 = str3;
    }
}
