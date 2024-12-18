package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C7e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27401C7e {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC27401C7e[] A04;
    public static final EnumC27401C7e A05;
    public static final EnumC27401C7e A06;
    public static final EnumC27401C7e A07;
    public static final EnumC27401C7e A08;
    public static final EnumC27401C7e A09;
    public static final EnumC27401C7e A0A;
    public final int A00;
    public final int A01;
    public final EnumC27389C6s A02;

    public static EnumC27401C7e valueOf(String str) {
        return (EnumC27401C7e) Enum.valueOf(EnumC27401C7e.class, str);
    }

    public static EnumC27401C7e[] values() {
        return (EnumC27401C7e[]) A04.clone();
    }

    static {
        EnumC27401C7e enumC27401C7e = new EnumC27401C7e(EnumC27389C6s.A02, "STICKER_ANYTHING", 0, R.drawable.instagram_scissors_pano_outline_24, 2131955513);
        A09 = enumC27401C7e;
        EnumC27389C6s enumC27389C6s = EnumC27389C6s.A03;
        EnumC27401C7e enumC27401C7e2 = new EnumC27401C7e(enumC27389C6s, "ENTER_FULLSCREEN_VIEW", 1, R.drawable.instagram_fullscreen_pano_outline_24, 2131955515);
        A06 = enumC27401C7e2;
        EnumC27401C7e enumC27401C7e3 = new EnumC27401C7e(enumC27389C6s, "EXIT_FULLSCREEN_VIEW", 2, R.drawable.instagram_fullscreen_off_pano_outline_24, 2131955514);
        A07 = enumC27401C7e3;
        EnumC27389C6s enumC27389C6s2 = EnumC27389C6s.A05;
        EnumC27401C7e enumC27401C7e4 = new EnumC27401C7e(enumC27389C6s2, "SAVE", 3, R.drawable.instagram_save_pano_outline_24, 2131955516);
        A08 = enumC27401C7e4;
        EnumC27401C7e enumC27401C7e5 = new EnumC27401C7e(enumC27389C6s2, "UNSAVE", 4, R.drawable.instagram_unsave_pano_outline_24, 2131955517);
        A0A = enumC27401C7e5;
        EnumC27401C7e enumC27401C7e6 = new EnumC27401C7e(EnumC27389C6s.A04, "CONTENT_NOTES", 5, R.drawable.instagram_content_note_add_pano_outline_24, 2131955512);
        A05 = enumC27401C7e6;
        EnumC27401C7e[] enumC27401C7eArr = {enumC27401C7e, enumC27401C7e2, enumC27401C7e3, enumC27401C7e4, enumC27401C7e5, enumC27401C7e6};
        A04 = enumC27401C7eArr;
        A03 = AbstractC12190kN.A00(enumC27401C7eArr);
    }

    public EnumC27401C7e(EnumC27389C6s enumC27389C6s, String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = enumC27389C6s;
    }
}
