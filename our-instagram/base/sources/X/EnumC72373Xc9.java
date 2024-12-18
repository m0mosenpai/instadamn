package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xc9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72373Xc9 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC72373Xc9[] A02;
    public static final EnumC72373Xc9 A03;
    public static final EnumC72373Xc9 A04;
    public static final EnumC72373Xc9 A05;
    public static final EnumC72373Xc9 A06;
    public static final EnumC72373Xc9 A07;
    public static final EnumC72373Xc9 A08;
    public static final EnumC72373Xc9 A09;
    public final int A00;

    static {
        EnumC72373Xc9 enumC72373Xc9 = new EnumC72373Xc9("CLOSED", 0, 0);
        A04 = enumC72373Xc9;
        EnumC72373Xc9 enumC72373Xc92 = new EnumC72373Xc9("LOST", 1, 1);
        A06 = enumC72373Xc92;
        EnumC72373Xc9 enumC72373Xc93 = new EnumC72373Xc9("ENCRYPTION_FAILED", 2, 2);
        A05 = enumC72373Xc93;
        EnumC72373Xc9 enumC72373Xc94 = new EnumC72373Xc9("SETUP_FAILED", 3, 3);
        A08 = enumC72373Xc94;
        EnumC72373Xc9 enumC72373Xc95 = new EnumC72373Xc9("AUTHENTICATION_FAILED", 4, 4);
        A03 = enumC72373Xc95;
        EnumC72373Xc9 enumC72373Xc96 = new EnumC72373Xc9("PEER_AUTHENTICATION_FAILED", 5, 5);
        A07 = enumC72373Xc96;
        EnumC72373Xc9 enumC72373Xc97 = new EnumC72373Xc9("UNSUPPORTED_TYPE", 6, 6);
        A09 = enumC72373Xc97;
        EnumC72373Xc9[] enumC72373Xc9Arr = {enumC72373Xc9, enumC72373Xc92, enumC72373Xc93, enumC72373Xc94, enumC72373Xc95, enumC72373Xc96, enumC72373Xc97};
        A02 = enumC72373Xc9Arr;
        A01 = AbstractC12190kN.A00(enumC72373Xc9Arr);
    }

    public static EnumC72373Xc9 valueOf(String str) {
        return (EnumC72373Xc9) Enum.valueOf(EnumC72373Xc9.class, str);
    }

    public static EnumC72373Xc9[] values() {
        return (EnumC72373Xc9[]) A02.clone();
    }

    public EnumC72373Xc9(String str, int i, int i2) {
        this.A00 = i2;
    }
}
