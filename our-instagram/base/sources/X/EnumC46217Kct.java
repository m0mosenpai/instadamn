package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kct, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46217Kct {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC46217Kct[] A05;
    public static final EnumC46217Kct A06;
    public static final EnumC46217Kct A07;
    public static final EnumC46217Kct A08;
    public static final EnumC46217Kct A09;
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static EnumC46217Kct valueOf(String str) {
        return (EnumC46217Kct) Enum.valueOf(EnumC46217Kct.class, str);
    }

    public static EnumC46217Kct[] values() {
        return (EnumC46217Kct[]) A05.clone();
    }

    static {
        EnumC46217Kct enumC46217Kct = new EnumC46217Kct("FILTER", 3.5f, 0, R.attr.igds_color_secondary_text, R.attr.igds_color_primary_text, 8);
        A06 = enumC46217Kct;
        EnumC46217Kct enumC46217Kct2 = new EnumC46217Kct("FILTER_DARK", 3.5f, 1, R.color.grey_6, R.attr.igds_color_text_on_color, 8);
        A07 = enumC46217Kct2;
        EnumC46217Kct enumC46217Kct3 = new EnumC46217Kct("TOOL", 0.0f, 2, R.attr.igds_color_primary_text, R.attr.igds_color_secondary_text, 0);
        A08 = enumC46217Kct3;
        EnumC46217Kct enumC46217Kct4 = new EnumC46217Kct("TOOL_DARK", 0.0f, 3, R.attr.igds_color_text_on_color, R.attr.igds_color_text_on_color, 0);
        A09 = enumC46217Kct4;
        EnumC46217Kct[] enumC46217KctArr = {enumC46217Kct, enumC46217Kct2, enumC46217Kct3, enumC46217Kct4};
        A05 = enumC46217KctArr;
        A04 = AbstractC12190kN.A00(enumC46217KctArr);
    }

    public EnumC46217Kct(String str, float f, int i, int i2, int i3, int i4) {
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A00 = f;
    }
}
