package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VFs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68200VFs {
    public static final EnumC68200VFs[] A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68200VFs[] A03;
    public static final EnumC68200VFs A04;
    public static final EnumC68200VFs A05;
    public final String A00;

    public static EnumC68200VFs valueOf(String str) {
        return (EnumC68200VFs) Enum.valueOf(EnumC68200VFs.class, str);
    }

    public static EnumC68200VFs[] values() {
        return (EnumC68200VFs[]) A03.clone();
    }

    static {
        EnumC68200VFs enumC68200VFs = new EnumC68200VFs("SAME_SIZE", 0, "same_size");
        A04 = enumC68200VFs;
        EnumC68200VFs enumC68200VFs2 = new EnumC68200VFs("TOP_ROUNDED", 1, "top_rounded");
        A05 = enumC68200VFs2;
        EnumC68200VFs[] enumC68200VFsArr = {enumC68200VFs, enumC68200VFs2};
        A03 = enumC68200VFsArr;
        C020508b A00 = AbstractC12190kN.A00(enumC68200VFsArr);
        A02 = A00;
        A01 = (EnumC68200VFs[]) A00.toArray(new EnumC68200VFs[0]);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC68200VFs(String str, int i, String str2) {
        this.A00 = str2;
    }
}
