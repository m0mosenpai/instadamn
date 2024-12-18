package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UDM extends C69725VuK {
    public final /* synthetic */ WPV A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDM(Context context, View view, WQH wqh, WPV wpv) {
        super(context, view, wqh, R.attr.actionOverflowMenuStyle, 0, true);
        this.A00 = wpv;
        super.A00 = 8388613;
        WPR wpr = wpv.A0K;
        this.A04 = wpr;
        WPX wpx = this.A03;
        if (wpx != null) {
            wpx.EQl(wpr);
        }
    }

    @Override // X.C69725VuK
    public final void A01() {
        WPV wpv = this.A00;
        WQH wqh = wpv.A06;
        if (wqh != null) {
            wqh.close();
        }
        wpv.A0D = null;
        super.A01();
    }
}
