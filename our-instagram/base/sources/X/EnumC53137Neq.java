package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Neq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53137Neq {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53137Neq[] A01;
    public static final EnumC53137Neq A02;
    public static final EnumC53137Neq A03;
    public static final EnumC53137Neq A04;

    static {
        EnumC53137Neq enumC53137Neq = new EnumC53137Neq("NO_E2EE", 0);
        A03 = enumC53137Neq;
        EnumC53137Neq enumC53137Neq2 = new EnumC53137Neq("P2P_E2EE", 1);
        A04 = enumC53137Neq2;
        EnumC53137Neq enumC53137Neq3 = new EnumC53137Neq("GVC_E2EE", 2);
        A02 = enumC53137Neq3;
        EnumC53137Neq[] enumC53137NeqArr = {enumC53137Neq, enumC53137Neq2, enumC53137Neq3};
        A01 = enumC53137NeqArr;
        A00 = AbstractC12190kN.A00(enumC53137NeqArr);
    }

    public static EnumC53137Neq valueOf(String str) {
        return (EnumC53137Neq) Enum.valueOf(EnumC53137Neq.class, str);
    }

    public static EnumC53137Neq[] values() {
        return (EnumC53137Neq[]) A01.clone();
    }

    public EnumC53137Neq(String str, int i) {
    }
}
