package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6a7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141286a7 extends C6ZL {
    public final ReelHeaderAttributionType A00;
    public final C41181vS A01;
    public final C6eI A02;
    public final InterfaceC144596ff A03;
    public final String A04;
    public final Context A05;
    public final InterfaceC11380iw A06;

    public C141286a7(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A02 = c6eI;
        this.A05 = context;
        this.A01 = c41181vS;
        this.A03 = interfaceC144596ff;
        this.A06 = interfaceC11380iw;
        String string = context.getString(2131971153);
        C14360o3.A07(string);
        this.A04 = string;
        this.A00 = ReelHeaderAttributionType.A0e;
    }
}