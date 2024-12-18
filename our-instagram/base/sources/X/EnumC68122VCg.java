package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68122VCg {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68122VCg[] A01;
    public static final EnumC68122VCg A02;
    public static final EnumC68122VCg A03;

    static {
        EnumC68122VCg enumC68122VCg = new EnumC68122VCg("UP", 0);
        A03 = enumC68122VCg;
        EnumC68122VCg enumC68122VCg2 = new EnumC68122VCg("DOWN", 1);
        A02 = enumC68122VCg2;
        EnumC68122VCg[] enumC68122VCgArr = {enumC68122VCg, enumC68122VCg2};
        A01 = enumC68122VCgArr;
        A00 = AbstractC12190kN.A00(enumC68122VCgArr);
    }

    public static EnumC68122VCg valueOf(String str) {
        return (EnumC68122VCg) Enum.valueOf(EnumC68122VCg.class, str);
    }

    public static EnumC68122VCg[] values() {
        return (EnumC68122VCg[]) A01.clone();
    }

    public EnumC68122VCg(String str, int i) {
    }
}
