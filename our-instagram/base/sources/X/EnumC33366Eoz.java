package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eoz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33366Eoz {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33366Eoz[] A01;
    public static final EnumC33366Eoz A02;
    public static final EnumC33366Eoz A03;
    public static final EnumC33366Eoz A04;
    public static final EnumC33366Eoz A05;
    public static final EnumC33366Eoz A06;
    public static final EnumC33366Eoz A07;
    public static final EnumC33366Eoz A08;

    static {
        EnumC33366Eoz enumC33366Eoz = new EnumC33366Eoz("COMMENTS", 0);
        A02 = enumC33366Eoz;
        EnumC33366Eoz enumC33366Eoz2 = new EnumC33366Eoz("DIRECT_MESSAGE", 1);
        A03 = enumC33366Eoz2;
        EnumC33366Eoz enumC33366Eoz3 = new EnumC33366Eoz("FOLLOWER_LIST", 2);
        A04 = enumC33366Eoz3;
        EnumC33366Eoz enumC33366Eoz4 = new EnumC33366Eoz("FOLLOWING_LIST", 3);
        A05 = enumC33366Eoz4;
        EnumC33366Eoz enumC33366Eoz5 = new EnumC33366Eoz("GRID_WALL", 4);
        A06 = enumC33366Eoz5;
        EnumC33366Eoz enumC33366Eoz6 = new EnumC33366Eoz("PROFILE_PICTURE_FULLSCREEN", 5);
        A07 = enumC33366Eoz6;
        EnumC33366Eoz enumC33366Eoz7 = new EnumC33366Eoz("TAGGED_WALL", 6);
        A08 = enumC33366Eoz7;
        EnumC33366Eoz[] enumC33366EozArr = {enumC33366Eoz, enumC33366Eoz2, enumC33366Eoz3, enumC33366Eoz4, enumC33366Eoz5, enumC33366Eoz6, enumC33366Eoz7};
        A01 = enumC33366EozArr;
        A00 = AbstractC12190kN.A00(enumC33366EozArr);
    }

    public static EnumC33366Eoz valueOf(String str) {
        return (EnumC33366Eoz) Enum.valueOf(EnumC33366Eoz.class, str);
    }

    public static EnumC33366Eoz[] values() {
        return (EnumC33366Eoz[]) A01.clone();
    }

    public EnumC33366Eoz(String str, int i) {
    }
}
