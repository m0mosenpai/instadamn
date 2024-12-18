package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nea, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53123Nea {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53123Nea[] A01;
    public static final EnumC53123Nea A02;
    public static final EnumC53123Nea A03;

    static {
        EnumC53123Nea enumC53123Nea = new EnumC53123Nea("LEAVE_BROADCAST", 0);
        A03 = enumC53123Nea;
        EnumC53123Nea enumC53123Nea2 = new EnumC53123Nea("DECLINE_INVITE", 1);
        A02 = enumC53123Nea2;
        EnumC53123Nea[] enumC53123NeaArr = {enumC53123Nea, enumC53123Nea2};
        A01 = enumC53123NeaArr;
        A00 = AbstractC12190kN.A00(enumC53123NeaArr);
    }

    public static EnumC53123Nea valueOf(String str) {
        return (EnumC53123Nea) Enum.valueOf(EnumC53123Nea.class, str);
    }

    public static EnumC53123Nea[] values() {
        return (EnumC53123Nea[]) A01.clone();
    }

    public EnumC53123Nea(String str, int i) {
    }
}
