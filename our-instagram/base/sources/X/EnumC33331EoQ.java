package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33331EoQ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33331EoQ[] A01;
    public static final EnumC33331EoQ A02;
    public static final EnumC33331EoQ A03;

    static {
        EnumC33331EoQ enumC33331EoQ = new EnumC33331EoQ("UPDATE_ACCOUNT_PRIVACY_SETTING", 0);
        A02 = enumC33331EoQ;
        EnumC33331EoQ enumC33331EoQ2 = new EnumC33331EoQ("UPDATE_SCC_SETTING", 1);
        A03 = enumC33331EoQ2;
        EnumC33331EoQ[] enumC33331EoQArr = {enumC33331EoQ, enumC33331EoQ2, new EnumC33331EoQ("UPDATE_MESSAGING_SETTING", 2)};
        A01 = enumC33331EoQArr;
        A00 = AbstractC12190kN.A00(enumC33331EoQArr);
    }

    public static EnumC33331EoQ valueOf(String str) {
        return (EnumC33331EoQ) Enum.valueOf(EnumC33331EoQ.class, str);
    }

    public static EnumC33331EoQ[] values() {
        return (EnumC33331EoQ[]) A01.clone();
    }

    public EnumC33331EoQ(String str, int i) {
    }
}
