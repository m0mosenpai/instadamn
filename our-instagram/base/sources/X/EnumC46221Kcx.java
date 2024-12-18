package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46221Kcx {
    public static final /* synthetic */ EnumEntries A05;
    public static final /* synthetic */ EnumC46221Kcx[] A06;
    public static final EnumC46221Kcx A07;
    public static final EnumC46221Kcx A08;
    public static final EnumC46221Kcx A09;
    public static final EnumC46221Kcx A0A;
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    static {
        EnumC46221Kcx enumC46221Kcx = new EnumC46221Kcx(null, "NORMAL", 0, false, true, true, false);
        A09 = enumC46221Kcx;
        EnumC46221Kcx enumC46221Kcx2 = new EnumC46221Kcx(null, "NORMAL_PROMOTION", 1, false, true, true, true);
        A0A = enumC46221Kcx2;
        EnumC46221Kcx enumC46221Kcx3 = new EnumC46221Kcx(Integer.valueOf(R.attr.igds_color_error_or_destructive), "DESTRUCTIVE", 2, false, true, true, false);
        A07 = enumC46221Kcx3;
        EnumC46221Kcx enumC46221Kcx4 = new EnumC46221Kcx(null, "MESSAGE_STATUS", 3, true, false, false, false);
        A08 = enumC46221Kcx4;
        EnumC46221Kcx[] enumC46221KcxArr = {enumC46221Kcx, enumC46221Kcx2, enumC46221Kcx3, enumC46221Kcx4};
        A06 = enumC46221KcxArr;
        A05 = AbstractC12190kN.A00(enumC46221KcxArr);
    }

    public static EnumC46221Kcx valueOf(String str) {
        return (EnumC46221Kcx) Enum.valueOf(EnumC46221Kcx.class, str);
    }

    public static EnumC46221Kcx[] values() {
        return (EnumC46221Kcx[]) A06.clone();
    }

    public EnumC46221Kcx(Integer num, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = num;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = z3;
        this.A04 = z4;
    }
}
