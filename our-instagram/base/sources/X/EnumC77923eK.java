package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3eK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC77923eK {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC77923eK[] A01;
    public static final EnumC77923eK A02;
    public static final EnumC77923eK A03;

    public static EnumC77923eK valueOf(String str) {
        return (EnumC77923eK) Enum.valueOf(EnumC77923eK.class, str);
    }

    public static EnumC77923eK[] values() {
        return (EnumC77923eK[]) A01.clone();
    }

    static {
        EnumC77923eK enumC77923eK = new EnumC77923eK("STATE_ACTIVE", 0);
        A02 = enumC77923eK;
        EnumC77923eK enumC77923eK2 = new EnumC77923eK("STATE_INACTIVE", 1);
        A03 = enumC77923eK2;
        EnumC77923eK[] enumC77923eKArr = {enumC77923eK, enumC77923eK2, new EnumC77923eK("STATE_ERROR", 2)};
        A01 = enumC77923eKArr;
        A00 = AbstractC12190kN.A00(enumC77923eKArr);
    }

    public EnumC77923eK(String str, int i) {
    }
}
