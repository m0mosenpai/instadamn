package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6ZP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZP extends C6ZL {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C41181vS A02;
    public final C41551w4 A03;
    public final C6eI A04;
    public final String A05;

    public C6ZP(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C6eI c6eI) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = context;
        this.A04 = c6eI;
        this.A03 = c41551w4;
        this.A02 = c41181vS;
        String string = context.getString(2131974902);
        C14360o3.A07(string);
        this.A05 = string;
        this.A01 = ReelHeaderAttributionType.A0r;
    }
}
