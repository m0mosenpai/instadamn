package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222779sI {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222779sI[] A01;
    public static final EnumC222779sI A02;
    public static final EnumC222779sI A03;
    public static final EnumC222779sI A04;
    public static final EnumC222779sI A05;
    public static final EnumC222779sI A06;
    public static final EnumC222779sI A07;
    public static final EnumC222779sI A08;

    static {
        EnumC222779sI enumC222779sI = new EnumC222779sI("NO_SURVEY", 0);
        A05 = enumC222779sI;
        EnumC222779sI enumC222779sI2 = new EnumC222779sI("ADDED_CLIP", 1);
        A02 = enumC222779sI2;
        EnumC222779sI enumC222779sI3 = new EnumC222779sI("EDITED_CLIP", 2);
        A03 = enumC222779sI3;
        EnumC222779sI enumC222779sI4 = new EnumC222779sI("SELECTED_AUDIO_FOR_REEL", 3);
        A07 = enumC222779sI4;
        EnumC222779sI enumC222779sI5 = new EnumC222779sI("EDITED_SAVED_DRAFT", 4);
        A04 = enumC222779sI5;
        EnumC222779sI enumC222779sI6 = new EnumC222779sI("SAVED_DRAFT", 5);
        A06 = enumC222779sI6;
        EnumC222779sI enumC222779sI7 = new EnumC222779sI("SELECTED_EFFECT", 6);
        A08 = enumC222779sI7;
        EnumC222779sI[] enumC222779sIArr = {enumC222779sI, enumC222779sI2, enumC222779sI3, enumC222779sI4, enumC222779sI5, enumC222779sI6, enumC222779sI7};
        A01 = enumC222779sIArr;
        A00 = AbstractC12190kN.A00(enumC222779sIArr);
    }

    public static EnumC222779sI valueOf(String str) {
        return (EnumC222779sI) Enum.valueOf(EnumC222779sI.class, str);
    }

    public static EnumC222779sI[] values() {
        return (EnumC222779sI[]) A01.clone();
    }

    public EnumC222779sI(String str, int i) {
    }
}
