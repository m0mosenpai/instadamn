package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.LOb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48032LOb implements View.OnClickListener {
    public final /* synthetic */ C7SB A00;
    public final /* synthetic */ C7BU A01;

    public ViewOnClickListenerC48032LOb(C7SB c7sb, C7BU c7bu) {
        this.A00 = c7sb;
        this.A01 = c7bu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RectF rectF;
        int A05 = C0f9.A05(-1800274771);
        C7SB c7sb = this.A00;
        InterfaceC165507ad interfaceC165507ad = c7sb.A02;
        if (!interfaceC165507ad.CQu()) {
            InterfaceC165477aa interfaceC165477aa = (InterfaceC165477aa) interfaceC165507ad;
            C7BU c7bu = this.A01;
            String str = c7bu.A04;
            C22P A01 = C4JI.A01(c7bu.A03);
            View view2 = c7sb.A01.getView();
            Rect A0U = AbstractC166987dD.A0U();
            if (!view2.getGlobalVisibleRect(A0U)) {
                rectF = null;
            } else {
                rectF = new RectF(A0U);
            }
            interfaceC165477aa.DfY(rectF, A01, null, str, null);
        }
        C0f9.A0C(-1887717681, A05);
    }
}
