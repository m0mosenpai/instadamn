package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC69983Ch {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC69983Ch[] A01;
    public static final EnumC69983Ch A02;
    public static final EnumC69983Ch A03;
    public static final EnumC69983Ch A04;
    public static final EnumC69983Ch A05;
    public static final EnumC69983Ch A06;

    static {
        EnumC69983Ch enumC69983Ch = new EnumC69983Ch("FOLLOWERS_SHARE", 0);
        A02 = enumC69983Ch;
        EnumC69983Ch enumC69983Ch2 = new EnumC69983Ch("GROUP_PHOTO", 1);
        A03 = enumC69983Ch2;
        EnumC69983Ch enumC69983Ch3 = new EnumC69983Ch("PROFILE_PHOTO", 2);
        A05 = enumC69983Ch3;
        EnumC69983Ch enumC69983Ch4 = new EnumC69983Ch("REACT_MEDIA_PICKER", 3);
        A06 = enumC69983Ch4;
        EnumC69983Ch enumC69983Ch5 = new EnumC69983Ch("OPAL_CONTENT", 4);
        A04 = enumC69983Ch5;
        EnumC69983Ch[] enumC69983ChArr = {enumC69983Ch, enumC69983Ch2, enumC69983Ch3, enumC69983Ch4, enumC69983Ch5};
        A01 = enumC69983ChArr;
        A00 = AbstractC12190kN.A00(enumC69983ChArr);
    }

    public static EnumC69983Ch valueOf(String str) {
        return (EnumC69983Ch) Enum.valueOf(EnumC69983Ch.class, str);
    }

    public static EnumC69983Ch[] values() {
        return (EnumC69983Ch[]) A01.clone();
    }

    public EnumC69983Ch(String str, int i) {
    }
}
