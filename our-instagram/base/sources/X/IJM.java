package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes7.dex */
public final class IJM {
    public final Context A00;
    public final C193328hC A01;
    public final InterfaceC16820sZ A02;
    public final boolean A03;
    public final boolean A04;

    public IJM(Context context, UserSession userSession, UpcomingEvent upcomingEvent) {
        boolean A01 = new C146066i4(userSession).A01(upcomingEvent);
        boolean A012 = AbstractC14480oK.A01(context);
        C43204J8b c43204J8b = new C43204J8b(context, 9);
        this.A00 = context;
        this.A04 = A01;
        this.A03 = A012;
        this.A02 = c43204J8b;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131976235);
        A0I.A09(2131976234);
        A0I.A0d(DialogInterfaceOnClickListenerC41836Ifq.A00(this, 32), AbstractC166997dE.A0p(context, 2131976236));
        A0I.A0b(DialogInterfaceOnClickListenerC41832Ifm.A00, AbstractC166997dE.A0p(context, 2131968687));
        this.A01 = A0I;
    }
}
