package X;

import com.facebook.R;
import com.instagram.api.schemas.CameraTool;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8i8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC193878i8 {
    public static final /* synthetic */ EnumEntries A07;
    public static final /* synthetic */ EnumC193878i8[] A08;
    public static final EnumC193878i8 A09;
    public static final EnumC193878i8 A0A;
    public static final EnumC193878i8 A0B;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final CameraTool A05;
    public final boolean A06 = true;

    public EnumC193878i8(CameraTool cameraTool, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A05 = cameraTool;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A00 = i5;
        this.A01 = i6;
    }

    static {
        EnumC193878i8 enumC193878i8 = new EnumC193878i8(CameraTool.A0L, "BACKDROP", 0, 2131965908, 2131965910, 2131965913, R.drawable.instagram_backdrop_gen_ai_pano_outline_24, R.drawable.instagram_backdrop_gen_ai_pano_filled_24);
        A09 = enumC193878i8;
        EnumC193878i8 enumC193878i82 = new EnumC193878i8(CameraTool.A26, "RESTYLE", 1, 2131965962, 2131965964, 2131965965, R.drawable.instagram_palette_gen_ai_pano_outline_24, R.drawable.instagram_palette_gen_ai_pano_filled_24);
        A0B = enumC193878i82;
        EnumC193878i8 enumC193878i83 = new EnumC193878i8(CameraTool.A0A, "EXPANDER", 2, 2131965936, 2131965937, 2131961764, R.drawable.instagram_backdrop_gen_ai_pano_outline_24, R.drawable.instagram_backdrop_gen_ai_pano_filled_24);
        A0A = enumC193878i83;
        EnumC193878i8[] enumC193878i8Arr = {enumC193878i8, enumC193878i82, enumC193878i83};
        A08 = enumC193878i8Arr;
        A07 = AbstractC12190kN.A00(enumC193878i8Arr);
    }

    public static EnumC193878i8 valueOf(String str) {
        return (EnumC193878i8) Enum.valueOf(EnumC193878i8.class, str);
    }

    public static EnumC193878i8[] values() {
        return (EnumC193878i8[]) A08.clone();
    }
}
