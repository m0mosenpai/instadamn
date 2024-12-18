package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.user.model.User;

/* renamed from: X.6Zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141006Zd extends C6ZL {
    public final ReelHeaderAttributionType A00;
    public final C41181vS A01;
    public final C41551w4 A02;
    public final C6eI A03;
    public final InterfaceC144596ff A04;
    public final String A05;
    public final String A06;
    public final Context A07;

    public static final String A00(C141006Zd c141006Zd) {
        User A2E;
        C38321qM c38321qM = c141006Zd.A01.A0b;
        if (c38321qM != null && (A2E = c38321qM.A2E(((C6ZL) c141006Zd).A01)) != null) {
            String string = c141006Zd.A07.getString(2131963366, A2E.getUsername());
            C14360o3.A07(string);
            return string;
        }
        return "";
    }

    public C141006Zd(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        this.A07 = context;
        this.A03 = c6eI;
        this.A01 = c41181vS;
        this.A02 = c41551w4;
        this.A04 = interfaceC144596ff;
        this.A06 = A00(this);
        this.A00 = ReelHeaderAttributionType.A0N;
        this.A05 = "group_profile";
    }
}
