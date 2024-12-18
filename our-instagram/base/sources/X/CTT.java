package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;

/* loaded from: classes5.dex */
public final class CTT {
    public final void A00(View view, AnonymousClass414 anonymousClass414) {
        String string;
        int A0G = AbstractC25231BEo.A0G(anonymousClass414, -1523832935);
        if (anonymousClass414.A04) {
            view.setLayoutParams(new AbsListView.LayoutParams(-1, 48));
            AbstractC13880nE.A0W(view, 48);
        }
        AbstractC56952jT.A01(view);
        String str = anonymousClass414.A03;
        Context context = view.getContext();
        if (str != null) {
            string = AbstractC167007dF.A0f(context, str, 2131952054);
        } else {
            string = context.getString(2131952053);
        }
        view.setContentDescription(string);
        C0fQ.A00(new ViewOnClickListenerC28668ClG(30, anonymousClass414, view), view);
        C0f9.A0A(-361854726, A0G);
    }
}
