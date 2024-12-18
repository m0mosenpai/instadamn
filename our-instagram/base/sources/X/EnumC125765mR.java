package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5mR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC125765mR {
    public static final EnumC125765mR A04;
    public static final /* synthetic */ EnumEntries A05;
    public static final /* synthetic */ EnumC125765mR[] A06;
    public static final EnumC125765mR A07;
    public static final EnumC125765mR A08;
    public static final EnumC125765mR A09;
    public static final EnumC125765mR A0A;
    public static final EnumC125765mR A0B;
    public static final EnumC125765mR A0C;
    public final EnumC125775mS A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    static {
        Integer num = C05F.A01;
        EnumC125765mR enumC125765mR = new EnumC125765mR(EnumC125775mS.A06, num, "FULL_AUDIENCE_MEDIA_GRID", "grid", "user_detail_grid", 0);
        A09 = enumC125765mR;
        EnumC125765mR enumC125765mR2 = new EnumC125765mR(EnumC125775mS.A09, num, "PHOTOS_OF_YOU_MEDIA_GRID", "tagged", "photos_of_you", 1);
        A0B = enumC125765mR2;
        EnumC125765mR enumC125765mR3 = new EnumC125765mR(EnumC125775mS.A04, num, "FAN_CLUB_MEDIA_GRID", "fan_club", "fan_club_grid", 2);
        A08 = enumC125765mR3;
        EnumC125765mR enumC125765mR4 = new EnumC125765mR(EnumC125775mS.A0A, num, "REPOST_MEDIA_GRID", "repost", "repost_grid", 3);
        A0C = enumC125765mR4;
        EnumC125765mR enumC125765mR5 = new EnumC125765mR(EnumC125775mS.A05, num, "HIGHLIGHTS_GRID", "highlights", "highlights_grid", 4);
        A0A = enumC125765mR5;
        EnumC125765mR enumC125765mR6 = new EnumC125765mR(EnumC125775mS.A03, num, "EDIT_PROFILE_HIGHLIGHTS_MANAGEMENT_SCREEN_GRID", "", "edit_profile_highlights_management_grid", 5);
        A07 = enumC125765mR6;
        EnumC125765mR[] enumC125765mRArr = {enumC125765mR, enumC125765mR2, enumC125765mR3, enumC125765mR4, enumC125765mR5, enumC125765mR6};
        A06 = enumC125765mRArr;
        A05 = AbstractC12190kN.A00(enumC125765mRArr);
        A04 = enumC125765mR;
    }

    public static EnumC125765mR valueOf(String str) {
        return (EnumC125765mR) Enum.valueOf(EnumC125765mR.class, str);
    }

    public static EnumC125765mR[] values() {
        return (EnumC125765mR[]) A06.clone();
    }

    public EnumC125765mR(EnumC125775mS enumC125775mS, Integer num, String str, String str2, String str3, int i) {
        this.A01 = num;
        this.A00 = enumC125775mS;
        this.A02 = str2;
        this.A03 = str3;
    }
}
