package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5mS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC125775mS {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC125775mS[] A02;
    public static final EnumC125775mS A03;
    public static final EnumC125775mS A04;
    public static final EnumC125775mS A05;
    public static final EnumC125775mS A06;
    public static final EnumC125775mS A07;
    public static final EnumC125775mS A08;
    public static final EnumC125775mS A09;
    public static final EnumC125775mS A0A;
    public static final EnumC125775mS A0B;
    public final int A00;

    static {
        EnumC125775mS enumC125775mS = new EnumC125775mS("MAIN_GRID", 0, 0);
        A06 = enumC125775mS;
        EnumC125775mS enumC125775mS2 = new EnumC125775mS("PHOTOS_OF_YOU", 1, 1);
        A09 = enumC125775mS2;
        EnumC125775mS enumC125775mS3 = new EnumC125775mS("PENDING_PHOTOS_OF_YOU", 2, 2);
        A08 = enumC125775mS3;
        EnumC125775mS enumC125775mS4 = new EnumC125775mS("FAN_CLUB_MEDIA_GRID", 3, 4);
        A04 = enumC125775mS4;
        EnumC125775mS enumC125775mS5 = new EnumC125775mS("REPOSTS_MEDIA_GRID", 4, 5);
        A0A = enumC125775mS5;
        EnumC125775mS enumC125775mS6 = new EnumC125775mS("SPAM_PHOTOS_OF_YOU", 5, 6);
        A0B = enumC125775mS6;
        EnumC125775mS enumC125775mS7 = new EnumC125775mS("OPAL_MEDIA_GRID", 6, 7);
        A07 = enumC125775mS7;
        EnumC125775mS enumC125775mS8 = new EnumC125775mS("HIGHLIGHTS_GRID", 7, 8);
        A05 = enumC125775mS8;
        EnumC125775mS enumC125775mS9 = new EnumC125775mS("EDIT_PROFILE_HIGHLIGHTS_MANAGEMENT_SCREEN_GRID", 8, 9);
        A03 = enumC125775mS9;
        EnumC125775mS[] enumC125775mSArr = {enumC125775mS, enumC125775mS2, enumC125775mS3, enumC125775mS4, enumC125775mS5, enumC125775mS6, enumC125775mS7, enumC125775mS8, enumC125775mS9};
        A02 = enumC125775mSArr;
        A01 = AbstractC12190kN.A00(enumC125775mSArr);
    }

    public static EnumC125775mS valueOf(String str) {
        return (EnumC125775mS) Enum.valueOf(EnumC125775mS.class, str);
    }

    public static EnumC125775mS[] values() {
        return (EnumC125775mS[]) A02.clone();
    }

    public EnumC125775mS(String str, int i, int i2) {
        this.A00 = i2;
    }
}
