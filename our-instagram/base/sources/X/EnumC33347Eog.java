package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eog, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33347Eog {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33347Eog[] A01;
    public static final EnumC33347Eog A02;
    public static final EnumC33347Eog A03;
    public static final EnumC33347Eog A04;
    public static final EnumC33347Eog A05;

    static {
        EnumC33347Eog enumC33347Eog = new EnumC33347Eog("NEXT_BUTTON_CLICKED", 0);
        A05 = enumC33347Eog;
        EnumC33347Eog enumC33347Eog2 = new EnumC33347Eog("CONNECT_TO_GLASSES_BUTTON_CLICKED", 1);
        A03 = enumC33347Eog2;
        EnumC33347Eog enumC33347Eog3 = new EnumC33347Eog("CANCEL_BUTTON_CLICKED", 2);
        A02 = enumC33347Eog3;
        EnumC33347Eog enumC33347Eog4 = new EnumC33347Eog("HELP_CENTER_LINK_CLICKED", 3);
        A04 = enumC33347Eog4;
        EnumC33347Eog[] enumC33347EogArr = {enumC33347Eog, enumC33347Eog2, enumC33347Eog3, enumC33347Eog4};
        A01 = enumC33347EogArr;
        A00 = AbstractC12190kN.A00(enumC33347EogArr);
    }

    public static EnumC33347Eog valueOf(String str) {
        return (EnumC33347Eog) Enum.valueOf(EnumC33347Eog.class, str);
    }

    public static EnumC33347Eog[] values() {
        return (EnumC33347Eog[]) A01.clone();
    }

    public EnumC33347Eog(String str, int i) {
    }
}
