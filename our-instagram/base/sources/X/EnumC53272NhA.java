package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NhA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53272NhA {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53272NhA[] A04;
    public static final EnumC53272NhA A05;
    public final float A00;
    public final C3LX A01;
    public final String A02;
    public static final EnumC53272NhA A09 = new EnumC53272NhA(O1A.A04, "RINGBACK", "Ringback_v2", 0.9f, 0);
    public static final EnumC53272NhA A06 = new EnumC53272NhA(O1A.A01, "END_CALL", "End", 0.35f, 1);
    public static final EnumC53272NhA A07 = new EnumC53272NhA(O1A.A02, "JOIN_CALL", "Join", 0.3f, 2);
    public static final EnumC53272NhA A08 = new EnumC53272NhA(O1A.A03, "LEAVE_CALL", "Leave", 0.25f, 3);

    static {
        EnumC53272NhA enumC53272NhA = new EnumC53272NhA(O1A.A00, "CONTACTING", "Contacting", 1.0f, 4);
        A05 = enumC53272NhA;
        EnumC53272NhA[] enumC53272NhAArr = {A09, A06, A07, A08, enumC53272NhA};
        A04 = enumC53272NhAArr;
        A03 = AbstractC12190kN.A00(enumC53272NhAArr);
    }

    public static EnumC53272NhA valueOf(String str) {
        return (EnumC53272NhA) Enum.valueOf(EnumC53272NhA.class, str);
    }

    public static EnumC53272NhA[] values() {
        return (EnumC53272NhA[]) A04.clone();
    }

    public EnumC53272NhA(C3LX c3lx, String str, String str2, float f, int i) {
        this.A01 = c3lx;
        this.A02 = str2;
        this.A00 = f;
    }
}
