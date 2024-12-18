package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nh3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53265Nh3 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53265Nh3[] A04;
    public static final EnumC53265Nh3 A05;
    public static final EnumC53265Nh3 A06;
    public final int A00;
    public final int A01;
    public final Integer A02;

    public static EnumC53265Nh3 valueOf(String str) {
        return (EnumC53265Nh3) Enum.valueOf(EnumC53265Nh3.class, str);
    }

    public static EnumC53265Nh3[] values() {
        return (EnumC53265Nh3[]) A04.clone();
    }

    static {
        EnumC53265Nh3 enumC53265Nh3 = new EnumC53265Nh3(2131955910, "CLIPS_TIME_MARKER", 0, R.layout.layout_time_marker_dot_item, R.layout.layout_time_marker_text_item);
        A06 = enumC53265Nh3;
        EnumC53265Nh3 enumC53265Nh32 = new EnumC53265Nh3(null, "BASEL_TIME_MARKER", 1, R.layout.layout_time_marker_bar_no_text, R.layout.layout_time_marker_bar_with_text);
        A05 = enumC53265Nh32;
        EnumC53265Nh3[] enumC53265Nh3Arr = {enumC53265Nh3, enumC53265Nh32};
        A04 = enumC53265Nh3Arr;
        A03 = AbstractC12190kN.A00(enumC53265Nh3Arr);
    }

    public EnumC53265Nh3(Integer num, String str, int i, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = num;
    }
}
