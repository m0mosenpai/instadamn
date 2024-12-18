package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eot, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33360Eot {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33360Eot[] A01;
    public static final EnumC33360Eot A02;
    public static final EnumC33360Eot A03;
    public static final EnumC33360Eot A04;
    public static final EnumC33360Eot A05;
    public static final EnumC33360Eot A06;

    static {
        EnumC33360Eot enumC33360Eot = new EnumC33360Eot("IG_FB_SIGN_UP", 0);
        A04 = enumC33360Eot;
        EnumC33360Eot enumC33360Eot2 = new EnumC33360Eot("IG_FB_NUX_FIND_FRIENDS", 1);
        A03 = enumC33360Eot2;
        EnumC33360Eot enumC33360Eot3 = new EnumC33360Eot("DISCOVER_PEOPLE", 2);
        A02 = enumC33360Eot3;
        EnumC33360Eot enumC33360Eot4 = new EnumC33360Eot("IG_SAC_SIGN_UP", 3);
        A05 = enumC33360Eot4;
        EnumC33360Eot enumC33360Eot5 = new EnumC33360Eot("PROFILE_PIC", 4);
        A06 = enumC33360Eot5;
        EnumC33360Eot[] enumC33360EotArr = {enumC33360Eot, enumC33360Eot2, enumC33360Eot3, enumC33360Eot4, enumC33360Eot5};
        A01 = enumC33360EotArr;
        A00 = AbstractC12190kN.A00(enumC33360EotArr);
    }

    public static EnumC33360Eot valueOf(String str) {
        return (EnumC33360Eot) Enum.valueOf(EnumC33360Eot.class, str);
    }

    public static EnumC33360Eot[] values() {
        return (EnumC33360Eot[]) A01.clone();
    }

    public EnumC33360Eot(String str, int i) {
    }
}
