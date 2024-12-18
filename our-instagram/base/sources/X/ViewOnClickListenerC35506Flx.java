package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Flx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35506Flx implements View.OnClickListener {
    public final /* synthetic */ C3BV A00;

    public ViewOnClickListenerC35506Flx(C3BV c3bv) {
        this.A00 = c3bv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-829140342);
        C3BV c3bv = this.A00;
        C65911TwI c65911TwI = c3bv.A09;
        if (c65911TwI == null) {
            C65911TwI.A04.A00(c3bv.A0E, new EZ9(c3bv, 13), null, 2);
        } else {
            DirectShareTarget A00 = c65911TwI.A00();
            if (A00 != null) {
                C3BV.A05(c3bv, A00);
            }
        }
        C0f9.A0C(523209436, A05);
    }
}
