package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.JUb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC43692JUb {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC43692JUb[] A04;
    public static final EnumC43692JUb A05;
    public static final EnumC43692JUb A06;
    public static final EnumC43692JUb A07;
    public final float A00;
    public final int A01;
    public final int A02;

    public static EnumC43692JUb valueOf(String str) {
        return (EnumC43692JUb) Enum.valueOf(EnumC43692JUb.class, str);
    }

    public static EnumC43692JUb[] values() {
        return (EnumC43692JUb[]) A04.clone();
    }

    static {
        EnumC43692JUb enumC43692JUb = new EnumC43692JUb("ONE", 1.0f, 0, 2131960726, R.drawable.playback_speed_1x);
        A05 = enumC43692JUb;
        EnumC43692JUb enumC43692JUb2 = new EnumC43692JUb("ONE_POINT_FIVE", 1.5f, 1, 2131960727, R.drawable.playback_speed_1_5x);
        A06 = enumC43692JUb2;
        EnumC43692JUb enumC43692JUb3 = new EnumC43692JUb("TWO", 2.0f, 2, 2131960728, R.drawable.playback_speed_2x);
        A07 = enumC43692JUb3;
        EnumC43692JUb[] enumC43692JUbArr = {enumC43692JUb, enumC43692JUb2, enumC43692JUb3};
        A04 = enumC43692JUbArr;
        A03 = AbstractC12190kN.A00(enumC43692JUbArr);
    }

    public EnumC43692JUb(String str, float f, int i, int i2, int i3) {
        this.A00 = f;
        this.A02 = i2;
        this.A01 = i3;
    }
}
