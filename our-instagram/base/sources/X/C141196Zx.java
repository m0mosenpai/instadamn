package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Zx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141196Zx extends C6ZL {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C41181vS A02;
    public final C6eI A03;
    public final InterfaceC144596ff A04;
    public final String A05;
    public final InterfaceC11380iw A06;

    public C141196Zx(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = context;
        this.A03 = c6eI;
        this.A02 = c41181vS;
        this.A04 = interfaceC144596ff;
        this.A06 = interfaceC11380iw;
        this.A01 = ReelHeaderAttributionType.A05;
        String string = context.getString(2131971859);
        C14360o3.A07(string);
        this.A05 = string;
    }
}