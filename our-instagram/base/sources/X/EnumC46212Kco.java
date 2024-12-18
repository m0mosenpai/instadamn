package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kco, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46212Kco {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC46212Kco[] A04;
    public static final EnumC46212Kco A05;
    public static final EnumC46212Kco A06;
    public static final EnumC46212Kco A07;
    public static final EnumC46212Kco A08;
    public final int A00;
    public final int A01;
    public final int[] A02;

    public static EnumC46212Kco valueOf(String str) {
        return (EnumC46212Kco) Enum.valueOf(EnumC46212Kco.class, str);
    }

    public static EnumC46212Kco[] values() {
        return (EnumC46212Kco[]) A04.clone();
    }

    static {
        EnumC46212Kco enumC46212Kco = new EnumC46212Kco("DEFAULT", AbstractC47206Ktf.A02, 0, R.id.gradient_default, 2131971178);
        A06 = enumC46212Kco;
        EnumC46212Kco enumC46212Kco2 = new EnumC46212Kco("PURPLE", AbstractC47206Ktf.A04, 1, R.id.gradient_purple, 2131971193);
        A08 = enumC46212Kco2;
        EnumC46212Kco enumC46212Kco3 = new EnumC46212Kco("BLUE", AbstractC47206Ktf.A01, 2, R.id.gradient_blue, 2131971177);
        A05 = enumC46212Kco3;
        EnumC46212Kco enumC46212Kco4 = new EnumC46212Kco("GREEN", AbstractC47206Ktf.A03, 3, R.id.gradient_green, 2131971190);
        A07 = enumC46212Kco4;
        EnumC46212Kco[] enumC46212KcoArr = {enumC46212Kco, enumC46212Kco2, enumC46212Kco3, enumC46212Kco4, new EnumC46212Kco("BLACK", AbstractC47206Ktf.A00, 4, R.id.gradient_black, 2131971176)};
        A04 = enumC46212KcoArr;
        A03 = AbstractC12190kN.A00(enumC46212KcoArr);
    }

    public EnumC46212Kco(String str, int[] iArr, int i, int i2, int i3) {
        this.A01 = i2;
        this.A02 = iArr;
        this.A00 = i3;
    }
}
