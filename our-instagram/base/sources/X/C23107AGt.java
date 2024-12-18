package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.AGt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23107AGt {
    public int A00;
    public final TextView A01;
    public final InterfaceC56392iX A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final A60 A06;

    public C23107AGt(Context context, TextView textView, InterfaceC56392iX interfaceC56392iX, A60 a60) {
        C14360o3.A0B(textView, 2);
        this.A05 = context;
        this.A01 = textView;
        this.A02 = interfaceC56392iX;
        this.A06 = a60;
        this.A03 = AbstractC167007dF.A09(context, R.attr.musicCreationTimeIndicatorTextColor);
        this.A04 = context.getColor(R.color.music_sticker_tray_color_2);
        textView.setText(AbstractC189358aC.A01(0));
    }

    public final void A01(int i, boolean z) {
        int i2;
        if (Math.round(i / 1000.0f) != Math.round(this.A00 / 1000.0f)) {
            this.A00 = i;
            TextView textView = this.A01;
            textView.setText(AbstractC189358aC.A01(i));
            if (z) {
                i2 = this.A04;
            } else {
                i2 = this.A03;
            }
            if (textView.getCurrentTextColor() != i2) {
                textView.setTextColor(i2);
            }
        }
    }

    public static final void A00(C23107AGt c23107AGt, boolean z) {
        InterfaceC189958bE interfaceC189958bE = c23107AGt.A06.A00.A0y;
        if (!interfaceC189958bE.Cdk()) {
            String BYP = interfaceC189958bE.BYP(z);
            if (BYP != null && BYP.length() != 0) {
                InterfaceC56392iX interfaceC56392iX = c23107AGt.A02;
                interfaceC56392iX.setVisibility(0);
                ((TextView) interfaceC56392iX.getView()).setText(BYP);
                return;
            }
            c23107AGt.A02.setVisibility(8);
        }
    }
}
