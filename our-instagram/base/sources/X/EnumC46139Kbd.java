package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46139Kbd {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46139Kbd[] A01;
    public static final EnumC46139Kbd A02;
    public static final EnumC46139Kbd A03;

    static {
        EnumC46139Kbd enumC46139Kbd = new EnumC46139Kbd("InitialScreen", 0);
        A03 = enumC46139Kbd;
        EnumC46139Kbd enumC46139Kbd2 = new EnumC46139Kbd("ConfirmationScreen", 1);
        A02 = enumC46139Kbd2;
        EnumC46139Kbd[] enumC46139KbdArr = {enumC46139Kbd, enumC46139Kbd2};
        A01 = enumC46139KbdArr;
        A00 = AbstractC12190kN.A00(enumC46139KbdArr);
    }

    public static EnumC46139Kbd valueOf(String str) {
        return (EnumC46139Kbd) Enum.valueOf(EnumC46139Kbd.class, str);
    }

    public static EnumC46139Kbd[] values() {
        return (EnumC46139Kbd[]) A01.clone();
    }

    public EnumC46139Kbd(String str, int i) {
    }
}
