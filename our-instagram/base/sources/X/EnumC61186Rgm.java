package X;

import java.util.HashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rgm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61186Rgm {
    public static final HashMap A03;
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC61186Rgm[] A05;
    public static final EnumC61186Rgm A06;
    public static final EnumC61186Rgm A07;
    public final int A00;
    public final int A01 = 12;
    public final int A02;

    static {
        EnumC61186Rgm enumC61186Rgm = new EnumC61186Rgm("AES128GCM", 0, 1, 16);
        A06 = enumC61186Rgm;
        EnumC61186Rgm enumC61186Rgm2 = new EnumC61186Rgm("AES256GCM", 1, 2, 32);
        A07 = enumC61186Rgm2;
        EnumC61186Rgm[] enumC61186RgmArr = {enumC61186Rgm, enumC61186Rgm2, new EnumC61186Rgm("CHACHA20POLY1305", 2, 3, 32)};
        A05 = enumC61186RgmArr;
        C020508b<EnumC61186Rgm> A00 = AbstractC12190kN.A00(enumC61186RgmArr);
        A04 = A00;
        A03 = AbstractC166987dD.A1G();
        for (EnumC61186Rgm enumC61186Rgm3 : A00) {
            AbstractC58319PtB.A1H(enumC61186Rgm3, A03, enumC61186Rgm3.A02);
        }
    }

    public EnumC61186Rgm(String str, int i, int i2, int i3) {
        this.A02 = i2;
        this.A00 = i3;
    }

    public static EnumC61186Rgm valueOf(String str) {
        return (EnumC61186Rgm) Enum.valueOf(EnumC61186Rgm.class, str);
    }

    public static EnumC61186Rgm[] values() {
        return (EnumC61186Rgm[]) A05.clone();
    }
}
