package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46151Kbp {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46151Kbp[] A01;
    public static final EnumC46151Kbp A02;
    public static final EnumC46151Kbp A03;
    public static final EnumC46151Kbp A04;

    static {
        EnumC46151Kbp enumC46151Kbp = new EnumC46151Kbp("LOADING", 0);
        A02 = enumC46151Kbp;
        EnumC46151Kbp enumC46151Kbp2 = new EnumC46151Kbp("ON", 1);
        A04 = enumC46151Kbp2;
        EnumC46151Kbp enumC46151Kbp3 = new EnumC46151Kbp("OFF", 2);
        A03 = enumC46151Kbp3;
        EnumC46151Kbp[] enumC46151KbpArr = {enumC46151Kbp, enumC46151Kbp2, enumC46151Kbp3};
        A01 = enumC46151KbpArr;
        A00 = AbstractC12190kN.A00(enumC46151KbpArr);
    }

    public static EnumC46151Kbp valueOf(String str) {
        return (EnumC46151Kbp) Enum.valueOf(EnumC46151Kbp.class, str);
    }

    public static EnumC46151Kbp[] values() {
        return (EnumC46151Kbp[]) A01.clone();
    }

    public EnumC46151Kbp(String str, int i) {
    }
}
