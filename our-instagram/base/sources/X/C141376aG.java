package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6aG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141376aG extends C6ZL {
    public final Context A00;
    public final InterfaceC1816483t A01;
    public final ReelHeaderAttributionType A02;
    public final C41181vS A03;
    public final C41551w4 A04;
    public final C6eI A05;
    public final InterfaceC144596ff A06;
    public final String A07;
    public final String A08;
    public final InterfaceC11380iw A09;

    public C141376aG(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        InterfaceC1816483t interfaceC1816483t;
        this.A00 = context;
        this.A05 = c6eI;
        this.A03 = c41181vS;
        this.A06 = interfaceC144596ff;
        this.A09 = interfaceC11380iw;
        this.A04 = c41551w4;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            interfaceC1816483t = c38321qM.A0C.BAr();
        } else {
            interfaceC1816483t = null;
        }
        this.A01 = interfaceC1816483t;
        String str = (interfaceC1816483t == null || (str = interfaceC1816483t.getName()) == null) ? "" : str;
        this.A07 = str;
        String string = context.getResources().getString(2131971648, str);
        C14360o3.A07(string);
        this.A08 = string;
        this.A02 = ReelHeaderAttributionType.A0A;
    }
}
