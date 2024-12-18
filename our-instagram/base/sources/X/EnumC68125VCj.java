package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68125VCj {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68125VCj[] A01;
    public static final EnumC68125VCj A02;
    public static final EnumC68125VCj A03;

    static {
        EnumC68125VCj enumC68125VCj = new EnumC68125VCj("Bloks", 0);
        A02 = enumC68125VCj;
        EnumC68125VCj enumC68125VCj2 = new EnumC68125VCj("Native", 1);
        A03 = enumC68125VCj2;
        EnumC68125VCj[] enumC68125VCjArr = {enumC68125VCj, enumC68125VCj2};
        A01 = enumC68125VCjArr;
        A00 = AbstractC12190kN.A00(enumC68125VCjArr);
    }

    public static EnumC68125VCj valueOf(String str) {
        return (EnumC68125VCj) Enum.valueOf(EnumC68125VCj.class, str);
    }

    public static EnumC68125VCj[] values() {
        return (EnumC68125VCj[]) A01.clone();
    }

    public EnumC68125VCj(String str, int i) {
    }
}
