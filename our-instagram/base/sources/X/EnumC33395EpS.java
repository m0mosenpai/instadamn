package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33395EpS {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33395EpS[] A02;
    public static final EnumC33395EpS A03;
    public static final EnumC33395EpS A04;
    public static final EnumC33395EpS A05;
    public static final EnumC33395EpS A06;
    public static final EnumC33395EpS A07;
    public final String A00;

    static {
        EnumC33395EpS enumC33395EpS = new EnumC33395EpS("PHONE_NUMBER_SOURCE_SIM", 0, "sim");
        A06 = enumC33395EpS;
        EnumC33395EpS enumC33395EpS2 = new EnumC33395EpS("PHONE_NUMBER_SOURCE_FB_FIRST_PARTY", 1, "fb_first_party");
        A03 = enumC33395EpS2;
        EnumC33395EpS enumC33395EpS3 = new EnumC33395EpS("PHONE_NUMBER_SOURCE_UIG_VIA_PHONE_ID", 2, "uig_via_phone_id");
        A07 = enumC33395EpS3;
        EnumC33395EpS enumC33395EpS4 = new EnumC33395EpS("PHONE_NUMBER_SOURCE_ME_PROFILE", 3, "me_profile");
        A04 = enumC33395EpS4;
        EnumC33395EpS enumC33395EpS5 = new EnumC33395EpS("PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE", 4, "mobile_subno_service");
        A05 = enumC33395EpS5;
        EnumC33395EpS[] enumC33395EpSArr = {enumC33395EpS, enumC33395EpS2, enumC33395EpS3, enumC33395EpS4, enumC33395EpS5};
        A02 = enumC33395EpSArr;
        A01 = AbstractC12190kN.A00(enumC33395EpSArr);
    }

    public static EnumC33395EpS valueOf(String str) {
        return (EnumC33395EpS) Enum.valueOf(EnumC33395EpS.class, str);
    }

    public static EnumC33395EpS[] values() {
        return (EnumC33395EpS[]) A02.clone();
    }

    public EnumC33395EpS(String str, int i, String str2) {
        this.A00 = str2;
    }
}
