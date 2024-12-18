package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68126VCk {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68126VCk[] A01;
    public static final EnumC68126VCk A02;
    public static final EnumC68126VCk A03;
    public static final EnumC68126VCk A04;

    static {
        EnumC68126VCk enumC68126VCk = new EnumC68126VCk("ENTER", 0);
        A02 = enumC68126VCk;
        EnumC68126VCk enumC68126VCk2 = new EnumC68126VCk("EXIT_FORWARD", 1);
        A04 = enumC68126VCk2;
        EnumC68126VCk enumC68126VCk3 = new EnumC68126VCk("EXIT_BACKWARD", 2);
        A03 = enumC68126VCk3;
        EnumC68126VCk[] enumC68126VCkArr = {enumC68126VCk, enumC68126VCk2, enumC68126VCk3};
        A01 = enumC68126VCkArr;
        A00 = AbstractC12190kN.A00(enumC68126VCkArr);
    }

    public static EnumC68126VCk valueOf(String str) {
        return (EnumC68126VCk) Enum.valueOf(EnumC68126VCk.class, str);
    }

    public static EnumC68126VCk[] values() {
        return (EnumC68126VCk[]) A01.clone();
    }

    public EnumC68126VCk(String str, int i) {
    }
}
