package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6a2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6a2 extends C6ZL {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C41181vS A02;
    public final C41551w4 A03;
    public final C6eI A04;
    public final InterfaceC144596ff A05;
    public final String A06;
    public final InterfaceC11380iw A07;

    public C6a2(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A04 = c6eI;
        this.A00 = context;
        this.A02 = c41181vS;
        this.A05 = interfaceC144596ff;
        this.A07 = interfaceC11380iw;
        this.A03 = c41551w4;
        String string = context.getString(2131953248);
        C14360o3.A07(string);
        this.A06 = string;
        this.A01 = ReelHeaderAttributionType.A0V;
    }
}
