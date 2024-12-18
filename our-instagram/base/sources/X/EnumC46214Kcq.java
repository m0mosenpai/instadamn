package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46214Kcq {
    public static final LIF A03;
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC46214Kcq[] A05;
    public static final EnumC46214Kcq A06;
    public static final EnumC46214Kcq A07;
    public static final EnumC46214Kcq A08;
    public static final EnumC46214Kcq A09;
    public static final EnumC46214Kcq A0A;
    public final int A00;
    public final int A01;
    public final int A02;

    public static EnumC46214Kcq valueOf(String str) {
        return (EnumC46214Kcq) Enum.valueOf(EnumC46214Kcq.class, str);
    }

    public static EnumC46214Kcq[] values() {
        return (EnumC46214Kcq[]) A05.clone();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.LIF] */
    static {
        EnumC46214Kcq enumC46214Kcq = new EnumC46214Kcq("VIEW_MODE", 0, 2131960747, R.drawable.instagram_mail_arrow_right_pano_outline_16, R.drawable.instagram_chevron_down_pano_filled_12);
        A0A = enumC46214Kcq;
        EnumC46214Kcq enumC46214Kcq2 = new EnumC46214Kcq("FILTER_TYPE", 1, 2131960744, R.drawable.instagram_sliders_pano_outline_16, R.drawable.instagram_chevron_down_pano_filled_12);
        A06 = enumC46214Kcq2;
        EnumC46214Kcq enumC46214Kcq3 = new EnumC46214Kcq("SENDER_TYPE", 2, 2131960748, R.drawable.instagram_user_circle_pano_outline_16, R.drawable.instagram_chevron_down_pano_filled_12);
        A09 = enumC46214Kcq3;
        EnumC46214Kcq enumC46214Kcq4 = new EnumC46214Kcq("LABEL", 3, 2131960746, R.drawable.instagram_tag_pano_outline_16, R.drawable.instagram_chevron_down_pano_filled_12);
        A08 = enumC46214Kcq4;
        EnumC46214Kcq enumC46214Kcq5 = new EnumC46214Kcq("HIDDEN", 4, 2131960745, R.drawable.instagram_eye_off_pano_outline_16, R.drawable.instagram_chevron_right_pano_filled_12);
        A07 = enumC46214Kcq5;
        EnumC46214Kcq[] enumC46214KcqArr = {enumC46214Kcq, enumC46214Kcq2, enumC46214Kcq3, enumC46214Kcq4, enumC46214Kcq5};
        A05 = enumC46214KcqArr;
        A04 = AbstractC12190kN.A00(enumC46214KcqArr);
        A03 = new Object();
    }

    public EnumC46214Kcq(String str, int i, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
