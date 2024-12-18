package X;

import android.graphics.Color;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Bmx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26476Bmx extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C75113Zb A01;
    public final InterfaceC30968DjP A02;
    public final InterfaceC30988Djn A03;
    public final C37644Ghd A04;
    public final UserSession A05;
    public final UpcomingEvent A06;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        ClipsShoppingCTABarIntf clipsShoppingCTABarIntf;
        C38321qM c38321qM;
        int A09;
        float f;
        String title;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A00;
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null) {
            clipsShoppingCTABarIntf = AbstractC37667Gi0.A00(c38321qM2);
        } else {
            clipsShoppingCTABarIntf = null;
        }
        UpcomingEvent upcomingEvent = this.A06;
        if (upcomingEvent != null && (c38321qM = c120985dq.A02) != null && AbstractC37667Gi0.A03(c38321qM, upcomingEvent)) {
            UserSession userSession = this.A05;
            if (new C146066i4(userSession).A00(upcomingEvent) && clipsShoppingCTABarIntf != null) {
                String dominantColor = clipsShoppingCTABarIntf.getDominantColor();
                if (dominantColor != null) {
                    A09 = Color.parseColor(dominantColor);
                } else {
                    A09 = AbstractC25228BEl.A09(c76223bS, R.color.badge_color);
                }
                Integer Azv = clipsShoppingCTABarIntf.Azv();
                if (Azv != null) {
                    f = Azv.intValue();
                } else {
                    f = 4.0f;
                }
                C37644Ghd c37644Ghd = this.A04;
                C29902DGq A01 = C29902DGq.A01(this, 46);
                InterfaceC30988Djn interfaceC30988Djn = this.A03;
                if (new C146066i4(userSession).A01(upcomingEvent) && clipsShoppingCTABarIntf.getToggledTitle() != null) {
                    title = clipsShoppingCTABarIntf.getToggledTitle();
                } else {
                    title = clipsShoppingCTABarIntf.getTitle();
                }
                return AbstractC28341CeT.A00(null, c76223bS, interfaceC30988Djn, c120985dq, c37644Ghd, userSession, title, A01, f, A09, true, this.A01.A1t, false);
            }
        }
        return null;
    }

    public C26476Bmx(InterfaceC30988Djn interfaceC30988Djn, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C75113Zb c75113Zb, UpcomingEvent upcomingEvent, InterfaceC30968DjP interfaceC30968DjP) {
        AbstractC167017dG.A1U(interfaceC30968DjP, userSession);
        this.A00 = c120985dq;
        this.A04 = c37644Ghd;
        this.A01 = c75113Zb;
        this.A06 = upcomingEvent;
        this.A03 = interfaceC30988Djn;
        this.A02 = interfaceC30968DjP;
        this.A05 = userSession;
    }
}
