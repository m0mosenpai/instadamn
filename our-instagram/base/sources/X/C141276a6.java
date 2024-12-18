package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6a6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141276a6 extends C6ZL {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C41181vS A02;
    public final C8F9 A03;
    public final C6eI A04;
    public final InterfaceC144596ff A05;
    public final String A06;
    public final InterfaceC11380iw A07;

    public C141276a6(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        C8F9 c8f9;
        C66645URj c66645URj;
        this.A00 = context;
        this.A04 = c6eI;
        this.A02 = c41181vS;
        this.A05 = interfaceC144596ff;
        this.A07 = interfaceC11380iw;
        C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0p, c41181vS.A0c());
        String str = null;
        if (A00 != null) {
            c8f9 = A00.A14;
        } else {
            c8f9 = null;
        }
        this.A03 = c8f9;
        if (c8f9 != null && ((c66645URj = c8f9.A0E) == null || (str = c66645URj.A0M) == null)) {
            str = "";
        }
        this.A06 = str;
        this.A01 = ReelHeaderAttributionType.A0W;
    }
}
