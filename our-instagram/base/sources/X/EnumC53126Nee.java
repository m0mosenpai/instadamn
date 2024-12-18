package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nee, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53126Nee {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53126Nee[] A01;
    public static final EnumC53126Nee A02;
    public static final EnumC53126Nee A03;

    static {
        EnumC53126Nee enumC53126Nee = new EnumC53126Nee("DRAFTS", 0);
        A02 = enumC53126Nee;
        EnumC53126Nee enumC53126Nee2 = new EnumC53126Nee("SCHEDULED", 1);
        A03 = enumC53126Nee2;
        EnumC53126Nee[] enumC53126NeeArr = {enumC53126Nee, enumC53126Nee2};
        A01 = enumC53126NeeArr;
        A00 = AbstractC12190kN.A00(enumC53126NeeArr);
    }

    public static EnumC53126Nee valueOf(String str) {
        return (EnumC53126Nee) Enum.valueOf(EnumC53126Nee.class, str);
    }

    public static EnumC53126Nee[] values() {
        return (EnumC53126Nee[]) A01.clone();
    }

    public EnumC53126Nee(String str, int i) {
    }
}
