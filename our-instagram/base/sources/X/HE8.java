package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HE8 extends AbstractC39047HGx {
    public final C6FG A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C39352HZr A03;
    public final C102884kP A04;

    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        C14360o3.A0B(context, 0);
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), null, R.layout.lightbox_story_video, false);
        A0C.setTag(new C42799Iwb(A0C));
        FrameLayout A00 = AbstractC41652Ibk.A00(A0C);
        C14360o3.A0B(A00, 0);
        ((AbstractC39047HGx) this).A00 = A00;
        return A00;
    }

    public HE8(C6FG c6fg, C102884kP c102884kP, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C39352HZr c39352HZr) {
        super(c6fg, c102884kP, userSession, interfaceC60442pS, c39352HZr);
        this.A04 = c102884kP;
        this.A00 = c6fg;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A03 = c39352HZr;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }
}