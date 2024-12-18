package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Zh, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Zh extends C6ZL {
    public final Context A00;
    public final Reel A01;
    public final ReelHeaderAttributionType A02;
    public final C41181vS A03;
    public final C6eI A04;
    public final InterfaceC144596ff A05;

    public C6Zh(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Reel reel, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = context;
        this.A04 = c6eI;
        this.A01 = reel;
        this.A03 = c41181vS;
        this.A05 = interfaceC144596ff;
        this.A02 = ReelHeaderAttributionType.A0P;
    }
}
