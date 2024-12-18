package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6vH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC153476vH {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC153476vH[] A02;
    public static final EnumC153476vH A03;
    public static final EnumC153476vH A04;
    public static final EnumC153476vH A05;
    public static final EnumC153476vH A06;
    public final int A00;

    public static EnumC153476vH valueOf(String str) {
        return (EnumC153476vH) Enum.valueOf(EnumC153476vH.class, str);
    }

    public static EnumC153476vH[] values() {
        return (EnumC153476vH[]) A02.clone();
    }

    static {
        EnumC153476vH enumC153476vH = new EnumC153476vH("DISABLED", 0, R.attr.igds_color_dimmer);
        A04 = enumC153476vH;
        EnumC153476vH enumC153476vH2 = new EnumC153476vH("SELECTED", 1, R.attr.igds_color_photo_overlay);
        A06 = enumC153476vH2;
        EnumC153476vH enumC153476vH3 = new EnumC153476vH("JUST_SEEN", 2, R.attr.igds_color_dimmer);
        A05 = enumC153476vH3;
        EnumC153476vH enumC153476vH4 = new EnumC153476vH("DELETED_STORY_WARNING", 3, R.attr.igds_color_dimmer);
        A03 = enumC153476vH4;
        EnumC153476vH[] enumC153476vHArr = {enumC153476vH, enumC153476vH2, enumC153476vH3, enumC153476vH4};
        A02 = enumC153476vHArr;
        A01 = AbstractC12190kN.A00(enumC153476vHArr);
    }

    public EnumC153476vH(String str, int i, int i2) {
        this.A00 = i2;
    }
}
