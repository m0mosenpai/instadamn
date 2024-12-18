package X;

import java.util.HashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rgh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61181Rgh {
    public static final HashMap A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC61181Rgh[] A04;
    public static final EnumC61181Rgh A05;
    public static final EnumC61181Rgh A06;
    public static final EnumC61181Rgh A07;
    public static final EnumC61181Rgh A08;
    public final int A00;
    public final int A01;

    static {
        EnumC61181Rgh enumC61181Rgh = new EnumC61181Rgh("DHKEM_P256_SHA256", 0, 16, 32);
        A05 = enumC61181Rgh;
        EnumC61181Rgh enumC61181Rgh2 = new EnumC61181Rgh("DHKEM_P384_SHA384", 1, 17, 48);
        A06 = enumC61181Rgh2;
        EnumC61181Rgh enumC61181Rgh3 = new EnumC61181Rgh("DHKEM_P512_SHA512", 2, 18, 64);
        A07 = enumC61181Rgh3;
        EnumC61181Rgh enumC61181Rgh4 = new EnumC61181Rgh("DHKEM_X25519_SHA256", 3, 32, 32);
        A08 = enumC61181Rgh4;
        EnumC61181Rgh[] enumC61181RghArr = {enumC61181Rgh, enumC61181Rgh2, enumC61181Rgh3, enumC61181Rgh4, new EnumC61181Rgh("DHKEM_X488_SHA512", 4, 33, 64)};
        A04 = enumC61181RghArr;
        C020508b<EnumC61181Rgh> A00 = AbstractC12190kN.A00(enumC61181RghArr);
        A03 = A00;
        A02 = AbstractC166987dD.A1G();
        for (EnumC61181Rgh enumC61181Rgh5 : A00) {
            AbstractC58319PtB.A1H(enumC61181Rgh5, A02, enumC61181Rgh5.A01);
        }
    }

    public static EnumC61181Rgh valueOf(String str) {
        return (EnumC61181Rgh) Enum.valueOf(EnumC61181Rgh.class, str);
    }

    public static EnumC61181Rgh[] values() {
        return (EnumC61181Rgh[]) A04.clone();
    }

    public EnumC61181Rgh(String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }
}
