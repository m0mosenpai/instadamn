package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68137VCy {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68137VCy[] A01;
    public static final EnumC68137VCy A02;
    public static final EnumC68137VCy A03;
    public static final EnumC68137VCy A04;
    public static final EnumC68137VCy A05;

    public static EnumC68137VCy valueOf(String str) {
        return (EnumC68137VCy) Enum.valueOf(EnumC68137VCy.class, str);
    }

    public static EnumC68137VCy[] values() {
        return (EnumC68137VCy[]) A01.clone();
    }

    static {
        EnumC68137VCy enumC68137VCy = new EnumC68137VCy("OVERLAP", 0);
        A04 = enumC68137VCy;
        EnumC68137VCy enumC68137VCy2 = new EnumC68137VCy("OFF_THE_SCREEN", 1);
        A03 = enumC68137VCy2;
        EnumC68137VCy enumC68137VCy3 = new EnumC68137VCy("HEADER_OVERLAP", 2);
        A02 = enumC68137VCy3;
        EnumC68137VCy enumC68137VCy4 = new EnumC68137VCy("TOOLBAR_OVERLAP", 3);
        A05 = enumC68137VCy4;
        EnumC68137VCy[] enumC68137VCyArr = {enumC68137VCy, enumC68137VCy2, enumC68137VCy3, enumC68137VCy4};
        A01 = enumC68137VCyArr;
        A00 = AbstractC12190kN.A00(enumC68137VCyArr);
    }

    public EnumC68137VCy(String str, int i) {
    }
}
