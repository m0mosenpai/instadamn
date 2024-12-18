package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LFj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47935LFj {
    public final UserSession A00;

    public C47935LFj(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(C9CD c9cd, InterfaceC11380iw interfaceC11380iw, LYW lyw, C75113Zb c75113Zb) {
        AbstractC167007dF.A1D(lyw, 0, interfaceC11380iw);
        C14360o3.A0B(c75113Zb, 3);
        View view = lyw.A04;
        if (c9cd == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        lyw.A00 = c9cd.A02;
        lyw.A01(c9cd.A01, c9cd.A03);
        lyw.A05.setVisibility(0);
        lyw.A02.setVisibility(8);
        lyw.A00(c75113Zb);
        LQ1.A00(view, 51, c9cd, interfaceC11380iw);
        view.setOnTouchListener(new ViewOnTouchListenerC48075LQa(4, c75113Zb, lyw));
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC44250Jgu(c75113Zb, 3));
        c75113Zb.A0L(lyw, null, false);
    }

    public final View A01(Context context, ViewGroup viewGroup) {
        View inflate = AbstractC31172DnG.A09(context).inflate(R.layout.broadcast_channel_feed_cta, viewGroup, false);
        UserSession userSession = this.A00;
        C14360o3.A0A(inflate);
        inflate.setTag(new LYW(inflate, userSession, AbstractC72723Nt.A00(context)));
        return inflate;
    }
}
