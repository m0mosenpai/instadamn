package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Ij9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41978Ij9 implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C9CQ A01;
    public final /* synthetic */ C139516Tg A02;
    public final /* synthetic */ Integer A03;

    public ViewOnClickListenerC41978Ij9(Context context, C9CQ c9cq, C139516Tg c139516Tg, Integer num) {
        this.A02 = c139516Tg;
        this.A00 = context;
        this.A01 = c9cq;
        this.A03 = num;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-1685509499);
        C139516Tg c139516Tg = this.A02;
        InterfaceC145496h8 interfaceC145496h8 = c139516Tg.A04;
        if (interfaceC145496h8 != null) {
            Context context = this.A00;
            C9CQ c9cq = this.A01;
            String str2 = c9cq.A01;
            String str3 = c9cq.A00;
            String str4 = c9cq.A05;
            String str5 = c9cq.A04;
            if (this.A03.intValue() != 0) {
                str = "see_less";
            } else {
                str = "see_more";
            }
            interfaceC145496h8.CJD(context, str2, str3, str4, str5, str);
            c139516Tg.A05.setVisibility(8);
            C0f9.A0C(-581502382, A05);
            return;
        }
        C14360o3.A0F("delegate");
        throw C00O.createAndThrow();
    }
}
