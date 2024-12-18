package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53233NgW {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53233NgW[] A02;
    public static final EnumC53233NgW A03;
    public static final EnumC53233NgW A04;
    public static final EnumC53233NgW A05;
    public static final EnumC53233NgW A06;
    public static final EnumC53233NgW A07;
    public static final EnumC53233NgW A08;
    public final boolean A00;

    static {
        EnumC53233NgW enumC53233NgW = new EnumC53233NgW("EDIT_MEDIA", 0, true);
        A04 = enumC53233NgW;
        EnumC53233NgW enumC53233NgW2 = new EnumC53233NgW("FOLLOWERS_SHARE", 1, true);
        A05 = enumC53233NgW2;
        EnumC53233NgW enumC53233NgW3 = new EnumC53233NgW("CLIPS_SHARE", 2, false);
        A03 = enumC53233NgW3;
        EnumC53233NgW enumC53233NgW4 = new EnumC53233NgW("UPCOMING_EVENTS_LIST", 3, true);
        A06 = enumC53233NgW4;
        EnumC53233NgW enumC53233NgW5 = new EnumC53233NgW("UPCOMING_EVENT_EDIT", 4, true);
        A07 = enumC53233NgW5;
        EnumC53233NgW enumC53233NgW6 = new EnumC53233NgW("VIDEOX_SHARESHEET", 5, false);
        A08 = enumC53233NgW6;
        EnumC53233NgW[] enumC53233NgWArr = {enumC53233NgW, enumC53233NgW2, enumC53233NgW3, enumC53233NgW4, enumC53233NgW5, enumC53233NgW6};
        A02 = enumC53233NgWArr;
        A01 = AbstractC12190kN.A00(enumC53233NgWArr);
    }

    public static EnumC53233NgW valueOf(String str) {
        return (EnumC53233NgW) Enum.valueOf(EnumC53233NgW.class, str);
    }

    public static EnumC53233NgW[] values() {
        return (EnumC53233NgW[]) A02.clone();
    }

    public EnumC53233NgW(String str, int i, boolean z) {
        this.A00 = z;
    }
}
