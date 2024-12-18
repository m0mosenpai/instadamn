package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46152Kbq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46152Kbq[] A01;
    public static final EnumC46152Kbq A02;
    public static final EnumC46152Kbq A03;
    public static final EnumC46152Kbq A04;

    static {
        EnumC46152Kbq enumC46152Kbq = new EnumC46152Kbq("LEFT", 0);
        A02 = enumC46152Kbq;
        EnumC46152Kbq enumC46152Kbq2 = new EnumC46152Kbq("RIGHT", 1);
        A03 = enumC46152Kbq2;
        EnumC46152Kbq enumC46152Kbq3 = new EnumC46152Kbq("TOP", 2);
        A04 = enumC46152Kbq3;
        EnumC46152Kbq[] enumC46152KbqArr = {enumC46152Kbq, enumC46152Kbq2, enumC46152Kbq3, new EnumC46152Kbq("BOTTOM", 3)};
        A01 = enumC46152KbqArr;
        A00 = AbstractC12190kN.A00(enumC46152KbqArr);
    }

    public static EnumC46152Kbq valueOf(String str) {
        return (EnumC46152Kbq) Enum.valueOf(EnumC46152Kbq.class, str);
    }

    public static EnumC46152Kbq[] values() {
        return (EnumC46152Kbq[]) A01.clone();
    }

    public EnumC46152Kbq(String str, int i) {
    }
}
