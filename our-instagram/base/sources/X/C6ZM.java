package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6ZM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZM extends C6ZL {
    public final ReelHeaderAttributionType A00;
    public final C41181vS A01;
    public final C70843Fw A02;
    public final C6eI A03;
    public final String A04;
    public final Context A05;
    public final InterfaceC11380iw A06;

    public C6ZM(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A03 = c6eI;
        this.A05 = context;
        this.A01 = c41181vS;
        this.A06 = interfaceC11380iw;
        this.A02 = AbstractC70833Fv.A00(userSession);
        String string = context.getString(2131953249);
        C14360o3.A07(string);
        this.A04 = string;
        this.A00 = ReelHeaderAttributionType.A0i;
    }
}
