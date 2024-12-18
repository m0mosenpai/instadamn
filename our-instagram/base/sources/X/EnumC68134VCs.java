package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68134VCs {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68134VCs[] A01;
    public static final EnumC68134VCs A02;
    public static final EnumC68134VCs A03;
    public static final EnumC68134VCs A04;

    static {
        EnumC68134VCs enumC68134VCs = new EnumC68134VCs("POST", 0);
        A02 = enumC68134VCs;
        EnumC68134VCs enumC68134VCs2 = new EnumC68134VCs("STORY", 1);
        A04 = enumC68134VCs2;
        EnumC68134VCs enumC68134VCs3 = new EnumC68134VCs("REEL", 2);
        A03 = enumC68134VCs3;
        EnumC68134VCs[] enumC68134VCsArr = {enumC68134VCs, enumC68134VCs2, enumC68134VCs3};
        A01 = enumC68134VCsArr;
        A00 = AbstractC12190kN.A00(enumC68134VCsArr);
    }

    public static EnumC68134VCs valueOf(String str) {
        return (EnumC68134VCs) Enum.valueOf(EnumC68134VCs.class, str);
    }

    public static EnumC68134VCs[] values() {
        return (EnumC68134VCs[]) A01.clone();
    }

    public EnumC68134VCs(String str, int i) {
    }
}
