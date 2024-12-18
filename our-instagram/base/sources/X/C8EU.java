package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.8EU, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8EU {
    public final C8EV A00;
    public final C8ET A01;
    public final C23031Ai A02;
    public final Activity A03;
    public final UserSession A04;

    public C8EU(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C8ET c8et) {
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A04 = userSession;
        this.A03 = activity;
        this.A01 = c8et;
        this.A02 = AbstractC23021Ah.A00(userSession);
        this.A00 = new C8EV(interfaceC11380iw, userSession);
    }

    public final void A00() {
        boolean A06 = C18U.A06(C06090Tz.A05, this.A04, 36323483315088680L);
        Context context = this.A03;
        if (A06) {
            context = AbstractC53172bz.A01(context);
        }
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A08 = true;
        C58652mO c58652mO = (C58652mO) c193328hC.A0Q.getDrawable(R.drawable.ig_reels_cutout_sticker_cutout_sticker_icon_scissors_animation);
        IgdsHeadline igdsHeadline = c193328hC.A0Z;
        C14360o3.A0A(c58652mO);
        igdsHeadline.setCircularImageDrawable(c58652mO);
        igdsHeadline.setVisibility(0);
        c58652mO.EH0(Integer.MAX_VALUE);
        c193328hC.A03 = c58652mO;
        c193328hC.A0A(2131957426);
        c193328hC.A09(2131957423);
        c193328hC.A0J(new DialogInterfaceOnClickListenerC23142ANh(this), 2131957425);
        c193328hC.A0H(new DialogInterfaceOnClickListenerC23143ANi(this), 2131957424);
        c193328hC.A0t(true);
        c193328hC.A0h(new AP8(this));
        c193328hC.A0C(new ANW(this));
        C0fJ.A00(c193328hC.A02());
    }
}
