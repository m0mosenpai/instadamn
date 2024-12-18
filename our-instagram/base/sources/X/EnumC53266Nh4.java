package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nh4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53266Nh4 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53266Nh4[] A04;
    public static final EnumC53266Nh4 A05;
    public static final EnumC53266Nh4 A06;
    public final int A00;
    public final int A01;
    public final int A02;

    static {
        EnumC53266Nh4 enumC53266Nh4 = new EnumC53266Nh4("OFF", 0, -1, 2131968927, R.drawable.mode_tilt_off);
        A05 = enumC53266Nh4;
        EnumC53266Nh4 enumC53266Nh42 = new EnumC53266Nh4("RADIAL", 1, 1, 2131975587, R.drawable.mode_tilt_radial_off);
        A06 = enumC53266Nh42;
        EnumC53266Nh4[] enumC53266Nh4Arr = {enumC53266Nh4, enumC53266Nh42, new EnumC53266Nh4("LINEAR", 2, 0, 2131975586, R.drawable.mode_tilt_linear_off)};
        A04 = enumC53266Nh4Arr;
        A03 = AbstractC12190kN.A00(enumC53266Nh4Arr);
    }

    public static EnumC53266Nh4 valueOf(String str) {
        return (EnumC53266Nh4) Enum.valueOf(EnumC53266Nh4.class, str);
    }

    public static EnumC53266Nh4[] values() {
        return (EnumC53266Nh4[]) A04.clone();
    }

    public EnumC53266Nh4(String str, int i, int i2, int i3, int i4) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
    }
}
