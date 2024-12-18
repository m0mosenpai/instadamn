package X;

import android.util.SparseArray;
import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46219Kcv {
    public static final SparseArray A04;
    public static final /* synthetic */ EnumEntries A05;
    public static final /* synthetic */ EnumC46219Kcv[] A06;
    public static final EnumC46219Kcv A07;
    public static final EnumC46219Kcv A08;
    public static final EnumC46219Kcv A09;
    public static final EnumC46219Kcv A0A;
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public static EnumC46219Kcv valueOf(String str) {
        return (EnumC46219Kcv) Enum.valueOf(EnumC46219Kcv.class, str);
    }

    public static EnumC46219Kcv[] values() {
        return (EnumC46219Kcv[]) A06.clone();
    }

    static {
        EnumC46219Kcv enumC46219Kcv = new EnumC46219Kcv("SUNGLASSES", 0.28f, 0.4f, 0, 0, R.drawable.sticker_sunglasses);
        A0A = enumC46219Kcv;
        EnumC46219Kcv enumC46219Kcv2 = new EnumC46219Kcv("HEARTS", 0.28f, 0.4f, 1, 1, R.drawable.sticker_hearts);
        A08 = enumC46219Kcv2;
        EnumC46219Kcv enumC46219Kcv3 = new EnumC46219Kcv("BLUE_GLASSES", 0.28f, 0.4f, 2, 2, R.drawable.sticker_blue_glasses);
        A07 = enumC46219Kcv3;
        EnumC46219Kcv enumC46219Kcv4 = new EnumC46219Kcv("MUSTACHE", 0.62f, 0.25f, 3, 3, R.drawable.sticker_mustache);
        A09 = enumC46219Kcv4;
        EnumC46219Kcv[] enumC46219KcvArr = {enumC46219Kcv, enumC46219Kcv2, enumC46219Kcv3, enumC46219Kcv4, new EnumC46219Kcv("UNICORN", 0.5f, 0.9f, 4, 4, R.drawable.sticker_unicorn)};
        A06 = enumC46219KcvArr;
        A05 = AbstractC12190kN.A00(enumC46219KcvArr);
        A04 = new SparseArray();
        for (EnumC46219Kcv enumC46219Kcv5 : values()) {
            A04.put(enumC46219Kcv5.A03, enumC46219Kcv5);
        }
    }

    public EnumC46219Kcv(String str, float f, float f2, int i, int i2, int i3) {
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = f;
        this.A00 = f2;
    }
}
