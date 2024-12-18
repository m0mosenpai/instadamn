package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C8s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27425C8s implements InterfaceC31035DkZ {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC27425C8s[] A04;
    public static final EnumC27425C8s A05;
    public static final EnumC27425C8s A06;
    public static final EnumC27425C8s A07;
    public static final EnumC27425C8s A08;
    public static final EnumC27425C8s A09;
    public final int A00;
    public final int A01;
    public final boolean A02;

    static {
        EnumC27425C8s enumC27425C8s = new EnumC27425C8s("ADD_NOTE", 0, 2131956729, R.drawable.instagram_add_pano_outline_24, false);
        A05 = enumC27425C8s;
        EnumC27425C8s enumC27425C8s2 = new EnumC27425C8s("VIEW_PROFILE", 1, 2131956735, R.drawable.instagram_user_circle_pano_outline_24, false);
        A09 = enumC27425C8s2;
        EnumC27425C8s enumC27425C8s3 = new EnumC27425C8s("MUTE", 2, 2131956732, R.drawable.instagram_eye_off_pano_outline_24, false);
        A07 = enumC27425C8s3;
        EnumC27425C8s enumC27425C8s4 = new EnumC27425C8s("REPORT", 3, 2131956733, R.drawable.instagram_report_pano_outline_24, true);
        A08 = enumC27425C8s4;
        EnumC27425C8s enumC27425C8s5 = new EnumC27425C8s("DELETE_NOTE", 4, 2131956730, R.drawable.instagram_delete_pano_outline_24, true);
        A06 = enumC27425C8s5;
        EnumC27425C8s[] enumC27425C8sArr = {enumC27425C8s, enumC27425C8s2, enumC27425C8s3, enumC27425C8s4, enumC27425C8s5};
        A04 = enumC27425C8sArr;
        A03 = AbstractC12190kN.A00(enumC27425C8sArr);
    }

    public static EnumC27425C8s valueOf(String str) {
        return (EnumC27425C8s) Enum.valueOf(EnumC27425C8s.class, str);
    }

    public static EnumC27425C8s[] values() {
        return (EnumC27425C8s[]) A04.clone();
    }

    public EnumC27425C8s(String str, int i, int i2, int i3, boolean z) {
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
