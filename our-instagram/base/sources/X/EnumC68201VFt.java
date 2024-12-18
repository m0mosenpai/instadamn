package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VFt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68201VFt {
    public static final EnumC68201VFt[] A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68201VFt[] A03;
    public static final EnumC68201VFt A04;
    public static final EnumC68201VFt A05;
    public final String A00;

    public static EnumC68201VFt valueOf(String str) {
        return (EnumC68201VFt) Enum.valueOf(EnumC68201VFt.class, str);
    }

    public static EnumC68201VFt[] values() {
        return (EnumC68201VFt[]) A03.clone();
    }

    static {
        EnumC68201VFt enumC68201VFt = new EnumC68201VFt("AUTO", 0, "auto");
        A04 = enumC68201VFt;
        EnumC68201VFt enumC68201VFt2 = new EnumC68201VFt("ENABLED", 1, "enabled");
        A05 = enumC68201VFt2;
        EnumC68201VFt[] enumC68201VFtArr = {enumC68201VFt, enumC68201VFt2, new EnumC68201VFt("DISABLED", 2, "disabled")};
        A03 = enumC68201VFtArr;
        C020508b A00 = AbstractC12190kN.A00(enumC68201VFtArr);
        A02 = A00;
        A01 = (EnumC68201VFt[]) A00.toArray(new EnumC68201VFt[0]);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC68201VFt(String str, int i, String str2) {
        this.A00 = str2;
    }
}
