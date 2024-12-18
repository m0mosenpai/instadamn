package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33339EoY {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33339EoY[] A01;
    public static final EnumC33339EoY A02;
    public static final EnumC33339EoY A03;
    public static final EnumC33339EoY A04;

    static {
        EnumC33339EoY enumC33339EoY = new EnumC33339EoY("NOT_SELECTED", 0);
        A03 = enumC33339EoY;
        EnumC33339EoY enumC33339EoY2 = new EnumC33339EoY("SELECTED", 1);
        A04 = enumC33339EoY2;
        EnumC33339EoY enumC33339EoY3 = new EnumC33339EoY("ALREADY_LOGGED_IN", 2);
        A02 = enumC33339EoY3;
        EnumC33339EoY[] enumC33339EoYArr = {enumC33339EoY, enumC33339EoY2, enumC33339EoY3};
        A01 = enumC33339EoYArr;
        A00 = AbstractC12190kN.A00(enumC33339EoYArr);
    }

    public static EnumC33339EoY valueOf(String str) {
        return (EnumC33339EoY) Enum.valueOf(EnumC33339EoY.class, str);
    }

    public static EnumC33339EoY[] values() {
        return (EnumC33339EoY[]) A01.clone();
    }

    public EnumC33339EoY(String str, int i) {
    }
}
