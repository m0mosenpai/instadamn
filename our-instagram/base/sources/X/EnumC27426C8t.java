package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C8t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27426C8t implements InterfaceC31035DkZ {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC27426C8t[] A04;
    public static final EnumC27426C8t A05;
    public static final EnumC27426C8t A06;
    public static final EnumC27426C8t A07;
    public static final EnumC27426C8t A08;
    public static final EnumC27426C8t A09;
    public final int A00;
    public final int A01;
    public final boolean A02;

    static {
        EnumC27426C8t enumC27426C8t = new EnumC27426C8t("DOGFOOD_ASSISTANT", 0, 2131956734, R.drawable.instagram_info_pano_outline_24, false);
        A06 = enumC27426C8t;
        EnumC27426C8t enumC27426C8t2 = new EnumC27426C8t("LAUNCHER_FLAGS", 1, 2131956731, R.drawable.instagram_settings_pano_outline_24, false);
        A07 = enumC27426C8t2;
        EnumC27426C8t enumC27426C8t3 = new EnumC27426C8t("VIEW_PROFILE", 2, 2131956735, R.drawable.instagram_user_circle_pano_outline_24, false);
        A09 = enumC27426C8t3;
        EnumC27426C8t enumC27426C8t4 = new EnumC27426C8t("BLOCK", 3, 2131956688, R.drawable.instagram_block_pano_outline_24, true);
        A05 = enumC27426C8t4;
        EnumC27426C8t enumC27426C8t5 = new EnumC27426C8t("UNFOLLOW", 4, 2131956689, R.drawable.instagram_user_unfollow_pano_outline_24, true);
        A08 = enumC27426C8t5;
        EnumC27426C8t[] enumC27426C8tArr = {enumC27426C8t, enumC27426C8t2, enumC27426C8t3, enumC27426C8t4, enumC27426C8t5};
        A04 = enumC27426C8tArr;
        A03 = AbstractC12190kN.A00(enumC27426C8tArr);
    }

    public static EnumC27426C8t valueOf(String str) {
        return (EnumC27426C8t) Enum.valueOf(EnumC27426C8t.class, str);
    }

    public static EnumC27426C8t[] values() {
        return (EnumC27426C8t[]) A04.clone();
    }

    public EnumC27426C8t(String str, int i, int i2, int i3, boolean z) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = z;
    }

    @Override // X.InterfaceC31035DkZ
    public final int BEr() {
        return this.A00;
    }

    @Override // X.InterfaceC31035DkZ
    public final int BKz() {
        return this.A01;
    }

    @Override // X.InterfaceC31035DkZ
    public final boolean isNegative() {
        return this.A02;
    }
}
