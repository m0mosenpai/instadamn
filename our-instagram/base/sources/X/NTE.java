package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTE extends AbstractC55206OeJ {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C55177Odh A03;
    public final PC8 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTE(Activity activity, ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C55177Odh c55177Odh) {
        super(AbstractC25225BEi.A1D(C51869MwD.class));
        C14360o3.A0B(c55177Odh, 4);
        this.A00 = activity;
        this.A02 = userSession;
        this.A03 = c55177Odh;
        this.A01 = interfaceC11380iw;
        this.A04 = new PC8(viewGroup, new O5G(this));
    }
}
