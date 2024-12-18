package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.user.model.User;

/* renamed from: X.6aF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141366aF extends C6ZL {
    public final InterfaceC1816483t A00;
    public final ReelHeaderAttributionType A01;
    public final C41551w4 A02;
    public final C6eI A03;
    public final InterfaceC144596ff A04;
    public final User A05;
    public final String A06;
    public final Context A07;
    public final InterfaceC11380iw A08;
    public final C41181vS A09;

    public C141366aF(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        InterfaceC1816483t interfaceC1816483t;
        String str;
        this.A07 = context;
        this.A03 = c6eI;
        this.A09 = c41181vS;
        this.A04 = interfaceC144596ff;
        this.A08 = interfaceC11380iw;
        this.A02 = c41551w4;
        User user = c41181vS.A0i;
        this.A05 = user;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            interfaceC1816483t = c38321qM.A0C.BAr();
        } else {
            interfaceC1816483t = null;
        }
        this.A00 = interfaceC1816483t;
        Resources resources = context.getResources();
        if (user != null) {
            str = user.getUsername();
        } else {
            str = "";
        }
        String string = resources.getString(2131971648, str);
        C14360o3.A07(string);
        this.A06 = string;
        this.A01 = ReelHeaderAttributionType.A09;
    }
}
