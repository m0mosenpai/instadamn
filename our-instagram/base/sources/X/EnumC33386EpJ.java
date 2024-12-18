package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33386EpJ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33386EpJ[] A02;
    public static final EnumC33386EpJ A03;
    public static final EnumC33386EpJ A04;
    public static final EnumC33386EpJ A05;
    public final String A00;

    static {
        EnumC33386EpJ enumC33386EpJ = new EnumC33386EpJ("SYNC_CONTACTS_PUSH", 0, "sync_contacts_push");
        A05 = enumC33386EpJ;
        EnumC33386EpJ enumC33386EpJ2 = new EnumC33386EpJ("SYNC_CONTACTS_AF", 1, "sync_contacts_af");
        A04 = enumC33386EpJ2;
        EnumC33386EpJ enumC33386EpJ3 = new EnumC33386EpJ("OTHER", 2, "other");
        A03 = enumC33386EpJ3;
        EnumC33386EpJ[] enumC33386EpJArr = {enumC33386EpJ, enumC33386EpJ2, enumC33386EpJ3};
        A02 = enumC33386EpJArr;
        A01 = AbstractC12190kN.A00(enumC33386EpJArr);
    }

    public static EnumC33386EpJ valueOf(String str) {
        return (EnumC33386EpJ) Enum.valueOf(EnumC33386EpJ.class, str);
    }

    public static EnumC33386EpJ[] values() {
        return (EnumC33386EpJ[]) A02.clone();
    }

    public EnumC33386EpJ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
