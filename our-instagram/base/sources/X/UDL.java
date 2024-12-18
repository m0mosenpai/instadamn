package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UDL extends C69725VuK {
    public final /* synthetic */ WPV A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDL(Context context, View view, UDI udi, WPV wpv) {
        super(context, view, udi, R.attr.actionOverflowMenuStyle, 0, false);
        this.A00 = wpv;
        if ((((WQJ) udi.getItem()).A02 & 32) != 32) {
            View view2 = wpv.A0C;
            this.A01 = view2 == null ? (View) wpv.A08 : view2;
        }
        WPR wpr = wpv.A0K;
        this.A04 = wpr;
        WPX wpx = this.A03;
        if (wpx != null) {
            wpx.EQl(wpr);
        }
    }

    @Override // X.C69725VuK
    public final void A01() {
        this.A00.A09 = null;
        super.A01();
    }
}
