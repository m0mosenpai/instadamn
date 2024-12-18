package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141206Zy extends C6ZL {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final ReelHeaderAttributionType A02;
    public final C41181vS A03;
    public final C6eI A04;
    public final String A05;
    public final InterfaceC144596ff A06;

    public C141206Zy(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = context;
        this.A04 = c6eI;
        this.A03 = c41181vS;
        this.A06 = interfaceC144596ff;
        this.A01 = interfaceC11380iw;
        String string = context.getString(2131976845);
        C14360o3.A07(string);
        this.A05 = string;
        this.A02 = ReelHeaderAttributionType.A0L;
    }
}
