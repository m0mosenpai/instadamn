package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6a0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141226a0 extends C6ZL {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C6eI A02;
    public final String A03;
    public final C41181vS A04;

    public C141226a0(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A00 = context;
        this.A02 = c6eI;
        this.A04 = c41181vS;
        String string = context.getString(2131971878);
        C14360o3.A07(string);
        this.A03 = string;
        this.A01 = ReelHeaderAttributionType.A0k;
    }
}
