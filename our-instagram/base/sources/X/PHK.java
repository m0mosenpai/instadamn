package X;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes9.dex */
public final class PHK implements InterfaceC125355lh {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PHK(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        if (this.A00 != 0) {
            C54731OFi c54731OFi = (C54731OFi) this.A02;
            c54731OFi.A01.remove(this.A01);
            MSZ.A1V(c54731OFi.A0D, MSY.A02(AbstractC166987dD.A0d(c54731OFi.A0A)));
            return;
        }
        C51362MmN c51362MmN = (C51362MmN) this.A02;
        C56802PIt c56802PIt = (C56802PIt) this.A01;
        String str = c56802PIt.A08;
        TextView textView = c51362MmN.A08;
        textView.setText(c56802PIt.A09);
        TextView textView2 = c51362MmN.A07;
        textView2.setText(str);
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView.setTypeface(Typeface.DEFAULT);
    }
}
