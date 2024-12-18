package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NfY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53176NfY {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53176NfY[] A01;
    public static final EnumC53176NfY A02;
    public static final EnumC53176NfY A03;
    public static final EnumC53176NfY A04;
    public static final EnumC53176NfY A05;
    public static final EnumC53176NfY A06;
    public static final EnumC53176NfY A07;
    public static final EnumC53176NfY A08;

    static {
        EnumC53176NfY enumC53176NfY = new EnumC53176NfY("SET", 0);
        A07 = enumC53176NfY;
        EnumC53176NfY enumC53176NfY2 = new EnumC53176NfY("REMOVE", 1);
        A05 = enumC53176NfY2;
        EnumC53176NfY enumC53176NfY3 = new EnumC53176NfY("GET", 2);
        A02 = enumC53176NfY3;
        EnumC53176NfY enumC53176NfY4 = new EnumC53176NfY("GET_V2", 3);
        A03 = enumC53176NfY4;
        EnumC53176NfY enumC53176NfY5 = new EnumC53176NfY("SET_V2", 4);
        A08 = enumC53176NfY5;
        EnumC53176NfY enumC53176NfY6 = new EnumC53176NfY("REMOVE_V2", 5);
        A06 = enumC53176NfY6;
        EnumC53176NfY enumC53176NfY7 = new EnumC53176NfY("PROMISE_COMPLETION_BOOL", 6);
        A04 = enumC53176NfY7;
        EnumC53176NfY[] enumC53176NfYArr = {enumC53176NfY, enumC53176NfY2, enumC53176NfY3, enumC53176NfY4, enumC53176NfY5, enumC53176NfY6, enumC53176NfY7, new EnumC53176NfY("PROMISE_COMPLETION_STRING", 7)};
        A01 = enumC53176NfYArr;
        A00 = AbstractC12190kN.A00(enumC53176NfYArr);
    }

    public static EnumC53176NfY valueOf(String str) {
        return (EnumC53176NfY) Enum.valueOf(EnumC53176NfY.class, str);
    }

    public static EnumC53176NfY[] values() {
        return (EnumC53176NfY[]) A01.clone();
    }

    public EnumC53176NfY(String str, int i) {
    }
}
