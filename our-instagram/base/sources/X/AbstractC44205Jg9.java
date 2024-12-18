package X;

import com.facebook.R;

/* renamed from: X.Jg9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44205Jg9 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public /* synthetic */ AbstractC44205Jg9(float f, float f2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        i = (i5 & 1) != 0 ? R.dimen.account_group_management_title_text_horizontal_padding : i;
        i2 = (i5 & 2) != 0 ? R.dimen.abc_action_bar_elevation_material : i2;
        i3 = (i5 & 4) != 0 ? R.dimen.afi_indicator_arrow_margin_top : i3;
        i4 = (i5 & 8) != 0 ? R.dimen.abc_edit_text_inset_top_material : i4;
        boolean A1M = AbstractC167007dF.A1M(i5 & 16);
        z = (i5 & 32) != 0 ? false : z;
        z2 = (i5 & 64) != 0 ? false : z2;
        boolean z4 = (i5 & 128) != 0;
        f = (i5 & 256) != 0 ? 1.0f : f;
        f2 = (i5 & 512) != 0 ? 0.0f : f2;
        boolean z5 = (i5 & 1024) == 0 ? z3 : false;
        this.A04 = i;
        this.A02 = i2;
        this.A05 = i3;
        this.A03 = i4;
        this.A09 = A1M;
        this.A0A = z;
        this.A07 = z2;
        this.A06 = z4;
        this.A01 = f;
        this.A00 = f2;
        this.A08 = z5;
    }
}
