package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eoj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33350Eoj {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33350Eoj[] A01;
    public static final EnumC33350Eoj A02;
    public static final EnumC33350Eoj A03;
    public static final EnumC33350Eoj A04;
    public static final EnumC33350Eoj A05;

    static {
        EnumC33350Eoj enumC33350Eoj = new EnumC33350Eoj("Error", 0);
        A02 = enumC33350Eoj;
        EnumC33350Eoj enumC33350Eoj2 = new EnumC33350Eoj("Loading", 1);
        A04 = enumC33350Eoj2;
        EnumC33350Eoj enumC33350Eoj3 = new EnumC33350Eoj("Success", 2);
        A05 = enumC33350Eoj3;
        EnumC33350Eoj enumC33350Eoj4 = new EnumC33350Eoj("Idle", 3);
        A03 = enumC33350Eoj4;
        EnumC33350Eoj[] enumC33350EojArr = {enumC33350Eoj, enumC33350Eoj2, enumC33350Eoj3, enumC33350Eoj4};
        A01 = enumC33350EojArr;
        A00 = AbstractC12190kN.A00(enumC33350EojArr);
    }

    public static EnumC33350Eoj valueOf(String str) {
        return (EnumC33350Eoj) Enum.valueOf(EnumC33350Eoj.class, str);
    }

    public static EnumC33350Eoj[] values() {
        return (EnumC33350Eoj[]) A01.clone();
    }

    public EnumC33350Eoj(String str, int i) {
    }
}
