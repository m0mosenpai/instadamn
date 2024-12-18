package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6ZV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZV extends C6ZL {
    public final ReelHeaderAttributionType A00;
    public final C41551w4 A01;
    public final C6eI A02;
    public final String A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public final C41181vS A06;

    public C6ZV(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C6eI c6eI) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A02 = c6eI;
        this.A04 = context;
        this.A06 = c41181vS;
        this.A05 = interfaceC11380iw;
        this.A01 = c41551w4;
        String string = context.getString(2131974966);
        C14360o3.A07(string);
        this.A03 = string;
        this.A00 = ReelHeaderAttributionType.A0s;
    }
}
