package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3rH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC85263rH {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC85263rH[] A01;
    public static final EnumC85263rH A02;
    public static final EnumC85263rH A03;

    static {
        EnumC85263rH enumC85263rH = new EnumC85263rH("STANDARD", 0);
        A03 = enumC85263rH;
        EnumC85263rH enumC85263rH2 = new EnumC85263rH("SANDWICH", 1);
        A02 = enumC85263rH2;
        EnumC85263rH[] enumC85263rHArr = {enumC85263rH, enumC85263rH2};
        A01 = enumC85263rHArr;
        A00 = AbstractC12190kN.A00(enumC85263rHArr);
    }

    public static EnumC85263rH valueOf(String str) {
        return (EnumC85263rH) Enum.valueOf(EnumC85263rH.class, str);
    }

    public static EnumC85263rH[] values() {
        return (EnumC85263rH[]) A01.clone();
    }

    public EnumC85263rH(String str, int i) {
    }
}
