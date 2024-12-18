package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HE6 extends AbstractC39047HGx {
    public final C6FG A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C39352HZr A03;
    public final C102884kP A04;

    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(this.A00.A00), null, R.layout.lightbox_story_photo, false);
        A0C.setTag(new C42798Iwa(A0C));
        ((AbstractC39047HGx) this).A00 = A0C;
        return A0C;
    }

    public HE6(C6FG c6fg, C102884kP c102884kP, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C39352HZr c39352HZr) {
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
