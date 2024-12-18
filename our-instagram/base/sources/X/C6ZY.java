package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6ZY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZY extends C6ZL {
    public final ReelHeaderAttributionType A00;
    public final C41181vS A01;
    public final C6eI A02;
    public final String A03;
    public final Context A04;

    public C6ZY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A04 = context;
        this.A02 = c6eI;
        this.A01 = c41181vS;
        String string = context.getString(2131961686);
        C14360o3.A07(string);
        this.A03 = string;
        this.A00 = ReelHeaderAttributionType.A0o;
    }
}
