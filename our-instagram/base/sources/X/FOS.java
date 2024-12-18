package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class FOS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final InterfaceC190658cN A06;
    public final Integer A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public /* synthetic */ FOS(Context context, View.OnClickListener onClickListener, InterfaceC190658cN interfaceC190658cN, Integer num, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4) {
        int i5;
        int i6;
        boolean z5 = z2;
        boolean z6 = z3;
        boolean z7 = z4;
        boolean z8 = (i4 & 16) != 0 ? false : z;
        if ((i4 & 32) != 0) {
            i5 = AbstractC53242c7.A0H(context, z8 ? R.attr.igds_color_error_or_destructive : R.attr.igds_color_primary_icon);
        } else {
            i5 = 0;
        }
        if ((i4 & 64) != 0) {
            i6 = AbstractC53242c7.A0H(context, z8 ? R.attr.igds_color_error_or_destructive : R.attr.igds_color_primary_text);
        } else {
            i6 = 0;
        }
        z5 = (i4 & 128) != 0 ? false : z5;
        z6 = (i4 & 256) != 0 ? false : z6;
        interfaceC190658cN = (i4 & 512) != 0 ? null : interfaceC190658cN;
        num = (i4 & 1024) != 0 ? null : num;
        z7 = (i4 & C3OO.FLAG_MOVED) != 0 ? false : z7;
        this.A02 = i;
        this.A04 = i2;
        this.A00 = i3;
        this.A08 = z8;
        this.A01 = i5;
        this.A03 = i6;
        this.A0B = z5;
        this.A0A = z6;
        this.A06 = interfaceC190658cN;
        this.A07 = num;
        this.A09 = z7;
        this.A05 = onClickListener;
    }
}
