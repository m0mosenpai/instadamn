package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33398EpV {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33398EpV[] A02;
    public static final EnumC33398EpV A03;
    public static final EnumC33398EpV A04;
    public static final EnumC33398EpV A05;
    public static final EnumC33398EpV A06;
    public static final EnumC33398EpV A07;
    public static final EnumC33398EpV A08;
    public final String A00;

    static {
        EnumC33398EpV enumC33398EpV = new EnumC33398EpV("UNKNOWN", 0, "unknown");
        A08 = enumC33398EpV;
        EnumC33398EpV enumC33398EpV2 = new EnumC33398EpV("STACKS", 1, "stacks");
        A07 = enumC33398EpV2;
        EnumC33398EpV enumC33398EpV3 = new EnumC33398EpV("SHARED_STACKS", 2, "shared_stacks");
        A06 = enumC33398EpV3;
        EnumC33398EpV enumC33398EpV4 = new EnumC33398EpV("ADD_YOURS", 3, "add_yours");
        A03 = enumC33398EpV4;
        EnumC33398EpV enumC33398EpV5 = new EnumC33398EpV("ROLL_CALL", 4, "roll_call");
        A05 = enumC33398EpV5;
        EnumC33398EpV enumC33398EpV6 = new EnumC33398EpV("QUESTIONS", 5, "questions");
        A04 = enumC33398EpV6;
        EnumC33398EpV[] enumC33398EpVArr = {enumC33398EpV, enumC33398EpV2, enumC33398EpV3, enumC33398EpV4, enumC33398EpV5, enumC33398EpV6, new EnumC33398EpV("CHALLENGES", 6, "challenges")};
        A02 = enumC33398EpVArr;
        A01 = AbstractC12190kN.A00(enumC33398EpVArr);
    }

    public static EnumC33398EpV valueOf(String str) {
        return (EnumC33398EpV) Enum.valueOf(EnumC33398EpV.class, str);
    }

    public static EnumC33398EpV[] values() {
        return (EnumC33398EpV[]) A02.clone();
    }

    public EnumC33398EpV(String str, int i, String str2) {
        this.A00 = str2;
    }
}
